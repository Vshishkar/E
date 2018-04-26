package by.tc.task01.service.appliance.factory;

import java.util.Map;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;

public class OvenFactory implements ApplianceBuildingService{

	@Override
	public Appliance buildAppliance(Map<String, String> params) {
		by.tc.task01.entity.appliance.Oven oven = new by.tc.task01.entity.appliance.Oven();
		
		oven.setCapacity(Double.parseDouble(params.get(Oven.CAPACITY.toString())));
		oven.setDepth(Double.parseDouble(params.get(Oven.DEPTH.toString())));
		oven.setHeight(Double.parseDouble(params.get(Oven.HEIGHT.toString())));
		oven.setPowerConsumption(Double.parseDouble(params.get(Oven.POWER_CONSUMPTION.toString())));
		oven.setWeight(Double.parseDouble(params.get(Oven.WEIGHT.toString())));
		oven.setWidth(Double.parseDouble(params.get(Oven.WIDTH.toString())));
		
		return oven;
	}

}
