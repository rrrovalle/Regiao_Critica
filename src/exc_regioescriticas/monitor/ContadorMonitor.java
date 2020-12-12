/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc_regioescriticas.monitor;

/**
 *
 * @author Rodrigo Valle
 */
public class ContadorMonitor extends Thread {
 
    private MonitorContadorSequencial monitor;

    public ContadorMonitor(MonitorContadorSequencial contador) {
        this.monitor = contador;
    }

    @Override
    public void run() {
        try {
            monitor.next(); 
        } finally {
            monitor.imprime();
        }
    }
}

