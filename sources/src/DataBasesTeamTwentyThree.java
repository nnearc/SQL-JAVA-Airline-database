import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class DataBasesTeamTwentyThree {

	private static int queryNumber = 0;
	private boolean isConnected = false;
	public static boolean isIT = false;
	public static boolean isCaller = false;
	public static boolean isManagement = false;
	private DatabaseQueries dataBaseQueries = new DatabaseQueries();
	public static String username = "";

	private JFrame frame;

	public static JTable customerTable;
	public static JTable employeesTable;
	public static JTable resultsTable;
	public static JTable usersTable;
	public static JLabel usersNameLbl;
	public static JTable carTable;
	public static JTable airlineTable;
	public static JTable airportTable;
	public static JTable carRentalOfficeTable;
	public static JTable destinationTable;
	public static JTable flightTable;
	public static JTable hotelTable;
	public static JTable registrationTable;
	public static JTable reservationTable;
	public static JTable roomTable;
	public static JTable updateTable;

	private JTextField customersCustomerIdTxt;
	private JTextField customersFnameTxt;
	private JTextField customersLnameTxt;
	private JTextField customerEmailTxt;
	private JTextField customersPhoneTxt;
	private JTextField customersStreetTxt;
	private JTextField customersPostcodeTxt;
	private JTextField customersAddressNumTxt;
	private JTextField employeeEmployeeSSNTxt;
	private JTextField employeePositionTxt;
	private JTextField employeeFnameTxt;
	private JTextField employeeLnameTxt;
	private JTextField employeeEmailTxt;
	private JTextField employeeAddressTxt;
	private JTextField employeePhoneTxt;
	private JTextField employeeMobilePhoneTxt;
	private JTextField employeeManageSSNTxt;
	private JTextField reservationIdTxt;
	private JTextField reservationTimeTxt;
	private JTextField reservationVisaTxt;
	private JTextField reservationConfirmationTxt;
	private JTextField reservationTypeTxt;
	private JTextField reservationCidTxt;
	private JTextField reservationSSNTxt;
	private JTextField usersUsernameTxt;
	private JTextField usersPasswordTxt;
	private JTextField parameterBox1Txt;
	private JTextField parameterBox2Txt;
	private JTextField parameterBox3Txt;
	private JTextField parameterBox4Txt;
	private JTextField parameterBox5Txt;
	private JTextField parameterBox6Txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataBasesTeamTwentyThree window = new DataBasesTeamTwentyThree();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DataBasesTeamTwentyThree() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 1566, 901);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel Title = new JLabel("Team 23");
		Title.setForeground(Color.BLACK);
		Title.setFont(new Font("Times New Roman", Font.BOLD, 30));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(643, 11, 249, 79);
		frame.getContentPane().add(Title);

		JLabel consolLabel = new JLabel("Console:");
		consolLabel.setForeground(Color.BLUE);
		consolLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		consolLabel.setBounds(162, 667, 80, 31);
		frame.getContentPane().add(consolLabel);

		JPanel strConsole = new JPanel();
		strConsole.setBackground(Color.LIGHT_GRAY);
		strConsole.setBounds(162, 709, 1365, 130);
		frame.getContentPane().add(strConsole);

		JButton query1a = new JButton("Query1a");
		query1a.setVisible(false);
		query1a.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1a.setForeground(Color.BLUE);
		query1a.setBounds(37, 114, 115, 35);
		frame.getContentPane().add(query1a);

		JButton query1b = new JButton("query1b");
		query1b.setVisible(false);
		query1b.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1b.setForeground(Color.BLUE);
		query1b.setBounds(37, 160, 115, 35);
		frame.getContentPane().add(query1b);

		JButton query1c = new JButton("query1c");
		query1c.setVisible(false);
		query1c.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1c.setForeground(Color.BLUE);
		query1c.setBounds(37, 206, 115, 35);
		frame.getContentPane().add(query1c);

		JButton query1d = new JButton("query1d");
		query1d.setVisible(false);
		query1d.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1d.setForeground(Color.BLUE);
		query1d.setBounds(37, 252, 115, 35);
		frame.getContentPane().add(query1d);

		JButton query1e = new JButton("query1e");
		query1e.setVisible(false);
		query1e.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1e.setForeground(Color.BLUE);
		query1e.setBounds(37, 298, 115, 35);
		frame.getContentPane().add(query1e);

		JButton query1f = new JButton("query1f");
		query1f.setVisible(false);
		query1f.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1f.setForeground(Color.BLUE);
		query1f.setBounds(37, 344, 115, 35);
		frame.getContentPane().add(query1f);

		JButton query1g = new JButton("query1g");
		query1g.setVisible(false);
		query1g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1g.setForeground(Color.BLUE);
		query1g.setBounds(37, 390, 115, 35);
		frame.getContentPane().add(query1g);

		JButton query1h = new JButton("query1h");
		query1h.setVisible(false);
		query1h.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1h.setForeground(Color.BLUE);
		query1h.setBounds(37, 436, 115, 35);
		frame.getContentPane().add(query1h);

		JButton query1i = new JButton("query1i");
		query1i.setVisible(false);
		query1i.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1i.setForeground(Color.BLUE);
		query1i.setBounds(37, 482, 115, 35);
		frame.getContentPane().add(query1i);

		JButton query1j = new JButton("query1j");
		query1j.setVisible(false);
		query1j.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1j.setForeground(Color.BLUE);
		query1j.setBounds(37, 528, 115, 35);
		frame.getContentPane().add(query1j);

		JButton query1k = new JButton("query1k");
		query1k.setVisible(false);
		query1k.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1k.setForeground(Color.BLUE);
		query1k.setBounds(37, 574, 115, 35);
		frame.getContentPane().add(query1k);

		JButton query1l = new JButton("query1l");
		query1l.setVisible(false);
		query1l.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1l.setForeground(Color.BLUE);
		query1l.setBounds(37, 620, 115, 35);
		frame.getContentPane().add(query1l);

		JButton query1m = new JButton("query1m");
		query1m.setVisible(false);
		query1m.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1m.setForeground(Color.BLUE);
		query1m.setBounds(37, 666, 115, 35);
		frame.getContentPane().add(query1m);

		JButton query1n = new JButton("query1n");
		query1n.setVisible(false);
		query1n.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1n.setForeground(Color.BLUE);
		query1n.setBounds(37, 712, 115, 35);
		frame.getContentPane().add(query1n);

		JButton query1o = new JButton("query1o");
		query1o.setVisible(false);
		query1o.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query1o.setForeground(Color.BLUE);
		query1o.setBounds(37, 758, 115, 35);
		frame.getContentPane().add(query1o);

		JButton query2b = new JButton("query2b");
		query2b.setVisible(false);
		query2b.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query2b.setForeground(Color.BLUE);
		query2b.setBounds(37, 848, 115, 35);
		frame.getContentPane().add(query2b);

		JButton query2c = new JButton("query2c");
		query2c.setVisible(false);
		query2c.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query2c.setForeground(Color.BLUE);
		query2c.setBounds(37, 892, 115, 35);
		frame.getContentPane().add(query2c);

		JButton query2d = new JButton("query2d");
		query2d.setVisible(false);
		query2d.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query2d.setForeground(Color.BLUE);
		query2d.setBounds(37, 936, 115, 35);
		frame.getContentPane().add(query2d);

		JButton query2e = new JButton("query2e");
		query2e.setVisible(false);
		query2e.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query2e.setForeground(Color.BLUE);
		query2e.setBounds(180, 848, 115, 35);
		frame.getContentPane().add(query2e);

		JButton query2f = new JButton("query2f");
		query2f.setVisible(false);
		query2f.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query2f.setForeground(Color.BLUE);
		query2f.setBounds(180, 892, 115, 35);
		frame.getContentPane().add(query2f);

		JButton query2g = new JButton("query2g");
		query2g.setVisible(false);
		query2g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query2g.setForeground(Color.BLUE);
		query2g.setBounds(180, 936, 115, 35);
		frame.getContentPane().add(query2g);

		JButton query2h = new JButton("query2h");
		query2h.setVisible(false);
		query2h.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query2h.setForeground(Color.BLUE);
		query2h.setBounds(320, 848, 115, 35);
		frame.getContentPane().add(query2h);

		JButton query2i = new JButton("query2i");
		query2i.setVisible(false);
		query2i.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query2i.setForeground(Color.BLUE);
		query2i.setBounds(320, 892, 115, 35);
		frame.getContentPane().add(query2i);

		JButton query2j = new JButton("query2j");
		query2j.setVisible(false);
		query2j.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		query2j.setForeground(Color.BLUE);
		query2j.setBounds(320, 936, 115, 35);
		frame.getContentPane().add(query2j);

		JTabbedPane tabbedPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedPanel.setBounds(162, 114, 1365, 542);
		frame.getContentPane().add(tabbedPanel);

		JPanel userTab = new JPanel();
		userTab.setBackground(Color.WHITE);
		tabbedPanel.addTab("Users", null, userTab, null);
		userTab.setLayout(null);

		JScrollPane scrollPaneUser = new JScrollPane();
		scrollPaneUser.setBounds(600, 11, 1155, 475);
		userTab.add(scrollPaneUser);

		usersTable = new JTable();
		scrollPaneUser.setViewportView(usersTable);

		usersUsernameTxt = new JTextField();
		usersUsernameTxt.setBounds(109, 10, 87, 26);
		userTab.add(usersUsernameTxt);
		usersUsernameTxt.setColumns(10);

		JLabel usersUsernamelbl = new JLabel("Username");
		usersUsernamelbl.setBounds(10, 11, 89, 24);
		userTab.add(usersUsernamelbl);

		JLabel usersPasswordlbl = new JLabel("Password");
		usersPasswordlbl.setBounds(10, 48, 89, 24);
		userTab.add(usersPasswordlbl);

		usersPasswordTxt = new JTextField();
		usersPasswordTxt.setColumns(10);
		usersPasswordTxt.setBounds(109, 47, 87, 26);
		userTab.add(usersPasswordTxt);

		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(33, 83, 115, 35);
		userTab.add(loginBtn);
		loginBtn.setForeground(Color.BLUE);
		loginBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		JButton employeesInsertBtn = new JButton("Insert");
		employeesInsertBtn.setBounds(104, 451, 89, 23);
		employeesInsertBtn.setVisible(false);
		userTab.add(employeesInsertBtn);

		JButton employeesUpdateBtn = new JButton("Update");
		employeesUpdateBtn.setBounds(14, 451, 89, 23);
		employeesUpdateBtn.setVisible(false);
		userTab.add(employeesUpdateBtn);

		JLabel lblEmployees = new JLabel("Employees");
		lblEmployees.setBounds(10, 140, 82, 14);
		lblEmployees.setVisible(false);
		userTab.add(lblEmployees);

		JLabel lblEmployeeSSN = new JLabel("SSN");
		lblEmployeeSSN.setBounds(10, 166, 82, 14);
		lblEmployeeSSN.setVisible(false);
		userTab.add(lblEmployeeSSN);

		employeeEmployeeSSNTxt = new JTextField();
		employeeEmployeeSSNTxt.setColumns(10);
		employeeEmployeeSSNTxt.setBounds(102, 165, 86, 20);
		employeeEmployeeSSNTxt.setVisible(false);
		userTab.add(employeeEmployeeSSNTxt);

		JLabel lblPosition = new JLabel("Position");
		lblPosition.setBounds(10, 192, 82, 14);
		lblPosition.setVisible(false);
		userTab.add(lblPosition);

		employeePositionTxt = new JTextField();
		employeePositionTxt.setColumns(10);
		employeePositionTxt.setBounds(102, 191, 86, 20);
		employeePositionTxt.setVisible(false);
		userTab.add(employeePositionTxt);

		JLabel lblFname_1 = new JLabel("Fname");
		lblFname_1.setBounds(10, 218, 82, 14);
		lblFname_1.setVisible(false);
		userTab.add(lblFname_1);

		employeeFnameTxt = new JTextField();
		employeeFnameTxt.setColumns(10);
		employeeFnameTxt.setBounds(102, 217, 86, 20);
		employeeFnameTxt.setVisible(false);
		userTab.add(employeeFnameTxt);

		JLabel lblLname_1 = new JLabel("Lname");
		lblLname_1.setBounds(10, 244, 82, 14);
		lblLname_1.setVisible(false);
		userTab.add(lblLname_1);

		employeeLnameTxt = new JTextField();
		employeeLnameTxt.setColumns(10);
		employeeLnameTxt.setBounds(102, 243, 86, 20);
		employeeLnameTxt.setVisible(false);
		userTab.add(employeeLnameTxt);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 296, 82, 14);
		lblEmail.setVisible(false);
		userTab.add(lblEmail);

		employeeEmailTxt = new JTextField();
		employeeEmailTxt.setColumns(10);
		employeeEmailTxt.setBounds(102, 295, 86, 20);
		employeeEmailTxt.setVisible(false);
		userTab.add(employeeEmailTxt);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 322, 82, 14);
		lblAddress.setVisible(false);
		userTab.add(lblAddress);

		employeeAddressTxt = new JTextField();
		employeeAddressTxt.setColumns(10);
		employeeAddressTxt.setBounds(102, 321, 86, 20);
		employeeAddressTxt.setVisible(false);
		userTab.add(employeeAddressTxt);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(10, 348, 82, 14);
		lblPhone.setVisible(false);
		userTab.add(lblPhone);

		employeePhoneTxt = new JTextField();
		employeePhoneTxt.setColumns(10);
		employeePhoneTxt.setBounds(102, 347, 86, 20);
		employeePhoneTxt.setVisible(false);
		userTab.add(employeePhoneTxt);

		JLabel lblMobilePhone = new JLabel("Mobile_Phone");
		lblMobilePhone.setBounds(10, 374, 82, 14);
		lblMobilePhone.setVisible(false);
		userTab.add(lblMobilePhone);

		employeeMobilePhoneTxt = new JTextField();
		employeeMobilePhoneTxt.setColumns(10);
		employeeMobilePhoneTxt.setBounds(102, 373, 86, 20);
		employeeMobilePhoneTxt.setVisible(false);
		userTab.add(employeeMobilePhoneTxt);

		JLabel lblManageSSN = new JLabel("Manage_SSN");
		lblManageSSN.setBounds(10, 400, 82, 14);
		lblManageSSN.setVisible(false);
		userTab.add(lblManageSSN);

		employeeManageSSNTxt = new JTextField();
		employeeManageSSNTxt.setColumns(10);
		employeeManageSSNTxt.setBounds(102, 399, 86, 20);
		employeeManageSSNTxt.setVisible(false);
		userTab.add(employeeManageSSNTxt);

		JButton customersUpdateBtn = new JButton("Update");
		customersUpdateBtn.setBounds(210, 452, 89, 23);
		customersUpdateBtn.setVisible(false);
		userTab.add(customersUpdateBtn);

		JButton customersInsertBtn = new JButton("Insert");
		customersInsertBtn.setBounds(300, 452, 89, 23);
		customersInsertBtn.setVisible(false);
		userTab.add(customersInsertBtn);

		JLabel lblCustomers = new JLabel("Customers");
		lblCustomers.setBounds(206, 136, 82, 14);
		lblCustomers.setVisible(false);
		userTab.add(lblCustomers);

		JLabel lblCustomerid = new JLabel("CustomerID");
		lblCustomerid.setBounds(206, 166, 82, 14);
		lblCustomerid.setVisible(false);
		userTab.add(lblCustomerid);

		customersCustomerIdTxt = new JTextField();
		customersCustomerIdTxt.setColumns(10);
		customersCustomerIdTxt.setBounds(298, 165, 86, 20);
		customersCustomerIdTxt.setVisible(false);
		userTab.add(customersCustomerIdTxt);

		JLabel lblFname = new JLabel("Fname");
		lblFname.setBounds(206, 196, 82, 14);
		lblFname.setVisible(false);
		userTab.add(lblFname);

		customersFnameTxt = new JTextField();
		customersFnameTxt.setColumns(10);
		customersFnameTxt.setBounds(298, 196, 86, 20);
		customersFnameTxt.setVisible(false);
		userTab.add(customersFnameTxt);

		JLabel lblLname = new JLabel("Lname");
		lblLname.setBounds(206, 226, 82, 14);
		lblLname.setVisible(false);
		userTab.add(lblLname);

		customersLnameTxt = new JTextField();
		customersLnameTxt.setColumns(10);
		customersLnameTxt.setBounds(298, 226, 86, 20);
		customersLnameTxt.setVisible(false);
		userTab.add(customersLnameTxt);

		JLabel lblCustomerEmail = new JLabel("Email");
		lblCustomerEmail.setBounds(206, 295, 82, 14);
		lblCustomerEmail.setVisible(false);
		userTab.add(lblCustomerEmail);

		customerEmailTxt = new JTextField();
		customerEmailTxt.setColumns(10);
		customerEmailTxt.setBounds(298, 298, 86, 20);
		customerEmailTxt.setVisible(false);
		userTab.add(customerEmailTxt);

		JLabel lblCustomerPhone = new JLabel("Phone");
		lblCustomerPhone.setBounds(206, 321, 82, 14);
		lblCustomerPhone.setVisible(false);
		userTab.add(lblCustomerPhone);

		customersPhoneTxt = new JTextField();
		customersPhoneTxt.setColumns(10);
		customersPhoneTxt.setBounds(298, 321, 86, 20);
		customersPhoneTxt.setVisible(false);
		userTab.add(customersPhoneTxt);

		JLabel lblStreet = new JLabel("Street");
		lblStreet.setBounds(206, 347, 82, 14);
		lblStreet.setVisible(false);
		userTab.add(lblStreet);

		customersStreetTxt = new JTextField();
		customersStreetTxt.setColumns(10);
		customersStreetTxt.setBounds(298, 347, 86, 20);
		customersStreetTxt.setVisible(false);
		userTab.add(customersStreetTxt);

		JLabel lblPostcode = new JLabel("Postcode");
		lblPostcode.setBounds(206, 373, 82, 14);
		lblPostcode.setVisible(false);
		userTab.add(lblPostcode);

		customersPostcodeTxt = new JTextField();
		customersPostcodeTxt.setColumns(10);
		customersPostcodeTxt.setBounds(298, 373, 86, 20);
		customersPostcodeTxt.setVisible(false);
		userTab.add(customersPostcodeTxt);

		JLabel lblAddressNum = new JLabel("Address Num");
		lblAddressNum.setBounds(206, 399, 82, 14);
		lblAddressNum.setVisible(false);
		userTab.add(lblAddressNum);

		customersAddressNumTxt = new JTextField();
		customersAddressNumTxt.setColumns(10);
		customersAddressNumTxt.setBounds(298, 399, 86, 20);
		customersAddressNumTxt.setVisible(false);
		userTab.add(customersAddressNumTxt);
		
		JButton reservationUpdateBtn = new JButton("Update");
		reservationUpdateBtn.setBounds(406, 452, 89, 23);
		reservationUpdateBtn.setVisible(false);
		userTab.add(reservationUpdateBtn);

		JButton reservationInsertBtn = new JButton("Insert");
		reservationInsertBtn.setBounds(496, 452, 89, 23);
		reservationInsertBtn.setVisible(false);
		userTab.add(reservationInsertBtn);

		JLabel lblReservation = new JLabel("Reservation");
		lblReservation.setBounds(406, 136, 82, 14);
		lblReservation.setVisible(false);
		userTab.add(lblReservation);

		JLabel lblReservationid = new JLabel("ReservationID");
		lblReservationid.setBounds(406, 166, 82, 14);
		lblReservationid.setVisible(false);
		userTab.add(lblReservationid);

		reservationIdTxt = new JTextField();
		reservationIdTxt.setColumns(10);
		reservationIdTxt.setBounds(498, 165, 86, 20);
		reservationIdTxt.setVisible(false);
		userTab.add(reservationIdTxt);

		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(406, 196, 82, 14);
		lblTime.setVisible(false);
		userTab.add(lblTime);

		reservationTimeTxt = new JTextField();
		reservationTimeTxt.setColumns(10);
		reservationTimeTxt.setBounds(498, 196, 86, 20);
		reservationTimeTxt.setVisible(false);
		userTab.add(reservationTimeTxt);

		JLabel lblVisa = new JLabel("Visa");
		lblVisa.setBounds(406, 226, 82, 14);
		lblVisa.setVisible(false);
		userTab.add(lblVisa);

		reservationVisaTxt = new JTextField();
		reservationVisaTxt.setColumns(10);
		reservationVisaTxt.setBounds(498, 226, 86, 20);
		reservationVisaTxt.setVisible(false);
		userTab.add(reservationVisaTxt);

		JLabel lblConfirmation = new JLabel("Confirmation");
		lblConfirmation.setBounds(406, 295, 82, 14);
		lblConfirmation.setVisible(false);
		userTab.add(lblConfirmation);

		reservationConfirmationTxt = new JTextField();
		reservationConfirmationTxt.setColumns(10);
		reservationConfirmationTxt.setBounds(498, 298, 86, 20);
		reservationConfirmationTxt.setVisible(false);
		userTab.add(reservationConfirmationTxt);

		JLabel lblType = new JLabel("Type");
		lblType.setBounds(406, 321, 82, 14);
		lblType.setVisible(false);
		userTab.add(lblType);

		reservationTypeTxt = new JTextField();
		reservationTypeTxt.setColumns(10);
		reservationTypeTxt.setBounds(498, 321, 86, 20);
		reservationTypeTxt.setVisible(false);
		userTab.add(reservationTypeTxt);

		JLabel lblCid = new JLabel("CustomerID");
		lblCid.setBounds(406, 347, 82, 14);
		lblCid.setVisible(false);
		userTab.add(lblCid);

		reservationCidTxt = new JTextField();
		reservationCidTxt.setColumns(10);
		reservationCidTxt.setBounds(498, 347, 86, 20);
		reservationCidTxt.setVisible(false);
		userTab.add(reservationCidTxt);

		JLabel lblSSN = new JLabel("SSN");
		lblSSN.setBounds(406, 399, 82, 14);
		lblSSN.setVisible(false);
		userTab.add(lblSSN);

		reservationSSNTxt = new JTextField();
		reservationSSNTxt.setColumns(10);
		reservationSSNTxt.setBounds(498, 399, 86, 20);
		reservationSSNTxt.setVisible(false);
		userTab.add(reservationSSNTxt);

		JPanel resultsTab = new JPanel();
		tabbedPanel.addTab("Results", null, resultsTab, null);
		resultsTab.setLayout(null);

		JScrollPane scrollPane_14 = new JScrollPane();
		scrollPane_14.setBounds(10, 11, 1340, 492);
		resultsTab.add(scrollPane_14);

		resultsTable = new JTable();
		scrollPane_14.setViewportView(resultsTable);

		JLabel queryNoDisplay = new JLabel("");
		queryNoDisplay.setFont(new Font("Times New Roman", Font.BOLD, 17));
		queryNoDisplay.setBounds(826, 667, 175, 31);
		frame.getContentPane().add(queryNoDisplay);

		JButton executeQueryBtn = new JButton("Execute");
		executeQueryBtn.setForeground(new Color(0, 128, 0));
		executeQueryBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		executeQueryBtn.setBounds(37, 11, 115, 35);
		frame.getContentPane().add(executeQueryBtn);

		JButton nullQueryBtn = new JButton("Null");
		nullQueryBtn.setForeground(Color.BLACK);
		nullQueryBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		nullQueryBtn.setBounds(37, 57, 115, 35);
		frame.getContentPane().add(nullQueryBtn);

		JButton initializeAllDataBtn = new JButton("Initialize Data");
		initializeAllDataBtn.setVisible(false);
		initializeAllDataBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SimpleJDBC.main(null);
				dataBaseQueries.setTables();
			}
		});
		initializeAllDataBtn.setForeground(Color.BLACK);
		initializeAllDataBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		initializeAllDataBtn.setBounds(162, 55, 115, 35);
		frame.getContentPane().add(initializeAllDataBtn);

		JButton deleteBtn = new JButton("Delete");
		deleteBtn.setVisible(false);
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataBaseQueries.DeleteAllData();
			}
		});
		deleteBtn.setForeground(new Color(255, 0, 0));
		deleteBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		deleteBtn.setBounds(162, 11, 115, 35);
		frame.getContentPane().add(deleteBtn);

		usersNameLbl = new JLabel("");
		usersNameLbl.setForeground(Color.DARK_GRAY);
		usersNameLbl.setFont(new Font("Times New Roman", Font.BOLD, 16));
		usersNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		usersNameLbl.setBounds(1365, 11, 162, 51);
		frame.getContentPane().add(usersNameLbl);

		JButton logoutBtn = new JButton("Logout");
		logoutBtn.setVisible(false);
		logoutBtn.setForeground(Color.BLUE);
		logoutBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		logoutBtn.setBounds(1395, 73, 115, 35);
		frame.getContentPane().add(logoutBtn);

		parameterBox1Txt = new JTextField();
		parameterBox1Txt.setVisible(false);
		parameterBox1Txt.setBounds(241, 674, 115, 20);
		frame.getContentPane().add(parameterBox1Txt);
		parameterBox1Txt.setColumns(10);

		parameterBox2Txt = new JTextField();
		parameterBox2Txt.setVisible(false);
		parameterBox2Txt.setColumns(10);
		parameterBox2Txt.setBounds(366, 674, 115, 20);
		frame.getContentPane().add(parameterBox2Txt);

		parameterBox3Txt = new JTextField();
		parameterBox3Txt.setVisible(false);
		parameterBox3Txt.setColumns(10);
		parameterBox3Txt.setBounds(491, 674, 115, 20);
		frame.getContentPane().add(parameterBox3Txt);

		parameterBox4Txt = new JTextField();
		parameterBox4Txt.setVisible(false);
		parameterBox4Txt.setColumns(10);
		parameterBox4Txt.setBounds(616, 674, 115, 20);
		frame.getContentPane().add(parameterBox4Txt);

		parameterBox5Txt = new JTextField();
		parameterBox5Txt.setVisible(false);
		parameterBox5Txt.setColumns(10);
		parameterBox5Txt.setBounds(741, 674, 115, 20);
		frame.getContentPane().add(parameterBox5Txt);

		parameterBox6Txt = new JTextField();
		parameterBox6Txt.setVisible(false);
		parameterBox6Txt.setColumns(10);
		parameterBox6Txt.setBounds(866, 674, 115, 20);
		frame.getContentPane().add(parameterBox6Txt);

		JLabel display = new JLabel("");
		display.setPreferredSize(strConsole.getSize());
		display.setHorizontalAlignment(0);
		display.setVerticalAlignment(1);
		display.setFont(new Font("Courier New", Font.BOLD, 18));
		display.setForeground(Color.BLUE);

		query1a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 1;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1a");
				display.setText(StringStatics.query1astr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});
		query1b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				queryNumber = 2;
				// TODO Auto-generated method stub
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1b");
				display.setText(StringStatics.query1bstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				queryNumber = 3;
				// TODO Auto-generated method stub
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1c");
				display.setText(StringStatics.query1cstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 4;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1d");
				display.setText(StringStatics.query1dstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1e.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(true);
				parameterBox4Txt.setVisible(true);
				parameterBox5Txt.setVisible(true);
				parameterBox6Txt.setVisible(true);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNumber = 5;
				queryNoDisplay.setText("query1e");
				display.setText(StringStatics.query1estr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1f.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(true);
				parameterBox4Txt.setVisible(true);
				parameterBox5Txt.setVisible(true);
				parameterBox6Txt.setVisible(true);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNumber = 6;
				queryNoDisplay.setText("query1f");
				display.setText(StringStatics.query1fstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1g.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(true);
				parameterBox4Txt.setVisible(true);
				parameterBox5Txt.setVisible(true);
				parameterBox6Txt.setVisible(true);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNumber = 7;
				queryNoDisplay.setText("query1g");
				display.setText(StringStatics.query1gstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1h.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 8;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1h");
				display.setText(StringStatics.query1hstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1i.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 9;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1i");
				display.setText(StringStatics.query1istr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1j.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 10;
				parameterBox1Txt.setVisible(false);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1j");
				display.setText(StringStatics.query1jstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1k.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 11;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1k");
				display.setText(StringStatics.query1kstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1l.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 12;
				parameterBox1Txt.setVisible(false);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1l");
				display.setText(StringStatics.query1lstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1m.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 13;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1m");
				display.setText(StringStatics.query1mstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1n.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 14;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1n");
				display.setText(StringStatics.query1nstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query1o.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 15;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query1o");
				display.setText(StringStatics.query1ostr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});


		query2b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 17;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query2b");
				display.setText(StringStatics.query2bstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query2c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 18;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(true);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query2c");
				display.setText(StringStatics.query2cstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query2d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 19;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query2d");
				display.setText(StringStatics.query2dstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query2e.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 20;
				parameterBox1Txt.setVisible(false);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query2e");
				display.setText(StringStatics.query2estr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query2f.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 21;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query2f");
				display.setText(StringStatics.query2fstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query2g.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 22;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query2g");
				display.setText(StringStatics.query2gstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query2h.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 23;
				parameterBox1Txt.setVisible(false);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query2h");
				display.setText(StringStatics.query2hstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		query2i.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 24;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(false);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query2i");
				display.setText(StringStatics.query2istr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});
		query2j.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				queryNumber = 24;
				parameterBox1Txt.setVisible(true);
				parameterBox2Txt.setVisible(true);
				parameterBox3Txt.setVisible(false);
				parameterBox4Txt.setVisible(false);
				parameterBox5Txt.setVisible(false);
				parameterBox6Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				parameterBox3Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox5Txt.setText(null);
				parameterBox6Txt.setText(null);
				queryNoDisplay.setText("query2j");
				display.setText(StringStatics.query2jstr);
				strConsole.removeAll();
				strConsole.add(display);
				strConsole.revalidate();
				strConsole.repaint();
			}
		});

		nullQueryBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				queryNumber = 0;
				parameterBox1Txt.setVisible(false);
				parameterBox2Txt.setVisible(false);
				parameterBox1Txt.setText(null);
				parameterBox2Txt.setText(null);
				queryNoDisplay.setText("");
				strConsole.removeAll();
				strConsole.repaint();
			}
		});

		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clearTables();
				loginBtn.setVisible(true);
				usersPasswordlbl.setVisible(true);
				usersUsernamelbl.setVisible(true);
				initializeAllDataBtn.setVisible(false);
				usersPasswordTxt.setVisible(true);
				usersUsernameTxt.setVisible(true);
				deleteBtn.setVisible(false);
				initializeAllDataBtn.setVisible(false);
				logoutBtn.setVisible(false);
				isIT = false;
				isCaller = false;
				isManagement = false;
				isConnected = false;

				query1a.setVisible(false);
				query1b.setVisible(false);
				query1c.setVisible(false);
				query1d.setVisible(false);
				query1e.setVisible(false);
				query1f.setVisible(false);
				query1g.setVisible(false);
				query1h.setVisible(false);
				query1i.setVisible(false);
				query1j.setVisible(false);
				query1k.setVisible(false);
				query1l.setVisible(false);
				query1m.setVisible(false);
				query1n.setVisible(false);
				query1o.setVisible(false);

				customersUpdateBtn.setVisible(false);
				customersInsertBtn.setVisible(false);
				lblCustomers.setVisible(false);
				lblCustomerid.setVisible(false);
				customersCustomerIdTxt.setVisible(false);
				lblFname.setVisible(false);
				customersFnameTxt.setVisible(false);
				lblLname.setVisible(false);
				customersLnameTxt.setVisible(false);
				lblCustomerEmail.setVisible(false);
				customerEmailTxt.setVisible(false);
				lblCustomerPhone.setVisible(false);
				customersPhoneTxt.setVisible(false);
				lblStreet.setVisible(false);
				customersStreetTxt.setVisible(false);
				lblPostcode.setVisible(false);
				customersPostcodeTxt.setVisible(false);
				lblAddressNum.setVisible(false);
				customersAddressNumTxt.setVisible(false);

				employeesInsertBtn.setVisible(false);
				employeesUpdateBtn.setVisible(false);
				lblEmployees.setVisible(false);
				lblEmployeeSSN.setVisible(false);
				employeeEmployeeSSNTxt.setVisible(false);
				lblPosition.setVisible(false);
				employeePositionTxt.setVisible(false);
				lblFname_1.setVisible(false);
				employeeFnameTxt.setVisible(false);
				lblLname_1.setVisible(false);
				employeeLnameTxt.setVisible(false);
				lblEmail.setVisible(false);
				employeeEmailTxt.setVisible(false);
				lblAddress.setVisible(false);
				employeeAddressTxt.setVisible(false);
				lblPhone.setVisible(false);
				employeePhoneTxt.setVisible(false);
				lblMobilePhone.setVisible(false);
				employeeMobilePhoneTxt.setVisible(false);
				lblManageSSN.setVisible(false);
				employeeManageSSNTxt.setVisible(false);
				
				reservationUpdateBtn.setVisible(false);
				reservationInsertBtn.setVisible(false);
				lblReservation.setVisible(false);
				lblReservationid.setVisible(false);
				reservationIdTxt.setVisible(false);
				lblTime.setVisible(false);
				reservationTimeTxt.setVisible(false);
				lblVisa.setVisible(false);
				reservationVisaTxt.setVisible(false);
				lblConfirmation.setVisible(false);
				reservationConfirmationTxt.setVisible(false);
				lblType.setVisible(false);
				reservationTypeTxt.setVisible(false);
				lblCid.setVisible(false);
				reservationCidTxt.setVisible(false);
				lblSSN.setVisible(false);
				reservationSSNTxt.setVisible(false);
			}
		});

		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*
				 * if (usersUsernameTxt.getText().isEmpty() ||
				 * usersPasswordTxt.getText().isEmpty() ||
				 * !dataBaseQueries.getUser(usersUsernameTxt.getText(),
				 * usersPasswordTxt.getText())) { JOptionPane.showMessageDialog(null,
				 * "Invalid Username or Password\n  Please try again!"); return; }
				 */

				/*
				 * dataBaseQueries.setTables();
				 * 
				 * queryNoDisplay.setText("Connecton status");
				 * display.setText(StringStatics.connect0str); strConsole.removeAll();
				 * strConsole.add(display); strConsole.revalidate(); strConsole.repaint();
				 */
				initializeAllDataBtn.setVisible(true);
				isManagement = true;
				if (isIT) {
					deleteBtn.setVisible(true);
					initializeAllDataBtn.setVisible(true);
				}
				if (isCaller) {
					query1a.setVisible(true);
					query1b.setVisible(true);
					query1c.setVisible(true);
					query1d.setVisible(true);
					query1e.setVisible(true);
					query1f.setVisible(true);
					query1g.setVisible(true);
					query1h.setVisible(true);
					query1i.setVisible(true);
					query1j.setVisible(true);
					query1k.setVisible(true);
					query1l.setVisible(true);
					query1m.setVisible(true);
					query1n.setVisible(true);
					query1o.setVisible(true);

					customersUpdateBtn.setVisible(true);
					customersInsertBtn.setVisible(true);
					lblCustomers.setVisible(true);
					lblCustomerid.setVisible(true);
					customersCustomerIdTxt.setVisible(true);
					lblFname.setVisible(true);
					customersFnameTxt.setVisible(true);
					lblLname.setVisible(true);
					customersLnameTxt.setVisible(true);
					lblCustomerEmail.setVisible(true);
					customerEmailTxt.setVisible(true);
					lblCustomerPhone.setVisible(true);
					customersPhoneTxt.setVisible(true);
					lblStreet.setVisible(true);
					customersStreetTxt.setVisible(true);
					lblPostcode.setVisible(true);
					customersPostcodeTxt.setVisible(true);
					lblAddressNum.setVisible(true);
					customersAddressNumTxt.setVisible(true);
					
					reservationUpdateBtn.setVisible(true);
					reservationInsertBtn.setVisible(true);
					lblReservation.setVisible(true);
					lblReservationid.setVisible(true);
					reservationIdTxt.setVisible(true);
					lblTime.setVisible(true);
					reservationTimeTxt.setVisible(true);
					lblVisa.setVisible(true);
					reservationVisaTxt.setVisible(true);
					lblConfirmation.setVisible(true);
					reservationConfirmationTxt.setVisible(true);
					lblType.setVisible(true);
					reservationTypeTxt.setVisible(true);
					lblCid.setVisible(true);
					reservationCidTxt.setVisible(true);
					lblSSN.setVisible(true);
					reservationSSNTxt.setVisible(true);

				}
				if (isManagement) {
					query1a.setVisible(true);
					query1b.setVisible(true);
					query1c.setVisible(true);
					query1d.setVisible(true);
					query1e.setVisible(true);
					query1f.setVisible(true);
					query1g.setVisible(true);
					query1h.setVisible(true);
					query1i.setVisible(true);
					query1j.setVisible(true);
					query1k.setVisible(true);
					query1l.setVisible(true);
					query1m.setVisible(true);
					query1n.setVisible(true);
					query1o.setVisible(true);

					query2b.setVisible(true);
					query2c.setVisible(true);
					query2d.setVisible(true);
					query2e.setVisible(true);
					query2f.setVisible(true);
					query2g.setVisible(true);
					query2h.setVisible(true);
					query2i.setVisible(true);
					query2j.setVisible(true);

					customersUpdateBtn.setVisible(true);
					customersInsertBtn.setVisible(true);
					lblCustomers.setVisible(true);
					lblCustomerid.setVisible(true);
					customersCustomerIdTxt.setVisible(true);
					lblFname.setVisible(true);
					customersFnameTxt.setVisible(true);
					lblLname.setVisible(true);
					customersLnameTxt.setVisible(true);
					lblCustomerEmail.setVisible(true);
					customerEmailTxt.setVisible(true);
					lblCustomerPhone.setVisible(true);
					customersPhoneTxt.setVisible(true);
					lblStreet.setVisible(true);
					customersStreetTxt.setVisible(true);
					lblPostcode.setVisible(true);
					customersPostcodeTxt.setVisible(true);
					lblAddressNum.setVisible(true);
					customersAddressNumTxt.setVisible(true);

					employeesInsertBtn.setVisible(true);
					employeesUpdateBtn.setVisible(true);
					lblEmployees.setVisible(true);
					lblEmployeeSSN.setVisible(true);
					employeeEmployeeSSNTxt.setVisible(true);
					lblPosition.setVisible(true);
					employeePositionTxt.setVisible(true);
					lblFname_1.setVisible(true);
					employeeFnameTxt.setVisible(true);
					lblLname_1.setVisible(true);
					employeeLnameTxt.setVisible(true);
					lblEmail.setVisible(true);
					employeeEmailTxt.setVisible(true);
					lblAddress.setVisible(true);
					employeeAddressTxt.setVisible(true);
					lblPhone.setVisible(true);
					employeePhoneTxt.setVisible(true);
					lblMobilePhone.setVisible(true);
					employeeMobilePhoneTxt.setVisible(true);
					lblManageSSN.setVisible(true);
					employeeManageSSNTxt.setVisible(true);
					
					reservationUpdateBtn.setVisible(true);
					reservationInsertBtn.setVisible(true);
					lblReservation.setVisible(true);
					lblReservationid.setVisible(true);
					reservationIdTxt.setVisible(true);
					lblTime.setVisible(true);
					reservationTimeTxt.setVisible(true);
					lblVisa.setVisible(true);
					reservationVisaTxt.setVisible(true);
					lblConfirmation.setVisible(true);
					reservationConfirmationTxt.setVisible(true);
					lblType.setVisible(true);
					reservationTypeTxt.setVisible(true);
					lblCid.setVisible(true);
					reservationCidTxt.setVisible(true);
					lblSSN.setVisible(true);
					reservationSSNTxt.setVisible(true);
				}
				logoutBtn.setVisible(true);
				usersPasswordlbl.setVisible(false);
				usersUsernamelbl.setVisible(false);
				usersPasswordTxt.setText("");
				usersUsernameTxt.setText("");
				usersPasswordTxt.setVisible(false);
				usersUsernameTxt.setVisible(false);
				loginBtn.setVisible(false);
				isConnected = true;
			}
		});
		/*
		 * INSERTS BUTTONS
		 */

		customersInsertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isConnected) {
					JOptionPane.showMessageDialog(null, "Not connected to the DataBase!\n  -Please login to proceed");
					return;
				}

				if (customersCustomerIdTxt.getText().isEmpty() || customersFnameTxt.getText().isEmpty()
						|| customersLnameTxt.getText().isEmpty() || customerEmailTxt.getText().isEmpty()
						|| customerEmailTxt.getText().isEmpty() || customerEmailTxt.getText().isEmpty()
						|| customersPostcodeTxt.getText().isEmpty() || customersAddressNumTxt.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "please fill the fields!");
					return;
				}

//				customersDate_Of_BirthTxt.setText(dataBaseQueries.setDateFormat(customersDate_Of_BirthTxt.getText()));

				String[] str = { customersCustomerIdTxt.getText(), customersFnameTxt.getText(),
						customersLnameTxt.getText(), customerEmailTxt.getText(), customerEmailTxt.getText(),
						customerEmailTxt.getText(), customersPostcodeTxt.getText(), customersAddressNumTxt.getText() };

				dataBaseQueries.Insert("Customers", str);
				dataBaseQueries.setTables();
			}
		});
		employeesInsertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isConnected) {
					JOptionPane.showMessageDialog(null, "Not connected to the DataBase!\n  -Please login to proceed");
					return;
				}

				if (employeeEmployeeSSNTxt.getText().isEmpty() || employeePositionTxt.getText().isEmpty()
						|| employeeFnameTxt.getText().isEmpty() || employeeLnameTxt.getText().isEmpty()
						|| employeeEmailTxt.getText().isEmpty() || employeeAddressTxt.getText().isEmpty()
						|| employeePhoneTxt.getText().isEmpty() || employeeMobilePhoneTxt.getText().isEmpty()
						|| employeeManageSSNTxt.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "please fill the fields!");
					return;
				}


				String[] str = { employeeEmployeeSSNTxt.getText(), employeePositionTxt.getText(),
						employeeFnameTxt.getText(), employeeLnameTxt.getText(), employeeEmailTxt.getText(),
						employeeAddressTxt.getText(), employeePhoneTxt.getText(), employeeMobilePhoneTxt.getText(),
						employeeManageSSNTxt.getText() };

				dataBaseQueries.Insert("Employee", str);
				dataBaseQueries.setTables();
			}
		});
		
		reservationInsertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isConnected) {
					JOptionPane.showMessageDialog(null, "Not connected to the DataBase!\n  -Please login to proceed");
					return;
				}

				if (reservationIdTxt.getText().isEmpty() || reservationTimeTxt.getText().isEmpty()
						|| reservationVisaTxt.getText().isEmpty() || reservationConfirmationTxt.getText().isEmpty()
						|| reservationTypeTxt.getText().isEmpty() || reservationCidTxt.getText().isEmpty()
						|| reservationSSNTxt.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "please fill the fields!");
					return;
				}


				String[] str = { reservationIdTxt.getText(), reservationTimeTxt.getText(),
						reservationVisaTxt.getText(), reservationConfirmationTxt.getText(), reservationTypeTxt.getText(),
						reservationCidTxt.getText(), reservationSSNTxt.getText() };

				dataBaseQueries.Insert("Reservation", str);
				dataBaseQueries.setTables();
			}
		});

		/*
		 * UPDATES BUTTONS
		 */

		customersUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isConnected) {
					JOptionPane.showMessageDialog(null, "Not connected to the DataBase!\n  -Please login to proceed");
					return;
				}

