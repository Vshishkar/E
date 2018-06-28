package by.tc.task04.airplanes.dao;

import java.util.Comparator;

import by.tc.task04.airplanes.dao.exception.DAOException;
import by.tc.task04.airplanes.entity.airline.AbstractAirline;
import by.tc.task04.airplanes.entity.plane.Plane;

public interface AirlineDAO {


	double getAmountCargoCapacity(AbstractAirline airline) throws DAOException;
	
	int getAmountPassangerCapacity(AbstractAirline airline) throws DAOException;
	
	void sortPlanes(AbstractAirline airline,Comparator<Plane> comporator) throws DAOException;

	
}
