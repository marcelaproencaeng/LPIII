import model.Calculadora;
import model.enuns.Operacao;
import model.enuns.OperacaoRaiz;

public class Application {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(Operacao.MULTIPLICACAO, 10, 3);
        calculadora.calcular(Operacao.DIVISAO, 20, 4);
        calculadora.calcular(Operacao.SOMA, 10, 4);
        calculadora.calcular(Operacao.SUBTRACAO, 10, 2);
        System.out.println("10 * 3=" + calculadora.calcular(Operacao.MULTIPLICACAO, 10, 3));
        System.out.println("20 / 4=" + calculadora.calcular(Operacao.DIVISAO, 20, 4));
        System.out.println("10 + 4=" + calculadora.calcular(Operacao.SOMA, 10, 4));
        System.out.println("10 -2=" + calculadora.calcular(Operacao.SUBTRACAO, 10, 2));
        calculadora.calcularRaiz(OperacaoRaiz.RAIZ_QUADRADA, 16);
        calculadora.calcularRaiz(OperacaoRaiz.RAIZ_QUADRADA, 144);
        calculadora.calcularRaiz(OperacaoRaiz.RAIZ_CUBICA, 27);
        System.out.println(calculadora.calcularRaiz(OperacaoRaiz.RAIZ_QUADRADA, 16));
        System.out.println(calculadora.calcularRaiz(OperacaoRaiz.RAIZ_QUADRADA, 144));
        System.out.println(calculadora.calcularRaiz(OperacaoRaiz.RAIZ_CUBICA, 27));

    }
}