//				customersDate_Of_BirthTxt.setText(dataBaseQueries.setDateFormat(customersDate_Of_BirthTxt.getText()));

				String[] columns = { "CustomerID", "Fname", "Lname", "Email", "Phone", "Street", "Postocode",
						"AddressNum" };
				String[] values = { customersCustomerIdTxt.getText(), customersFnameTxt.getText(),
						customersLnameTxt.getText(), customerEmailTxt.getText(), customersPhoneTxt.getText(),
						customersStreetTxt.getText(), customersPostcodeTxt.getText(),
						customersAddressNumTxt.getText() };

				if (!dataBaseQueries.Update(Integer.parseInt(customersCustomerIdTxt.getText()), "Customer", values,
						columns)) {
					JOptionPane.showMessageDialog(null, "Invalid ID");
					return;
				} else
					JOptionPane.showMessageDialog(null, "data Updated");
				dataBaseQueries.setTables();
			}
		});
		employeesUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isConnected) {
					JOptionPane.showMessageDialog(null, "Not connected to the DataBase!\n  -Please login to proceed");
					return;
				}

				String[] columns = { "EmployeeSSN", "Position", "Fname", "Lname", "Email", "Address", "Phone",
						"MobilePhone", "ManageSSN" };
				String[] values = { employeeEmployeeSSNTxt.getText(), employeePositionTxt.getText(),
						employeeFnameTxt.getText(), employeeLnameTxt.getText(), employeeEmailTxt.getText(),
						employeeAddressTxt.getText(), employeePhoneTxt.getText(), employeeMobilePhoneTxt.getText(),
						employeeManageSSNTxt.getText() };

				if (!dataBaseQueries.Update(Integer.parseInt(employeeEmployeeSSNTxt.getText()), "Employee", values,
						columns)) {
					JOptionPane.showMessageDialog(null, "Invalid SSN");
					return;
				} else
					JOptionPane.showMessageDialog(null, "data Updated");

				dataBaseQueries.setTables();
			}
		});

		reservationUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isConnected) {
					JOptionPane.showMessageDialog(null, "Not connected to the DataBase!\n  -Please login to proceed");
					return;
				}

				String[] columns = { "id", "Time", "Visa", "Confirmation", "Type", "Cid", "SSN" };
				String[] values = { reservationIdTxt.getText(), reservationTimeTxt.getText(),
						reservationVisaTxt.getText(), reservationConfirmationTxt.getText(), reservationTypeTxt.getText(),
						reservationCidTxt.getText(), reservationSSNTxt.getText() };

				if (!dataBaseQueries.Update(Integer.parseInt(employeeEmployeeSSNTxt.getText()), "Employee", values,
						columns)) {
					JOptionPane.showMessageDialog(null, "Invalid SSN");
					return;
				} else
					JOptionPane.showMessageDialog(null, "data Updated");

				dataBaseQueries.setTables();
			}
		});
		
		/*
		 * execute Queries
		 */

