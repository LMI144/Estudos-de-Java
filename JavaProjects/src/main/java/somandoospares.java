import javax.swing.JOptionPane;
public class somandoospares {
    public static void main(String[] args) {
        int valortot, soma;
        soma = 0;
        valortot = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor total"));
        for (int n = 0; n < valortot; n++){
            if (n % 2 == 0){
                System.out.println(n);
            }
        }
    }
}