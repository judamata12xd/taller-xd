import java.util.Scanner;

public class principal {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos");
        int n = sc.nextInt();

        metodos m = new metodos();

        objAlmacen[] productos = new objAlmacen[n];

        productos = m.Productos(productos);

        objAlmacen[][] estanteria = m.Estanteria(productos);

        m.Mostrar(estanteria);
     }
    
}
