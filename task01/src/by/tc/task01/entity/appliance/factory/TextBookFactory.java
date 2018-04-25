package by.tc.task01.entity.appliance.factory;

import java.util.Map;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.TextBook;


public class TextBookFactory implements ApplianceBuildingService {

	@Override
	public Appliance buildAppliance(Map<String, String> params) {
		by.tc.task01.entity.appliance.TextBook tb = new by.tc.task01.entity.appliance.TextBook();
		
		tb.setAuthor(params.get(TextBook.AUTHOR.toString()));
		tb.setSubject(params.get(TextBook.SUBJECT.toString()));
		tb.setTitle(params.get(TextBook.TITLE.toString()));
		tb.setNumberOfPages(Integer.parseInt(params.get(TextBook.NUMBER_OF_PAGES.toString())));
		
		return null;
	}

}
