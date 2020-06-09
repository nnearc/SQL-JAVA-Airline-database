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
IF OBJECT_ID('SearchCustomer') IS NOT NULL
    DROP PROCEDURE dbo.SearchCustomer
GO
CREATE PROCEDURE [dbo].[SearchCustomer]
	-- Add the parameters for the stored procedure here
	@Name varchar(50), @id int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT *
	FROM [nnearc01].[CUSTOMER] AS C
	--WHERE (C.NAME LIKE '%' + @Name + '%') AND (C.id = @id) 
	WHERE ((DIFFERENCE(SOUNDEX(@Name), SOUNDEX(C.[Name])) = 4) OR (C.NAME LIKE '%' + @Name + '%')) AND (C.id = @id) ;
END
GO
