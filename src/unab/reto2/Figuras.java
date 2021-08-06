package unab.reto2;

public class Figuras {

    private int lados;
    private String nombre;

    public void asignaLados(int lados) {
        this.lados = lados;
    }

    public int consultaLados() {
        return this.lados;
    }

    public void asignaNombre(String nombre) {
        this.nombre = nombre;
    }

    public String consultaNombre() {
        return this.nombre;
    }

    public Figuras(int numLados, String nombreF) {
        this.lados = numLados;
        this.nombre = nombreF;
    }
}
