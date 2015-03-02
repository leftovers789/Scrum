package LogManagement;

import BusManagement.Bus;
import java.util.Date;

public class MaintenanceReport {

    private Bus bus;
    private Date dateChecked;
    private boolean issue;
    private String descriptionOfIssue;
    private double issueEstimatedCost;

    public MaintenanceReport(Bus bus, Date dateChecked, boolean issue,
            String descriptionOfIssue, double issueEstimatedCost) {
        this.bus = bus;
        this.dateChecked = dateChecked;
        this.issue = issue;
        this.descriptionOfIssue = descriptionOfIssue;
        this.issueEstimatedCost = issueEstimatedCost;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBusChecked(Bus bus) {
        this.bus = bus;
    }

    public boolean hasIssue() {
        return issue;
    }

    public void setIssue(boolean issue) {
        this.issue = issue;
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
        return this.issue;
    }

    /**
     *
     * @param issueFound
     */
    public void setIssueFound(boolean issueFound) {
        this.issue = issueFound;
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
     * @param issueEstimatedCost
     */
    public void setIssueEstimatedCost(double issueEstimatedCost) {
        this.issueEstimatedCost = issueEstimatedCost;
    }

}
