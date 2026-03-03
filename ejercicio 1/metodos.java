
import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public objMatriz[][] productos(objMatriz[][] p){

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                objMatriz o = new objMatriz();

                System.out.println("Ingrese el nombre:");
                o.setNombre(sc.next());

                System.out.println("ingrese precio");
                o.setPrecio(sc.nextDouble());

                System.out.println("ingrese la cantidad");
                o.setCantidad(sc.nextInt());

                p[i][j] = o;
            }
        }
        return p;
    }

     public objMatriz[][] BuscarNombre(objMatriz[][] p){
        String nombre;

        System.out.println("ingrese el nombre a buscar: ");
        nombre = sc.next();

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if(p[i][j].getNombre().equals(nombre)){
                    System.out.println("Nombre encontado en la fila " + i + " en la colummna " + j);
                }
            }
        }
        return p;
     }

      public void Mostar(objMatriz[][] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                System.out.println("nombre: " + p[i][j].getNombre());
                System.out.println("precio: " + p[i][j].getPrecio());
                System.out.println("cantidad: " + p[i][j].getCantidad());
                System.out.println("-----------------------------------------------------");
            }
        }
    }

    
}
