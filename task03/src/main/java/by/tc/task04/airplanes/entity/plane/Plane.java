package by.tc.task04.airplanes.entity.plane;

public abstract class Plane {
	
	private double length;
	
	private double height;
	
	private double topSpeed;
	
	private double maxRange;
	
	private double fuelStock;
	
	private int crew;
	
	private String model;

	public Plane(){}
	
	public Plane(double length,double height,double topSpeed,double maxRange,double fuelStock,int crew,String model){		
		this.length = length;
		this.height = height;
		this.topSpeed = topSpeed;
		this.maxRange = maxRange;
		this.fuelStock = fuelStock;
		this.crew = crew;
		this.model = model;				
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

	public double getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(double maxRange) {
		this.maxRange = maxRange;
	}

	public double getFuelStock() {
		return fuelStock;
	}

	public void setFuelStock(double fuelStock) {
		this.fuelStock = fuelStock;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(obj == null) return false;
		if(obj == this) return true;
		if(!(obj instanceof Plane))return false;
		
		Plane plane = (Plane) obj;
		
		return plane.getCrew() == this.crew && plane.getFuelStock() == this.fuelStock && plane.height == this.height &&
				plane.getLength() == this.length && plane.model.equals(plane.getModel()) 
				&& plane.getMaxRange() == this.maxRange && plane.getTopSpeed() == this.topSpeed;								
		
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + crew;
		result = (int) (prime * result + fuelStock);
		result = (int)( prime * result + height);
		result = (int) (prime * result + length);
		result = (int) (prime * result + maxRange);
		result = (int) (prime * result + topSpeed);
		result = prime * result + model.hashCode();
		return result;
	}
	
	
	@Override
	public String toString(){
		return this.getClass().getSimpleName() + " : [" + " Crew " + this.crew + "\t" + "Fuel stock " + this.fuelStock  +"\t" + "Height " + this.height 
				 +"\t" + "Length " + this.length  + "\t" +"  MaxRange" + this.maxRange + "\t" +"Model " + this.model  +"\t" + "Top speed " + this.topSpeed  ;
				
	}
	

}
