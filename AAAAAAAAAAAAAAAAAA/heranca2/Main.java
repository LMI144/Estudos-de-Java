public class Main {
   public static void main(String[] args) {
        Visitante v1 = new Visitante("Lucas", 7, "macho homem");
       System.out.println(v1.toString());

        Aluno a1 = new Aluno("Jorginho", 19, "homem afeminado", true, "Sistema de informação");
        System.out.println(a1.toString());
        a1.dadosaluno();

        Bolsista b1 = new Bolsista("Antagorda", 20, "Mulher fêmea",false, "Design de planta", "integral");  
       System.out.println(b1.toString());
       b1.estudar();
       b1.cancelarbolsa();
       b1.dadosaluno();
       //É INTERESSANTE TENTAR FAZER COM QUE, AO CANCELAR MATRICULA, O OBJETO VIRE UM ALUNO E NÃO UM BOLSISTA!!
    }
}
