import services.ManipuladorDeElementos;
import models.Quadrilatero;
import models.Circulo;
import models.Triangulo;

public class Main {
    public static void main(String[] args) {
        ManipuladorDeElementos manipulador = new ManipuladorDeElementos();

        Circulo circulo = new Circulo(5.0);
        manipulador.obterInformacoes(circulo);

        Quadrilatero quadrilatero = new Quadrilatero(5.0, 5.0, 6.0, 6.0);
        manipulador.obterInformacoes(quadrilatero);

        Triangulo triangulo = new Triangulo(10.0, 12.0, 12.0);
        manipulador.obterInformacoes(triangulo);
    }
}
