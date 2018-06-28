package by.tc.task04.airplanes.entity.airline;

import java.util.ArrayList;
import java.util.List;

import by.tc.task04.airplanes.entity.plane.Plane;

public abstract class AbstractAirline {

	private List<Plane> planes;
	
	private String title;
	
	public AbstractAirline() {
		this.planes = new ArrayList<>();
	}
	
	public AbstractAirline(String title,List<Plane> planes){
		this.planes = planes;
		this.title = title;
	}

	public List<Plane> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plane> planes) {
		this.planes = planes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result + super.hashCode();
		result = prime*result + this.title.hashCode();
		result = prime*result + this.planes.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		if( !(obj instanceof AbstractAirline)) return false;
		
		AbstractAirline airLine = (AbstractAirline) obj;
		
		return airLine.planes.equals(this.getPlanes()) && airLine.title.equals(this.getTitle());
	}

	@Override
	public String toString() {
		return this.title + "\n " + this.planes.toString();
	}
	
	
	
}
