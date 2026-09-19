public class Heranca {

    public static void main(String[] args) {
        Herancadepessoa h1 = new Herancadepessoa();
        Nerd n1 = new Nerd();
        Professor p1 = new Professor();
        Funcionario fu1 = new Funcionario();
        
        h1.setNome("Gustavo");
        h1.setIdadde(9);
        h1.setSexo("Homem");
        
        n1.setNome("Luis");
        n1.setMaterias(8);
        n1.setCurso("Sistema da informacao");
        n1.setCursoativado(true);
        n1.estudar();

        p1.setNome("Lara");
        p1.setEspecialidade("Hardware");
        p1.setSalario(9000.0f);
        p1.ensinar();

        fu1.setNome("Marcia");
        fu1.setSetor("limpeza");
        fu1.setConversando(true);
        fu1.setTrabalhando(false);
        fu1.servircafe();
        
        System.out.println(h1.toString());
        System.out.println(n1.toString());
        System.out.println(p1.toString());
        System.out.println(fu1.toString());
        
    }

    public static class Main {
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
}
