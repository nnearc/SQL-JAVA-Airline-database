USE [nnearc01]
GO
ALTER TABLE [nnearc01].[Room] DROP CONSTRAINT [checkratingR]
GO
ALTER TABLE [nnearc01].[Room] DROP CONSTRAINT [checkpriceR2]
GO
ALTER TABLE [nnearc01].[Room] DROP CONSTRAINT [checkpriceR]
GO
ALTER TABLE [nnearc01].[Room] DROP CONSTRAINT [checkdateR]
GO
ALTER TABLE [nnearc01].[Room] DROP CONSTRAINT [checkbedroomsR]
GO
ALTER TABLE [nnearc01].[Flight] DROP CONSTRAINT [checkseatsF]
GO
ALTER TABLE [nnearc01].[Flight] DROP CONSTRAINT [checkpriceF2]
GO
ALTER TABLE [nnearc01].[Flight] DROP CONSTRAINT [checkpriceF]
GO
ALTER TABLE [nnearc01].[Flight] DROP CONSTRAINT [checkdateF]
GO
ALTER TABLE [nnearc01].[Flight] DROP CONSTRAINT [checkdate]
GO
ALTER TABLE [nnearc01].[Car] DROP CONSTRAINT [checkseatsC]
GO
ALTER TABLE [nnearc01].[Car] DROP CONSTRAINT [checkpriceC2]
GO
ALTER TABLE [nnearc01].[Car] DROP CONSTRAINT [checkpriceC]
GO
ALTER TABLE [nnearc01].[Car] DROP CONSTRAINT [checkdateC]
GO
ALTER TABLE [nnearc01].[UPDATES] DROP CONSTRAINT [FK__UPDATES__SSN]
GO
ALTER TABLE [nnearc01].[Room] DROP CONSTRAINT [FK__Room__id]
GO
ALTER TABLE [nnearc01].[Room] DROP CONSTRAINT [FK__Room__hotelID]
GO
ALTER TABLE [nnearc01].[RESERVATION] DROP CONSTRAINT [FK__RESERVATION__SSN]
GO
ALTER TABLE [nnearc01].[RESERVATION] DROP CONSTRAINT [FK__RESERVATION__Cid]
GO
ALTER TABLE [nnearc01].[REGISTRATION] DROP CONSTRAINT [FK__REGISTRATIO__SSN]
GO
ALTER TABLE [nnearc01].[Hotel] DROP CONSTRAINT [FK__Hotel__DName]
GO
ALTER TABLE [nnearc01].[Flight_Reservation] DROP CONSTRAINT [FK_Flight_Reservation_RESERVATION]
GO
ALTER TABLE [nnearc01].[Flight_Reservation] DROP CONSTRAINT [FK_Flight_Reservation_Flight]
GO
ALTER TABLE [nnearc01].[Flight] DROP CONSTRAINT [FK_Flight_RESERVATION]
GO
ALTER TABLE [nnearc01].[Flight] DROP CONSTRAINT [FK__Flight__ToCode]
GO
ALTER TABLE [nnearc01].[Flight] DROP CONSTRAINT [FK__Flight__FromCode]
GO
ALTER TABLE [nnearc01].[Flight] DROP CONSTRAINT [FK__Flight__AirlineC]
GO
ALTER TABLE [nnearc01].[EMPLOYEE] DROP CONSTRAINT [FK__EMPLOYEE__Manage]
GO
ALTER TABLE [nnearc01].[CarRentalOffice] DROP CONSTRAINT [FK__CarRental__DName]
GO
ALTER TABLE [nnearc01].[Car] DROP CONSTRAINT [FK_Car_CarRentalOffice]
GO
ALTER TABLE [nnearc01].[Car] DROP CONSTRAINT [FK__Car__id]
GO
/****** Object:  Table [nnearc01].[UPDATES]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[UPDATES]
GO
/****** Object:  Table [nnearc01].[Room]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[Room]
GO
/****** Object:  Table [nnearc01].[RESERVATION]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[RESERVATION]
GO
/****** Object:  Table [nnearc01].[REGISTRATION]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[REGISTRATION]
GO
/****** Object:  Table [nnearc01].[Hotel]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[Hotel]
GO
/****** Object:  Table [nnearc01].[Flight_Reservation]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[Flight_Reservation]
GO
/****** Object:  Table [nnearc01].[Flight]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[Flight]
GO
/****** Object:  Table [nnearc01].[EMPLOYEE]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[EMPLOYEE]
GO
/****** Object:  Table [nnearc01].[Destination]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[Destination]
GO
/****** Object:  Table [nnearc01].[CUSTOMER]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[CUSTOMER]
GO
/****** Object:  Table [nnearc01].[CarRentalOffice]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[CarRentalOffice]
GO
/****** Object:  Table [nnearc01].[Car]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[Car]
GO
/****** Object:  Table [nnearc01].[Airport]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[Airport]
GO
/****** Object:  Table [nnearc01].[Airline]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[Airline]
GO
/****** Object:  Table [nnearc01].[ACCOUNT]    Script Date: 02/12/2019 01:12:29 ******/
DROP TABLE [nnearc01].[ACCOUNT]
GO
/****** Object:  Table [nnearc01].[ACCOUNT]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[ACCOUNT](
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[Salary] [money] NOT NULL,
	[hours] [int] NOT NULL,
	[Time] [smalldatetime] NOT NULL,
	[Products] [int] NOT NULL,
	[SSN] [int] NOT NULL,
	[Position] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK__ACCOUNT] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[Airline]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[Airline](
	[Name] [nvarchar](50) NOT NULL,
	[AirlineCode] [nvarchar](3) NOT NULL,
	[URL] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK__Airline] PRIMARY KEY CLUSTERED 
(
	[AirlineCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[Airport]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[Airport](
	[AirportCode] [nvarchar](3) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK__Airport] PRIMARY KEY CLUSTERED 
(
	[AirportCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[Car]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[Car](
	[TypeName] [nvarchar](50) NOT NULL,
	[Seats] [int] NOT NULL,
	[Engine] [nvarchar](50) NOT NULL,
	[HorsePower] [int] NOT NULL,
	[Colour] [nvarchar](50) NOT NULL,
	[carID] [int] IDENTITY(1,1) NOT NULL,
	[Price] [money] NOT NULL,
	[PriceWithDiscount] [money] NOT NULL,
	[id] [int] NOT NULL,
	[FromTime] [smalldatetime] NOT NULL,
	[ToTime] [smalldatetime] NOT NULL,
	[CarRental_ID] [int] NOT NULL,
 CONSTRAINT [PK__Car] PRIMARY KEY CLUSTERED 
(
	[carID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[CarRentalOffice]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[CarRentalOffice](
	[Name] [nvarchar](50) NOT NULL,
	[Cars_Available] [int] NOT NULL,
	[car_rentalID] [int] IDENTITY(1,1) NOT NULL,
	[DName] [nvarchar](50) NOT NULL,
 CONSTRAINT [UQ__CarRenta] UNIQUE NONCLUSTERED 
(
	[car_rentalID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[CUSTOMER]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[CUSTOMER](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[Surname] [nvarchar](50) NOT NULL,
	[email] [nvarchar](100) NOT NULL,
	[phone] [int] NOT NULL,
	[Street] [nvarchar](100) NOT NULL,
	[Postcode] [int] NOT NULL,
	[Address_Num] [int] NOT NULL,
 CONSTRAINT [PK__CUSTOMER] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[Destination]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[Destination](
	[Description] [nvarchar](310) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[Population] [bigint] NOT NULL,
 CONSTRAINT [PK__Destinat] PRIMARY KEY CLUSTERED 
(
	[Name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[EMPLOYEE]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[EMPLOYEE](
	[Position] [nvarchar](50) NOT NULL,
	[Mobile_Phone] [int] NOT NULL,
	[Phone] [int] NOT NULL,
	[Address] [nvarchar](100) NOT NULL,
	[SSN] [int] NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[Surname] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](100) NOT NULL,
	[Manage_SSN] [int] NOT NULL,
 CONSTRAINT [PK__EMPLOYEE] PRIMARY KEY CLUSTERED 
(
	[SSN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[Flight]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[Flight](
	[flightID] [int] IDENTITY(1,1) NOT NULL,
	[FromCode] [nvarchar](3) NOT NULL,
	[ToCode] [nvarchar](3) NOT NULL,
	[AirlineCode] [nvarchar](3) NOT NULL,
	[DepartureTime] [smalldatetime] NOT NULL,
	[ArrivalTime] [smalldatetime] NOT NULL,
	[Price] [money] NOT NULL,
	[PriceWithDiscount] [money] NOT NULL,
	[Seats] [int] NOT NULL,
	[id] [int] NULL,
 CONSTRAINT [PK_Flight] PRIMARY KEY CLUSTERED 
(
	[flightID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[Flight_Reservation]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[Flight_Reservation](
	[ReservationID] [int] NOT NULL,
	[FlightID] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[Hotel]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[Hotel](
	[Name] [nvarchar](50) NOT NULL,
	[hotelID] [int] IDENTITY(1,1) NOT NULL,
	[Rooms_Available] [int] NOT NULL,
	[DName] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK__Hotel] PRIMARY KEY CLUSTERED 
(
	[hotelID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[REGISTRATION]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[REGISTRATION](
	[Name] [nvarchar](50) NOT NULL,
	[Time] [smalldatetime] NOT NULL,
	[SSN] [int] NOT NULL,
 CONSTRAINT [PK__REGISTRA] PRIMARY KEY CLUSTERED 
(
	[SSN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[RESERVATION]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[RESERVATION](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[time] [smalldatetime] NOT NULL,
	[visa] [int] NOT NULL,
	[confirmation] [int] NOT NULL,
	[Type] [nvarchar](50) NOT NULL,
	[Cid] [int] NOT NULL,
	[SSN] [int] NOT NULL,
	[buy] [int] NOT NULL,
 CONSTRAINT [PK__RESERVAT] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[Room]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[Room](
	[roomID] [int] IDENTITY(1,1) NOT NULL,
	[Bedrooms] [int] NOT NULL,
	[sight] [int] NOT NULL,
	[RName] [nvarchar](50) NOT NULL,
	[Price] [money] NOT NULL,
	[PriceWithDiscount] [money] NOT NULL,
	[rating] [real] NOT NULL,
	[id] [int] NULL,
	[hotelID] [int] NOT NULL,
	[FromTime] [smalldatetime] NOT NULL,
	[ToTime] [smalldatetime] NOT NULL,
 CONSTRAINT [PK__Room] PRIMARY KEY CLUSTERED 
(
	[roomID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [nnearc01].[UPDATES]    Script Date: 02/12/2019 01:12:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [nnearc01].[UPDATES](
	[Time] [smalldatetime] NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[SSN] [int] NOT NULL,
	[Description] [nvarchar](100) NOT NULL
) ON [PRIMARY]
GO
ALTER TABLE [nnearc01].[Car]  WITH NOCHECK ADD  CONSTRAINT [FK__Car__id] FOREIGN KEY([id])
REFERENCES [nnearc01].[RESERVATION] ([id])
GO
ALTER TABLE [nnearc01].[Car] CHECK CONSTRAINT [FK__Car__id]
GO
ALTER TABLE [nnearc01].[Car]  WITH CHECK ADD  CONSTRAINT [FK_Car_CarRentalOffice] FOREIGN KEY([CarRental_ID])
REFERENCES [nnearc01].[CarRentalOffice] ([car_rentalID])
GO
ALTER TABLE [nnearc01].[Car] CHECK CONSTRAINT [FK_Car_CarRentalOffice]
GO
ALTER TABLE [nnearc01].[CarRentalOffice]  WITH NOCHECK ADD  CONSTRAINT [FK__CarRental__DName] FOREIGN KEY([DName])
REFERENCES [nnearc01].[Destination] ([Name])
GO
ALTER TABLE [nnearc01].[CarRentalOffice] CHECK CONSTRAINT [FK__CarRental__DName]
GO
ALTER TABLE [nnearc01].[EMPLOYEE]  WITH NOCHECK ADD  CONSTRAINT [FK__EMPLOYEE__Manage] FOREIGN KEY([Manage_SSN])
REFERENCES [nnearc01].[EMPLOYEE] ([SSN])
GO
ALTER TABLE [nnearc01].[EMPLOYEE] CHECK CONSTRAINT [FK__EMPLOYEE__Manage]
GO
ALTER TABLE [nnearc01].[Flight]  WITH NOCHECK ADD  CONSTRAINT [FK__Flight__AirlineC] FOREIGN KEY([AirlineCode])
REFERENCES [nnearc01].[Airline] ([AirlineCode])
GO
ALTER TABLE [nnearc01].[Flight] CHECK CONSTRAINT [FK__Flight__AirlineC]
GO
ALTER TABLE [nnearc01].[Flight]  WITH NOCHECK ADD  CONSTRAINT [FK__Flight__FromCode] FOREIGN KEY([FromCode])
REFERENCES [nnearc01].[Airport] ([AirportCode])
GO
ALTER TABLE [nnearc01].[Flight] CHECK CONSTRAINT [FK__Flight__FromCode]
GO
ALTER TABLE [nnearc01].[Flight]  WITH NOCHECK ADD  CONSTRAINT [FK__Flight__ToCode] FOREIGN KEY([ToCode])
REFERENCES [nnearc01].[Airport] ([AirportCode])
GO
ALTER TABLE [nnearc01].[Flight] CHECK CONSTRAINT [FK__Flight__ToCode]
GO
ALTER TABLE [nnearc01].[Flight]  WITH NOCHECK ADD  CONSTRAINT [FK_Flight_RESERVATION] FOREIGN KEY([id])
REFERENCES [nnearc01].[RESERVATION] ([id])
GO
ALTER TABLE [nnearc01].[Flight] CHECK CONSTRAINT [FK_Flight_RESERVATION]
GO
ALTER TABLE [nnearc01].[Flight_Reservation]  WITH CHECK ADD  CONSTRAINT [FK_Flight_Reservation_Flight] FOREIGN KEY([FlightID])
REFERENCES [nnearc01].[Flight] ([flightID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [nnearc01].[Flight_Reservation] CHECK CONSTRAINT [FK_Flight_Reservation_Flight]
GO
ALTER TABLE [nnearc01].[Flight_Reservation]  WITH CHECK ADD  CONSTRAINT [FK_Flight_Reservation_RESERVATION] FOREIGN KEY([ReservationID])
REFERENCES [nnearc01].[RESERVATION] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [nnearc01].[Flight_Reservation] CHECK CONSTRAINT [FK_Flight_Reservation_RESERVATION]
GO
ALTER TABLE [nnearc01].[Hotel]  WITH NOCHECK ADD  CONSTRAINT [FK__Hotel__DName] FOREIGN KEY([DName])
REFERENCES [nnearc01].[Destination] ([Name])
GO
ALTER TABLE [nnearc01].[Hotel] CHECK CONSTRAINT [FK__Hotel__DName]
GO
ALTER TABLE [nnearc01].[REGISTRATION]  WITH NOCHECK ADD  CONSTRAINT [FK__REGISTRATIO__SSN] FOREIGN KEY([SSN])
REFERENCES [nnearc01].[EMPLOYEE] ([SSN])
GO
ALTER TABLE [nnearc01].[REGISTRATION] CHECK CONSTRAINT [FK__REGISTRATIO__SSN]
GO
ALTER TABLE [nnearc01].[RESERVATION]  WITH NOCHECK ADD  CONSTRAINT [FK__RESERVATION__Cid] FOREIGN KEY([Cid])
REFERENCES [nnearc01].[CUSTOMER] ([id])
GO
ALTER TABLE [nnearc01].[RESERVATION] CHECK CONSTRAINT [FK__RESERVATION__Cid]
GO
ALTER TABLE [nnearc01].[RESERVATION]  WITH NOCHECK ADD  CONSTRAINT [FK__RESERVATION__SSN] FOREIGN KEY([SSN])
REFERENCES [nnearc01].[EMPLOYEE] ([SSN])
GO
ALTER TABLE [nnearc01].[RESERVATION] CHECK CONSTRAINT [FK__RESERVATION__SSN]
GO
ALTER TABLE [nnearc01].[Room]  WITH NOCHECK ADD  CONSTRAINT [FK__Room__hotelID] FOREIGN KEY([hotelID])
REFERENCES [nnearc01].[Hotel] ([hotelID])
GO
ALTER TABLE [nnearc01].[Room] CHECK CONSTRAINT [FK__Room__hotelID]
GO
ALTER TABLE [nnearc01].[Room]  WITH NOCHECK ADD  CONSTRAINT [FK__Room__id] FOREIGN KEY([id])
REFERENCES [nnearc01].[RESERVATION] ([id])
GO
ALTER TABLE [nnearc01].[Room] CHECK CONSTRAINT [FK__Room__id]
GO
ALTER TABLE [nnearc01].[UPDATES]  WITH NOCHECK ADD  CONSTRAINT [FK__UPDATES__SSN] FOREIGN KEY([SSN])
REFERENCES [nnearc01].[EMPLOYEE] ([SSN])
GO
ALTER TABLE [nnearc01].[UPDATES] CHECK CONSTRAINT [FK__UPDATES__SSN]
GO
ALTER TABLE [nnearc01].[Car]  WITH CHECK ADD  CONSTRAINT [checkdateC] CHECK  (([FromTime]<[ToTime]))
GO
ALTER TABLE [nnearc01].[Car] CHECK CONSTRAINT [checkdateC]
GO
ALTER TABLE [nnearc01].[Car]  WITH CHECK ADD  CONSTRAINT [checkpriceC] CHECK  (([Price]>[PriceWithDiscount]))
GO
ALTER TABLE [nnearc01].[Car] CHECK CONSTRAINT [checkpriceC]
GO
ALTER TABLE [nnearc01].[Car]  WITH CHECK ADD  CONSTRAINT [checkpriceC2] CHECK  (([Price]>(0) AND [PriceWithDiscount]>(0)))
GO
ALTER TABLE [nnearc01].[Car] CHECK CONSTRAINT [checkpriceC2]
GO
ALTER TABLE [nnearc01].[Car]  WITH CHECK ADD  CONSTRAINT [checkseatsC] CHECK  (([Seats]>(2)))
GO
ALTER TABLE [nnearc01].[Car] CHECK CONSTRAINT [checkseatsC]
GO
ALTER TABLE [nnearc01].[Flight]  WITH CHECK ADD  CONSTRAINT [checkdate] CHECK  (([ArrivalTime]>[DepartureTime]))
GO
ALTER TABLE [nnearc01].[Flight] CHECK CONSTRAINT [checkdate]
GO
ALTER TABLE [nnearc01].[Flight]  WITH CHECK ADD  CONSTRAINT [checkdateF] CHECK  (([ArrivalTime]>[DepartureTime]))
GO
ALTER TABLE [nnearc01].[Flight] CHECK CONSTRAINT [checkdateF]
GO
ALTER TABLE [nnearc01].[Flight]  WITH CHECK ADD  CONSTRAINT [checkpriceF] CHECK  (([Price]>[PriceWithDiscount]))
GO
ALTER TABLE [nnearc01].[Flight] CHECK CONSTRAINT [checkpriceF]
GO
ALTER TABLE [nnearc01].[Flight]  WITH CHECK ADD  CONSTRAINT [checkpriceF2] CHECK  (([Price]>(0) AND [PriceWithDiscount]>(0)))
GO
ALTER TABLE [nnearc01].[Flight] CHECK CONSTRAINT [checkpriceF2]
GO
ALTER TABLE [nnearc01].[Flight]  WITH CHECK ADD  CONSTRAINT [checkseatsF] CHECK  (([Seats]>(0)))
GO
ALTER TABLE [nnearc01].[Flight] CHECK CONSTRAINT [checkseatsF]
GO
ALTER TABLE [nnearc01].[Room]  WITH CHECK ADD  CONSTRAINT [checkbedroomsR] CHECK  (([Bedrooms]>=(1)))
GO
ALTER TABLE [nnearc01].[Room] CHECK CONSTRAINT [checkbedroomsR]
GO
ALTER TABLE [nnearc01].[Room]  WITH CHECK ADD  CONSTRAINT [checkdateR] CHECK  (([FromTime]<[ToTime]))
GO
ALTER TABLE [nnearc01].[Room] CHECK CONSTRAINT [checkdateR]
GO
ALTER TABLE [nnearc01].[Room]  WITH CHECK ADD  CONSTRAINT [checkpriceR] CHECK  (([Price]>[PriceWithDiscount]))
GO
ALTER TABLE [nnearc01].[Room] CHECK CONSTRAINT [checkpriceR]
GO
ALTER TABLE [nnearc01].[Room]  WITH CHECK ADD  CONSTRAINT [checkpriceR2] CHECK  (([Price]>(0) AND [PriceWithDiscount]>(0)))
GO
ALTER TABLE [nnearc01].[Room] CHECK CONSTRAINT [checkpriceR2]
GO
ALTER TABLE [nnearc01].[Room]  WITH CHECK ADD  CONSTRAINT [checkratingR] CHECK  (([Rating]>(0)))
GO
ALTER TABLE [nnearc01].[Room] CHECK CONSTRAINT [checkratingR]
GO
