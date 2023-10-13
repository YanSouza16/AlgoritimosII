
    package algotimosversionado.Aulas.Semana03;

      import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
import java.util.Scanner;

    public class EntregaDicionario {

        public static void main(String[] args) {
         String caminhoArquivo;
            Scanner teclado=new Scanner(System.in);
            System.out.print("Informe se CPU ADM/YAN = 0");
                 int CPU=teclado.nextInt();
                                 teclado.nextLine();

            if(CPU==0){
                             caminhoArquivo= "C:/Users/yan01/OneDrive/Área de Trabalho/dicionario.txt";
         }else{
                System.out.print("Informe o caminho do seu arquivo .txt:\n");
                 caminhoArquivo=teclado.nextLine();
            }
                       try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
                 String[] dicionario = criarDicionario(caminhoArquivo);
          int count=0;
            for (String palavra : dicionario) {
                if (palavra != null) {
                    System.out.println(palavra);
                  count++;
                }
            }System.out.printf("A quantidade de palavras e: %d \n",count);
        } catch (IOException e) {
    System.err.println("Erro ao ler o arquivo: " + e.getMessage());
    e.printStackTrace();
} 
                 
}


        public static String[] criarDicionario(String caminhoArquivo) {
            final int TAMANHO_MAXIMO = 1000;

            String[] dicionario = new String[TAMANHO_MAXIMO];
            int tamanhoDicionario = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
                String linha;

                while ((linha = br.readLine()) != null) {
                    String[] palavras = linha.split("\\s+");

                    for (String palavra : palavras) {
                        palavra = palavra.toLowerCase();

                        int indice = buscaBinaria(dicionario, palavra, tamanhoDicionario);

                        if (indice < 0) {
                            indice = -(indice + 1);

                            System.arraycopy(dicionario, indice, dicionario, indice + 1, tamanhoDicionario - indice);

                            dicionario[indice] = palavra;
                            tamanhoDicionario++;

                            if (tamanhoDicionario >= TAMANHO_MAXIMO)
                                break;
                        }
                    }
                if (tamanhoDicionario >= TAMANHO_MAXIMO)
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return dicionario;
        }

        public static int buscaBinaria(String[] vetor, String palavra, int tamanho) {
            int esquerda = 0;
            int direita = tamanho - 1;

            while (esquerda <= direita) {
                int meio = esquerda + (direita - esquerda) / 2;
                int comparacao = vetor[meio].compareTo(palavra);

                if (comparacao == 0) {
                    return meio;  
                } else if (comparacao < 0) {
                    esquerda = meio + 1;
                } else {
                    direita = meio - 1;
                }
            }

            return -(esquerda + 1);
        }
    }
