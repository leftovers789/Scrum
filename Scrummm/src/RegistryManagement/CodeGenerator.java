/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RegistryManagement;

import BookingManagement.*;
import java.util.Date;

/**
 *
 * @author Sian Paul Lasaga
 */
public class CodeGenerator {
    
    private static int refNoCount;
    private static int ticketNoCount;
    private static CodeGenerator uniqueInstance;
    
    public static String generateReferenceNumber(){
        refNoCount++;
            String number = refNoCount+"";
            String prefix = "RE";
            String zero = "";
            for (int i = 0; i < 5 - number.length(); i++) {
                zero = zero+"0";
            }
            return prefix+new Date().getYear()+zero+refNoCount;
    }
    
    public static String generateTicketNumber(){
        ticketNoCount++;
            String number = ticketNoCount+"";
            String zero = "";
            for (int i = 0; i < 6 - number.length(); i++) {
                zero = zero + "0";
            }
            return zero+ticketNoCount;
    }

    public static CodeGenerator getInstance(){
        if(uniqueInstance == null){
            uniqueInstance =  new CodeGenerator();
        }
        return uniqueInstance;
    }
    
    private CodeGenerator() {
    }
    
    
    
}
