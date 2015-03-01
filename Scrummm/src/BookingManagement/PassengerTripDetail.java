package BookingManagement;


import BusManagement.Bus;
import java.util.Date;

public class PassengerTripDetail {

	private Date schedule;
	private String route;
	private Bus bus;
        private int count = 0;

	public Date getSchedule() {
		return this.schedule;
	}

	public String getRoute() {
		return this.route;
	}

	public Bus getBus() {
		return this.bus;
	}

	public String getTicketNumber() {
            // TODO - implement PassengerTripDetail.getTicketNumber
            count++;
            String number = count+"";
            String zero = "";
            for (int i = 0; i < 6 - number.length(); i++) {
                zero = zero + "0";
            }
            return zero+count;
	}

}