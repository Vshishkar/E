package by.tc.task01.dao;

import java.util.List;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceDAO {

	<E> List<Appliance> find(Criteria<E> criteria);
	
}
