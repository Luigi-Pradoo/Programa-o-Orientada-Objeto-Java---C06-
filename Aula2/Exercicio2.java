package Aula2;

import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do lanche 1: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite o valor do lanche 2: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite o valor d10o lanche 3: ");
        int lanche3 = entrada.nextInt();
        int soma = lanche1 + lanche2 + lanche3;
        double media = (double) soma / 3;
        System.out.println("O total de lanches é: " + soma);
        System.out.println("A média de lanches é: " + media);
    }
}