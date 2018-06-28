package by.tc.task04.airplanes.service;

public class ServiceFactory {
	
	private static final ServiceFactory instanse = new ServiceFactory();
	
	private static AirlineService service = new AirlineServiceImpl();
	
	private ServiceFactory() {}

	public static AirlineService getService() {
		return service;
	}

	public static void setService(AirlineService service) {
		ServiceFactory.service = service;
	}

	public static ServiceFactory getInstanse() {
		return instanse;
	}
	
}
