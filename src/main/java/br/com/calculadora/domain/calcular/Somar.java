package br.com.calculadora.domain.calcular;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Somar implements IOperacaoAritmetica {

    private final BigDecimal parcela;

    public Somar(BigDecimal parcela) {
        this.parcela = parcela;
    }

    public Somar(Double parcela) {
        this.parcela = new BigDecimal(parcela).setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal Calcular(BigDecimal valorInicial) {
        return valorInicial.add(parcela);
    }

}
