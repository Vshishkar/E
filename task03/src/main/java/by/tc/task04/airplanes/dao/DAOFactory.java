package by.tc.task04.airplanes.dao;

public class DAOFactory {

	private static final DAOFactory instanse = new DAOFactory();
	
	private DAOFactory() {};
	
	private static AirlineDAO airlineDAO = new AirlineDAOImpl();

	public static AirlineDAO getAirlineDAO() {
		return airlineDAO;
	}

	public synchronized static DAOFactory getInstanse() {
		return instanse;
	}

	
	
	
}
