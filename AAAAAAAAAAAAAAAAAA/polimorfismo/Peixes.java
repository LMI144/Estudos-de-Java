public class Peixes extends Animal{
    private String corescama;

    public Peixes(String nome,float peso, int idade, int membros, String corescama) {
        super(nome,peso, idade, membros);
        this.corescama = corescama;
    }

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }

    public void soltarbolhas(){
        System.out.println(this.nome + " solta bolhas");
    }
    @Override
    public void locomover() {
        System.out.println("Peixes nadam");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixes comem algas ou outros seres");
    }

    @Override
    public void emitirsom() {
        System.out.println("Peixes emitem bolhas");
    }
}
