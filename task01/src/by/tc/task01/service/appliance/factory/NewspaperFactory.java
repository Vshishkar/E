package by.tc.task01.service.appliance.factory;

import java.util.Map;



import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Newspaper;

public class NewspaperFactory implements ApplianceBuildingService {

	@Override
	public Appliance buildAppliance(Map<String, String> params) {
		by.tc.task01.entity.appliance.Newspaper newspaper = new by.tc.task01.entity.appliance.Newspaper();
		
		newspaper.setNumberOfPeriodocity(params.get(Newspaper.PERIODICITY.toString()));
		newspaper.setPaidOrFree(params.get(Newspaper.PAID_OR_FREE.toString()));
		newspaper.setTitle(params.get(Newspaper.TITLE.toString()));
		
		return newspaper;
	}

}
