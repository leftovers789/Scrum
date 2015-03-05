package LogManagement;

import EmployeeManagement.Employee;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DutyLog {

    private Date timeIn;
    private Date timeOut;
    private Employee employee;
    private List<ActionLog> actionLogs = new ArrayList<>();
    private static DutyLog dutyLog=null;

    private DutyLog() {

    }
    
    public static DutyLog getInstance() {
        if (dutyLog==null) {
            dutyLog=new DutyLog();
        }
        return dutyLog;
    }
    
    public void resetInstance() {
        dutyLog=null;
    }

    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public void addActionLog(ActionLog actionLog) {
        this.actionLogs.add(actionLog);
    }

    public List<ActionLog> getActionLogs() {
        return actionLogs;
    }

    public Date getTimeIn() {
        return timeIn;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public Employee getEmployee() {
        return employee;
    }

}
