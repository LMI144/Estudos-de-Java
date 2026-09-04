public class HumanoLivro {
    public String nome;
    private int idade;
    public boolean possuilivro;
    
    public HumanoLivro(String nome, int idade, boolean possuilivro) {
        this.nome = nome;
        this.idade = idade;
        this.possuilivro = possuilivro;
        
    }
    public void fazeraniversario(){
        this.setIdade(this.getIdade() + 1);
        System.out.println(this.getNome() + " acabou de completar " + this.getIdade() + "!!");
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isPossuilivro() {
        return possuilivro;
    }

    public void setPossuilivro(boolean possuilivro) {
        this.possuilivro = possuilivro;
    }
    
    
}
