package RegistryManagement;


import java.util.Observable;
import java.util.Observer;

public class FinancialReport implements Observer {

	private double grossProfit;
	private double netProfit;
	private double revenue;
	private double grossProfitPercentage;
	private double operatingExpenses;

	public double getGrossProfit() {
		return this.grossProfit;
	}

	public double getNetProfit() {
		return this.netProfit;
	}

	public double getRevenue() {
		return this.revenue;
	}

	public double getGrossProfitPercentage() {
		return this.grossProfitPercentage;
	}

	public double getOperatingExpenses() {
		return this.operatingExpenses;
	}

 
    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}