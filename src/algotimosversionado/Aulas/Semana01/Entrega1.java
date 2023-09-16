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
        boolean numberChecked;
        int firstOption, index, tamanhoVetor, limitadorRandom, option;

        do {
            imprimeMenu();
            firstOption = teclado.nextInt();
        } while (firstOption != 1);

        if (firstOption == 1) {

            System.out.print("\nQual o tamanho:\n");
            tamanhoVetor = Integer.parseInt(teclado.next());
            int vetor[] = new int[tamanhoVetor];
            System.out.print("\nLimitador de numeros:\n");
            limitadorRandom = teclado.nextInt();
            vetor = initVetor(vetor, tamanhoVetor, limitadorRandom);

            do {

                imprimeMenu();
                option = teclado.nextInt();
                switch (option) {

                    case 2:
                        imprimeVetor(vetor);
                        break;
                    case 3:
                        System.out.print("Qual numero deseja buscar:");
                        int numberX = teclado.nextInt();
                        index = checkNumber(vetor, numberX);
                        if (index == -1) {
                            System.out.printf("Nao Foi encontrado: %d\n", numberX);
                        } else {
                            System.out.printf("%d  Foi encontrado O indice e: %d \n", numberX, index);
                        }
                        break;

                    case 4:
                        System.out.printf("Maior numero e: %d \n", majorNumber(vetor));

                        break;

                    case 5:
                   System.out.printf("A media dos numeros pares e: %.2f\n", avaregeEven(vetor));
                        break;

                    case 6:
                               System.out.printf("A media dos numeros pares e: %.2f\n", avaregeOdd(vetor));

                        break;
                    case 7:
                        System.out.print("Media centralizada e: "+centerAvarege(vetor)+"\n");
                        break;
                    case 8:
                        System.out.print("Qual numero deseja somar :\n");
                        numberX = teclado.nextInt();
                        numberChecked = sumNumbers(vetor, numberX);
                        System.out.printf("%b%n ", numberChecked);
                        break;
                    case 9:
                        System.out.print("\n Encerrando..\n");
                        break;

                    default:
                        break;

                }
            } while (option != 9);

        }
    }

    //1.inicia vetor com tamanho informado, e numeros aleatorios
    public static int[] initVetor(int vetor[], int tamanhoVetor, int limitadorVetor) {

        Random gerador = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(limitadorVetor + 1);
        }
        return vetor;
    }

    //2. imprimir
    public static void imprimeVetor(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    //3. checar numero contido no vetor
    public static int checkNumber(int vetor[], int numberX) {
        int index = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numberX) {
                index = i;
            }
        }
        return index;
    }

    //4. Maior numero requesito 
    public static int majorNumber(int vetor[]) {
        int major = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            major = Math.max(major, vetor[i]);
        }

        return major;
    }

    //5.media pares
    public static double avaregeEven(int vetor[]) {
        int even = 0;
        int countEven = 0;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {
                even += vetor[i];
                countEven++;

            }
        }
        if (countEven == 0) {
            System.out.print("Nao ha numeros pares no vetor.");
            return 0.0;
        }

        double avaregeEven = (double) even / countEven;
        return avaregeEven;
    }
    //6.media impares

    public static double avaregeOdd(int vetor[]) {
         int odd = 0;
        int countOdd = 0;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {
                odd += vetor[i];
                countOdd++;

            }
        }
        if (countOdd == 0) {
            System.out.print("Nao ha numeros pares no vetor.");
            return 0.0;
        }

        double avaregeOdd = (double) odd / countOdd;
        return avaregeOdd;
    }

    //7. calcula media centralizada do vetor
    public static double centerAvarege(int vetor[]) {

        if (vetor.length < 3) {
            System.out.print("O vetor deve ter pelo menos 3 elementos para calcular a media centralizada.");
            return 0.0;
        }

        int soma = vetor[0];
        int min = vetor[0];
        int max = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            min = Math.min(min, vetor[i]);
            max = Math.max(max, vetor[i]);
        }
        for (int i = 1; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double mediaCentralizada = (double) (soma - max - min) / (vetor.length - 2);
        return mediaCentralizada;
    }

    //8. Soma dos numeros distintos
    public static boolean sumNumbers(int vetor[], int numberX) {
        int sum[] = new int[0];
        boolean checked = false;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] + vetor[j] == numberX) {
                  
                    checked = (vetor[i] + vetor[j] == numberX) ? true : false;

                }
            }
        }
        return checked;
    }

    //Função a parte para melhor reutilização do codigo
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
}
