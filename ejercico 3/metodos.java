
import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    // Registrar libros en la matriz
    public ObjLibrosxd[][] Libros(ObjLibrosxd[][] l) {

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[i].length; j++) {

                ObjLibrosxd o = new ObjLibrosxd();

                System.out.println("Ingrese el titulo del libro: ");
                o.setTitulo(sc.next());

                System.out.println("Ingrese el autor del libro: ");
                o.setAutor(sc.next());

                System.out.println("Ingrese el precio del libro: ");
                o.setPrecio(sc.nextDouble());

                l[i][j] = o;
            }
        }
        return l;
    }

    // 🔥 Devuelve el OBJETO libro más costoso
    public ObjLibrosxd LibroCostoso(ObjLibrosxd[][] l){

        ObjLibrosxd mayor = l[0][0];

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[i].length; j++) {

                if (l[i][j].getPrecio() > mayor.getPrecio()) {
                    mayor = l[i][j];
                }
            }
        }

        return mayor;
    }

    // Mostrar todos los libros y el más caro
    public void Mostrar(ObjLibrosxd[][] l, ObjLibrosxd mayor) {

        System.out.println("\n===== INVENTARIO DE LIBROS =====");

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[i].length; j++) {

                System.out.println("Titulo: " + l[i][j].getTitulo());
                System.out.println("Autor: " + l[i][j].getAutor());
                System.out.println("Precio: " + l[i][j].getPrecio());
                System.out.println("---------------------------------");
            }
        }

        System.out.println("\n===== LIBRO MAS CARO =====");
        System.out.println("Titulo: " + mayor.getTitulo());
        System.out.println("Autor: " + mayor.getAutor());
        System.out.println("Precio: " + mayor.getPrecio());
    }
}


    

