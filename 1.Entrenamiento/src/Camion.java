public class Camion {
    
    private String marca;
    private int year;
    private float precio;
    private static String estado;

    private static final int ruedas = 4;

    public Camion(String marca, int año, float precio) {
        this.marca = marca;
        this.year = año;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static int getRuedas() {
        return ruedas;
    }

    @Override
    public String toString() {
        return "Camion " + marca + ", del año " + year + " tiene un precio de " + precio + ", "+getRuedas()+" ruedas y está "+getEstado();
    }

    public static void acelerando(){
        estado = "acelerando";
    }
    public static void frenando(){
        estado = "frenando";
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        Camion.estado = estado;
    }

}
