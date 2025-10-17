package com.hugomachadodev.CalculadoraSimplesTsi2025;

public class Operator {
    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2) {
        return num1 / num2;
    }

    public double raizquadrada(double number){
        return Math.sqrt(number);
    }

    public double raizcubica(double number){
        return Math.cbrt(number);
    }

    public double potenciacao(double base, double expoente){
        return Math.pow(base, expoente);
    }

    public String binario(double number){
        return Integer.toBinaryString((int) number);
    }

    public double potencial10(double number){
        return Math.pow(10, number);
    }

    public double fatorial(double number){
        double calc = 1;
        for(int i = 1; i <= number; i++){
            calc *= i;
        }
        return calc;
    }

    public double valorPI(){
        return Math.PI;
    }
}
