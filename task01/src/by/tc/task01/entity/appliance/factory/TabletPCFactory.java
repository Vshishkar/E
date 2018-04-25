package by.tc.task01.entity.appliance.factory;

import java.util.Map;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;


public class TabletPCFactory implements ApplianceBuildingService{

	@Override
	public Appliance buildAppliance(Map<String, String> params) {
		by.tc.task01.entity.appliance.TabletPC tablet = new by.tc.task01.entity.appliance.TabletPC();
		
		tablet.setBatteryCapacity(Double.parseDouble(params.get(TabletPC.BATTARY_CAPACITY.toString())));
		tablet.setColor(params.get(TabletPC.COLOR.toString()));
		tablet.setDisplayInches(Double.parseDouble(params.get(TabletPC.DISPLAY_INCHS.toString())));
		tablet.setFlashMemoryCapacity(Double.parseDouble(params.get(TabletPC.FLASH_MEMORY_CAPACITY.toString())));
		tablet.setMemoryRom(Double.parseDouble(params.get(TabletPC.MEMORY_ROM.toString())));
		
		return  tablet;
		
	}

}
