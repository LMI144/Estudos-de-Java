import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class somandoospares {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int valortot, soma;
        soma = 0;
        System.out.println("Digite o valor total");
        valortot = Integer.parseInt(in.readLine());
        for (int n = 0; n < valortot; n++){
            if (n % 2 == 0){
                System.out.println(n);
            }
        }
    }
}