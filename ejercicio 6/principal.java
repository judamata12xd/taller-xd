
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de produsctos que va a registrar: ");
        int n = sc.nextInt();

        metodos m = new metodos();

        objSuperMercado[][] estanteria = new objSuperMercado[n][n];
        
        estanteria = m.Estanteria(estanteria);

        objSuperMercado[][] ProductosDis = new objSuperMercado[n][n];

        ProductosDis = m.Disponibles(estanteria, ProductosDis);

        System.out.println("Los productos disponibles son:");
        m.Mostrar(ProductosDis);
    }
    
}
