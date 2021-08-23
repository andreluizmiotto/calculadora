package br.com.calculadora.domain.impl;

import br.com.calculadora.domain.ICalculadora;
import br.com.calculadora.domain.IOperacaoAritmetica;

import java.math.BigDecimal;

public class Calculadora implements ICalculadora {

    BigDecimal resultado;

    public Calculadora(BigDecimal resultado) {
        this.resultado = resultado;
    }

    @Override
    public ICalculadora Calcular(IOperacaoAritmetica operacao) {
        resultado = operacao.Calcular(resultado);
        return this;
    }

    @Override
    public BigDecimal GetResultado() {
        return this.resultado;
    }

}
