package strategy;

public class RaizQuadradaStrategy implements OperacaoRaizStrategy {


    @Override
    public double calcular(int a) {
        return Math.sqrt(a);
    }
}

