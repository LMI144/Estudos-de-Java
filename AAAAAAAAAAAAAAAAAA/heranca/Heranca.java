package com.mycompany.heranca;

public class Heranca {

    public static void main(String[] args) {
        Herancadepessoa h1 = new Herancadepessoa();
        Nerd n1 = new Nerd();
        Professor p1 = new Professor();
        Funcionario fu1 = new Funcionario();
        
        h1.setNome("Gustavo");
        h1.setIdadde(9);
        h1.setSexo("Homem");
        
        n1.setNome("Luis");
        n1.setMaterias(8);
        n1.setCurso("Sistema da informacao");
        n1.setCursoativado(true);
        n1.estudar();

        p1.setNome("Lara");
        p1.setEspecialidade("Hardware");
        p1.setSalario(9000.0f);
        p1.ensinar();

        fu1.setNome("Marcia");
        fu1.setSetor("limpeza");
        fu1.setConversando(true);
        fu1.setTrabalhando(false);
        fu1.servircafe();
        
        System.out.println(h1.toString());
        System.out.println(n1.toString());
        System.out.println(p1.toString());
        System.out.println(fu1.toString());
        
    }
}
