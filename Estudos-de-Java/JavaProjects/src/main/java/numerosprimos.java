 import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class numerosprimos {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int numeros = 0, tot = 0;
        System.out.println("Dogite um valor total");
        numeros = Integer.parseInt(in.readLine());

        for (int n = 1; n < numeros+1; n++){
            System.out.println(n);
            if (numeros % n == 0){
                tot+=1;
                System.out.println("divisivel");
            }else{
                System.out.println("não divisivel");
            }
        }
        if (tot > 2){
            System.out.println("O número não é primo!");
        }else{
            System.out.println("O numero é primo!");
        }

    }
}
