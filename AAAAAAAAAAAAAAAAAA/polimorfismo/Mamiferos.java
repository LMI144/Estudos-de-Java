public class Mamiferos extends Animal{
    private String corpelo;

    public Mamiferos(String nome,float peso, int idade, int membros, String corpelo) {
        super(nome,peso, idade, membros);
        this.corpelo = corpelo;
    }

    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpelo) {
        this.corpelo = corpelo;
    }

    public void cagar(){
        System.out.println( this.nome + " cagou no chão");
    }
    @Override
    public void locomover() {
        System.out.println("Mamiferos andam ");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamiferos maman e caçam");
    }
    @Override
    public void emitirsom() {
        System.out.println("Mamiferos emitem som");
    }

}
