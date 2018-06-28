package by.tc.task04.airplanes.service;

import java.util.Comparator;

import by.tc.task04.airplanes.entity.airline.AbstractAirline;
import by.tc.task04.airplanes.entity.plane.Plane;

public interface AirlineService {
	
	double getAmountCargoCapacity(AbstractAirline airline);
	
	int getAmountPassangerCapacity(AbstractAirline airline);
	
	void sortPlanes(AbstractAirline airline,Comparator<Plane> comporator);

}
