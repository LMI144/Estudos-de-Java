public class Aves extends Animal{
    private String cordapena;

    public Aves(String nome,float peso, int idade, int membros, String cordapena) {
        super(nome,peso, idade, membros);
        this.cordapena = cordapena;
    }

    public String getCordapena() {
        return cordapena;
    }

    public void setCordapena(String cordapena) {
        this.cordapena = cordapena;
    }

    public void fazerninho(){
        System.out.println(this.nome + " fez um ninho");
    }
    @Override
    public void locomover() {
        System.out.println("Aves voam");
    }
    @Override
    public void alimentar() {
        System.out.println("Avem bicam o chão e caçam");
    }
    @Override
    public void emitirsom() {
        System.out.println("avem cantam");
    }
}
