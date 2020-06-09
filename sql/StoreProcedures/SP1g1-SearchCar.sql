USE nnearc01
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Ioannis Pastellas
-- Create date: 11/11/2019
-- Description:	Search car .
-- =============================================
IF OBJECT_ID('SearchCar') IS NOT NULL
    DROP PROCEDURE dbo.SearchFlight
GO
CREATE PROCEDURE [dbo].[SearchCar]
	-- Add the parameters for the stored procedure here
          @low money,@high money,@date1 smalldatetime,@date2 smalldatetime, @island nvarchar(50) 
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT  DISTINCT C.carID,C.TName,C.Colour,C.seats,C.HorsePower,C.Engine,C.Price,C.FromTime,C.ToTime
	FROM [nnearc01].Car AS C, [nnearc01].CarRentalOffice AS CR, [nnearc01].Destination as D
	WHERE (DATEDIFF(day,@date1,C.FromTime ) >=0) AND (DATEDIFF(day,C.ToTime,@date2 ) >=0)AND(C.Price >= @low) AND (C.Price <= @high)  AND (CR.car_rentalID = C.car_rentalID) AND  (CR.DName LIKE  '%' +  D.Name+ '%') AND ( D.Name LIKE  '%' + @island + '%')
	ORDER BY C.Price
END
GO