package unab.reto2;

import java.util.Scanner;

public class Funciones {

    int opc;
    double valor, base, altura;
    char continuar;
    Scanner lee = new Scanner(System.in);

    public void limpiar() {
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }
    }

    public void menu() {
        do {
            limpiar();
            System.out.println("MENU\n1. Cuadrado.\n2. Triangulo.\n3. Rectangulo.\n4. Hexagono.\n5. Salir");
            System.out.print("Ingrese la opcion: ");
            opc = lee.nextInt();
            switch (opc) {
                case 1: {

                    do {
                        System.out.print("Ingrese el valor del lado: ");
                        valor = lee.nextDouble();
                        calculoCuadrado(valor);
                        System.out.print("Otro calculo? (S/N)");
                        continuar = lee.next().toUpperCase().charAt(0);
                    } while (continuar == 'S');
                }
                break;

                case 2:
                    do {
                        System.out.print("Ingrese el valor de la base: ");
                        base = lee.nextDouble();
                        System.out.print("Ingrese el valor de la altura: ");
                        altura = lee.nextDouble();
                        calculoTriangulo(base, altura);
                        System.out.print("Otro calculo? (S/N)");
                        continuar = lee.next().toUpperCase().charAt(0);
                    } while (continuar == 'S');
                    break;
                case 3:
                    do {
                        System.out.print("Ingrese el valor de la base: ");
                        base = lee.nextDouble();
                        System.out.print("Ingrese el valor de la altura: ");
                        altura = lee.nextDouble();
                        calculoRectangulo(base, altura);
                        System.out.print("Otro calculo? (S/N)");
                        continuar = lee.next().toUpperCase().charAt(0);
                    } while (continuar == 'S');
                    break;
                case 4:
                    do {
                        System.out.print("Ingrese el valor del lado: ");
                        double lado = lee.nextDouble();
                        System.out.print("Ingrese el valor del apotema: ");
                        double apotema = lee.nextDouble();
                        calculoHexagono(lado, apotema);
                        System.out.print("Otro calculo? (S/N)");
                        continuar = lee.next().toUpperCase().charAt(0);
                    } while (continuar == 'S');
                    break;
                case 5:
                    System.exit(0);
            }

        } while (opc > 0 || opc < 5);
    }

    public double calculoCuadrado(double valor) {

        Cuadrado sqr = new Cuadrado("Cuadrado", valor);
        System.out.println(sqr);
        return 0;
    }

    public double calculoTriangulo(double base, double altura) {
        Triangulo tri = new Triangulo("Triangulo", base, altura);
        System.out.println(tri);
        return 0;
    }

    public double calculoRectangulo(double base, double altura) {
        Rectangulo rec = new Rectangulo("Rectangulo", base, altura);
        System.out.println(rec);
        return 0;
    }

    public double calculoHexagono(double longitud, double apotema) {
        Hexagono hex = new Hexagono("Hexagono", longitud, apotema);
        System.out.println(hex);
        return 0;
    }

}
