import java.util.Scanner;
public class maiornota {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("quantos alunos há na turma?");
        int numaluno = Integer.parseInt((leitor.nextLine()));
        String[] listanome = new String[numaluno];
        double[] listanota =  new double[numaluno];
        double maiornota = 0.0;
        String melhoraluno = "";


        for (int k = 0; k < numaluno; k++){
            System.out.println("Qual o nome do aluno "+ (k+1));
            listanome[k] = leitor.nextLine();
            System.out.println("Qual a nota do aluno "+ (k+1));
            listanota[k] = Double.parseDouble(leitor.nextLine());
        }
        for (int k = 0; k < numaluno; k++){
            if(listanota[k] >= maiornota){
                maiornota = listanota[k];
                melhoraluno = listanome[k];
            }
        }
        for (int k = 0; k < numaluno;k++){
            if (listanota[k] < 7){
                System.out.println("Alunos que tiraram notas menor do que 7: " + listanome[k]);
            }
        }
        System.out.println("A maior nota é " + maiornota + " do aluno " + melhoraluno);
        int cont = 0;

    }
}
