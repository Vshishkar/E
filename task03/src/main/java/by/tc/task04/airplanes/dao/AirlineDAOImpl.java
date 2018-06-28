package by.tc.task04.airplanes.dao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.tc.task04.airplanes.dao.exception.DAOException;
import by.tc.task04.airplanes.entity.airline.AbstractAirline;
import by.tc.task04.airplanes.entity.plane.PassangerPlane;
import by.tc.task04.airplanes.entity.plane.Plane;
import by.tc.task04.airplanes.entity.plane.TransportPlane;

public class AirlineDAOImpl implements AirlineDAO {

	@Override
	public double getAmountCargoCapacity(AbstractAirline airline) throws DAOException {
		List<Plane> planes = airline.getPlanes();
		
		if(planes == null) {
			throw new DAOException("there are no planes at airline.");
		}
		
		double result = 0;
		for(Plane plane:planes) {
			if(plane instanceof TransportPlane) { 
				TransportPlane transportPlane = (TransportPlane) plane;
				result +=transportPlane.getCargoCapacity();
			}
		}
		return result;
	}

	@Override
	public int getAmountPassangerCapacity(AbstractAirline airline) throws DAOException {
		List<Plane> planes = airline.getPlanes();
		if(planes == null) {
			throw new DAOException("there are no planes at airline.");
		}
		int result = 0;
		for(Plane plane:planes) {
			if(plane instanceof PassangerPlane) {
				PassangerPlane passangerPlane = (PassangerPlane) plane;
				result +=passangerPlane.getPassangerCapacity();
			}
		}
		return result;
	}

	@Override
	public void sortPlanes(AbstractAirline airline, Comparator<Plane> comporator) throws DAOException {
		List<Plane> planes = airline.getPlanes();
		if(planes == null) {
			throw new DAOException("there are no planes at airline.");
		}
		Collections.sort(planes, comporator);
	}

}