//		 executeQueryBtn.addActionListener(new ActionListener() {
//		  
//		  @Override
//		  public void actionPerformed(ActionEvent e) { // TODO Auto-generated method stub 
//			  if (queryNumber == 0) { 
//				  JOptionPane.showMessageDialog(null,"Select the Query you want to execute before pressing the button!");
//				  return;
//		  } if (!isConnected) {
//			  JOptionPane.showMessageDialog(null,"Not connected to the DataBase!\n  -Please login to proceed"); return; }
//		  
//		  tabbedPanel.setSelectedIndex(2);
//		  
//		  switch (queryNumber) {
//		  case 1: 
//			  if (parameterBox1Txt.getText().isEmpty()) {
//		  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value"); 
//		  return; }
//			  // execute query1a
//		  dataBaseQueries.q1(parameterBox1Txt.getText());
//		  break; case 2: 
//			  if(parameterBox1Txt.getText().isEmpty()) {
//				  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//				  return; } 
//		  // execute query1b 
//			  dataBaseQueries.q2(parameterBox1Txt.getText()); break;
//		  case 3:
//			  if (parameterBox1Txt.getText().isEmpty() ) {
//		  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");} 
//			  String[] str = {parameterBox1Txt.getText() };
//			  if (!dataBaseQueries.checkIfInt(str)) {
//		  JOptionPane.showMessageDialog(null,"Parameter is not an Integer!/n	Please insert a valid value"); 
//		  return; }
//		  
//		  // execute query1c
//		  dataBaseQueries.q3(Integer.parseInt(parameterBox1Txt.getText()));
//		  break; 
//		  case 4: 
//			  if (parameterBox1Txt.getText().isEmpty() || parameterBox2Txt.getText().isEmpty()) {
//				  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value"); 
//				  return; }
//			  // execute query1d
//		  dataBaseQueries.q4(parameterBox1Txt.getText(), parameterBox2Txt.getText());
//		  break;
//		  case 5: 
//			  if (parameterBox1Txt.getText().isEmpty() ||parameterBox2Txt.getText().isEmpty() 
//				||parameterBox3Txt.getText().isEmpty() || parameterBox4Txt.getText().isEmpty()
//				||parameterBox5Txt.getText().isEmpty() || parameterBox6Txt.getText().isEmpty()) {
//				  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//				  return; } //parameterBox1Txt.setText(dataBaseQueries.setDateFormat(parameterBox1Txt. getText())); 
//			  //execute query1e
//		  dataBaseQueries.q5(parameterBox1Txt.getText(),parameterBox2Txt.getText(),parameterBox3Txt.getText(),
//		  parameterBox4Txt.getText(),parameterBox5Txt.getText(),parameterBox6Txt.getText());
//		  break; 
//		  case 6: 
//			  if(parameterBox1Txt.getText().isEmpty() || parameterBox2Txt.getText().isEmpty()
//				||parameterBox3Txt.getText().isEmpty() ||parameterBox4Txt.getText().isEmpty() 
//				||parameterBox5Txt.getText().isEmpty() || parameterBox6Txt.getText().isEmpty()) {
//		  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//		  return; }
//			  // execute query1f
//		  dataBaseQueries.q6(parameterBox1Txt.getText(),parameterBox2Txt.getText(),,parameterBox3Txt.getText(),
//		  parameterBox4Txt.getText(),parameterBox5Txt.getText(),parameterBox6Txt.getText());
//		  break; 
//		  case 7: 
//			  if(parameterBox1Txt.getText().isEmpty() || parameterBox2Txt.getText().isEmpty()
//				||parameterBox3Txt.getText().isEmpty() || parameterBox4Txt.getText().isEmpty()
//				||parameterBox5Txt.getText().isEmpty() || parameterBox6Txt.getText().isEmpty()) {
//		  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//		  return; } 
//			  // execute query1g
//		  dataBaseQueries.q7(parameterBox1Txt.getText(),parameterBox2Txt.getText(),parameterBox3Txt.getText(),
//		  parameterBox4Txt.getText(),parameterBox5Txt.getText(),parameterBox6Txt.getText());
//		  break; 
//		  case 8: 
//			  if(parameterBox1Txt.getText().isEmpty()|| parameterBox2Txt.getText().isEmpty()){ 
//				  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value"); 
//				  return; } 
//			  if(!dataBaseQueries.checkIfInt(parameterBox1Txt.getText())) {
//		  JOptionPane.showMessageDialog(null,"Parameter is not an Integer!/n	Please insert a valid value");
//		  return; }
//			  //execute query1h
//		  dataBaseQueries.q8(Integer.parseInt(parameterBox1Txt.getText()),parameterBox2Txt.getText());
//		  break; 
//		  case 9: 
//			  if(parameterBox1Txt.getText().isEmpty()) {
//				  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//				  return; 
//				  } // execute query1i
//		  dataBaseQueries.q9(parameterBox1Txt.getText());
//		  break; 
//		  case 10: 
//			  // execute query1j 
//			  dataBaseQueries.q10(); 
//			  break; 
//			  case 11: 
//				  if(parameterBox1Txt.getText().isEmpty() ||parameterBox2Txt.getText().isEmpty()) { 
//					  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//					  return; } 
//				  // execute query1k 
//				  dataBaseQueries.q11(parameterBox1Txt.getText(),parameterBox2Txt.getText()); 
//				  break; 
//				  case 12: 
//					  // execute query1l 
//					  dataBaseQueries.q12();
//					  break; 
//					  case 13: 
//						  if(parameterBox1Txt.getText().isEmpty()|| parameterBox2Txt.getText().isEmpty()){ 
//							  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//							  return; } 
//						  // execute query1m
//		  dataBaseQueries.q13(Integer.parseInt(parameterBox1Txt.getText()),parameterBox2Txt.getText());
//		  break; 
//		  case 14: 
//			  if(parameterBox1Txt.getText().isEmpty()|| parameterBox2Txt.getText().isEmpty()){ 
//				  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//				  return; } 
//			  // execute query1n
//		  dataBaseQueries.q14(Integer.parseInt(parameterBox1Txt.getText()),parameterBox2Txt.getText());
//		  break; 
//		  case 15:
//			  if(parameterBox1Txt.getText().isEmpty()|| parameterBox2Txt.getText().isEmpty()){ 
//				  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//				  return; } 
//			  // execute query1o
//		  dataBaseQueries.q15(parameterBox1Txt.getText(),parameterBox2Txt.getText());
//		  break; 
//		  case 17: 
//			if(parameterBox1Txt.getText().isEmpty()){ 
//		  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//		  return; } 
			// execute query2b 
