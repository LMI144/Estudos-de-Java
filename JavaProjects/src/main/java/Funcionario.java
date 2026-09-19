public class Funcionario extends Herancadepessoa{
    private String setor;
    private boolean trabalhando;
    private boolean conversando;
    
    public void servircafe(){
        System.out.println("Opa meu fi, quer um cafezin?");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public boolean isConversando() {
        return conversando;
    }

    public void setConversando(boolean conversando) {
        this.conversando = conversando;
    }
    
    
}
