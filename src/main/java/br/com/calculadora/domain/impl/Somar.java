package br.com.calculadora.domain.impl;

import br.com.calculadora.domain.IOperacaoAritmetica;

import java.math.BigDecimal;

public class Somar implements IOperacaoAritmetica {

    private BigDecimal parcela2;

    public Somar(BigDecimal parcela2) {
        this.parcela2 = parcela2;
    }

    public BigDecimal Calcular(BigDecimal valorInicial) {
        return valorInicial.add(parcela2);
    }

}
