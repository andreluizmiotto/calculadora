package br.com.calculadora.domain;

import java.math.BigDecimal;

public interface ICalculadora {

    ICalculadora Calcular(IOperacaoAritmetica operacao);
    BigDecimal GetResultado();

}
