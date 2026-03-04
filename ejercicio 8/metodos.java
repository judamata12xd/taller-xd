
import java.util.Scanner;

public class metodos {

    public objAlmacen[] Productos(objAlmacen[] p) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < p.length; i++) {
            objAlmacen o = new objAlmacen();

            System.out.println("Ingrese nombre del producto: ");
            o.setNombre(sc.next());

            System.out.println("Ingrese la categoria: ");
            o.setCategoria(sc.next());

            System.out.println("Ingrese el peso: ");
            o.setPeso(sc.nextDouble());

            p[i] = o;

        }
        return p;
    }

    public objAlmacen[][] Estanteria(objAlmacen[] p) {
        int contAli = 0, contAseo = 0, contTec = 0;

        for (int i = 0; i < p.length; i++) {
            if (p[i].getCategoria().equalsIgnoreCase("alimentos")) {
                contAli++;
            } else if (p[i].getCategoria().equalsIgnoreCase("aseo")) {
                contAseo++;

            } else if (p[i].getCategoria().equalsIgnoreCase("tecnologia")) {
                contTec++;
            }
        }

        objAlmacen[] Alimentos = new objAlmacen[contAli];
        objAlmacen[] Aseo = new objAlmacen[contAseo];
        objAlmacen[] Tecnologia = new objAlmacen[contTec];

        int a=0,b=0,c=0;

        for (int i = 0; i < p.length; i++) {
            if (p[i].getCategoria().equalsIgnoreCase("alimentos")) {
                Alimentos[a] = p[i];
                a++;
            } else if (p[i].getCategoria().equalsIgnoreCase("aseo")) {
                Aseo[b] = p[i];
                b++;
            } else if (p[i].getCategoria().equalsIgnoreCase("tecnologia")) {
                Tecnologia[c] = p[i];
                c++;
            }
        }

        objAlmacen[][] matriz = new objAlmacen[3][];

        matriz[0] = Alimentos;
        matriz[1] = Aseo;
        matriz[2] = Tecnologia;

        return matriz;
    }

    public void Mostrar(objAlmacen[][] matriz){
        String[] Nombres = {"\n ALIMENTOS","ASEO","TECNOLOGIA"};

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("SECCIONES " + Nombres[i]);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Nombres: " + matriz[i][j].getNombre());
                System.out.println("Peso: " + matriz[i][j].getPeso());
                System.out.println("----------------------------------------------------");
            }
        }
    }

}
