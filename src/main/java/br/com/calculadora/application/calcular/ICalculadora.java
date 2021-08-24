package br.com.calculadora.application.calcular;

import br.com.calculadora.domain.calcular.IOperacaoAritmetica;

import java.math.BigDecimal;

public interface ICalculadora {

    ICalculadora AddOperacao(IOperacaoAritmetica operacao);
    ICalculadora Calcular();
    ICalculadora Calcular(IOperacaoAritmetica operacao);
    BigDecimal GetResultado();

}
