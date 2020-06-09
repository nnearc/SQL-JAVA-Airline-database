USE [nnearc01]
GO
/****** Object:  StoredProcedure [dbo].[EmptyRoom]    Script Date: 26/11/2019 20:11:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Ioannis Pastellas
-- Create date: <Create Date,,>
-- Description:	
-- =============================================
IF OBJECT_ID('EmptyRoom') IS NOT NULL
    DROP PROCEDURE dbo.EmptyRoom
GO
CREATE PROCEDURE [dbo].[EmptyRoom]
	-- Add the parameters for the stored procedure here
	@From smalldatetime,	@To smalldatetime
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;
	SELECT DISTINCT R.*
	FROM nnearc01.Room As R
	WHERE R.roomID NOT IN (
	
		SELECT R.RoomId
		FROM nnearc01.Room As R, nnearc01.RESERVATION As Res
		WHERE R.id = Res.id  AND  (DATEDIFF(day,@from,R.FromTime ) >=0) AND (DATEDIFF(day,R.ToTime,@To ) >=0)
	)
END
