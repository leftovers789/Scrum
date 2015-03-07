package LogManagement;

import CommandPatternClasses.Command;
import EmployeeManagement.Employee;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DutyLog {

    private Date timeIn;
    private Date timeOut;
    private Employee employee;
    private List<Command> commandLogs = new ArrayList<>();
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
    
    public void addCommandLog(Command commandLog) {
        this.commandLogs.add(commandLog);
    }

    public List<Command> getCommandLogs() {
        return commandLogs;
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
