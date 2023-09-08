package algotimosversionado.Aulas.Semana01;

import java.util.Random;
import java.util.Scanner;

/*
Entrega a Atividade 1 - Algoritmos e Programação II

Nós,

Nome:Yan Souza
Nome:Vitor Moreira
Nome:Vinicius Oliveira
Nome:Murilo Macedo
Nome:Helloysa Araujo
declaramos que

todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
 */
public class Entrega1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Menu:");
        System.out.print("\n1.Inicializar o vetor com numero aleatorios");
        System.out.print("\n2.Imprimir o vetor");
        System.out.print("\n3.Verificar se um determinado numero esta contido no vetor");
        System.out.print("\n4.Buscar o maior numero armazenado no vetor");
        System.out.print("\n5.Calcular a media dos numero pares armazenados no vetor");
        System.out.print("\n6.Calcular o percentual dos numero impares armazenados no vetor");
        System.out.print("\n7.Calcula a media centralizada dos numero armazenados no vetor");
        System.out.print("\n8.dois numero em posicoes distintas ");
        System.out.print("\n(Informe a Opcao desejada com seu numero) \n");
        int option = teclado.nextInt();
        switch (option) {
            case 1: {
                int m;
                System.out.print("\nQual o tamanho:\n");
                int n = Integer.parseInt(teclado.next());
                int vetor[] = new int[n];
                System.out.print("\nLimitador de numeros:\n");
                m = teclado.nextInt();
                Random gerador = new Random(m);
                for (int i = 0; i < vetor.length; i++) {
                    vetor[i] = gerador.nextInt();
                }

                break;
            }

            case 2: {
                imprimeVetor(vetor);
                break;
            }
            case 3: {
                checkNumber(vetor);
                break;
            }
            case 4: {

                break;
            }
            case 5: {

                break;
            }
            case 6: {

                break;
            }
            case 7: {

                break;
            }
            case 8: {

                break;
            }
            default: {
                break;
            }
        }
    }

    public static void imprimeVetor(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void checkNumber(int[] vetor) {
        int x = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                System.out.print("\nO numero:" + x + " foi encontrado\n");
            }
        }
    }
}
