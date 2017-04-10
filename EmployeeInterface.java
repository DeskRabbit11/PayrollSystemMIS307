package PayrollProgram;

import java.util.Scanner;

/**
 * 
 * @author Logan Grimm
 *
 */
public class EmployeeInterface {

	String name;
	Employees e = new Employees();
	Employee tempor;
	
	//constructor for employee interface.
	public EmployeeInterface(String name)
	{
		this.name = name;
		e.populateList();
		tempor = e.findEmployee(name);
	}
	
	//runs this part of the interface.
	public void run()
	{
		Scanner in = new Scanner(System.in);
		boolean done = false;
		
		//sets up menu.
		
		System.out.println("            Welcome " + name                      );
		System.out.println("            What would you like to do?           ");
		while(!done){
		System.out.println("[S]ee Info | [P]rint W2 | [E]dit Address | [Q]uit");
		System.out.println("-------------------------------------------------");
		String temp = in.nextLine();
			if(temp.equals("S"))
			{
				System.out.println(tempor.toString());
			}
			else if(temp.equals("P"))
			{
				//set up printable W2
			}
			else if(temp.equals("E"))
			{
				System.out.println("Current Address: " + tempor.getAdress());
				System.out.println("Would you like to change it? Y/N");
				String o = in.nextLine();
				if(o.equals("Y")){
					System.out.println("What would you like to change it too?");
					String newaddress = in.nextLine();
					tempor.editEmployeeAddress(newaddress);
				}
				
			}
			else if(temp.equals("Q"))
			{
				done = true;
			}
		}
		in.close();
	}

}
