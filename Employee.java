package PayrollProgram;

/**
 * @author O'Sheen
 *
 */
public class Employee {
	private String name;
	private int SSN;
	private String adress;
	private double hours;
	private double rate;
	private String password;
	private double yearlytotal;
	private boolean isManager = false;

	/*
	 * creates an employee account that has name adress SSN and hours/rate
	 * 
	 * @Param
	 * 
	 * @Param
	 * 
	 * @Param
	 * 
	 * @Param
	 * 
	 * @Param
	 */
	public Employee(String newName, String newpassword, int newSSN, String newAdress, double newHours,
			double newRate, boolean isManager) {
		name = newName;
		password = newpassword;
		SSN = newSSN;
		adress = newAdress;
		hours = newHours;
		rate = newRate;
		yearlytotal = rate * hours;
		this.isManager = isManager;
	}
	
	//true if manager, false is employee
	public boolean isManager()
	{
		return isManager;
	}

	// edits hours employee has by amount.
	public void addHours(double amount) {
		double newHours = hours + amount;
		hours = newHours;
	}

	// gets the new rate of employee by adding amount to the rate.
	public void raise(double amount) {
		double newRate = rate + amount;
		rate = newRate;
	}

	// gets name of employee.
	public String getName() {
		return name;
	}

	// gets SSN for employee.
	public int getSSN() {
		return SSN;
	}

	// gets address for employee.
	public String getAdress() {
		return adress;
	}

	// get password for employee.
	public String getPassword() {
		return password;
	}

	// gets yearly gross total of pay.
	public double getYearly() {
		return yearlytotal;
	}

	// edits employee variable taken.
	public void editEmployeeAddress(String address) {
		this.adress = address;
	}

	// edits employee rate of pay
	public void editEmployeeRate(int rate) {
		this.rate = rate;
	}
	
	public String toString()
	{
		System.out.println("Name: " + name);
		System.out.println("Address: " + adress);
		System.out.println("Social Security #: " + SSN);
		System.out.println("Pay Rate: $" + rate);
		return "";
	}

}