package br.com.calculadora.domain.calcular;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Subtrair implements IOperacaoAritmetica {

    private final BigDecimal subtraendo;

    public Subtrair(BigDecimal subtraendo) {
        this.subtraendo = subtraendo;
    }

    public Subtrair(Double subtraendo) {
        this.subtraendo = new BigDecimal(subtraendo).setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal Calcular(BigDecimal valorInicial) {
        return valorInicial.subtract(subtraendo);
    }

}
