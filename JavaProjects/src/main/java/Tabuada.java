import javax.swing.JOptionPane;
public class Tabuada {
    public static void main(String[]args){
        boolean valido = false;
        int numero = 0;
        while(!valido){
            try{
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
                valido = true;
            }catch(NumberFormatException e){
                System.out.println("Isso não é um número inteiro");
            }
        }
        System.out.println("TABUADA");
        for (int n = 1; n < 11; n++){
            System.out.println(numero + " X " + n +" = " + numero*n);
        }
    }
}