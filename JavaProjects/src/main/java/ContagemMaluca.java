
import javax.swing.JOptionPane;
public class ContagemMaluca {
    static void contagem(int primeiro, int segundo, int terceiro) {
        for (int k = primeiro; k < segundo; k += terceiro) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        int primeiro = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        int segundo = Integer.parseInt(JOptionPane.showInputDialog("Digite o ultimo valor"));
        int terceiro = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância entre os números"));

        contagem(primeiro, segundo, terceiro);
    }
}