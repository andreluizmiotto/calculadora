package br.com.calculadora.acceptance.steps;

import br.com.calculadora.application.calcular.Calculadora;
import br.com.calculadora.domain.calcular.Somar;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SomarSteps {

    Calculadora calculadora;

    @Before
    public void beforeSteps() {
        this.calculadora = new Calculadora();
    }

    @Dado("um numero valido")
    public void um_numero_valido() {
        calculadora.AddOperacao(
                new Somar(1500.50));
    }
    @Quando("realiza a operacao somar com outro numero valido")
    public void realiza_a_operacao_somar_com_outro_numero_valido() {
        calculadora.Calcular(
                new Somar(299.50));
    }
    @Entao("retorna o valor resultante da operacao")
    public void retorna_o_valor_resultante_da_operacao() {
        BigDecimal valorResultante = calculadora.GetResultado();
        Assertions.assertEquals(new BigDecimal("1800.00"), valorResultante);
        Assertions.assertNotEquals(new BigDecimal("2000.00"), valorResultante);
    }


    @Dado("um item de {double} reais")
    public void um_item_de_reais(Double valor) {
        calculadora.AddOperacao(
                new Somar(new BigDecimal(valor)));
    }
    @Quando("realiza a operacao calcular")
    public void realiza_a_operacao_calcular() {
        calculadora.Calcular();
    }
    @Entao("retorna o valor {double}")
    public void retorna_o_valor(Double resultado) {
        Assertions.assertEquals(
                new BigDecimal(resultado).setScale(2, RoundingMode.HALF_EVEN),
                calculadora.GetResultado());
    }


    @Dado("o valor {double}")
    public void o_valor(Double parcela1) {
        calculadora.AddOperacao(
                new Somar(parcela1));
    }
    @Quando("somado ao valor {double}")
    public void somado_ao_valor(Double parcela2) {
        calculadora.Calcular(
                new Somar(parcela2));
    }
    @Entao("retorna a soma {double}")
    public void retorna_a_soma(Double resultado) {
        Assertions.assertEquals(
                new BigDecimal(resultado).setScale(2, RoundingMode.HALF_EVEN),
                calculadora.GetResultado());
    }

}
