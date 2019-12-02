package edu.citytech.carpentier.joshua;

public class Year {

	private int number;
	private boolean isEven;
	private boolean isOdd;
	private boolean isLeapYear;
	
	
	
	public Year(int number, boolean isEven, boolean isOdd, boolean isLeapYear) {
		super();
		this.number = number;
		this.isEven = isEven;
		this.isOdd = isOdd;
		this.isLeapYear = isLeapYear;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isEven() {
		return isEven;
	}
	public void setEven(boolean isEven) {
		this.isEven = isEven;
	}
	public boolean isOdd() {
		return isOdd;
	}
	public void setOdd(boolean isOdd) {
		this.isOdd = isOdd;
	}
	public boolean isLeapYear() {
		return isLeapYear;
	}
	public void setLeapYear(boolean isLeapYear) {
		this.isLeapYear = isLeapYear;
	}

@Override
public String toString() {
	return "Year [number=" + number + ", isEven=" + isEven + ", isOdd=" + isOdd + ", isLeapYear=" + isLeapYear + "]";
}
	
	
	// right click go to source generate getter and setters
	// then select private variable 
    // same for constructors
	
	
	
}
