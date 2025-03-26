package org.example;

public class ServicoTest {
    public static void main(String[] args) {
        // Instanciando a Calculadora
        Calculadora calculadora = new Calculadora();

        // Criando a instância da classe Servico
        Servico servico = new Servico(calculadora);

        // Teste de soma
        int resultadoSoma = servico.somaValores(2, 3);
        if (resultadoSoma == 5) {
            System.out.println("Teste de soma passou!");
        } else {
            System.out.println("Teste de soma falhou! Esperado 5, mas foi " + resultadoSoma);
        }

        // Teste de subtração
        int resultadoSubtracao = servico.subtracaoValores(5, 3);
        if (resultadoSubtracao == 2) {
            System.out.println("Teste de subtração passou!");
        } else {
            System.out.println("Teste de subtração falhou! Esperado 2, mas foi " + resultadoSubtracao);
        }

        // Teste de multiplicação
        int resultadoMultiplicacao = servico.multiplicacaoValores(4, 2);
        if (resultadoMultiplicacao == 8) {
            System.out.println("Teste de multiplicação passou!");
        } else {
            System.out.println("Teste de multiplicação falhou! Esperado 8, mas foi " + resultadoMultiplicacao);
        }
    }
}
