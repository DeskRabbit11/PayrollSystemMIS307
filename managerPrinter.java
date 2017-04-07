	import java.io.*;
	

public class managerPrinter {

	    public static void main(String[] args)
	    {
	    	System.out.println("Please enter file type(check, report, or W2): ");
	    	System.out.println("Please enter file name: ");
	    	
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
	            }
	        }
	    }
	}

