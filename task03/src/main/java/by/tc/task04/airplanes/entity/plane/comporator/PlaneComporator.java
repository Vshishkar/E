package by.tc.task04.airplanes.entity.plane.comporator;

import java.util.Comparator;

import by.tc.task04.airplanes.entity.plane.Plane;

/**
 * This comporator compare 2 planes by flight range
 * */
public class PlaneComporator implements Comparator<Plane> {

	@Override
	public int compare(Plane o1, Plane o2) {
		return (int) ( o1.getMaxRange() - o2.getMaxRange());
	}

}
