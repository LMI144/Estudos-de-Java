import javax.swing.JOptionPane;
public class Soma {
    public static void main(String[]args) {

        float A, B, X;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite sua primeira nota"));
        B = Integer.parseInt(JOptionPane.showInputDialog(("Digite sua segunda nota")));
        
        X = A + B;

        System.out.println("X = " + X/2);
        //o resultado sai em interio --> depois mudar para float


    }
}