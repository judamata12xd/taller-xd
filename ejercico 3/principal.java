import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();

        System.out.println("Ingrese la cantidad de libros a registrar: ");
        int n = sc.nextInt();

        ObjLibrosxd[][] l = new ObjLibrosxd[n][n];

        l = m.Libros(l);

        ObjLibrosxd mayor = m.LibroCostoso(l);

        m.Mostrar(l, mayor);
    }
}
