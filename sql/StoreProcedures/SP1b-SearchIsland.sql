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
IF OBJECT_ID('SearchIsland') IS NOT NULL
    DROP PROCEDURE dbo.SearchIsland
GO
CREATE PROCEDURE [dbo].[SearchIsland]
	-- Add the parameters for the stored procedure here
	@Name varchar(50)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT D.*
	FROM [nnearc01].Destination AS D
	--WHERE (C.NAME LIKE '%' + @Name + '%') AND (C.id = @id) 
	WHERE ((DIFFERENCE(SOUNDEX(@Name), SOUNDEX(D.[Name])) = 4) OR (D.NAME LIKE '%' + @Name + '%'))  ;
END
GO
