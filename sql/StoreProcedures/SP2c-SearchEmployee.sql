USE nnearc01
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Ioannis Pastellas
-- Create date: 11/11/2019
-- Description:	Search for employee details based on name, ssn .
-- =============================================
IF OBJECT_ID('SearchEmployee') IS NOT NULL
    DROP PROCEDURE dbo.SearchEmployee
GO
CREATE PROCEDURE [dbo].[SearchEmployee]
	-- Add the parameters for the stored procedure here
	@Name varchar(50), @SSN int 
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT *
	FROM [nnearc01].[EMPLOYEE] AS E
	
	WHERE (((DIFFERENCE(SOUNDEX(@Name), SOUNDEX(E.[Name])) = 4) OR (E.NAME LIKE '%' + @Name + '%'))) AND (E.SSN = @SSN) ;
END
GO