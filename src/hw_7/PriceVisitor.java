package hw_7;

public class PriceVisitor implements Visitor{

	@Override
	public double visit(Glass g) {
		// TODO Auto-generated method stub
		String name = g.getName();
		int thickness = g.getTickness();
		double length = g.getLenght();
		double cost;
		
		if(thickness == 1) {
			cost = 2 * length/100;
		}else if(thickness == 2) {
			cost = 1.2 * length/100;
		}else {
			cost = 0.7 * length/100;
		}
				
		return cost;
	}

	@Override
	public double visit(Furniture f) {
		// TODO Auto-generated method stub
		String name = f.getName();
		double weight = f.getWeight();
		
		double cost;
		
		cost = 5 * weight/20;

		return cost;
	}

	@Override
	public double visit(Electronic e) {
		// TODO Auto-generated method stub
		String name = e.getName();
		double weight = e.getWeight();
		boolean fragile = e.getFragile();
		
		double cost;
		
		if(fragile == true) {
			cost = 5 * weight/10;
		}else {
			cost = 5* weight/15;
		}
				
		return cost;
	}

	@Override
	public String visit1(Glass g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit1(Furniture f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit1(Electronic e) {
		// TODO Auto-generated method stub
		return null;
	}



}
