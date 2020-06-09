
USE [nnearc01]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date, ,>
-- Description:	<Description, ,>
-- =============================================
IF OBJECT_ID('CalcTurnOver') IS NOT NULL
    DROP FUNCTION nnearc01.CalcTurnOver
GO
CREATE FUNCTION [nnearc01].[CalcTurnOver](
    --@month int
)
    RETURNS float
AS
BEGIN
    -- Returned Variable
    DECLARE
        @turnover float;

	 DECLARE
        @Temp Table
              (
                 total float
              )

	 	 DECLARE
        @Temp2 Table
              (
                 total2 float
              )
	 	 DECLARE
        @Temp3 Table
              (
                 total3 float
              )
	


    -- Insert statements for procedure here
	INSERT INTO @Temp
	SELECT (  SUM(F.Price)  )
	FROM [nnearc01].RESERVATION AS Res, [nnearc01].Flight AS F--, [nnearc01].CUSTOMER AS Cus
	WHERE   Res.confirmation = 1 AND ( F.id = Res.id)AND (MONTH(Res.time) =MONTH(GETDATE()))

	INSERT INTO @Temp2
	SELECT (  SUM(R.Price)  )
	FROM [nnearc01].RESERVATION AS Res, [nnearc01].Room AS R--, [nnearc01].CUSTOMER AS Cus
	WHERE   Res.confirmation = 1 AND ( R.id = Res.id)AND (MONTH(Res.time) =MONTH(GETDATE()))

	INSERT INTO @Temp3
	SELECT (  SUM(C.Price)  )
	FROM [nnearc01].RESERVATION AS Res, [nnearc01].Car AS C--, [nnearc01].CUSTOMER AS Cus
	WHERE   Res.confirmation = 1 AND ( C.id = Res.id)AND (MONTH(Res.time) =MONTH(GETDATE()))
	
	-- OR Res.id = C.id OR Res.id = F.id )
     
                

    -- Calculate Turnover
       SELECT @turnover =  SUM(total) + SUM(total2) + SUM(total3)
                       FROM @Temp,@Temp2,@Temp3

    

 
    

    Return    @turnover

END
