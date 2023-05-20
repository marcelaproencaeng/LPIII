package model.enuns;

import strategy.*;

public enum Operacao {
    SOMA(new SomaStrategy()),
    SUBTRACAO(new SubtracaoStrategy()),
    MULTIPLICACAO(new MultiplicacaoStrategy()),
    DIVISAO(new DivisaoStrategy());


    private final OperacaoStrategy strategy;

    private Operacao(OperacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public OperacaoStrategy getStrategy() {
        return strategy;
    }
}
