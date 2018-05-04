package by.tc.task03.entity.plane;

public class TransportPlane extends Plane  {
	
	private double cargoCapacity;

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public String toString(){
		return super.toString() + " " + this.cargoCapacity;
	}
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(obj == this) return true;
		if(!(obj instanceof TransportPlane))return false;
		
		TransportPlane plane = (TransportPlane) obj;
		return super.equals(plane) && plane.getCargoCapacity() == this.cargoCapacity; 
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = result*prime + super.hashCode();
		result = (int) (result*prime + this.cargoCapacity);
		return result;
	}
	
	
}
