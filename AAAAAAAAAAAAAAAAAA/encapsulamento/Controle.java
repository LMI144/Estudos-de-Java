package com.mycompany.encapsulamento;

public class Controle implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;


    public Controle() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // Getter: retorna o valor do volume
    public int getVolume() {
        return volume;
    }

    // Setter: define o valor do volume
    public void setVolume(int v) {
        this.volume = v;
    }

    // Getter: retorna se o controle esta ligado
    public boolean getLigado() {
        return ligado;
    }

    // Setter: define se o controle esta ligado
    public void setLigado(boolean l) {
        this.ligado = l;
    }

    // Getter: retorna se algo esta tocando
    public boolean getTocando() {
        return tocando;
    }

    // Setter: define se algo esta tocando
    public void setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void maisvolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Liga a TV primeiro cabeção");
        }
        
    }

    @Override
    public void menosvolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Liga a TV primeiro cabeção");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Liga a TV primeiro cabeção");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && (this.getTocando())){
            this.setTocando(false);
        }else{
            System.out.println("Liga a TV primeiro cabeção");
        }
    }

    @Override
    public void status() {
        System.out.println("A TV está ligada? " + this.getLigado());
        System.out.println("Volume atual " + this.getVolume());
        System.out.println("Video pausado: " + this.getTocando());
    }
    

}
