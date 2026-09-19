public class Leitura {
    public static void main(String[] args) {
        HumanoLivro p[] = new HumanoLivro[99];
        p[1] = new HumanoLivro("Gerivaldo", 88, true);
        Obralivro l[] = new Obralivro[99];
        l[1] = new Obralivro("A sutil arte de ser educado com as pessoas", "Minervino", 100,false, p[1]);
        l[1].abrir();
        l[1].avançarpg();
        l[1].detalhes();
        p[1].fazeraniversario();
        l[1].folhear();
    }
}
