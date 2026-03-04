
import java.util.Random;

public class metodos {

    public objVentas[][] Llenado(objVentas[][] m) {
        Random r = new Random();
        String[] Nombres = { "Juan ", "maria ", "Laura ", "Pedro" };

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                objVentas o = new objVentas();

                o.setVenta(r.nextInt(100));

                if (j == 0 && i < Nombres.length) {
                    o.setNombre(Nombres[i]);
                }
                m[i][j] = o;
            }
        }
        return m;
    }

    public void MayorVenta(objVentas[][] m) {
        String NombreM = "";
        int mayor = 0;

        for (int i = 0; i < m.length; i++) {
            int suma = 0;
            for (int j = 1; j < m[i].length; j++) {
                suma = suma + m[i][j].getVenta();
            }
            if (suma > mayor) {
                mayor = suma;
                NombreM = m[i][0].getNombre();
            }
        }
        System.out.println("La peronas que mas vendio fue: " + NombreM + " con " + mayor + " ventas.");
    }

    public void Mostar(objVentas[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j == 0) {
                    System.out.print(m[i][j].getNombre() + " ");
                } else {
                    System.out.print(m[i][j].getVenta() + " ");
                }

            }
        }
        System.out.println();
    }

}
