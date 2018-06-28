package by.tc.task04.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.tc.task04.airplanes.entity.airline.AbstractAirline;
import by.tc.task04.airplanes.entity.airline.USAAirline;
import by.tc.task04.airplanes.entity.plane.Plane;
import by.tc.task04.airplanes.entity.plane.TransportPlane;
import by.tc.task04.airplanes.entity.plane.comporator.PlaneComporator;
import by.tc.task04.airplanes.service.AirlineService;
import by.tc.task04.airplanes.service.ServiceFactory;

public class Runner {

	public static void main(String [] args) {
		
		ServiceFactory factory = ServiceFactory.getInstanse();
		
		AirlineService airlineService = ServiceFactory.getService(); 
				
		List<Plane> planes = new ArrayList<>();
		
		for(int i = 0;i < 10; i ++) {
			Plane plane = null;
			if(i % 2 == 0 ) {
				plane = PlaneCreator.createRandomPassangerPlane();
			}
			else {
				plane = PlaneCreator.createRandomTransportPlane();
			}
			planes.add(plane);
		}
		
		USAAirline airline = new USAAirline();
		Comparator<Plane> comporator =  new PlaneComporator();
		
		airline.setIATA("UA");
		airline.setTitle("United Airlines");
		airline.setPlanes(planes);
		
		Printer.printAirlineInfo(airline);
		
		double amountCargoCapacity =  airlineService.getAmountCargoCapacity(airline);
		int amountPassangerCapacity = 	airlineService.getAmountPassangerCapacity(airline);
		airlineService.sortPlanes(airline, comporator);
		
		
		System.out.println("AmountCargoCapacity : " + amountCargoCapacity);
		System.out.println("AmountPassangerCapacity : " + amountPassangerCapacity);
		System.out.println("Planes sorted by max range");
		Printer.printAirlineInfo(airline);
		
	}
	
	
}
