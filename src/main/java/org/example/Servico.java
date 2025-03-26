package org.example;

public class Servico {
    private Calculadora calculadora;

    public Servico(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public int somaValores(int a, int b) {
        return calculadora.soma(a, b);
    }

    public int subtracaoValores(int a, int b) {
        return calculadora.subtracao(a, b);
    }

    public int multiplicacaoValores(int a, int b) {
        return calculadora.multiplicacao(a, b);
    }
}

