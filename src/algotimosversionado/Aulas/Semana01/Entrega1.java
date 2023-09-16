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
        int firstOption, index, option;
        int[] vetor = new int[0];
       do {
           
           imprimeMenu();
            firstOption = teclado.nextInt();
        } while (firstOption != 1);

        if (firstOption == 1) {
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
                    System.out.printf("Percentual: %d \n", avaregeEven(vetor));
                    break;

                case 6:
                    System.out.printf("Percentual: %d \n", avaregeOdd(vetor));
                    break;
                case 7:

                    break;
                case 8:
                    System.out.print("Qual numero deseja somar :\n");
                    numberX = teclado.nextInt();
                    numberChecked = sumNumbers(vetor, numberX);
                    System.out.printf("%b%n   ",numberChecked);
                    break;
                case 9:
                    System.out.print("\n Encerrando..\n");
                    break;

                default:
                    break;

            }
        } while (option != 9);

    }

    //1.inicia vetor com tamanho informado, e numeros aleatorios
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

    //media impares
    public static int avaregeOdd(int vetor[]) {
        int avarege = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) {
                avarege++;
            }

        }
        avarege = avarege / avarege;
        return avarege * 100;
    }

    //media pares
    public static int avaregeEven(int vetor[]) {
        int avarege = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                avarege++;
            }

        }
        avarege = avarege / avarege;
        return avarege * 100;
    }

    //8. Soma dos numeros distintos
    public static boolean sumNumbers(int vetor[], int numberX) {
        int sum=0;
       boolean checked = false;
            for (int i = 0; i < vetor.length; i++) {
                if(sum!=numberX){
                       
                sum += vetor[i];
                   }else{
                       sum++;
                   }
                
            }
         
        checked = (sum == numberX) ? true : false;
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
