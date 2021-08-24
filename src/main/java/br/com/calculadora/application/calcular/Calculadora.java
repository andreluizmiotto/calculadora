package br.com.calculadora.application.calcular;

import br.com.calculadora.domain.calcular.IOperacaoAritmetica;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;

public class Calculadora implements ICalculadora {

    BigDecimal resultado;
    Queue<IOperacaoAritmetica> queue;

    public Calculadora() {
        this.resultado = new BigDecimal("0.00");
        this.queue = new LinkedList<>();
    }

    public Calculadora(BigDecimal resultado) {
        this.resultado = resultado;
        this.queue = new LinkedList<>();
    }

    @Override
    public ICalculadora AddOperacao(IOperacaoAritmetica operacao) {
        queue.add(operacao);
        return this;
    }

    @Override
    public ICalculadora Calcular() {
        this.queue.forEach(operacao -> resultado = operacao.Calcular(resultado));
        queue.clear();
        return this;
    }

    @Override
    public ICalculadora Calcular(IOperacaoAritmetica operacao) {
        AddOperacao(operacao);
        Calcular();
        return this;
    }

    @Override
    public BigDecimal GetResultado() {
        Calcular();
        return this.resultado;
    }

}
