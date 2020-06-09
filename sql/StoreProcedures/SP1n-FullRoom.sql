USE [nnearc01]
GO
/****** Object:  StoredProcedure [dbo].[FullRoom]    Script Date: 26/11/2019 20:11:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Ioannis Pastellas
-- Create date: <Create Date,,>
-- Description:	
-- =============================================
IF OBJECT_ID('FullRoom') IS NOT NULL
    DROP PROCEDURE nnearc01.FullRoom
GO
CREATE PROCEDURE [nnearc01].[FullRoom]
	-- Add the parameters for the stored procedure here
	@From smalldatetime,	@To smalldatetime
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
        

SELECT DISTINCT R.hotelID
FROM nnearc01.Room R
WHERE NOT EXISTS ((
                      SELECT R.RoomID
                      FROM nnearc01.Room R,nnearc01.Reservation Res,nnearc01.Hotel AS H
                      WHERE R.FromTime>=@From AND R.ToTime<=@To AND Res.confirmation=1 AND Res.id = R.id )
                                        EXCEPT(
                                        SELECT R.RoomID
                                         FROM nnearc01.Room R,nnearc01.Reservation Res,nnearc01.Hotel AS H
                                        WHERE  Res.confirmation=1 AND R.id=Res.id AND H.hotelID = R.hotelID))

										END
