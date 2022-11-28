package hw_7_task2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

String name;
	
	public Composite(String name) {
		this.name = name;
	}
	
	public List<Component> Child = new ArrayList<>();
	
	public void addComponent(Component c) {
		Child.add(c);
	}
	
	public void removeComponent(Component c) {
		Child.remove(c);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " ");
		for(Component c : Child) {
			c.printName();
		}
	}

	@Override
	public void printNameNumAthletes() {
		// TODO Auto-generated method stub
		System.out.println(getName() + ", ");
		for(Component c : Child) {
			c.printNameNumAthletes();
		}
	}

	@Override
	public void printNameNumGold() {
		// TODO Auto-generated method stub
		System.out.println(getName() + ", ");
		for(Component c : Child) {
			c.printNameNumGold();
		}
	}
	
	

}
