package unab.reto2;

public class Rectangulo extends Figuras {

    private double altura;
    private double base;

    public double area() {
        return this.altura * this.base;
    }

    public double perimetro() {
        return (this.altura * 2) + (this.base * 2);
    }

    public Rectangulo(String nombreF, double laBase, double laAltura) {
        super(4, nombreF);
        this.base = laBase;
        this.altura = laAltura;
    }

    @Override
    public String toString() {
        return "El " + consultaNombre() + " tiene  un AREA de " + area() + " y un PERIMETRO de " + perimetro();
    }
}
