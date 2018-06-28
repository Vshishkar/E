package by.tc.task04.main;

import by.tc.task04.airplanes.entity.airline.AbstractAirline;
import by.tc.task04.airplanes.entity.plane.Plane;

public class Printer {

	public static void printPlaneInfo(Plane p) {
		System.out.println(p.toString());
	}
	
	public static void printAirlineInfo(AbstractAirline airline) {
		System.out.println(airline.toString());
	}
	

}
