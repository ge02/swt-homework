package hw_7;

public interface Visitor {
	
	public double visit(Glass g);
	public double visit(Furniture f);
	public double visit(Electronic e);
	
	public String visit1(Glass g);
	public String visit1(Furniture f);
	public String visit1(Electronic e);

}
