package by.tc.task04.main;

import java.util.Random;

import by.tc.task04.airplanes.entity.plane.PassangerPlane;
import by.tc.task04.airplanes.entity.plane.TransportPlane;

public class PlaneCreator {

	public static TransportPlane createRandomTransportPlane() {
		TransportPlane transportPlane = new TransportPlane();
		transportPlane.setCargoCapacity((int)(Math.random() * 50 + 1));
		transportPlane.setCrew((int)(Math.random() * 12 + 1));
		transportPlane.setFuelStock((int)(Math.random() * 50 + 1));
		transportPlane.setHeight((int)(Math.random() * 50 + 1));
		transportPlane.setLength((int)(Math.random() * 50 + 1));
		transportPlane.setTopSpeed((int)(Math.random() * 50 + 1));
		transportPlane.setMaxRange((int)(Math.random() * 50 + 1));
		transportPlane.setModel("A451F");
		return transportPlane;
	} 
	
	public static PassangerPlane createRandomPassangerPlane() {
		PassangerPlane passangerPlane = new PassangerPlane();
		passangerPlane.setPassangerCapacity((int)(Math.random() * 100 + 1));
		passangerPlane.setCrew((int)(Math.random() * 12 + 1));
		passangerPlane.setFuelStock((int)(Math.random() * 50 + 1));
		passangerPlane.setHeight((int)(Math.random() * 50 + 1));
		passangerPlane.setLength((int)(Math.random() * 50 + 1));
		passangerPlane.setTopSpeed((int)(Math.random() * 50 + 1));
		passangerPlane.setMaxRange((int)(Math.random() * 50 + 1));
		passangerPlane.setModel("A443F");
		passangerPlane.setPlaneClass((int)(Math.random() * 10 + 1));
		return passangerPlane;
	}
	
}
