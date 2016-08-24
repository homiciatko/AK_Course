package day_04.Interface;

public class DatabaseConnector implements Saveable {

	@Override
	public void save() {
		System.out.println("save to database");
		
	}

}
