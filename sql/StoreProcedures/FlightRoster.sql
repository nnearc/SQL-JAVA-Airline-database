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
IF OBJECT_ID('Roster') IS NOT NULL
    DROP PROCEDURE nnearc01.Roster
GO
CREATE PROCEDURE [nnearc01].[Roster]
	-- Add the parameters for the stored procedure here
          @id int, @date smalldatetime
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

	
	
	SELECT DISTINCT C.*
	FROM [nnearc01].CUSTOMER AS C, nnearc01.Flight AS F,nnearc01.RESERVATION AS Res,nnearc01.Flight_Reservation AS R  -- [nnearc01].Room AS R, [nnearc01].Car AS C, [nnearc01].Flight AS F,
	WHERE F.flightID = R.FlightID  AND (Res.id = R.ReservationID) AND C.id = Res.Cid AND (@date = F.DepartureTime OR F.ArrivalTime = @date)
	

	
	

END
GO