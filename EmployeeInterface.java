package PayrollProgram;

import java.awt.*;
import javax.swing.*;

/**
 * Interface class for the Employee to access when they login.
 * @author Logan Grimm
 *
 */
@SuppressWarnings("serial")
public class EmployeeInterface extends JFrame {

	public EmployeeInterface()
	{
		setTitle("Payroll Program");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
