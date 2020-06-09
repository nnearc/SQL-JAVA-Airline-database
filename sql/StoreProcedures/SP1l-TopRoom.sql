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
IF OBJECT_ID('TopRoom') IS NOT NULL
    DROP PROCEDURE dbo.TopRoom
GO
CREATE PROCEDURE [dbo].[TopRoom]
	
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT *
	FROM (      
		SELECT TOP 10 R.roomId, SUM(DATEDIFF(day,R.FromTime,R.ToTime)) days
		FROM nnearc01.Room AS R,nnearc01.RESERVATION AS Res 
		WHERE (Res.id = R.id) AND (Res.confirmation = 1)
		GROUP BY RoomId
		ORDER BY days Desc
	) AS D			 
	UNION ALL
	SELECT * 
	FROM (
		SELECT TOP 5 R.roomID, SUM(DATEDIFF(day,R.FromTime,R.ToTime))  days
		FROM nnearc01.Room AS R,nnearc01.RESERVATION AS Res
		WHERE (Res.id = R.id) AND (Res.confirmation = 1) 
		GROUP BY RoomId
		ORDER BY days 
	) AS s;
END
GO