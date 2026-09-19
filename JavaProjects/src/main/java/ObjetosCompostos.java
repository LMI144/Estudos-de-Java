public class ObjetosCompostos {

    public static void main(String[] args) {
        //peso entre 52.2 e 120.2
        //nome, vitoria,derrota,peso
        Lutadores l[] = new Lutadores[99];
        l[1] = new Lutadores("Luis", 99, 0, 90f);
        l[2] = new Lutadores("Artur", 0, 99, 90f);
        Luta luta1 = new Luta();
        luta1.marcarluta(l[1],l[2]);
        luta1.lutar();
    }
}
