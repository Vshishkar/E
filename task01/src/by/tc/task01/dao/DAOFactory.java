package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

public class DAOFactory {

	private static final DAOFactory instance = new DAOFactory();
	
	private static ApplianceDAO applianceDAO = new ApplianceDAOImpl();
	
	private DAOFactory(){}
	
	public ApplianceDAO getApplianceDAO(){
		return applianceDAO;
	}
	
	public static  DAOFactory getInstance(){
		return instance;
	}
	
	
	
}
