package br.com.calculadora.domain.impl;

import br.com.calculadora.domain.IOperacaoAritmetica;

import java.math.BigDecimal;

public class Subtrair implements IOperacaoAritmetica {

    private BigDecimal subtraendo;

    public Subtrair(BigDecimal subtraendo) {
        this.subtraendo = subtraendo;
    }

    public BigDecimal Calcular(BigDecimal valorInicial) {
        return valorInicial.subtract(subtraendo);
    }

}
