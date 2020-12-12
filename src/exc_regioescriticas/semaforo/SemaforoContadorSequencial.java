package exc_regioescriticas.semaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Rodrigo Valle
 */
public class SemaforoContadorSequencial {

    private long valorSequencial = 0; 
    private static SemaforoContadorSequencial instance = null;
    private static final Semaphore mutex = new Semaphore(1);

    private SemaforoContadorSequencial() {}

    public static SemaforoContadorSequencial getInstance() {
        try {
            mutex.acquire();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        if (instance == null) {
            instance = new SemaforoContadorSequencial();
        }
        mutex.release();
        return instance;
    }

    public long next() throws InterruptedException {
        mutex.acquire();
        valorSequencial++;
        mutex.release();
        return valorSequencial;
    }

    public void imprime() {
        System.out.println(valorSequencial);
    }
}
