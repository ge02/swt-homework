package hw_7_task2;

public class Leaf implements Component{

	String name;
	int numAthletes;
	int numGold;

	
	public Leaf(String name, int numAthletes, int numGold) {
		super();
		this.name = name;
		this.numAthletes = numAthletes;
		this.numGold = numGold;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumAthletes() {
		return numAthletes;
	}

	public void setNumAthletes(int numAthletes) {
		this.numAthletes = numAthletes;
	}

	public int getNumGold() {
		return numGold;
	}
	
	public void setNumGold(int nGold) {
		this.numGold = nGold;
	}
	
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println(getName());
	}

	@Override
	public void printNameNumAthletes() {
		// TODO Auto-generated method stub
		System.out.println("Team: " + getName() + ", umber of Athletes: " + getNumAthletes());
	}

	@Override
	public void printNameNumGold() {
		// TODO Auto-generated method stub
		System.out.println("Team: " + getName() + " has won " + getNumGold() + " Gold Medals");
	}
	
}
