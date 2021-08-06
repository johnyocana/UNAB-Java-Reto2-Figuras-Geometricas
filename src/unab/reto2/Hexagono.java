package unab.reto2;

public class Hexagono extends Figuras {

    private double apotema;
    private double longitud;

    public double perimetro() {
        return this.longitud * consultaLados();
    }

    public double area() {
        return this.apotema * (this.longitud * consultaLados() / 2);
    }

    public Hexagono(String nombreF, double laLongitud, double elApotema) {
        super(6, nombreF);
        this.longitud = laLongitud;
        this.apotema = elApotema;
    }

    @Override
    public String toString() {
        return "El " + consultaNombre() + " tiene  un AREA de " + area() + " y un PERIMETRO de " + perimetro();
    }
}
