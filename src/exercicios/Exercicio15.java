package exercicios;

/*
A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população
b) média do número de filhos
c) maior salário

Crie um script que leia as informações necessários do usuário enquanto o salário digitado não for negativo. Após isso informe as informações solicitadas.
Entrada:
3000
3
2000
1
4000
1
-100
Saída:
Média salarial: 3000
Média de filhos: 1.67
Maior salário: 4000
*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1º Passo - Descobrir qual laço será utilizado
        // 2º Passo - Quais dados vou pedir para o usuário
        // 3º Passo - Qual é o ponto de parada?
        // 4º Passo - Implementar a lógica dentro do laço

        // notas = (10 + 10 + 10) / 3;
        // media = (soma das notas) / quantidade de notas;

        int quantidadeEntrevistados = 0; // Variável contadora -> Conta quantas vezes o laço repetiu
        double somaSalario = 0;
        int somaFilhos = 0;
        double maiorSalario = 0;
        while (true) {
            System.out.print("Digite um salário: ");
            double salario = Double.parseDouble(sc.nextLine());

            // Verificar se o salário informado é o maior salário até o momento
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            // Verificando se o salário é negativo
            if (salario <= 0) break;

            System.out.print("Digite a quantidade de filhos: ");
            int numFilhos = Integer.parseInt(sc.nextLine());

            // Adicionando valores aos acumuladores
            somaSalario += salario;
            somaFilhos += numFilhos;

            quantidadeEntrevistados++;
        }

        System.out.println("Quantidade de entrevistados: " + quantidadeEntrevistados);
        System.out.println("Soma dos salários: " + somaSalario);
        System.out.println("Soma dos filhos: " + somaFilhos);

        // Calculando as médias
        double mediaSalario = somaSalario / quantidadeEntrevistados;
        double mediaFilhos = (double) somaFilhos / quantidadeEntrevistados;

        System.out.println("Média de salários: " + mediaSalario);
        System.out.println("Média de filhos: " + mediaFilhos);
        System.out.println("Maior salário: " + maiorSalario);
    }
}
