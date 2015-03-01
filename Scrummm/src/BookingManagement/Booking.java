package BookingManagement;


import EmployeeManagement.Gender;
import BusManagement.BusType;
import java.util.Date;

public class Booking {

	private String firstName;
	private String lastName;
	private Date schedule;
	private String contactNumber;
	private int age;
	private String address;
	private Gender gender;
	private boolean isDiscounted;
	private String route;
	private BusType busType;
        private String ticketNuber;
        private int count;
        
        public Booking(){
            
        }

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Date getSchedule() {
		return this.schedule;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public int getAge() {
		return this.age;
	}

	public String getAddress() {
		return this.address;
	}

	public Gender getGender() {
		return this.gender;
	}

	public boolean getIsDiscounted() {
		return this.isDiscounted;
	}

	public String getRoute() {
		return this.route;
	}

	public BusType getBusType() {
		return this.busType;
	}

    public Booking(String firstName, String lastName, Date schedule, String contactNumber, int age, String address, Gender gender, boolean isDiscounted, String route, BusType busType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schedule = schedule;
        this.contactNumber = contactNumber;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.isDiscounted = isDiscounted;
        this.route = route;
        this.busType = busType;
    }
        
        
    public String getTicketNumber(){
        count++;
        String number = count+"";
        String zero = "";
        for (int i = 0; i < 6 - number.length(); i++) {
            zero = zero + "0";
        }
        return this.ticketNuber = zero+count;
    }


}