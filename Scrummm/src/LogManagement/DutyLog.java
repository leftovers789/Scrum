package LogManagement;


import EmployeeManagement.Employee;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DutyLog {

	private Employee employee;
	private Date timeIn;
	private Date timeOut;
        private List<CashierLog> cashierLog = new ArrayList<>();
        
        public void addCashierLog(CashierLog log){
            cashierLog.add(log);
        }

	public Employee getEmployee() {
		return this.employee;
	}

	/**
	 * 
	 * @param employee
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getTimeIn() {
		return this.timeIn;
	}

	/**
	 * 
	 * @param timeIn
	 */
	public void setTimeIn(Date timeIn) {
		this.timeIn = timeIn;
	}

	public Date getTimeOut() {
		return this.timeOut;
	}

	/**
	 * 
	 * @param timeOut
	 */
	public void setTimeOut(Date timeOut) {
		this.timeOut = timeOut;
	}

}