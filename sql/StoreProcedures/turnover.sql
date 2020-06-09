USE [nnearc01]
GO  


IF OBJECT_ID('Turnover') IS NOT NULL
    DROP PROCEDURE dbo.TurnOver
GO
CREATE PROCEDURE [dbo].[Turnover]
	-- Add the parameters for the stored procedure here
          
AS
BEGIN

SET NOCOUNT ON
-- Declare a variable to return the results of the function. 
DECLARE @ret float;   

-- Execute the function while passing a value to the @status parameter
EXEC @ret = nnearc01.CalcTurnOver
	

-- View the returned value.  The Execute and Select statements must be executed at the same time.  
SELECT + @ret; 

END