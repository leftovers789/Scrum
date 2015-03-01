package BusManagement;


import EmployeeManagement.Driver;
import java.util.Date;

public class BusTravelLog {

	private Bus bus;
	private Date timeIn;
	private Date timeOut;
	private String travelDestination;
	private double travelDistance;
	private double travelFuelCost;
	private Driver driver;

	public Bus getBus() {
		return this.bus;
	}

	/**
	 * 
	 * @param bus
	 */
	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Date getTimeIn() {
		return this.timeIn;
	}

	/**
	 * 
	 * @param timeIn
	 */
	public void setTimeIn(Date timeIn) {
		this.timeIn = timeIn;
	}

	public Date getTimeOut() {
		return this.timeOut;
	}

	/**
	 * 
	 * @param timeOut
	 */
	public void setTimeOut(Date timeOut) {
		this.timeOut = timeOut;
	}

	public String getTravelDestination() {
		return this.travelDestination;
	}

	/**
	 * 
	 * @param travelDestination
	 */
	public void setTravelDestination(String travelDestination) {
		this.travelDestination = travelDestination;
	}

	public double getTravelDistance() {
		return this.travelDistance;
	}

	/**
	 * 
	 * @param travelDistance
	 */
	public void setTravelDistance(double travelDistance) {
		this.travelDistance = travelDistance;
	}

	public double getTravelFuelCost() {
		return this.travelFuelCost;
	}

	/**
	 * 
	 * @param travelFuelCost
	 */
	public void setTravelFuelCost(double travelFuelCost) {
		this.travelFuelCost = travelFuelCost;
	}

	public Driver getDriver() {
		return this.driver;
	}

	/**
	 * 
	 * @param driver
	 */
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
}