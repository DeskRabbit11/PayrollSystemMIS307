package PayrollProgram;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * This is the main class for the program. login to either Employee Interface or
 * Manager Interface depending on the Employee login information.
 * 
 * @author Logan Grimm
 *
 */

@SuppressWarnings("serial")
public class PayrollProgram extends JFrame {

	private JTextField nameField;
	private JPasswordField password;
	private JButton login;
	private static String OK = "ok";

	// constructor for the main class.
	public PayrollProgram() {
		setTitle("Payroll Program");
		setSize(400, 230);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(5, 1));

		buildPanel();
		setVisible(true);
	}

	private void buildPanel() {

		// text field for employee name.
		JLabel name = new JLabel("Enter Username");
		nameField = new JTextField(12);

		// text field for employee password.
		JLabel pass = new JLabel("Enter Password");
		password = new JPasswordField(12);
		password.setActionCommand(OK);
		password.addActionListener(new login());

		// login button to check if the login information is correct.
		login = new JButton("Login");
		// TODO
		// add actionlistener to login button so it goes to correct interface.

		// creates new panels to store objects.
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		// adds panels into interface.
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);

		// adds panels to GUI
		panel1.add(name);
		panel2.add(nameField);
		panel3.add(pass);
		panel4.add(password);
		panel5.add(login);

	}

	// login actionlistener for button.
	private class login implements ActionListener {

		private String name;
		private char[] pass;

		public void actionPerformed(ActionEvent e) {

			String cmd = e.getActionCommand();
			name = nameField.getText();
			pass = password.getPassword();

			// checks if username is empty or not.
			if (cmd.equals(OK)) {
				if (name.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter your Username.");
					while (true) {
						nameField.requestFocusInWindow();
						if (!name.equals(""))
							break;
					}
				}
			}
			// checks if password is correct or not.
			if (cmd.equals(OK)) {
				if (isPasswordCorrect(pass)) {
					// TODO and if statement that checks whether or not the
					// password
					// is correct for the username and then if it is, if it's a
					// manager or regular employee, and goes to GUI accordingly.
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Wrong Password. Please try again.");
				}
			}

		}

		// checks if password is correct.
		public boolean isPasswordCorrect(char[] input) {
			boolean isCorrect = true;
			// Employees temp = findEmployee(name);

			char[] correctpassword; // = temp.getPassword();

			// TODO set up a for each character in input it checks it against
			// correctpassword
			// and determines if it's correct or not, it not then false,
			// otherwise return.
			return isCorrect;
		}
	}

}
