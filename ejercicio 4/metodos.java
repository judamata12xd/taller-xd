
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public objTeatro[] Teatro(objTeatro[] t) {
        for (int i = 0; i < t.length; i++) {

            objTeatro o = new objTeatro();

            System.out.println("Ingrese el numero que le corresponde: ");
            o.setNumero(sc.nextInt());

            o.setFila(i + 1);

            System.out.println("Ingrese el precio de la boleta: ");
            o.setPrecio(sc.nextDouble());

            t[i]= o;

        }
        return t;
    }

    public objTeatro[] ordenMayor(objTeatro[] t) {

     Arrays.sort(t, Comparator.comparingDouble(objTeatro::getPrecio));
     return t;
    }

    public void Mostrar(objTeatro[] t) {
        for (int i = 0; i < t.length; i++) {
                System.out.println("FIlas: " + t[i].getFila());
                System.out.println("Numero: " + t[i].getNumero());
                System.out.println("precio" + t[i].getPrecio());
                System.out.println("-------------------------------------------");
            }

        }
    }


