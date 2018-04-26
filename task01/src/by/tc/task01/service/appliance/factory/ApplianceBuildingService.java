package by.tc.task01.service.appliance.factory;

import java.util.Map;

import by.tc.task01.entity.appliance.Appliance;

public interface ApplianceBuildingService {
	
	 Appliance buildAppliance(Map<String, String> params);

}
