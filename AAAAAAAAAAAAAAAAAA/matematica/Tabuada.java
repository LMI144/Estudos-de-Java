import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Tabuada {
    public static void main(String[] args) throws IOException{ //gera uma excessão do tipo IOException --> input/output exception
        boolean valido = false;
        int cont = 0;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.println("Digite um número inteiro positivo");

        while(!valido){
            try{ // ele vai rodar isso aqui de novo. o try tenta dar uma segunda chance
                cont = Integer.parseInt(in.readLine());
                valido = true;
            }catch(NumberFormatException e){ //se ele ver que esta errado novamente, ele da uma outra chance
                System.out.println("Isso não é um número inteiro");
            }
        }
        System.out.println("TABUADA");
        for (int n = 1; n < 11; n++){
            System.out.println(cont + " X " + n +" = " + cont*n);
        }
    }
}