package exc_regioescriticas.monitor;

/**
 *
 * @author Rodrigo Valle
 */
public class MonitorContadorSequencial {
    private long valorSequencial = 0;
    private static MonitorContadorSequencial instance = null; 

    private MonitorContadorSequencial() {}

    public synchronized static MonitorContadorSequencial getInstance() {
        if (instance == null) {
            instance = new MonitorContadorSequencial();
        }
        return instance;
    }

    public synchronized long next() { 
        valorSequencial++; ;
        return valorSequencial;
    }

    public void imprime() {
        System.out.println(valorSequencial);
    }
}
