package com.mycompany.leitura;
public class Obralivro implements Livro{
    private String titulo;
    private String autor;
    private int totpag;
    private int pgatual;
    private boolean aberto;
    private Pessoa leitor;

    public Obralivro(String titulo, String autor, int totpag, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpag = totpag;
        this.pgatual = 0;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpag() {
        return totpag;
    }

    public void setTotpag(int totpag) {
        this.totpag = totpag;
    }

    public int getPgatual() {
        return pgatual;
    }

    public void setPgatual(int pgatual) {
        this.pgatual = pgatual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){     
 
        if (leitor.possuilivro && this.getAberto()){
            System.out.println("Quem esta lendo é o " + this.getLeitor().getNome() + ".");   //nao e necessario o this.getNome()ã
            System.out.println("Ele está lendo " + this.getTitulo() + ".");
            System.out.println("Feito por " + this.getAutor() + ".");
            System.out.println("Com " + this.getTotpag() + " páginas");
            System.out.println("O " + this.getLeitor().getNome() + " está na pagina " + this.getPgatual());
        }
        else{
            System.out.println("compra o livro primeiro seu burrinho");   
        }
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void avançarpg() {
        this.setPgatual(this.getPgatual() + 1);
    }

    @Override
    public void voltarpg() {
        this.setPgatual(this.getPgatual() - 1);
    }

    @Override
    public void folhear() {
        System.out.println( this.getLeitor().getNome() + " folheou o livro.");
    }
}