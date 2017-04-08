/**
 * 
 */

/**
 * @author O'Sheen
 *
 */
public class employee 
{
private String name;
private String SSN;
private String adress;
private double hours;
private double rate;

/* creates an employee account that has name adress SSN and hours/rate 
 * @Param
 * @Param
 * @Param
 * @Param
 * @Param
 * */
public employee(String newName, String newSSN, String newAdress, double newHours, double newRate)
{
	name = newName;
	SSN = newSSN;
	adress = newAdress;
	hours = newHours;
	rate = newRate;
		
}
public void hours (double amount)
{
	double newHours = hours + amount;
	hours = newHours;
}
public void rate ( double amount)
{
	double newRate = rate + amount;
	rate = newRate;
}
public String getName()
{
return name;
}
public String getSSN()
{
	return SSN;
}
public String getAdress()
{
	return adress;
}
}



