public class Visitante extends Pessoa {
    public Visitante(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    //herda tudo de Pessoa, mas não implementa nada novo --> herança pobre
}
