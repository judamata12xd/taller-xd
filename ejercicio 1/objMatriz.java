public class objMatriz{

    private String Nombre;
    private double Precio;
    private int cantidad;

    public objMatriz() {
    }

    public objMatriz(String nombre, double precio, int cantidad) {
        Nombre = nombre;
        Precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}







