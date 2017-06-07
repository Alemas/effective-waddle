package model;

public class Loan {

	private double amount = 100000;
	private double rate = 7.5;  //7.5%
	private int numPeriods = 30;
	
	public Loan() {
		
	
		
	}
	 
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
		
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getNumPeriods() {
		return numPeriods;
	}
	public void setNumPeriods(int numPeriods) {
		this.numPeriods = numPeriods;
	}
	 
}
