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
        int option1, numberMatch, option;
        int[] vetor = new int[0];
        do {
            imprimeMenu();
            option1 = teclado.nextInt();
        } while (option1 != 1);

        if (option1 == 1) {
            vetor = initVetor();
        }
        do {
            imprimeMenu();
            option = teclado.nextInt();
            switch (option) {
                case 2:
                    imprimeVetor(vetor);
                    break;

                case 3:
                    System.out.println("Qual numero deseja buscar:");
                    int numberX = teclado.nextInt();
                    numberMatch = checkNumber(vetor, numberX);
                    if (numberMatch == 1) {
                        System.out.print(numberX + "  foi encontrado ");
                    } else {
                        System.out.printf("d% nao Foi encontrado.\n", numberMatch);
                    }
                    break;

                case 4:
                    break;

                case 5:

                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;
                case 9:
                    System.out.print("\n Encerrando..\n");
                    break;

                default:
                    break;

            }
        } while (option != 9);

    }
    //inicia vetor com tamanho informado, e numeros aleatorios

    public static int[] initVetor() {
        int m;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nQual o tamanho:\n");
        int n = Integer.parseInt(teclado.next());
        int vetor[] = new int[n];
        System.out.print("\nLimitador de numeros:\n");
        m = teclado.nextInt();
        Random gerador = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(m + 1);
        }
        return vetor;
    }

    public static void imprimeMenu() {
        System.out.print("Menu:");
        System.out.print("\n1.Inicializar o vetor com numero aleatorios");
        System.out.print("\n2.Imprimir o vetor");
        System.out.print("\n3.Verificar se um determinado numero esta contido no vetor");
        System.out.print("\n4.Buscar o maior numero armazenado no vetor");
        System.out.print("\n5.Calcular a media dos numero pares armazenados no vetor");
        System.out.print("\n6.Calcular o percentual dos numero impares armazenados no vetor");
        System.out.print("\n7.Calcula a media centralizada dos numero armazenados no vetor");
        System.out.print("\n8.dois numero em posicoes distintas ");
        System.out.print("\n9. Fechar programa ");
        System.out.print("\n(Informe a Opcao desejada com seu numero) \n");
    }

    public static void imprimeVetor(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
    // Procura numero contido no vetor

    public static int checkNumber(int vetor[], int numberX) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numberX) {
                numberX = 1;
            } else {
                numberX = -1;
            }
        }

        int checked = numberX;
        return checked;
    }
}
