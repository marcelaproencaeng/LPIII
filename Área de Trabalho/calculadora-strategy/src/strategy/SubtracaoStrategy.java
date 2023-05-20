package strategy;

public class SubtracaoStrategy implements OperacaoStrategy {
    @Override
    public double calcular(int a, int b) {
        return (a - b);
    }
}

