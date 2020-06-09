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
IF OBJECT_ID('Hardworkers') IS NOT NULL
    DROP PROCEDURE dbo.Hardworkers
GO
CREATE PROCEDURE [dbo].[Hardworkers]
	-- Add the parameters for the stored procedure here
          
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;


	DECLARE @T table(
	    emID int,
		maxi float)
    -- Insert statements for procedure here

	INSERT INTO @T
    -- Insert statements for procedure here
	SELECT E.SSN,COUNT(Res.id) 
	FROM [nnearc01].RESERVATION AS Res, [nnearc01].EMPLOYEE AS E -- [nnearc01].Room AS R, [nnearc01].Car AS C, [nnearc01].Flight AS F,
	WHERE E.SSN = Res.SSN AND Res.confirmation = 1
	GROUP BY E.SSN

	SELECT emID,MAX(maxi)
	FROM @T
	GROUP BY emID
	

END
GO