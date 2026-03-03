
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes: ");
        int n = sc.nextInt();

        metodos m = new metodos();
        objEst[][] estudiantes = new objEst[n][n];
        estudiantes = (objEst[][]) m.Estudiantes(estudiantes);

        objEst[][] CaliBajas = new objEst[n][n];
        CaliBajas = (objEst[][]) m.bajaCalificacion(estudiantes, CaliBajas);

        objEst[][] CaliRegular = new objEst[n][n];
        CaliRegular = (objEst[][]) m.RegularCalificacion(estudiantes, CaliRegular);

        objEst[][] CaliSuperior = new objEst[n][n];
        CaliSuperior = (objEst[][]) m.ExcelenteCalificacion(estudiantes, CaliSuperior);

        m.Resultados(CaliBajas, CaliRegular, CaliSuperior);

    }
    
}
