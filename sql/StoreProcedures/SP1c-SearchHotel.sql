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
IF OBJECT_ID('SearchHotel') IS NOT NULL
    DROP PROCEDURE dbo.SearchHotel
GO
CREATE PROCEDURE [dbo].[SearchHotel]
	-- Add the parameters for the stored procedure here
	@hotel varchar(50), @Name  varchar(50)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT H.*
	FROM  nnearc01.Hotel AS H 
	WHERE ((DIFFERENCE(SOUNDEX(@hotel), SOUNDEX(H.[Name])) = 4) OR (H.Name LIKE '%' + @hotel + '%'))  AND  ((H.DName LIKE '%' + @Name + '%') OR (DIFFERENCE(SOUNDEX(@Name), SOUNDEX(H.DName)) = 4));
END
GO