//		  dataBaseQueries.q17(parameterBox1Txt.getText());
//		  break; 
//		  case 18:
//		if(parameterBox1Txt.getText().isEmpty() || parameterBox2Txt.getText().isEmpty()
//		||parameterBox3Txt.getText().isEmpty()){ 
//			  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//			  return; }
		// execute query2c 
//		  dataBaseQueries.q18(parameterBox1Txt.getText(),parameterBox2Txt.getText(),parameterBox3Txt.getText());
//		  break; 
//		  case 19: 
//		if(parameterBox1Txt.getText().isEmpty()){ 
//		  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//		  return; }
		// execute query2d 
//		  dataBaseQueries.q19(parameterBox1Txt.getText());
//		  break; 
//		  case 20: 
		// execute query2e 
//		  dataBaseQueries.q20();
//		  break; 
//		  case 21: 
//		if(parameterBox1Txt.getText().isEmpty()){ 
//		  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//		  return; }
		// execute query2f 
//		  dataBaseQueries.q21(parameterBox1Txt.getText());
//		  break; 
//		  case 22: 
//		if(parameterBox1Txt.getText().isEmpty()){ 
//		  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//		  return; }
		// execute query2g 
//		  dataBaseQueries.q22(parameterBox1Txt.getText());
//		  break; 
//		  case 23:
		// execute query2h 
