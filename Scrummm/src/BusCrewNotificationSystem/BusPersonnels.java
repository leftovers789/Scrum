package BusCrewNotificationSystem;

public class BusPersonnels implements Observer {

    private String name;
    private String busNumber;

    public BusPersonnels(String name, String busNumber) {
        this.name = name;
        this.busNumber = busNumber;
    }

    @Override
    public void update(Subject s) {
        System.out.println("The message has been sent to " + this.name + " with a bus number " + this.busNumber);
//        System.out.println(s);
    }

}
