USE nnearc01
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Ioannis Pastellas
-- Create date: 11/11/2019
-- Description:	Search for customer details based on .
-- =============================================
IF OBJECT_ID('SearchFlightStops') IS NOT NULL
    DROP PROCEDURE dbo.SearchFlightStops
GO
CREATE PROCEDURE [dbo].[SearchFlightStops]
	-- Add the parameters for the stored procedure here
          @low money,@high money,@date smalldatetime,@from nvarchar(50),@to nvarchar(50),@k int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;



	WITH cte_org(n,Fid,arrival,departure,fromAirport,toAirport) AS (
    -- Insert statements for procedure here
	SELECT 0,F.flightID,F.ArrivalTime,F.DepartureTime,F.FromCode,F.ToCode
	FROM [nnearc01].[Flight] AS F 
	WHERE (F.Price >= @low) AND (F.Price <= @high) AND (F.DepartureTime = @date) AND(F.FromCode LIKE '%' + @from +'%')
	--ORDER BY F.Price


	UNION ALL
   SELECT n+1,F2.flightID,F2.ArrivalTime,F2.DepartureTime,F2.FromCode,F2.ToCode
	FROM [nnearc01].[Flight] AS F2 , cte_org 
	WHERE  cte_org.n < @k   AND (F2.FromCode  LIKE '%' + cte_org.toAirport +'%') 
	AND (DATEDIFF(day,F2.DepartureTime,cte_org.arrival) = 0) AND ( DATEDIFF(minute,cte_org.arrival,F2.DepartureTime) >=60) AND (cte_org.toAirport NOT LIKE '%' + @to +'%')
	--ORDER BY F2.Price
	--@k

	)

	SELECT Fid,departure,fromAirport,arrival
    FROM cte_org
	ORDER BY Fid;
END
GO