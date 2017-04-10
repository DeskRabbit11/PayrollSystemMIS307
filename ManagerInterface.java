package PayrollProgram;

/**
 * Interface for the managers of the Payroll Program.
 * @author Logan Grimm
 * 
 */

import java.util.Scanner;

public class ManagerInterface {

	String name;
	Employees ex = new Employees();
	Employee tempor;

	public ManagerInterface(String name) {
		this.name = name;
		ex.populateList();
		tempor = ex.findEmployee(name);
	}

	public void run() {
		Scanner in = new Scanner(System.in);
		boolean done = false;

		// sets up menu.

		System.out.println("Welcome " + name);
		System.out.println("What would you like to do?");
		while (!done) {
			System.out.println("[S]ee Info | [P]rint W2 | [E]dit Address | [Q]uit");
			System.out.println("-------------------------------------------------");
			System.out.println("p[R]int check | pr[I]nt reports | [A]dd Employee ");
			System.out.println("----- E[d]it Employee | [R]emove Employee -------");
			System.out.println("-------------------------------------------------");
			String temp = in.nextLine();
			if (temp.equals("S")) {
				System.out.println(tempor.toString());
			} else if (temp.equals("P")) {
				// set up printable W2
			} else if (temp.equals("E")) {
				System.out.println("Current Address: " + tempor.getAdress());
				System.out.println("Would you like to change it? Y/N");
				String o = in.nextLine();
				if (o.equals("Y")) {
					System.out.println("What would you like to change it too?");
					String newaddress = in.nextLine();
					tempor.editEmployeeAddress(newaddress);
				}

			} else if (temp.equals("Q")) {
				done = true;
			}
			//TODO needs to finish manager options in interface.
		}
		in.close();
	}
}
