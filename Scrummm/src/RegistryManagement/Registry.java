package RegistryManagement;

import LogManagement.*;
import BookingManagement.*;
import BusManagement.*;
import java.util.*;

public class Registry extends Observable {

    private List<BusTravelLog> busTravelLogs = new ArrayList<>();
    private List<DutyLog> dutyLogs = new ArrayList<>();
    private List<SalesLog> salesLogs = new ArrayList<>();
    private List<Trip> trips = new ArrayList<>();
    private static Registry registry = null;

    private Registry() {
    }

    public static Registry getInstance() {
        if (registry == null) {
            registry = new Registry();
        }
        return registry;
    }

    public List<BusTravelLog> getBusTravelLogs() {
        return busTravelLogs;
    }

    public void addBusTravelLog(BusTravelLog busTravelLog) {
        this.busTravelLogs.add(busTravelLog);
    }

    public List<DutyLog> getDutyLogs() {
        return dutyLogs;
    }

    public void addDutyLog(DutyLog dutyLogs) {
        this.dutyLogs.add(dutyLogs);
    }

    public List<SalesLog> getSalesLogs() {
        return salesLogs;
    }

    public void addSalesLog(SalesLog salesLog) {
        this.salesLogs.add(salesLog);
    }

    public List<Trip> getTrips() {
        return trips;
    }

    /**
     *
     * @param trip
     */
    public void addTrip(Trip trip) {
        // TODO - implement Registry.addTrip
        this.trips.add(trip);
    }

    public void editTrip() {
        // TODO - implement Registry.editTrip
        throw new UnsupportedOperationException();
    }

    public void removeTrip(Trip trip) {
        // TODO - implement Registry.removeTrip
        if (this.trips.contains(trip)) {
            this.trips.remove(trip);
        }
    }
}
