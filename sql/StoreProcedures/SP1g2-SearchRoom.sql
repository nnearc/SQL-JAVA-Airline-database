USE nnearc01
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Ioannis Pastellas
-- Create date: 11/11/2019
-- Description:	Search room in a specific island within a price range
--              within a specific time period.
-- =============================================
IF OBJECT_ID('SearchRoom') IS NOT NULL
    DROP PROCEDURE dbo.SearchRoom
GO
CREATE PROCEDURE [dbo].[SearchRoom]
	-- Add the parameters for the stored procedure here
          @low money,@high money,@date1 smalldatetime,@date2 smalldatetime, @island nvarchar(50) 
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT  DISTINCT R.roomID,R.Bedrooms, R.FromTime,R.hotelID,R.Price,R.rating,R.RName
	FROM [nnearc01].Room AS R, [nnearc01].Hotel AS H, [nnearc01].Destination as D,[nnearc01].RESERVATION AS Res
	WHERE (DATEDIFF(day,@date1,R.FromTime ) >=0) AND (DATEDIFF(day,R.ToTime,@date2 ) >=0)AND(R.Price >= @low) AND (R.Price <= @high)  AND (R.hotelID = H.hotelID) AND  (H.DName LIKE  '%' +  D.Name+ '%') AND ( D.Name LIKE  '%' + @island + '%')
	ORDER BY R.Price
END
GO