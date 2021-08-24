package br.com.calculadora.domain.calcular;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dividir implements IOperacaoAritmetica {

    private final BigDecimal divisor;

    public Dividir(BigDecimal divisor) {
        this.divisor = divisor;
    }

    public Dividir(Double divisor) {
        this.divisor = new BigDecimal(divisor).setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal Calcular(BigDecimal valorInicial) {
        return valorInicial.divide(divisor);
    }

}
