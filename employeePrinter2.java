	import java.io.*;
	import java.nio.file.attribute.*;
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
	    	System.out.print("Please enter name of directory(file location): ");
			String directory = console.nextLine();
	    	System.out.print("Please enter payslip file name: ");
	    	File fileName = console.nextLine();
	    	File payslipCopy = fileName;
	    	String print;
			String cancel;
			System.out.print("File found would you like to print:" + fileName + print + "or" + cancel + "?");
	    	String payslip = console.nextLine();
	    	if (print != null){
	    		
	    		PrintWriter out = new PrintWriter(payslip);
	    	}
	    	if (cancel != null){
	    		return;
	    	}
	    	
	    	
	   
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
