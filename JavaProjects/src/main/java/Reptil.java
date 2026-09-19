public class Reptil extends Animal{
    private String corescama;

    public Reptil(String nome,float peso, int idade, int membros, String corescama) {
        super(nome,peso, idade, membros);
        this.corescama = corescama;
    }

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }

    public void pegarinseto(){
        System.out.println(this.nome + " Pegou um inseto");
    }
    @Override
    public void locomover() {
        System.out.println("Répteis rastejam");
    }
    @Override
    public void alimentar() {
        System.out.println("Répteis comem vegetais ou carnes");
    }
    @Override
    public void emitirsom() {
        System.out.println("répteis emitem sons de dinossauro");
    }
}
