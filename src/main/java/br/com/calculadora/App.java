package br.com.calculadora;

import br.com.calculadora.application.calcular.Calculadora;
import br.com.calculadora.domain.calcular.Dividir;
import br.com.calculadora.domain.calcular.Multiplicar;
import br.com.calculadora.domain.calcular.Somar;
import br.com.calculadora.domain.calcular.Subtrair;

import java.math.BigDecimal;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(
                new Calculadora(new BigDecimal("25"))
                        .Calcular(new Somar(35.0))
                        .Calcular(new Subtrair(50.0))
                        .AddOperacao(new Multiplicar(10.0))
                        .AddOperacao(new Dividir(5.0))
                        .Calcular()
                        .GetResultado());
    }
}
