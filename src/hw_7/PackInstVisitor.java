package hw_7;

public class PackInstVisitor implements Visitor{

	public double visit(Glass g) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double visit(Furniture f) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double visit(Electronic e) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String visit1(Glass g) {
		int length = g.getLenght();
		int width = g.getWidth();
		int height = g.getHeight();
		
		return ">should be wrapped with Bubble wraps and packed in a box with dimension: " + (height+1) + "x" + (length+1) + "x" + (width+1);		
	}
	
	public String visit1(Furniture f) {
		int length = f.getLenght();
		int width = f.getWidth();
		
		return ">should be covered with waterproof covers with area of: " + length + "x" + width;
	}

	@Override
	public String visit1(Electronic e) {
		// TODO Auto-generated method stub
		int length = e.getLenght();
		int width = e.getWidth();
		int height = e.getHeight();
		
		return ">should be covered with Polyethylene foam film and packen in a box with dimension: " + (height+1) + "x" + (length+1) + "x" + (width+1);
	}

}
