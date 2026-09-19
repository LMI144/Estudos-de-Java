public class Peixedourado extends Peixes{

    public Peixedourado(String nome, float peso, int idade, int membros, String corescama){
        super(nome,peso,idade,membros,corescama);
    }
    @Override
    public void locomover(){
        System.out.println("Peixinhos dourados nadam");
    }
}
