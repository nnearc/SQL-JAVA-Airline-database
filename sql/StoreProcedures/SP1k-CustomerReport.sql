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
IF OBJECT_ID('CustomerReport') IS NOT NULL
    DROP PROCEDURE dbo.CustomerReport
GO
CREATE PROCEDURE [dbo].[CustomerReport]
	-- Add the parameters for the stored procedure here
	@Name varchar(50), @id int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT R.*
	FROM [nnearc01].[CUSTOMER] AS C INNER JOIN[nnearc01].RESERVATION AS R ON C.id = R.Cid
	WHERE ((DIFFERENCE(SOUNDEX(@Name), SOUNDEX(C.[Name])) = 4 OR (C.NAME LIKE '%' + @Name + '%'))  AND (C.id = @id) )
	ORDER BY R.time DESC
END
GO
