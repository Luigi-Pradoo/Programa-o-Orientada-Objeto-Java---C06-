package Aula2;
import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor da Nota 1 :");
        int nota1 = entrada.nextInt();
        if(nota1 < 0 || nota1 > 100){
            System.out.println("Nota inválida");
            return;
        }
        System.out.println("Valor da Nota 2 :");
        int nota2 = entrada.nextInt();
        if(nota2 < 0 || nota2 > 100){
            System.out.println("Nota inválida");
            return;
        }
        System.out.println("Valor da NPA = " + (nota1 + nota2) / 2);

        int NPA = (nota1 + nota2) / 2;

    
        if(NPA > 60){
            System.out.println("Aluno Aprovado");
        }
        else if(NPA < 30){
            System.out.println("Aluno Reprovado");
        }
        else{
            System.out.println("Nota da NP3");
            int NP3 = entrada.nextInt();
            if((NPA + NP3) / 2 >= 50){
                System.out.println("Aluno Aprovado");
            }
            else{
                System.out.println("Aluno Reprovado");
            }
        }
    }
}