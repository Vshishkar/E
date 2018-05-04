package by.tc.task03.entity.airline;

import java.util.ArrayList;

import by.tc.task03.entity.plane.Plane;

public class AbstractAirline {

	private String name;
	
	private ArrayList<Plane> planes;
	
	public ArrayList<Plane> getPlanes() {
		return planes;
	}

	public void setPlanes(ArrayList<Plane> planes) {
		this.planes = planes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
