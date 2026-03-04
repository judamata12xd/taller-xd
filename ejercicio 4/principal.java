
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Ingrese el tamaño del teatro");
        n = sc.nextInt();

        objTeatro[] teatro = new objTeatro[n];

        metodos m = new metodos();

        teatro = m.Teatro(teatro);

        System.out.println("\n--- ANTES DE ORDENAR ---");
        m.Mostrar(teatro);

        teatro = m.ordenMayor(teatro);

        System.out.println("\n--- DESPUES DE ORDENAR POR PRECIO (ASCENDENTE) ---");
        m.Mostrar(teatro);



        
    }
    
}
