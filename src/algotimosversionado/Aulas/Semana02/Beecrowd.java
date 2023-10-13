package algotimosversionado.Aulas.Semana02;


import java.util.Scanner;

public class Beecrowd {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       // Ex1();
        //Ex2();
        //Ex3(teclado);
        //Ex4(teclado);
        //Ex5(teclado);
        Ex6(teclado);
    }

    public static void Ex1(Scanner teclado) {
        int n,
                menor = Integer.MAX_VALUE,
                index = 0;
        do {
            System.out.printf("Digite um numero:");
            n = teclado.nextInt();
        } while (n < 1 || n > 1000);
        String input = teclado.nextLine();
        input = teclado.nextLine();
        String[] inputArray = input.split(" ");
        int[] X = new int[n];

        for (int i = 0; i < X.length; i++) {
            X[i] = Integer.parseInt(inputArray[i]);
        }
        for (int i = 0; i < X.length; i++) {
            if (menor > X[i]) {
                menor = X[i];
                index = i;
            }
        }
        System.out.print("Menor valor: " + menor);
        System.out.print("\nPosicao: " + index + "\n");

    }

    public static void Ex2(Scanner teclado) {
        int x = 0, index = 0;
        int X[] = new int[5];
        for (int i = 0; i < X.length; i++) {
            X[i] = teclado.nextInt();
            if (X[i] <= 0) {
                X[i] = 1;
            }
        }
        for (int i = 0; i < X.length; i++) {
            index = i;
            x = X[i];
            System.out.printf("X[%d] = %d\n", index, x);
        }
    }

    public static void Ex3(Scanner teclado) {
       int V,
           index=0;
        do{
            System.out.print("Digite um numero");
            V=teclado.nextInt();
       }while(V>50);
         int []X=new int[10];
             for (int i = 0; i < 1; i++) {
           System.out.printf(" Vetor[%d] = %d \n",index,V);
        }
           for (int i = 0; i < X.length; i++) {
                 X[i]=V;
                X[i]*=2;
                V=X[i];
                 index=i+1;
           System.out.printf(" Vetor[%d] = %d \n",index,V);
        }
        
    }

    public static void Ex4(Scanner teclado){
        double x=1;      
        int index=0;
                double[] A= new double[100];
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o numero: ");
            A[i] =teclado.nextDouble();
          }
        for (int i = 0; i < A.length; i++) {
              if(A[i]<=10){
                  x=A[i];
                  index=i;
                System.out.printf(" Vetor[%d] = %.2f \n",index,x);

        }
    }
    }
 
    public static void Ex5(Scanner teclado){
     
        
        
        int [] vec=new int[5]; 
        int impar=0,par=0;
        
       
            for (int i = 0; i < vec.length; i++) {
               vec[i]=teclado.nextInt();
              
              
            }
               for (int i = 0; i < vec.length; i++) {
                     if(vec[i]%2 ==0){
                    par=vec[i];
                }else{
                    impar=vec[i];
                }
                System.out.print("\nImpares: "+impar);
                System.out.print("\npar: "+par);
                
            }
        }
               
        public static void Ex6(Scanner teclado){

        int[] N = new int[4];

        // Leitura dos 20 números inteiros
        for (int i = 0; i < N.length; i++) {
            N[i] = teclado.nextInt();
        }

        // Altera os elementos conforme especificado
        for (int i = 0; i < N.length; i++) {
            int temp = N[i];
            N[i] = N[(N.length-1) - i];
            N[(N.length-1) - i] = temp;
        }

        // Imprime a matriz modificada
        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}
                

    


