public class principal {

    public static void main(String[] args){

        metodos m = new metodos();

        objVentas[][] ventas = new objVentas[4][3];

        ventas = m.Llenado(ventas);
        m.Mostar(ventas);
        m.MayorVenta(ventas);
    }
    
}
