package model;

import Enuns.TipoCerveja;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cerveja extends Produto {
    private TipoCerveja tipo;
    private double teorAlcoolico;
    private int volume;




    public Cerveja(String nome, BigDecimal valor, LocalDate dataFabricacao, LocalDate dataVencimento, String origem,
                   TipoCerveja tipo, double teorAlcoolico, int volume) {
        super(nome, valor, dataFabricacao, dataVencimento, origem);
        this.tipo = tipo;
        this.teorAlcoolico = teorAlcoolico;
        this.volume = volume;
    }

    public TipoCerveja getTipo() {
        return tipo;
    }

    public void setTipo(TipoCerveja tipo) {
        this.tipo = tipo;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cerveja{" +
                "tipo=" + tipo +
                ", teorAlcoolico=" + teorAlcoolico +
                ", volume=" + volume +
                '}';
    }
}






