import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import net.proteanit.sql.DbUtils;

public class DatabaseQueries {
	private int lastLogID;
	private static boolean dbDriverLoaded = false;
	private static Connection conn = null;

	public DatabaseQueries() {
		conn = getDBConnection();
	}

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

	public boolean getUser(String username, String password, String position) {
		System.out.println("Username: " + username + "\nPassword: " + password + "\nPosition: " + position);
		String query = "";
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			query = "SELECT Position, Name FROM Accounts WHERE Username='" + username + "' AND UserPassword ='"
					+ password + "';";
			System.out.println(query);
			statement = conn.createStatement();
			resultSet = statement.executeQuery(query);

			if (!resultSet.next())
				return false;

			DataBasesTeamTwentyThree.username = username;
			DataBasesTeamTwentyThree.isIT = resultSet.getBoolean("Position");
			DataBasesTeamTwentyThree.isCaller = resultSet.getBoolean("Position");
			DataBasesTeamTwentyThree.isManagement = resultSet.getBoolean("Position");
			DataBasesTeamTwentyThree.usersNameLbl.setText(resultSet.getString("Name"));

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return true;
	}

	public void DeleteAllData() {

		/*
		 * disables FKs
		 */
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Queries\\3-Disable-Foreign_Keys.sql");
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

		/*
		 * delete all data
		 */
		file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Queries\\R-DeleteData.sql");
		scan = null;
		try {
			scan = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		query = "";
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

		/*
		 * enable FKs
		 */
		file = new File("C:\\Users\\Nirchis\\Desktop\\Database\\Queries\\4-Enable_Foreign_Keys.sql");
		scan = null;
		try {
			scan = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		query = "";
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

	public void setTables() {
		String query = "";
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {

			query = "SELECT * FROM Car;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.carTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Airline;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.airlineTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Customer;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.customerTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Airport;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.airportTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM CarRentalOffice;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.carRentalOfficeTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Employee;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.employeesTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Flight;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.flightTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Destination;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.destinationTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Hotel;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.hotelTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Registration;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.registrationTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Reservation;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.reservationTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Room;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.roomTable.setModel(DbUtils.resultSetToTableModel(rs));

			query = "SELECT * FROM Update;";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			DataBasesTeamTwentyThree.updateTable.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void Insert(String table, String[] values) {

		String lastValues = "(";
		for (int i = 0; i < values.length; i++) {
			if (i != values.length - 1 && values[i].isEmpty())
				lastValues += "NULL,";
			else if (i != values.length - 1)
				lastValues += "'" + values[i] + "',";
			else if (values[i].isEmpty())
				lastValues += "NULL)";
			else
				lastValues += "'" + values[i] + "');";
		}
		String query = "";
		Statement statement = null;
		try {
			query = "INSERT INTO " + table + " VALUES " + lastValues;
			System.out.println(query);
			statement = conn.createStatement();
			statement.execute(query);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		updateLogFile("Inserted into " + table + " :with id " + values[0]);
	}

	public boolean Update(int id, String tableName, String[] values, String[] columns) {

		String query = "";
		Statement statement = null;
		try {
			query = "SELECT * FROM " + tableName + " WHERE " + columns[0] + "='" + id + "';";
			statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (!rs.next())
				return false;

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		String lastValues = "";
		for (int i = 0; i < values.length; i++) {
			if (values[i].isEmpty())
				continue;
			lastValues = columns[i] + "='" + values[i] + "',";
		}
		String str = "";
		for (int i = 0; i < lastValues.length() - 1; i++) {
			str += lastValues.charAt(i);
		}
		lastValues = str;
		System.out.println("Update function");
		System.out.println(lastValues);
		try {
			query = "UPDATE " + tableName + " SET " + lastValues + " WHERE " + columns[0] + "='" + id + "';";
			System.out.println(query);
			statement = conn.createStatement();
			statement.execute(query);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		str = "";
		for (int i = 0; i < lastValues.length() - 1; i++) {
			str += lastValues.charAt(i);
		}
		lastValues = str;
		updateLogFile("Updated " + tableName + " :with id " + values[0] + " the columns " + lastValues);

		return true;
	}

	private void updateLogFile(String change) {
		String str = "";
		for (int i = 0; i < change.length(); i++) {
			if (change.charAt(i) != '\'')
				str += change.charAt(i);
		}
		change = str;
		System.out.println(change);

		java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		String query = "";
		Statement statement = null;
		try {
			query = "INSERT INTO Update VALUES ('" + currentTimestamp +"','" + DataBasesTeamTwentyThree.username + "','"
					+  "','" + change + "');";
			System.out.println(query);
			statement = conn.createStatement();
			statement.execute(query);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public boolean checkIfInt(String[] intFlag) {
		for (int i = 0; i < intFlag.length; i++) {
			if (!checkIfInt(intFlag[i]))
				return false;
		}
		return true;
	}

	public boolean checkIfInt(String intFlag) {
		try {
			Integer.parseInt(intFlag);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean checkIfValidId(String columnId, String table, String id) {
		if (!checkIfInt(id))
			return false;
		String query = "";
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			query = "SELECT * FROM " + table + " WHERE " + columnId + "='" + id + "';";
			System.out.println(query);
			statement = conn.createStatement();
			resultSet = statement.executeQuery(query);

			if (resultSet.next())
				return false;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}

		return true;
	}

	private void ShowResults(ResultSet rs) {
		try {
			DataBasesTeamTwentyThree.resultsTable.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	public void q1(String value) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q1(?)}");
			cst.setString(1, value);

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q2(String Date) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q2(?)}");
			cst.setString(1, Date);

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q3(int val1, int val2) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q3(?,?)}");
			cst.setInt(1, val1);
			cst.setInt(2, val2);
			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q4(String date1, String date2) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q4(?,?)}");
			cst.setString(1, date1);
			cst.setString(2, date2);

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q5(String date1, String date2) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q5(?,?)}");
			cst.setString(1, date1);
			cst.setString(2, date2);
			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q6(String date1, String date2) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q6(?,?)}");
			cst.setString(1, date1);
			cst.setString(2, date2);
			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q7() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q7()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q8(int val) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q8(?)}");
			cst.setInt(1, val);
			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q9() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q9()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q10() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q10()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q11(String date1, String date2) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q11(?,?)}");
			cst.setString(1, date1);
			cst.setString(2, date2);
			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q12(String date1, String date2) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q12(?,?)}");
			cst.setString(1, date1);
			cst.setString(2, date2);
			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q13(int val) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q13(?)}");
			cst.setInt(1, val);
			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q14(int val) {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q14(?)}");
			cst.setInt(1, val);
			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}

	public void q15() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q15()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}
	
	public void q17() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q15()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}
	public void q18() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q15()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}
	public void q19() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q15()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}
	public void q20() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q15()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}
	public void q21() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q15()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}
	public void q22() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q15()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}
	public void q23() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q15()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}
	public void q24() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q15()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}
	public void q25() {
		CallableStatement cst = null;
		ResultSet rs = null;
		try {
			cst = conn.prepareCall("{call q15()}");

			if (!cst.execute()) {
				System.out.println("Wrong input");
				return;
			}
			cst.execute();
			rs = cst.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ShowResults(rs);
	}
	
	public String setDateFormat(String date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date dateD;
		try {
			dateD = (Date) format.parse(date);
		} catch (ParseException e) {
			// TODO: handle exception
			date = null;
			return date;
		}

		return dateD.toString();
	}

}
