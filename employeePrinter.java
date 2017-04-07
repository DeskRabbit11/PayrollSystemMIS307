	import java.io.*;

public class employeePrinter {

	    public static void main(String[] args) 
	    {

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
	            }
	        }
	    }
	}
