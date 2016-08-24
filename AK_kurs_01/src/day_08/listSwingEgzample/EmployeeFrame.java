package day_08.listSwingEgzample;

import javax.swing.JFrame;
import javax.swing.JList;

public class EmployeeFrame extends JFrame{
	
	public EmployeeFrame() {
		super("Wyswietlanie pracownikow");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		JList<Employee> employeesList = new JList<Employee>(DatabaseConnector.getAllEmployees());
		add(employeesList);
		
		
	}

}
