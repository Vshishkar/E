package by.tc.task03.entity.plane;

public class PassangerPlane extends Plane  {

	private int passangerCapacity;
	
	private int planeClass;

	public PassangerPlane(){}
	
	public int getPassangerCapacity() {
		return passangerCapacity;
	}

	public void setPassangerCapacity(int passangerCapacity) {
		this.passangerCapacity = passangerCapacity;
	}

	public int getPlaneClass() {
		return planeClass;
	}

	public void setPlaneClass(int planeClass) {
		this.planeClass = planeClass;
	}
	
	@Override
	public String toString(){
		return super.toString() + " " + this.planeClass + " " + this.passangerCapacity;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(obj == this) return true;
		if(!(obj instanceof PassangerPlane))return false;
		
		PassangerPlane plane = (PassangerPlane) obj;
		return super.equals(plane) && plane.getPassangerCapacity() == this.passangerCapacity 
				&& this.planeClass == plane.getPlaneClass(); 
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = result*prime + super.hashCode();
		result = (int) (result*prime + this.planeClass);
		result = (int) (result*prime + this.passangerCapacity);
		return result;
	}


	
}
