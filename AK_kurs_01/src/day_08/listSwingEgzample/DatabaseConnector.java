package day_08.listSwingEgzample;

public class DatabaseConnector {
	
	public static Employee[] getAllEmployees() {
		Employee[] employees = new Employee[4];
		employees[0] = new Employee("Jan", "Kowalski", 10);
		employees[1] = new Employee("Zdzislaw", "Pyton", 20);
		employees[2] = new Employee("Anna", "Jantar", 50);
		employees[3] = new Employee("Justyna", "Nowak", 30); 
		return employees;
	}

}
