package day_04.classes2.zad5;

import java.util.ArrayList;
import java.util.List;

public class Question {
	private String name;
	private List<String> answers = new ArrayList<String>();
	
	public Question(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addAnswer(String answer) {
		answers.add(answer);
	}
	
}
