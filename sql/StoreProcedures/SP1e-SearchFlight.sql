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
IF OBJECT_ID('SearchFlight') IS NOT NULL
    DROP PROCEDURE nnearc01.SearchFlight
GO
CREATE PROCEDURE [nnearc01].[SearchFlight]
	-- Add the parameters for the stored procedure here
        @low money,@high money,@date smalldatetime,@from nvarchar(50),@to nvarchar(50)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT F.*
	FROM [nnearc01].[Flight] AS F
	WHERE (F.Price >= @low) AND (F.Price <= @high) AND (F.DepartureTime = @date) AND(F.FromCode LIKE '%' + @from + '%') AND(F.ToCode LIKE '%' + @to + '%')
	ORDER BY F.Price
END
GO