package algotimosversionado.Aulas.Semana02;


import java.util.Scanner;

public class Beecrowd {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
   // Ex1();
    Ex2();
    }

    public static void Ex1() {
        Scanner teclado = new Scanner(System.in);
        int menor=0,index=0;
         int n = teclado.nextInt();
        int[] X = new int[n];
        for (int i = 0; i < X.length; i++) {
            System.out.print(" ");
            X[i] = teclado.nextInt();
            if(menor>X[i]){
                 menor=X[i];
                 index=i;
           }
        }
         System.out.println("Menor valor: " + menor );   
         System.out.println("Posicao: \n" + index);   
    
    }
        public static void Ex2() {
          Scanner teclado = new Scanner(System.in);
           int x=0,index=0;  
          int X[]=new int[5]; 
            
          for (int i = 0; i <X.length; i++) {
          for (int j = 0; j < X.length; j++) {
                
             
              X[i]=teclado.nextInt();
                if(X[i]==0 || X[i]<0){
                    X[i]=1;
                    
                }
                index=i;
              x=X[i];
            }
           
                System.out.printf("X[%d] = %d",index,x);
            }
            }
            
        }


