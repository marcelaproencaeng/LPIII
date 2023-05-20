package strategy;

public class RaizCubicaStrategy implements OperacaoRaizStrategy{

    @Override
    public double calcular(int a) {
        return Math.cbrt(a);
    }
}
