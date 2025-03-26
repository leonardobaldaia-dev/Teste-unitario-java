package org.example;

public class CalculadoraMock extends Calculadora {
    @Override
    public int soma(int a, int b) {
        return 5;
    }

    @Override
    public int subtracao(int a, int b) {
        return 3;
    }

    @Override
    public int multiplicacao(int a, int b) {
        return 10;
    }
}
