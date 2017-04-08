	import java.io.*;
	import java.util.Scanner;
	/**
 * Printer class for manager's to print checks, reports, and W2s.
 * @author Tanner Koolstra
 *
 */
public class managerPrinter {

	    public static void main(String[] args)
	    {
	    	Scanner console = new Scanner(System.in);
	    	System.out.print("Please enter file type(check, report, or W2): ");
	    	System.out.print("Please enter file name: ");
	    	
	        File check = new File("C:/Users/fileLocation.txt");
	        File report = new File("C:/Users/fileLocation.txt");
	        File W2 = new File("C:/Users/fileLocation.txt");

	        PrintWriter printWriter = null;

	        try
	        {
	            printWriter = new PrintWriter(check);
	            printWriter = new PrintWriter(report);
	            printWriter = new PrintWriter(W2);
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
	                printWriter.close();
	                printWriter.close();
	                console.close();
	                
	            }
	        }
	    }
	}


