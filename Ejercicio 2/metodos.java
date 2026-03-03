import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public objtienda[][] registarProductos(objtienda[][] r) {

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
                objtienda o = new objtienda();

                System.out.println("ingrese el nombre del producto: ");
                o.setProducto(sc.next());

                System.out.println("ingrese la cantidad ");
                o.setCantidad(sc.nextInt());

                r[i][j] = o;

            }
        }
        return r;
    }

    public int TotalInventario(objtienda[][] r){
        int suma = 0;
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
                suma = suma + r[i][j].getCantidad();  
            }
        }
        return suma;
    }

    public void MostrarIventario(objtienda[][] r, int total){

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
                System.out.println("Producto registrado: " + r[i][j].getProducto()+ " cantidad: " + r[i][j].getCantidad());
            }
        }
        System.out.println("la cantidad de productos es: " + total);
    }

}
