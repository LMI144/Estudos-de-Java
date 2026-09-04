public class Lutadores {
    private String nome, categoria;
    private int vitoria, derrota;
    private float peso;
//estou usando o alt + insert no que é
    public Lutadores(String nome, int vitoria, int derrota, float peso) {
        this.nome = nome;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.setPeso(peso);
    }
    public void status(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitórias: " + this.getVitoria());
        System.out.println("Derrotas: " + this.getDerrota());
        
    }
    public void ganharluta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderluta(){
        this.setVitoria(this.getVitoria());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() { //nao recebe parametro
       if (this.peso < 52.2){
           this.categoria = "Inválido";
       }else if (this.peso <= 70.3){
           this.categoria = "Leve";
       } else if (this.peso <= 84){
            this.categoria = "Médio";
       } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
       }else {
           this.categoria = "Inválido";
       }
    
    }


    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    
}
