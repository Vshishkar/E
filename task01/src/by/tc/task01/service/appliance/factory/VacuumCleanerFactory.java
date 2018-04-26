package by.tc.task01.service.appliance.factory;

import java.util.Map;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;


public class VacuumCleanerFactory implements ApplianceBuildingService {

	@Override
	public Appliance buildAppliance(Map<String, String> params) {
		by.tc.task01.entity.appliance.VacuumCleaner vacuumCleaner = new by.tc.task01.entity.appliance.VacuumCleaner() ;
		
		vacuumCleaner.setBagType(params.get(VacuumCleaner.BAG_TYPE.toString()));
		vacuumCleaner.setCleaningWidth(Double.parseDouble(params.get(VacuumCleaner.CLEANING_WIDTH.toString())));
		vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(params.get(VacuumCleaner.MOTOR_SPEED_REGULATION.toString())));
		vacuumCleaner.setFilterType(params.get(VacuumCleaner.FILTER_TYPE.toString()));
		vacuumCleaner.setCleaningWidth(Double.parseDouble(params.get(VacuumCleaner.CLEANING_WIDTH.toString())));
		vacuumCleaner.setWandType(params.get(VacuumCleaner.WAND_TYPE.toString()));
		
		return vacuumCleaner;
		
	}

}
