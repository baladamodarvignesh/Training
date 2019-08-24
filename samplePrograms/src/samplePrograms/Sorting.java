package samplePrograms;

import java.util.Comparator;
import java.util.List;

public class Sorting {
	
	public static List<Person> sortingDESC(List<Person> li, Comparator<Person> compare)
	{
		li.sort(compare.reversed());
		return li;
	}

}
