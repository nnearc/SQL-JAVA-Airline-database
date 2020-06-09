import java.io.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SimpleJDBC {
	private static boolean dbDriverLoaded = false;
	private static Connection conn = null;

	/**
	 * A method that returns a connection to MS SQL server DB
	 *
	 * @return The connection object to be used.
	 */
	private Connection getDBConnection() {
		String dbConnString = "jdbc:sqlserver://mssql.cs.ucy.ac.cy:1433;databaseName=nnearc01;username=nnearc01;password=7AsmusWG";
		System.setProperty("java.net.preferIPv6Addresses", "true");
		if (!dbDriverLoaded)
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				dbDriverLoaded = true;
			} catch (ClassNotFoundException e) {
				System.out.println("Cannot load DB driver!");
				return null;
			}

		try {
			if (conn == null)
				conn = DriverManager.getConnection(dbConnString);
			else if (conn.isClosed())
				conn = DriverManager.getConnection(dbConnString);
		} catch (SQLException e) {
			System.out.print("Cannot connect to the DB!\nGot error: ");
			System.out.print(e.getErrorCode());
			System.out.print("\nSQL State: ");
			System.out.println(e.getSQLState());
			System.out.println(e.getMessage());
		}
		return conn;
	}

	public static void addCar() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Car.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}

				input = st.split(";");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
				LocalDateTime parsedDate = LocalDateTime.parse(input[9], formatter);
				LocalDateTime parsedDate2 = LocalDateTime.parse(input[10], formatter);
				String query = "INSERT INTO "
						+ "Car (TName, Seats, Engine, HorsePower, Colour, carID, Price, PriceWithDiscount, id, FromTime, ToTime )"
						+ "VALUES (" + input[0] + ", '" + Integer.parseInt(input[1]) + ", '" + input[2] + ", '"
						+ input[3] + ", '" + input[4] + ", '" + Integer.parseInt(input[5]) + ", '"
						+ Integer.parseInt(input[6]) + Integer.parseInt(input[7]) + ", '" + Integer.parseInt(input[8])
						+ ", '" + parsedDate.format(formatter) + ", '" + parsedDate2.format(formatter) + "');";
				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);

				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());

				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addAirline() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Airline.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				String query = "INSERT INTO " + "Airline (Name, AirlineCode, URL)" + "VALUES (" + input[0] + ", '"
						+ input[1] + input[2] + "');";
				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addAirport() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Airport.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				String query = "INSERT INTO " + "Airport (AirportCode, name)" + "VALUES (" + input[0] + ", '" + input[1]
						+ "');";
				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addCustomer() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Customers.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd
				// HH:mm:ss.SSS", Locale.ENGLISH);
				// LocalDateTime parsedDate = LocalDateTime.parse(input[3], formatter);
				// System.out.println(parsedDate.format(formatter));
				// Timestamp timestamp = new Timestamp(date.getTime());
				// System.out.println(input[3]);
				String query = "INSERT INTO "
						+ "Customer (CustomerID, Name, Surname, email, phone, Street, Postcode, Address_Num)"
						+ "VALUES (" + Integer.parseInt(input[0]) + ", '" + input[1] + "', '" + input[2] + "', '"
						+ input[3] + "', '" + Integer.parseInt(input[4]) + "', '" + input[5] + "', '"
						+ Integer.parseInt(input[6]) + input[7] + "');";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addCustomerInv() {
		String[] input;
		File file = new File("U:\\EPL233\\Epl342Employees\\Data\\Invoices.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
				LocalDateTime parsedDate = LocalDateTime.parse(input[3], formatter);
				String query = "INSERT INTO " + "CustomerInvoice (InvoiceID, StoreID, CustomerID, Date)" + "VALUES ("
						+ Integer.parseInt(input[0]) + ", " + Integer.parseInt(input[1]) + ", "
						+ Integer.parseInt(input[2]) + ", '" + parsedDate.format(formatter) + "');";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addEmployee() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Employees.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd
				// HH:mm:ss.SSS", Locale.ENGLISH);
				// LocalDateTime parsedDate = LocalDateTime.parse(input[4], formatter);
				String query = "INSERT INTO "
						+ "Employee (Position, Mobile_Phone, Phone, Address, SSN, Name, Surname, Email, Manage_SSN)"
						+ "VALUES (" + input[0] + ", '" + Integer.parseInt(input[1]) + "', '"
						+ Integer.parseInt(input[2]) + "', '" + input[3] + "',' " + Integer.parseInt(input[4]) + "',' "
						+ input[5] + "',' " + input[6] + "',' " + input[7] + "',' " + Integer.parseInt(input[8]) + ");";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addCarRentalOffice() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\CarRentalOffice.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				String query = "INSERT INTO " + "CarRentalOffice (Name, Cars_Available, car_rentalID, DName, carID)"
						+ "VALUES (" + input[0] + ", '" + Integer.parseInt(input[1]) + "', '"
						+ Integer.parseInt(input[2]) + "', " + input[3] + ", " + Integer.parseInt(input[4]) + ");";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addDestination() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Destination.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");

				String query = "INSERT INTO " + "Destination (Description, Name, Population)" + "VALUES (" + input[0]
						+ ", '" + input[1] + "', " + Integer.parseInt(input[2]) + "');";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addFlight() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Flight.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
				LocalDateTime parsedDate = LocalDateTime.parse(input[4], formatter);
				LocalDateTime parsedDate2 = LocalDateTime.parse(input[5], formatter);
				String query = "INSERT INTO "
						+ "Flight (flightID, FromCode, ToCode, AirlineCode, DepartureTime, ArrivalTime, Price, PriceWithDiscount, Seats, id)"
						+ "VALUES (" + Integer.parseInt(input[0]) + ", '" + input[1] + "', '" + input[2] + "', "
						+ input[3] + ", " + parsedDate.format(formatter) + ", '" + parsedDate2.format(formatter) + ", '"
						+ Integer.parseInt(input[6]) + ", '" + Integer.parseInt(input[7]) + ", '"
						+ Integer.parseInt(input[8]) + ", '" + Integer.parseInt(input[9]) + ");";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
					System.out.println(
							"________________________________________________________________________________");
				}
			}
		} catch (

		IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addHotel() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Hotel.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");

				String query = "INSERT INTO " + "Hotel (Name, hotelID, Rooms_Available, DName)" + "VALUES (" + input[0]
						+ ", '" + Integer.parseInt(input[1]) + ", '" + Integer.parseInt(input[2]) + ", '" + input[3]
						+ "');";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addRegistration() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Registration.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
				LocalDateTime parsedDate = LocalDateTime.parse(input[2], formatter);
				String query = "INSERT INTO " + "Registration (Name, Time, SSN)" + "VALUES (" + input[0] + ", '"
						+ input[1] + ", '" + parsedDate.format(formatter) + "');";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addReservation() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Reservation.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
				LocalDateTime parsedDate = LocalDateTime.parse(input[1], formatter);
				String query = "INSERT INTO " + "Reservation (id, time, visa, confirmation, Type, Cid, SSN)"
						+ "VALUES (" + Integer.parseInt(input[0]) + ", '" + parsedDate.format(formatter) + ", '"
						+ Integer.parseInt(input[2]) + ", '" + Integer.parseInt(input[3]) + ", '" + input[4] + ",'"
						+ Integer.parseInt(input[5]) + ", '" + Integer.parseInt(input[6]) + "');";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addRoom() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Room.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
				LocalDateTime parsedDate = LocalDateTime.parse(input[4], formatter);
				LocalDateTime parsedDate2 = LocalDateTime.parse(input[5], formatter);
				String query = "INSERT INTO "
						+ "Room (roomID, Bedrooms, sight, RName, Price, PriceWithDiscount, rating, id, hotelID, FromTime, ToTime)"
						+ "VALUES (" + Integer.parseInt(input[0]) + ", '" + Integer.parseInt(input[1]) + "', '"
						+ Integer.parseInt(input[2]) + "', " + input[3] + ", " + Integer.parseInt(input[4]) + ", '"
						+ Integer.parseInt(input[5]) + ", '" + Integer.parseInt(input[6]) + ", '"
						+ Integer.parseInt(input[7]) + ", '" + Integer.parseInt(input[8]) + ", '"
						+ parsedDate.format(formatter) + ", '" + parsedDate2.format(formatter) + ");";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
					System.out.println(
							"________________________________________________________________________________");
				}
			}
		} catch (

		IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addUpdate() {
		String[] input;
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Data\\Update.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				if (count == 0) {
					count++;
					continue;
				}
				input = st.split(";");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
				LocalDateTime parsedDate = LocalDateTime.parse(input[0], formatter);
				String query = "INSERT INTO " + "Update (Time, Name, Description)" + "VALUES (" + parsedDate.format(formatter)
						+ input[1] + ", '" + input[2] + ");";

				try {
					Statement str = conn.createStatement();
					str.executeUpdate(query);
					// System.out.println("________________________________________________________________________________");
					// System.out.println(query);
				} catch (SQLException e) {
					System.out.println(
							"________________________________________________________________________________");
					System.out.println(query);
					System.out.print("Got error: ");
					System.out.print(e.getErrorCode());
					System.out.print("\nSQL State: ");
					System.out.println(e.getSQLState());
					System.out.println(e.getMessage());
					System.out.println(
							"________________________________________________________________________________");
				}
			}
		} catch (

		IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void enableForeingKeys() {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Queries\\4-Enable_Foreign_Keys.sql");
		Scanner scan = null;
		try {
			scan = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String query = "";
		try {
			while (scan.hasNextLine()) {
				query += scan.nextLine() + "\n";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(query);
		try {
			Statement statement = conn.createStatement();
			statement.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void disableForeingKeys() {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Queries\\3-Disable_Foreign_Keys.sql");
		Scanner scan = null;
		try {
			scan = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String query = "";
		try {
			while (scan.hasNextLine()) {
				query += scan.nextLine() + "\n";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(query);

		try {
			Statement statement = conn.createStatement();
			statement.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void deleteAllData() {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Queries\\R-DeleteData.sql");
		Scanner scan = null;
		try {
			scan = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String query = "";
		try {
			while (scan.hasNextLine()) {
				query += scan.nextLine() + "\n";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(query);
		try {
			Statement statement = conn.createStatement();
			statement.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Main Module
	 *
	 * @param args A {@link String} array containing the command line arguments
	 *             passed to the program
	 */
	public static void main(String[] args) {

		SimpleJDBC anObj = new SimpleJDBC();
		conn = anObj.getDBConnection();

		if (conn == null) {
			return;
		}

		System.out.println("WELCOME TO JDBC program ! \n\n");
		// note remember to change the path and file names of the csv files
		// provided and alter then inputs if needed

		//disableForeingKeys();
		//deleteAllData();
		//addCar();
		//addAirline();
		//addAirport();
		//addCustomer();
		//addEmployee();
		//addCarRentalOffice();
		//addDestination();
		//addFlight();
		//addHotel();
		//addRegistration();
		//addReservation();
		//addRoom();
		//addUpdate();
		enableForeingKeys();
	}

}
