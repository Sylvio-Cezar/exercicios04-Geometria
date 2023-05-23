package models;

public class Quadrilatero {
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public double calculaArea() {
        double semiperimetro = (lado1 + lado2 + lado3 + lado4) / 2;
        return Math.sqrt((semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3) * (semiperimetro - lado4));
    }

    public double calculaPerimetro() {
        return lado1 + lado2 + lado3 + lado4;
    }

    public boolean isQuadrado() {
        return lado1 == lado2 && lado2 == lado3 && lado3 == lado4;
    }

    public boolean isRetangulo() {
        return (lado1 == lado3 && lado2 == lado4) || (lado1 == lado2 && lado3 == lado4);
    }
}
