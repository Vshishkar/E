package by.tc.task01.service.appliance.factory;

import java.util.Map;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;


public class RefrigeratorFactory implements ApplianceBuildingService {

	@Override
	public Appliance buildAppliance(Map<String, String> params) {
		
		by.tc.task01.entity.appliance.Refrigerator refrigerator = new by.tc.task01.entity.appliance.Refrigerator();
		
		refrigerator.setFreezerCapacity(Double.parseDouble(params.get(Refrigerator.FREEZER_CAPACITY.toString())));
		refrigerator.setHeight(Double.parseDouble(params.get(Refrigerator.HEIGHT.toString())));
		refrigerator.setOverallCapacity(Double.parseDouble(params.get(Refrigerator.OVERAL_CAPACITY.toString())));
		refrigerator.setPowerConsumption(Double.parseDouble(params.get(Refrigerator.POWER_CONSUMPTION.toString())));
		refrigerator.setWeight(Double.parseDouble(params.get(Refrigerator.WEIGHT.toString())));
		refrigerator.setWidth(Double.parseDouble(params.get(Refrigerator.WIDTH.toString())));
		return null;
	}

}
