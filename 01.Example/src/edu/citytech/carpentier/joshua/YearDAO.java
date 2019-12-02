package edu.citytech.carpentier.joshua;

import java.util.ArrayList;
import java.util.List;

public class YearDAO {

	public List<Year> findEvenNumbers() {
		List<Year> list = new ArrayList<>();
		List<Year> alldata = this.findAll();
		for (Year year : alldata) {
			if (year.isEven())
				list.add(year);
		}
		return list;

	}

	public List<Year> findisOdd() {
		List<Year> list = new ArrayList<>();
		List<Year> alldata = this.findAll();
		for (Year year : alldata) {
			if (year.isOdd())
				list.add(year);
		}
		return list;

	}

	public List<Year> findLeapYear() {
		List<Year> list = new ArrayList<>();
		List<Year> alldata = this.findAll();
		for (Year year : alldata) {
			if (year.isLeapYear())
				list.add(year);
		}
		return list;

	}

	public Year findByNumber(int key) {
		List<Year> alldata = this.findAll();

		for (Year year : alldata) {
			if (year.getNumber() == key)
				return year;
		}
		return null;

	}

	public List<Year> findAll() {

		List<Year> list = new ArrayList<>();

//		list .add("Friend");
//		list .add(3999f);
//		list .add(new Double(3));

		int count = 2000;
		while (count <= 3001) {
			int number = count;
			boolean isEven = number % 2 == 0;
			boolean isOdd = !(number % 2 == 0);
			boolean isLeapYear = number % 4 == 0;
			Year year = new Year(number, isEven, isOdd, isLeapYear);
			list.add(year);
			count++;
		}
		return list;
	}

}
