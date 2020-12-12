package exc_regioescriticas;

import exc_regioescriticas.monitor.ContadorMonitor;
import exc_regioescriticas.monitor.MonitorContadorSequencial;
import exc_regioescriticas.semaforo.ContadorSemaforo;
import exc_regioescriticas.semaforo.SemaforoContadorSequencial;

/**
 *
 * @author Rodrigo Valle
 */
public class Main {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {

        /**
         * Semáforos
         */
        SemaforoContadorSequencial semaforo = SemaforoContadorSequencial.getInstance();

        ContadorSemaforo contador  = new ContadorSemaforo(semaforo);
        ContadorSemaforo contador2 = new ContadorSemaforo(semaforo);
        ContadorSemaforo contador3 = new ContadorSemaforo(semaforo);
        
        System.out.println("Semáforos"); 
        contador.start();
        contador2.start();
        contador3.start();

        /**
         * Monitor
         */
        MonitorContadorSequencial monitor = MonitorContadorSequencial.getInstance();

        ContadorMonitor mContador  = new ContadorMonitor(monitor); 
        ContadorMonitor mContador2 = new ContadorMonitor(monitor);
        ContadorMonitor mContador3 = new ContadorMonitor(monitor);
        
        System.out.println("Monitores");
        mContador.start();
        mContador2.start();
        mContador3.start();
    }
}
