package edu.citytech.carpentier.joshua;

import java.util.List;

public class _DriverDAO {

	public static void main(String[] args) {
		// Data Access Object
		YearDAO dao = new YearDAO();
		List<Year> years = dao.findAll();

		// whats going on with List<Year> years
		// fore crtl space

		for (Year year : years) {
			System.out.println(year);
		}

		System.out.println("-----------------------");
		years = dao.findAll();
		years.forEach(System.out::println);
		System.out.println("===========================");

//		years = dao.findEvenNumbers();
//		years.forEach(System.out::println);

//		years = dao.findisOdd();
//		years.forEach(System.out::println);
//		
//		years = dao.findLeapYear();
//		years.forEach(System.out::println);

		Year row = dao.findByNumber(3_000);
		System.out.println(row);
	}

}