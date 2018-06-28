package by.tc.task04.airplanes.service;

import java.io.IOException;
import java.util.Comparator;


import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import by.tc.task04.airplanes.dao.DAOFactory;
import by.tc.task04.airplanes.dao.exception.DAOException;
import by.tc.task04.airplanes.entity.airline.AbstractAirline;
import by.tc.task04.airplanes.entity.plane.PassangerPlane;
import by.tc.task04.airplanes.entity.plane.Plane;
import by.tc.task04.airplanes.entity.plane.TransportPlane;
import by.tc.task04.airplanes.dao.AirlineDAO;

public class AirlineServiceImpl implements AirlineService {

	private static final DAOFactory factory = DAOFactory.getInstanse(); 
	
	private static Logger log = Logger.getLogger(AirlineServiceImpl.class.getName());
	
	private static String root = System.getProperty("user.dir");
	private static String src = "/src/main/airline_service_log.log";
	
	public AirlineServiceImpl() {
		configureLogger();
	}
	
	@Override
	public double getAmountCargoCapacity(AbstractAirline airline) {
		
		AirlineDAO airlineDAO =  factory.getAirlineDAO();
		
		double result = 0;
		try {
			result = airlineDAO.getAmountCargoCapacity(airline);
		} catch (DAOException e) {
			log.log(Level.SEVERE,"Exception",e);
		}
		
		return result;
		
	}

	@Override
	public int getAmountPassangerCapacity(AbstractAirline airline) {
	
		AirlineDAO airlineDAO =  factory.getAirlineDAO();
		
		int result = 0;
		try {
			result = airlineDAO.getAmountPassangerCapacity(airline);
		} catch (DAOException e) {
			log.log(Level.SEVERE,"Exception",e);
		}
	
		return result;
		
	}
	

	@Override
	public void sortPlanes(AbstractAirline airline, Comparator<Plane> comporator) {
	
		AirlineDAO airlineDAO = factory.getAirlineDAO();
		
		try {
			airlineDAO.sortPlanes(airline, comporator);
		} catch (DAOException e) {
			log.log(Level.SEVERE, "Exception", e);
		}
		
		
	}

	private void configureLogger() {
		
		FileHandler fileHandler = null;
		
		try {
			fileHandler = new FileHandler(root + src);
			log.addHandler(fileHandler);
			
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
			
			log.info("First log");
		}catch(SecurityException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
