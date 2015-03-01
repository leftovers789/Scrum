package LogManagement;

import BusManagement.Bus;
import EmployeeManagement.Mechanic;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MechanicReportLog {

    private Mechanic mechanic;
    private List<Bus> bussesMaintained = new ArrayList<>();
    private List<Bus> bussesFixed=new ArrayList<>();
    private Date dateChecked;
    private boolean minorIssue;
    private String descriptionOfIssue;
    private double issueEstimatedCost;

    public MechanicReportLog(Mechanic mechanic, Date dateChecked, boolean issueFound, 
            String descriptionOfIssue, double issueEstimatedCost) {
        this.mechanic = mechanic;
        this.dateChecked = dateChecked;
        this.minorIssue = issueFound;
        this.descriptionOfIssue = descriptionOfIssue;
        this.issueEstimatedCost = issueEstimatedCost;
    }

    public Mechanic getMechanic() {
        return this.mechanic;
    }

    /**
     *
     * @param mechanic
     */
    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public List<Bus> getBussesMaintained() {
        return bussesMaintained;
    }

    /**
     *
     * @param bus
     */
    public void addBus(Bus busChecked) {
        this.bussesMaintained.add(busChecked);
    }

    public Date getDateChecked() {
        return this.dateChecked;
    }

    /**
     *
     * @param dateChecked
     */
    public void setDateChecked(Date dateChecked) {
        this.dateChecked = dateChecked;
    }

    public boolean hasMinorIssue() {
        return this.minorIssue;
    }

    /**
     *
     * @param issueFound
     */
    public void setIssueFound(boolean issueFound) {
        this.minorIssue = issueFound;
    }

    public String getDescriptionOfIssue() {
        return this.descriptionOfIssue;
    }

    /**
     *
     * @param descriptionOfIssue
     */
    public void setDescriptionOfIssue(String descriptionOfIssue) {
        this.descriptionOfIssue = descriptionOfIssue;
    }

    public double getIssueEstimatedCost() {
        return this.issueEstimatedCost;
    }

    /**
     *
     * @param issueCost
     */
    public void setIssueEstimatedCost(double issueEstimatedCost) {
        this.issueEstimatedCost = issueEstimatedCost;
    }

}
