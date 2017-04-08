import java.io.*;
	import java.util.Scanner;
	/**
	 * Printer class for employee's to print their payslip copies.
	 * @author Tanner Koolstra
	 *
	 */
public class employeePrinter {

	    public static void main(String[] args) 
	    {
	    	Scanner console = new Scanner(System.in);
	    	System.out.print("Please enter payslip file name: ");
	    	
	        File payslipCopy = new File("C:/Users/fileLocation.txt");

	        PrintWriter printWriter = null;

	        try
	        {
	            printWriter = new PrintWriter(payslipCopy);
	        }
	        catch (FileNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            if ( printWriter != null ) 
	            {
	                printWriter.close();
	                console.close();
	            }
	        }
	    }
	}
