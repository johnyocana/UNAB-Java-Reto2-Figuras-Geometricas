package unab.reto2;

public class Triangulo extends Figuras {

    private double base;
    private double altura;
    private double cateto1;
    private double hipo;

    public double area() {
        return (this.base * this.altura) / 2;
    }

    public double perimetro() {
        cateto1 = this.base / 2;
        hipo = Math.hypot(cateto1, altura);
        return this.base + (hipo * 2);
    }

    public Triangulo(String nombreF, double laBase, double laAltura) {
        super(3, nombreF);
        this.base = laBase;
        this.altura = laAltura;
    }

    @Override
    public String toString() {
        return "El " + consultaNombre() + " tiene  un AREA de " + area() + " y un PERIMETRO de " + perimetro();
    }
}
