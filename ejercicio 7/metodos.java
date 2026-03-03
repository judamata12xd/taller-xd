import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public objEst[][] Estudiantes(objEst[][] e) {
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                objEst o = new objEst();

                System.out.println("Ingrese el nombre del estudiante:");
                o.setNombre(sc.next());
                System.out.println("ingrese la calificacion del estudiante");
                o.setCalificacion(sc.nextDouble());

                e[i][j] = o;       
            }
        }
        return e;
    }

    public objEst[][] bajaCalificacion(objEst[][] e, objEst[][] b){

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                if(e[i][j].getCalificacion() >= 0 && e[i][j].getCalificacion() < 3){
                    b[i][j] = e[i][j];
                }
            }
        }
        return b;
    } 

    public objEst[][] RegularCalificacion(objEst[][] e,objEst[][] r){
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                if(e[i][j].getCalificacion() >= 3 && e[i][j].getCalificacion() < 4){
                    r[i][j] = e[i][j];
                }
            }
        }
        return r;
    } 

    public objEst[][] ExcelenteCalificacion(objEst[][] e , objEst[][] ex){
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                if(e[i][j].getCalificacion() >= 4 && e[i][j].getCalificacion() <= 5){
                    ex[i][j] = e[i][j];
                }
            }
        }
        return ex;
    } 

    public void Resultados(objEst[][] b, objEst[][] r, objEst[][] ex){

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("Estudaintes con bajas calificaciones");
                if(b[i][j] != null){

                    System.out.println("Nombre: " + b[i][j].getNombre());
                    System.out.println("Calificacion: " + b[i][j].getCalificacion());
                    System.out.println("---------------------------------------------");
                }
            }
        }

         for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                System.out.println("Estudaintes con calificaciones regulares");
                if(r[i][j] != null){
                    System.out.println("Nombre: " + r[i][j].getNombre());
                    System.out.println("Calificacion: " + r[i][j].getCalificacion());
                     System.out.println("---------------------------------------------");
                }
            }
        }

         for (int i = 0; i < ex.length; i++) {
            for (int j = 0; j < ex[i].length; j++) {
                System.out.println("Estudaintes con calificaciones superiores");
                if(ex[i][j] != null){
                    System.out.println("Nombre: " + ex[i][j].getNombre());
                    System.out.println("Calificacion: " + ex[i][j].getCalificacion());
                     System.out.println("---------------------------------------------");
                }
            }
        }
    }
}
