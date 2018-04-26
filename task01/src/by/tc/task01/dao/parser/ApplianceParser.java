package by.tc.task01.dao.parser;

import java.util.ArrayList;

import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceParser {
	
	 ArrayList<String> parse(String path);
	
	 <E> ArrayList<String> parse(String path,Criteria<E> criteria);
	
}
