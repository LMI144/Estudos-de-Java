public class Bolsista extends Aluno{
    private String bolsa;

    public Bolsista(String nome, int idade, String sexo,boolean ativo, String curso, String bolsa) {
        super(nome, idade, sexo, ativo, curso);
        this.bolsa = bolsa;
    }
    @Override
    public void dadosaluno(){
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Ativo: " + this.getAtivo());
        System.out.println("Bolsa: " + this.getBolsa());
    }
    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }
    public void cancelarbolsa(){
        this.ativo = false;
        this.bolsa = null;
    }
}
