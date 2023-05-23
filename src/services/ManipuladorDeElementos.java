package services;

import models.Circulo;
import models.Quadrilatero;
import models.Triangulo;

import java.text.DecimalFormat;

public class ManipuladorDeElementos {
    private DecimalFormat decimalFormat;

    public ManipuladorDeElementos() {
        decimalFormat = new DecimalFormat("#.##");
    }

    public void obterInformacoes(Circulo circulo) {
        double area = circulo.calculaArea();
        double perimetro = circulo.calculaPerimetro();
        double raio = circulo.getRaio();

        System.out.println("Área do círculo: " + decimalFormat.format(area));
        System.out.println("Perímetro do círculo: " + decimalFormat.format(perimetro));
        System.out.println("Raio do círculo: " + decimalFormat.format(raio));
    }

    public void obterInformacoes(Quadrilatero quadrilatero) {
        double area = quadrilatero.calculaArea();
        double perimetro = quadrilatero.calculaPerimetro();
        boolean isQuadrado = quadrilatero.isQuadrado();
        boolean isRetangulo = quadrilatero.isRetangulo();

        System.out.println("Área do quadrilátero: " + decimalFormat.format(area));
        System.out.println("Perímetro do quadrilátero: " + decimalFormat.format(perimetro));

        if (isQuadrado) {
            System.out.println("É um quadrado");
        } else if (isRetangulo) {
            System.out.println("É um retângulo");
        } else {
            System.out.println("Não é quadrado nem retângulo");
        }
    }

    public void obterInformacoes(Triangulo triangulo) {
        double area = triangulo.calculaArea();
        double perimetro = triangulo.calculaPerimetro();
        String classificacao = triangulo.getClassificacao();

        System.out.println("Área do triângulo: " + decimalFormat.format(area));
        System.out.println("Perímetro do triângulo: " + decimalFormat.format(perimetro));
        System.out.println("Classificação do triângulo: " + classificacao);
    }
}
