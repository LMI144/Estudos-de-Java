import java.util.Scanner;
public class Adivinha {

    public static int sorteiaNumeroInteiro(int maximo) {
        int x = (int) (Math.random()*(maximo+1)); //gera número inteiro aleatório entre [0-maximo]
        return x;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maxNum = 100;
        int pontos = 100;
        int y = sorteiaNumeroInteiro(maxNum);
        boolean acertou = false;
        int tentativas = 0;
        while(!acertou) {
            System.out.println("Tente adivinhar y [0-100]:");
            int numLido = Integer.parseInt(leitor.nextLine());
            tentativas++;
            if (numLido ==y) {
                System.out.println("Parabéns! Você acertou. Número de tentativas:"+tentativas);
                System.out.println(pontos);
                acertou = true;
            } else {
                System.out.println("Errou! Tente novamente");
                if (numLido > y ){
                    System.out.println("O número escolhido é menor!");
                }else if (numLido < y){
                    System.out.println("o número escolhido é maior");
                }
                pontos -= 2;
            }
        }
        leitor.close();
    }

}