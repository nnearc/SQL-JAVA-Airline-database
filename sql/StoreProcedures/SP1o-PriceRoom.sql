USE nnearc01
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Ioannis Pastellas
-- Create date: 11/11/2019
-- Description:	Returns a list with rooms that have price 
-- above the avg price of a specified month.
-- =============================================
IF OBJECT_ID('PriceRoom') IS NOT NULL
    DROP PROCEDURE dbo.PriceRoom
GO
CREATE PROCEDURE [dbo].[PriceRoom]
	-- Add the parameters for the stored procedure here
	@month int 
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

	DECLARE @SUM FLOAT
	SET @SUM = (
		SELECT SUM(R.price) 
		FROM nnearc01.Room AS R, nnearc01.RESERVATION AS Res
		WHERE @month = MONTH(R.FromTime) AND ( R.id = Res.id) --AND (Res.confirmation =1 )
	)

	DECLARE @ROOMS INT
	SET @ROOMS = (
		SELECT COUNT(DISTINCT R.roomID)
		FROM nnearc01.Room AS R, nnearc01.RESERVATION AS Res
		WHERE @month = MONTH(R.FromTime) AND ( R.id = Res.id) --AND (Res.confirmation =1 )
	)

	DECLARE @AVG FLOAT
	SET @AVG = @SUM/@ROOMS

	SELECT T2.*
	FROM (
		SELECT SUM(R.Price) sum, R.roomID
		FROM nnearc01.Room AS R, nnearc01.RESERVATION AS Res
		WHERE @month = MONTH(R.FromTime) AND ( R.id = Res.id) AND (Res.confirmation =1 )
		GROUP BY R.roomID
	)AS T1 INNER JOIN nnearc01.Room T2 ON T1.roomID = T2.roomID
	WHERE T1.sum > @AVG 
	ORDER BY SUM DESC

END
GO