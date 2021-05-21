/**
 * Clase Taquilla, contiene su constructor y el método reservarEntradas.
 *
 * @author Carlos Benjumea
 * @version 1.0
 */

public class Taquilla {
    private int idTaquilla;
    private int entradesRestants;
    private int maxEntrades;

    /**
     * Constructor de la clase Taquilla, recibe el su id de identificación, el número de entradas restantes y el máximo de entradas por persona.
     * @param idTaquilla Entero que es el identificador individual de la taquilla.
     * @param entradesRestants Número de entradas a la venta en esa taquilla.
     * @param maxEntrades Número máximo de entradas por persona en esa taquilla.
     */
    public Taquilla(int idTaquilla, int entradesRestants, int maxEntrades) {
        this.idTaquilla = idTaquilla;
        this.entradesRestants = entradesRestants;
        this.maxEntrades = maxEntrades;
    }

    /**
     * Método que permite al usuario reservar un número determinado de entradas a una persona.
     * @param nomUsuari String con el nombre identificador de la persona que compra la entrada.
     * @param numEntrades Entero con el número de entradas que compra esa persona.
     */
    public synchronized void reservarEntrades(String nomUsuari, int numEntrades) {
        if (numEntrades >= maxEntrades){
            System.out.println("L'usuari "+nomUsuari+" no ha pogut reservar entrades ja que ha demanat més de "+maxEntrades+". Ha perdut el torn.");
        }
        else {
            for (int i = 0; i < numEntrades; i++) {
                if (entradesRestants > 0) {
                    entradesRestants--;
                    System.out.println("L'usuari "+nomUsuari+" ha reservat la seva "+(i + 1)+"a entrada (de "+numEntrades+") entrada de la taquilla"+idTaquilla+". Restants: ["+entradesRestants+"]");
                }
                else {
                    System.out.println("L'usuari "+nomUsuari+" no ha pogut reservar la seva entrada n."+(i + 1)+" ja que no hi queden");
                }
            }
        }
    }
}
