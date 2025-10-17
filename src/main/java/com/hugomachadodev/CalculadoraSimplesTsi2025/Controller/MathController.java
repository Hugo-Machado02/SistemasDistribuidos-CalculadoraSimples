package com.hugomachadodev.CalculadoraSimplesTsi2025.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hugomachadodev.CalculadoraSimplesTsi2025.Operator;
import com.hugomachadodev.CalculadoraSimplesTsi2025.NumberConvert;

@RestController
public class MathController {
    private Operator operator = new Operator();

    @RequestMapping(value = "soma/{n1}/{n2}")
    public double soma(
        @PathVariable (value = "n1") String n1,
        @PathVariable (value = "n2") String n2
    ) throws Exception{
        return operator.soma(NumberConvert.convertToDouble(n1), NumberConvert.convertToDouble(n2));
    }

    @RequestMapping(value = "subtracao/{n1}/{n2}")
    public double subtracao(
        @PathVariable (value = "n1") String n1,
        @PathVariable (value = "n2") String n2
    ) throws Exception{
        return operator.subtracao(NumberConvert.convertToDouble(n1), NumberConvert.convertToDouble(n2));
    }
    @RequestMapping(value = "multiplicacao/{n1}/{n2}")
    public double multiplicacao(
        @PathVariable (value = "n1") String n1,
        @PathVariable (value = "n2") String n2
    ) throws Exception{
        return operator.multiplicacao(NumberConvert.convertToDouble(n1), NumberConvert.convertToDouble(n2));
    }

    @RequestMapping(value = "divisao/{n1}/{n2}")
    public double divisao(
        @PathVariable (value = "n1") String n1,
        @PathVariable (value = "n2") String n2
    ) throws Exception{
        return operator.divisao(NumberConvert.convertToDouble(n1), NumberConvert.convertToDouble(n2));
    }

    @RequestMapping(value = "raizquadrada/{num}")
    public double raizquadrada(
        @PathVariable (value = "num") String num
    ) throws Exception{
        return operator.raizquadrada(NumberConvert.convertToDouble(num));
    }

    @RequestMapping(value = "raizcubica/{num}")
    public double raizcubica(
        @PathVariable (value = "num") String num
    ) throws Exception{
        return operator.raizcubica(NumberConvert.convertToDouble(num));
    }

    @RequestMapping(value = "potenciacao/{n1}/{n2}")
    public double potenciacao(
        @PathVariable (value = "n1") String n1,
        @PathVariable (value = "n2") String n2
    ) throws Exception{
        return operator.potenciacao(NumberConvert.convertToDouble(n1), NumberConvert.convertToDouble(n2));
    }

    @RequestMapping(value = "binario/{num}")
    public String binario(
        @PathVariable (value = "num") String num
    ) throws Exception{
        return operator.binario(NumberConvert.convertToDouble(num));
    }

    @RequestMapping(value = "potencial10/{num}")
    public double potencial10(
        @PathVariable (value = "num") String num
    ) throws Exception{
        return operator.potencial10(NumberConvert.convertToDouble(num));
    }

    @RequestMapping(value = "fatorial/{num}")
    public double fatorial(
        @PathVariable (value = "num") String num
    ) throws Exception{
        return operator.fatorial(NumberConvert.convertToDouble(num));
    }

    @RequestMapping(value = "pi")
    public double pi() throws Exception{
        return operator.valorPI();
    }
}
