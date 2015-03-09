/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPatternClasses;

import LogManagement.DutyLog;

/**
 *
 * @author Sian Paul Lasaga
 */
public class Invoker {
    
    private DutyLog dutyLog=DutyLog.getInstance();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
        dutyLog.addCommandLog(command);
    }
}
