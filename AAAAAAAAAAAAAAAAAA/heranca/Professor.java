package com.mycompany.heranca;

public class Professor extends Herancadepessoa {
    private String especialidade;
    private float salario;

    
    public void ensinar(){
        System.out.println("O professor esta ensinando " + this.getEspecialidade());
    }
    public void darbronca(){
        System.out.println("Meu salario ta caindo na conta de todo jeito seus preguiçosos");
    }
    

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
