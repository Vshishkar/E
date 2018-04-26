package by.tc.task01.service.appliance.factory;

import java.util.Map;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;
;

public class SpeakersFactory implements ApplianceBuildingService{

	@Override
	public Appliance buildAppliance(Map<String, String> params) {
		
		by.tc.task01.entity.appliance.Speakers speakers = new  by.tc.task01.entity.appliance.Speakers();
		
		speakers.setCordLength(Double.parseDouble(params.get(Speakers.CORD_LENGTH.toString())));
		speakers.setFrequencyRange(params.get(Speakers.FREQUENCY_RANGE.toString()));
		speakers.setNumberOfSpeakers(Integer.parseInt(Speakers.NUMBER_OF_SPEAKERS.toString()));
		speakers.setPowerConsumption(Double.parseDouble(params.get(Speakers.POWER_CONSUMPTION.toString())));
				
		return speakers;
		
	}

}
