/**
 * Clase que utiliza las funcionalidad de la taquilla utilizando threads. También aplica el uso de lambdas.
 * @author Carlos Benjumea
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        program.TaquillaVirtual();
    }

    public void TaquillaVirtual() {
        Taquilla taquilla = new Taquilla(1, 7, 4);
        Runnable r1 = () -> taquilla.reservarEntrades("Carlos", 1);
        Runnable r2 = () -> taquilla.reservarEntrades("Dani", 2);
        Runnable r3 = () -> taquilla.reservarEntrades("Iñaki", 4);
        Runnable r4 = () -> taquilla.reservarEntrades("Marcel", 2);
        Runnable r5 = () -> taquilla.reservarEntrades("David", 3);

        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
        new Thread(r4).start();
        new Thread(r5).start();
    }
}
