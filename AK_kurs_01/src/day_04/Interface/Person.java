package day_04.Interface;

import java.util.List;

public class Person {
	
	private List<String> list;
	private Saveable connector;
	
	
	public Saveable getConnector() {
		return connector;
	}
	public void setConnector(Saveable connector) {
		this.connector = connector;
	}
	public void save() {
		connector.save();
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}
	

}
