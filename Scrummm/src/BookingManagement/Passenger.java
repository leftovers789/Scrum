package BookingManagement;

import EmployeeManagement.Gender;

public class Passenger {

	private String firstName;
	private String lastName;
	private int age;
	private Gender gender;
        private String contactNumber;
        private String address;
	private Ticket ticket;

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}

	public Gender getGender() {
		return this.gender;
	}
	
        public Ticket getTicket() {
            return ticket;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public String getAddress() {
            return address;
        }
        
        public Passenger(String firstName, String lastName, int age, Gender gender, String contactNumber, String address, Ticket ticket) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;
            this.contactNumber = contactNumber;
            this.address = address;
            this.ticket = ticket;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setTicket(Ticket ticket) {
            this.ticket = ticket;
        }

}