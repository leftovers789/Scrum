package BusCrewNotificationSystem;

import java.util.ArrayList;

public class Operator implements Subject {

    private ArrayList<Observer> userList;
    private ArrayList<String> announcements;

    public Operator() {
        userList = new ArrayList<Observer>();
        announcements = new ArrayList<String>();
    }

    @Override
    public void addObserver(Observer o) {
        userList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
    }

    @Override
    public void notifyObservers() {
        for (Observer o : userList) {
            o.update(this);
        }
    }

    public void addAnnouncement(String announcement) {
        this.announcements.add(announcement);
        notifyObservers();
    }

    public ArrayList<String> getAnnouncements() {
        return announcements;
    }

    public String toString() {
        return announcements.toString();
    }

}
