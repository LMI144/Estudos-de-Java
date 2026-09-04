public class Aluno extends Pessoa {
    //se eu colocar um "final" na classe ou em um metodo, ninguém pode herdar o objeto
    protected boolean ativo;
    private String curso;

    public void estudar(){
        System.out.println(this.nome + " está estudando");
    }

    public void dadosaluno(){
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Ativo: " + this.getAtivo());
    }
    public Aluno(String nome, int idade, String sexo, boolean ativo, String curso) {
        super(nome, idade, sexo);
        this.ativo = ativo;
        this.curso = curso;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
