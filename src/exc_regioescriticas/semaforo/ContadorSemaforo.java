package exc_regioescriticas.semaforo; 

/**
 *
 * @author Rodrigo Valle
 */
public class ContadorSemaforo extends Thread {

    private SemaforoContadorSequencial semaforo;

    public ContadorSemaforo(SemaforoContadorSequencial contador) {
        this.semaforo = contador;
    }

    @Override
    public void run() {
        try {
            semaforo.next();
        } catch (InterruptedException ex) {
             System.out.println("Error: " + ex);
        } finally {
            semaforo.imprime();
        }
    }
}
