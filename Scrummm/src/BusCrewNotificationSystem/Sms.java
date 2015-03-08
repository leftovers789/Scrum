/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BusCrewNotificationSystem;

import javax.swing.JOptionPane;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.Level;
import org.smslib.AGateway;
import org.smslib.IOutboundMessageNotification;
import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.smslib.modem.SerialModemGateway;
/**
 *
 * @author Sian Paul Lasaga
 */
public class Sms {
    
    private boolean isSent;
    
    public void startService() throws Exception{
        OutboundNotification outboundNotification = new OutboundNotification();
        SerialModemGateway gateway = new SerialModemGateway("modem.com3", "COM3", 9600, "Huawei", "");
        gateway.setInbound(true);
        gateway.setOutbound(true);
        gateway.setSimPin("0000");
        gateway.setSmscNumber("09054462390");
        Service.getInstance().setOutboundMessageNotification(outboundNotification);
        Service.getInstance().addGateway(gateway);
        Service.getInstance().startService();
    }
    
    public void stopService() throws Exception{
        Service.getInstance().stopService();
    }
    
    public void sendSms(String number, String message) throws Exception{ 
        OutboundMessage msg = new OutboundMessage(number, message);
        Service.getInstance().sendMessage(msg);
        msg.setStatusReport(true);
        if(msg.getStatusReport()){
            JOptionPane.showMessageDialog(null, "Message sent", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public class OutboundNotification implements IOutboundMessageNotification
    {
        @Override
        public void process(AGateway gateway, OutboundMessage msg) {
            System.out.println("Outbound handler called from Gateway: " + gateway.getGatewayId());
            System.out.println(msg);
        }
    }
        
    static{
        Logger rootLogger = Logger.getRootLogger();
        rootLogger.setLevel(Level.INFO);
        rootLogger.addAppender(new ConsoleAppender(
        new PatternLayout("%-6r [%p] %c - %m%n")));
    }
    
}
