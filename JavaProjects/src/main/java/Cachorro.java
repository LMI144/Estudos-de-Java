public class Cachorro extends Mamiferos{

    public Cachorro(String nome, float peso, int idade, int membros, String corpelo) {
        super(nome, peso, idade, membros, corpelo);
    }
    @Override
    public void locomover(){
        System.out.println("Cachorros andam");
    }
    @Override
    public void emitirsom(){
        System.out.println("Cachorros latem");
    }

    public void reagir(String frase){
        if(frase.equals("vem comer")|| frase.equals("vamo passear") || frase.equals("vamos passear")){
            System.out.println(this.nome + " está feliz");
        }else{
            System.out.println(this.nome + " está rosnando");
        }
    }
    public void reagir(int hora){
        if (hora <= 12 && hora > 0) {
            System.out.println(this.nome + " está feliz");
        }else if (hora > 12 && hora <= 24){
            System.out.println(this.nome + " está cansado e quer dormir");
        }else{
            System.out.println("isso nem é hora");
        }
    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println(this.nome + " está abanando o rabo");
        }else{
            System.out.println(this.nome + " está indiferente");
        }
    }
    public void reagir(int idade, float peso){ //não posso ter dois metodos com 1 int, pois ainda é a mesma assinatura. A ordem e a quantidade mudam a assinatura
        if (idade >= 7 && idade <= 20 || peso >= 10f && peso <= 20f){
            System.out.println(this.nome + " parece cansado por nada");
        }else if (idade < 7 || peso < 10f){
            System.out.println(this.nome + " está com muita energia");
        }if (peso >= 20f){
            System.out.println("Esse peso não existe");
        } if (idade >= 20){
            System.out.println("Essa idade não existe");
        }
    }
}
