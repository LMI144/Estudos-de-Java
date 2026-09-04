public class Iguana extends Reptil {
    public Iguana(String nome, float peso, int idade, int membros, String corescama) {
        super(nome, peso, idade, membros, corescama);
    }
    @Override
    public void locomover(){
        System.out.println("Iguanas andam");
    }

}
