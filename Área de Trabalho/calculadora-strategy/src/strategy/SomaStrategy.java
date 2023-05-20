package strategy;

public class SomaStrategy implements OperacaoStrategy{
    @Override
    public double calcular(int a, int b){
        return  (a +  b);
    }
}
