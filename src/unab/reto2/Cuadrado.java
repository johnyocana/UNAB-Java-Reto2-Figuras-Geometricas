package unab.reto2;

public class Cuadrado extends Figuras {

    private double longitud;

    public double area() {
        return this.longitud * this.longitud;
    }

    public double perimetro() {
        return this.longitud * consultaLados();
    }

    public Cuadrado(String nombreF, double laLongitud) {
        super(4, nombreF);
        this.longitud = laLongitud;
    }

    @Override
    public String toString() {
        return "El " + consultaNombre() + " tiene  un AREA de " + area() + " y un PERIMETRO de " + perimetro();
    }
}
