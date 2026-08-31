package com.mycompany.heranca;

public class Nerd extends Herancadepessoa {
    private int materias;
    private String curso;
    private boolean cursoativado;
    
    public boolean isCursoativado() {
        return cursoativado;
    }

    public void setCursoativado(boolean cursoativado) {
        this.cursoativado = cursoativado;
    }
    public void estudar(){
        if (this.cursoativado){
            System.out.println("estudando muito no curso " + this.getCurso());
        }else{
            System.out.println("tu ta desativado no curso " + this.getCurso() + " doido.");
        }
    }   
    public void trancarcurso(){
        this.cursoativado = false;
        System.out.println("curso trancado");
    }
    public void destrancarcurso(){
        this.cursoativado = true;
        System.out.println("volta a estudar vagabundo");
    }
    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
