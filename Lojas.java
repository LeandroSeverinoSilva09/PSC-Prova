
//Imagine que você está desenvolvendo um programa de software para uma loja online. 
//O programa precisa calcular o valor total de uma compra com base nos itens selecionados pelo cliente e aplicar descontos especiais, se aplicáveis.
//Como você usaria instruções de seleção (if) para resolver esse problema?
//a) Descreva como você identificaria os itens selecionados pelo cliente e como aplicaria os descontos.
//b) Mostre trechos de código de acordo com sua proposta. Utilize a linguagem de programação usada pelo professor durante as aulas presenciais ou online.
//c) Discuta qualquer consideração importante que você teria ao usar instruções de seleção nesse contexto e como garantiria que o programa seja confiável para lidar com diferentes cenários de compra.
import java.util.Scanner;

public class Lojas {
    public static void imprimiritens(String[] array) {
        System.out.println("\nSeus itens comprados foram:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 10, soma = 0, qtdProduto = 0;
        double total;
        String[] produtos = { "jordan", "air force", "air max", "court vision", "nike sb" };
        int[] preco = { 1500, 1000, 900, 200, 300 };
        String[] itens = new String[10];
        final double desconto1 = 0.10, desconto2 = 0.15;

        System.out.println("Bem vindo a loja de tênis\n");
        do {

            System.out.println("Esses são nosso produtos e seus respectivos preços");
            for (int i = 0; i < produtos.length; i++) {
                System.out.printf("%d - %s preço: %d\n", i, produtos[i], preco[i]);
            }
            if (qtdProduto < 10) {
                // menu de produtos
                System.out.println(
                        "\nSe deseja escolher um produto Digite o número referente a ele.(Máximo 10 produtos)\nCaso deseje finalizar seu pedido digite -1");
                System.out.println(
                        "\n10% de desconto se comprar mais de 3 produtos\n15% de desconto se comprar mais de 5 produtos");
                num = scanner.nextInt();
                switch (num) {
                    case 0:
                        soma += preco[0];
                        itens[qtdProduto] = produtos[0];
                        qtdProduto++;
                        break;
                    case 1:
                        soma += preco[1];
                        itens[qtdProduto] = produtos[1];
                        qtdProduto++;
                        break;
                    case 2:
                        soma += preco[2];
                        itens[qtdProduto] = produtos[2];
                        qtdProduto++;
                        break;
                    case 3:
                        soma += preco[3];
                        itens[qtdProduto] = produtos[3];
                        qtdProduto++;
                        break;
                    case 4:
                        soma += preco[4];
                        itens[qtdProduto] = produtos[4];
                        qtdProduto++;
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Você já atingiu a cota máxima de produtos");
                break;
            }
        } while (num != -1);

        if (qtdProduto > 5) {
            System.out.println("\nSeus itens comprados foram:");
            imprimiritens(itens);
            System.out.println("\nVoce comprou " + qtdProduto + " produtos e recebeu 15% de desconto");
            total = soma + (soma * desconto2);
            System.out.println("o total da sua compra foi: " + total);
        } else if (qtdProduto > 3) {
            imprimiritens(itens);
            System.out.println("\nVoce comprou " + qtdProduto + " produtos e recebeu 10% de desconto");
            total = soma + (soma * desconto1);
            System.out.println("o total da sua compra foi: " + total);
        } else {
            imprimiritens(itens);
            System.out.println("\nVoce comprou " + qtdProduto + " produtos");
            System.out.println("o total da sua compra foi: " + soma);
        }

        scanner.close();
    }
}
