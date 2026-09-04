public class Herancadepessoa {
    private String nome;
    private int idadde;
    private String sexo;

    public void fazerniv(){
        this.idadde ++; //muito melhor que this.setIdade(this.getIdade() + 1)
        System.out.println(this.getNome() + " acabou de fazer aniversario." + this.getIdadde() + " anos!");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadde() {
        return idadde;
    }

    public void setIdadde(int idadde) {
        this.idadde = idadde;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() { //converte objeto em texto
        return "Herancadepessoa{" + "nome=" + nome + ", idadde=" + idadde + ", sexo=" + sexo + '}';
    }
    
    
}
