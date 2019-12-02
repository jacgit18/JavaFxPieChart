package edu.citytech.carpentier.joshua;

public class _Driver {

	public static void main(String[] args) {
		
		// type this /* then press enter
		
		/*
		int i = 0;
		while(i <= 100) { 
			if(i % 5 == 0)
			  System.out.println(i + " ");
			  i++;
		}
		*/
		
		int count = 2000;
		while(count <= 3001) {
			int number = count;
			boolean isEven = true;
			boolean isOdd = true;
			boolean isLeapYear = true;
			Year year = new Year(number, isEven, isOdd, isLeapYear);
			 System.out.println(" "  + year);
			 count++;
		}

	
		
		
	}

}
