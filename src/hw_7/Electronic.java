package hw_7;

public class Electronic implements HouseholdItem, Visitable {

	String name;

	int lenght;
	int width;
	int height;

	int weight;

	Boolean fragile;

	public Electronic(String name, int lenght, int width, int height, int weight, Boolean fragile) {
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.fragile = fragile;
	}

//Getters and Setters

	public int getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getFragile() {
		return fragile;
	}

	public void setFragile(Boolean fragile) {
		this.fragile = fragile;
	}

	@Override
	public double accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

	@Override
	public String accept1(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit1(this);
	}

}