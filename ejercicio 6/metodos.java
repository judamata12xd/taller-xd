
import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public objSuperMercado[][] Estanteria(objSuperMercado[][] e){

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                objSuperMercado o = new objSuperMercado();

                System.out.println("Ingrese el nombre del producto: ");
                o.setNombre(sc.next());

                System.out.println("Ingrese el valor del producto: ");
                o.setPrecio(sc.nextDouble());

                System.out.println("Ingrese 1 si esta dispodible de lo contrario 0 si no lo esta");

                int dis = sc.nextInt();

                if(dis == 1){
                    o.setDisponible(true);
                } else {
                    o.setDisponible(false);
                }

                e[i][j] = o;
            }
            
        }
        return e;
    }

    public objSuperMercado[][] Disponibles(objSuperMercado[][] e, objSuperMercado[][] d){

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                if(e[i][j].isDisponible() == true){
                    objSuperMercado o = new objSuperMercado();
                    o.setNombre(e[i][j].getNombre());
                    o.setPrecio(e[i][j].getPrecio());
                    o.setDisponible(true);
                    d[i][j] = o;
                }
                
            }
            
        }
        return d;
    }

    public void Mostrar(objSuperMercado[][] d){

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if(d[i][j] != null) {
                System.out.println("Producto: " + d[i][j].getNombre());
                System.out.println("Precio: " + d[i][j].getPrecio());
                System.out.println("-----------------------------------------");
                }
            }
        }
    }
}
