
import java.util.Scanner;

public class principal {

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        metodos m = new metodos();

       System.out.println("ingrese la cantidad de prodcutos: ");

        int n = sc.nextInt();

        objMatriz[][] p = new objMatriz[n][n];

        p =  (objMatriz[][]) m.productos(p);
        m.Mostar(p);
        p = (objMatriz[][]) m.BuscarNombre(p);
    }
    
}
