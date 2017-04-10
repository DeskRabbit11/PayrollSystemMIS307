package PayrollProgram;

import java.util.Scanner;

/**
 * 
 * @author Logan Grimm
 *
 */
public class PayrollProgram {

	public static void main(String[] args) {
		boolean done = false;
		// starting program.
		Employees ex = new Employees();
		ex.populateList();

		// set up scanner.
		Scanner in = new Scanner(System.in);

		// asking for username and password.
		System.out.println("Welcome to Payroll Program");
		System.out.println("--------------------------");

		while (!done) {

			System.out.println("Username:");
			// name is the username.
			String name = in.nextLine();

			System.out.println("Password:");
			// pass is the password.
			String pass = in.nextLine();

			// find employee from name.
			
			if (pass.equals(ex.findEmployee(name).getPassword())) {
				if (ex.findEmployee(name).isManager()) {
					// run managerinterface
					done = true;
					System.out.println("you logged in.");
				}
				done = true;
				// run employeeinterface
			}
		}
		in.close();
	}
}
