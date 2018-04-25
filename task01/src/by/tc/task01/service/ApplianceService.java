package by.tc.task01.service;

import java.util.List;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceService {

	<E> List<Appliance> find(Criteria<E> criteria);
	
}
