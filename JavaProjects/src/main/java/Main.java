public class Main {

    //Polimorfismo são heranças mais diversificadas. Eu fiz uma classe Animal, depois Mamiferos, depois Cachorro
    public static void main(String[]args) {
    Cachorro c1 = new Cachorro("Caramelo", 10f, 15,999, "caramelo");
    Peixedourado p1 = new Peixedourado("robsonion",0.4f, 3, 999, "dourado");
    Arara a1 = new Arara("logica", 3f, 7, 100, "colorida");
    Iguana i1 = new Iguana("Jaminto", 8f, 12, 999, "verde");

    c1.cagar();
    c1.locomover();
    a1.locomover();
    c1.emitirsom();
    c1.reagir("vamos passear");
    c1.reagir(16);
    c1.reagir(true);
    c1.reagir(21, 21f);

    }
}