//		  dataBaseQueries.q23();
//		  break; 
//		  case 24: 
//		if(parameterBox1Txt.getText().isEmpty()){ 
//		  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//		  return; }
		// execute query2i 
//		  dataBaseQueries.q24(parameterBox1Txt.getText());
//		  break; 
//		  case 25: 
//		if(parameterBox1Txt.getText().isEmpty()|| parameterBox2Txt.getText().isEmpty()){ 
//		  JOptionPane.showMessageDialog(null,"Null parameter!/n	Please insert a value");
//		  return; }
		// execute query2j 
//		  dataBaseQueries.q25(parameterBox1Txt.getText(),parameterBox2Txt.getText());
//		  break; 
//			  default:
//		  System.out.println("finished");
//		  
//		  }
//		  
//		  } });

	}

	public void clearTables() {

		customerTable.setModel(new DefaultTableModel());
		employeesTable.setModel(new DefaultTableModel());
		usersTable.setModel(new DefaultTableModel());
		resultsTable.setModel(new DefaultTableModel());
		carTable.setModel(new DefaultTableModel());
		airlineTable.setModel(new DefaultTableModel());
		airportTable.setModel(new DefaultTableModel());
		carRentalOfficeTable.setModel(new DefaultTableModel());
		destinationTable.setModel(new DefaultTableModel());
		flightTable.setModel(new DefaultTableModel());
		hotelTable.setModel(new DefaultTableModel());
		registrationTable.setModel(new DefaultTableModel());
		reservationTable.setModel(new DefaultTableModel());
	    roomTable.setModel(new DefaultTableModel());
		updateTable.setModel(new DefaultTableModel());
	}
}
