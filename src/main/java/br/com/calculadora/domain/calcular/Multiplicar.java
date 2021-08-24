package br.com.calculadora.domain.calcular;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Multiplicar implements IOperacaoAritmetica {

    private final BigDecimal fator;

    public Multiplicar(BigDecimal fator) {
        this.fator = fator;
    }

    public Multiplicar(Double fator) {
        this.fator = new BigDecimal(fator).setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal Calcular(BigDecimal valorInicial) {
        return valorInicial.multiply(fator);
    }

}
