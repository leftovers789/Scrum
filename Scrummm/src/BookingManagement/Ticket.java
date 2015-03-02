/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BookingManagement;

/**
 *
 * @author Sian Paul Lasaga
 */
public class Ticket {
    
    private String tickerNumber;
    private TicketType type;
    private double price;
    private static double discountedRate;
    private static int minimumAgeForHalfFare;

    public Ticket(String tickerNumber, TicketType type, double price) {
        this.tickerNumber = tickerNumber;
        this.type = type;
        this.price = price;
    }

    public String getTickerNumber() {
        return tickerNumber;
    }

    public TicketType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }

    public static double getDiscountedRate() {
        return discountedRate;
    }

    public static void setDiscountedRate(double discountedRate) {
        Ticket.discountedRate = discountedRate/100;
    }

    public static void setMinimumAgeForHalfFare(int minimumAgeForHalfFare) {
        Ticket.minimumAgeForHalfFare = minimumAgeForHalfFare;
    }

    public static int getMinimumAgeForHalfFare() {
        return minimumAgeForHalfFare;
    }
    
    
    
}
