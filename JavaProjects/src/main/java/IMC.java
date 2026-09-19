import javax.swing.JOptionPane;
public class IMC {
    public static void main(String[] args) {
        float peso, altura;
        while (true){
            try{
                 peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso"));
                 altura =  Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura"));
                break;
            }catch (NumberFormatException e){
                System.out.println("Entrada inválida. Tente novamente");
            }
        }
        float calculo = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC: " + calculo);
    }
}
