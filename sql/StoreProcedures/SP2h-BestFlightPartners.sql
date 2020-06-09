USE nnearc01
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Ioannis Pastellas
-- Create date: 11/11/2019
-- Description:	Report for the daily charges of visa .
-- =============================================
IF OBJECT_ID('BestAirlines') IS NOT NULL
    DROP PROCEDURE dbo.BestAirlines
GO
CREATE PROCEDURE [dbo].[BestAirlines]
	-- Add the parameters for the stored procedure here
          
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;
	

	DECLARE @T table(
	    Air nvarchar(50),
		maxi float)
    -- Insert statements for procedure here

	INSERT INTO @T
	SELECT A.AirlineCode,( SUM(F.Seats)) total
	FROM [nnearc01].RESERVATION AS Res, [nnearc01].Flight AS F, [nnearc01].Airline A
	WHERE (F.AirlineCode LIKE A.AirlineCode)  
	GROUP BY A.AirlineCode

	

		SELECT  Air,maxi
		FROM @T
		WHERE maxi >= ALL (SELECT maxi            
		                   From @T)
		
		


END
GO