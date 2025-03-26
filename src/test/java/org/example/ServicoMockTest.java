package org.example;

public class ServicoMockTest {
    public static void main(String[] args) {
        // Criando o mock manual da Calculadora
        Calculadora calculadoraMock = new CalculadoraMock();
        Servico servico = new Servico(calculadoraMock);

        // Teste de soma com mock
        if (servico.somaValores(2, 3) == 5) {
            System.out.println("Teste de soma com mock passou!");
        } else {
            System.out.println("Teste de soma com mock falhou!");
        }

        // Teste de subtração com mock
        if (servico.subtracaoValores(5, 3) == 3) {
            System.out.println("Teste de subtração com mock passou!");
        } else {
            System.out.println("Teste de subtração com mock falhou!");
        }

        // Teste de multiplicação com mock
        if (servico.multiplicacaoValores(4, 2) == 10) {
            System.out.println("Teste de multiplicação com mock passou!");
        } else {
            System.out.println("Teste de multiplicação com mock falhou!");
        }
    }
}
