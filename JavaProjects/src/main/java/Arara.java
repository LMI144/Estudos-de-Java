public class Arara extends Aves {
    public Arara(String nome, float peso, int idade, int membros, String cordapena) {
        super(nome, peso, idade, membros, cordapena);
    }
    @Override
    public void locomover() {
        System.out.println("Araras voam");
    }
    @Override
    public void emitirsom(){
        System.out.println("Araras cantam");
    }
}
