import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        metodos m = new metodos();

        int n = 0;
        System.out.println("ingrese la cantidad de productos a registrar: ");
        n = sc.nextInt();
        objtienda[][] r = new objtienda[n][n];

        r = m.registarProductos(r);
        int suma = m.TotalInventario(r);
        m.MostrarIventario(r, suma);
        




        
    }
    
}
