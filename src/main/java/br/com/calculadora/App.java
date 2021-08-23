package br.com.calculadora;

import br.com.calculadora.domain.ICalculadora;
import br.com.calculadora.domain.impl.Calculadora;
import br.com.calculadora.domain.impl.Somar;
import br.com.calculadora.domain.impl.Subtrair;

import java.math.BigDecimal;

public class App 
{
    public static void main( String[] args )
    {
        ICalculadora calc = new Calculadora(new BigDecimal("25"));

        System.out.println(calc
                .Calcular(new Somar(new BigDecimal("10")))
                .Calcular(new Subtrair(new BigDecimal("50")))
                .GetResultado());
    }
}
