import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Soma {
    public static void main(String[]args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in); //converte os bytes em String --> System.in coleta os bytes do teclado
        BufferedReader in = new BufferedReader(ir); //lê linhas de texto com readline

        int A, B, X;

        System.out.println("Digite suas notas");
        A = Integer.parseInt(in.readLine()); //in readline lê o input e transforma em String
        B = Integer.parseInt(in.readLine());//integer parseint transforma A String em int
        
        X = A + B;

        System.out.println("X = " + X/2);
        //o resultado sai em interio --> depois mudar para float


    }
}