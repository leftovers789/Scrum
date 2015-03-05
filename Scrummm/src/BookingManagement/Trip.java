package BookingManagement;


import BusManagement.Bus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trip {
	private TripStatus status;
	private double price;
	private String tripFrom;
        private String tripTo;
	private Bus bus;
	private Date schedule;
	private List<Passenger> passenger = new ArrayList<>();
        private String referenceNo;
        private String venue;
        private int capacity;

    public Trip(TripStatus status, double price, String tripFrom, String tripTo, Bus bus, Date schedule, String referenceNo, String venue) {
        this.status = status;
        this.price = price;
        this.tripFrom = tripFrom;
        this.tripTo = tripTo;
        this.bus = bus;
        this.schedule = schedule;
        this.referenceNo = referenceNo;
        this.venue = venue;
    }   

    public void addPassenger(Passenger passenger){
        this.passenger.add(passenger);
        capacity--;
    }
    
    public TripStatus getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }

    public String getTripFrom() {
        return tripFrom;
    }

    public String getTripTo() {
        return tripTo;
    }

    public Bus getBus() {
        return bus;
    }

    public Date getSchedule() {
        return schedule;
    }

    public List<Passenger> getPassenger() {
        return passenger;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public String getVenue() {
        return venue;
    }

    public int getCapacity() {
        return capacity;
    }

    public Trip() {
    }

    public void setTripFrom(String tripFrom) {
        this.tripFrom = tripFrom;
    }

    public void setTripTo(String tripTo) {
        this.tripTo = tripTo;
    }

    
    
    public void setStatus(TripStatus status) {
        this.status = status;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void setSchedule(Date date) {
        this.schedule = date;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public void removePassenger(Passenger passenger){
        this.passenger.remove(passenger);
    }
        
}