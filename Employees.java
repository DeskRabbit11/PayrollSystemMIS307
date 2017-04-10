package PayrollProgram;

import java.util.ArrayList;

/* @author team 170 - MIS 307
*  this is Employees class for payroll system.
*/
public class Employees {

	private ArrayList<Employee> list = new ArrayList<Employee>();

	// adds employee to list of employees.
	public void addEmployee(Employee e) {
		list.add(e);
	}

	// checks if employee is in system then fires them if they are.
	public void fireEmployee(Employee e) {
		for (Employee i : list) {
			if (i.getName().equals(e.getName())) {
				list.remove(e);
			}
		}
		System.out.println("Employee does not exist in system.");
	}

	// finds employee in list.
	public Employee findEmployee(String e) {
		for (Employee i : list) {
			if (i.getName().equals(e)) {
				return i;
			}
		}
		return null;
	}

	// for testing purposes, will add 5 new employees to the list for testing.
	public void populateList() {

		// list of employees added.
		list.add(new Employee("Logan Grimm", "logan", 456234568, "1315 Mayfield Dr. Apt 308 Ames, IA 50014", 40.0, 15.00,
				true));
		list.add(new Employee("Taylor Ringham", "taylor", 123456789, "2345 SevenEleven Rd. Ames, IA 50015", 40.0, 13.00,
				false));
		list.add(new Employee("Justin Siner", "justin", 678456321, "456 PO BOX 111 Ames, IA 51235", 35.0, 12.00, false));
		list.add(new Employee("Blaze Boii", "blaze", 785545555, "420 Goddang Ln. Ames, IA 12345", 15.3, 12.50, false));
		list.add(new Employee("Ryan Tumbler", "ryan", 456124578, "3245 Denver Rd Ames, IA 23456", 25.3, 13.00, false));

	}
	
	public String toString()
	{
		for(Employee i : list)
		{
			System.out.println(i.getName());
		}
		return null;
	}
}