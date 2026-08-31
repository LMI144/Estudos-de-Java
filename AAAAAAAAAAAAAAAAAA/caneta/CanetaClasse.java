package com.mycompany.caneta;
public class CanetaClasse {
    public String modelo;
    public String cor;
    private int carga;
    private boolean tampar;
    private float ponta;
    
    public CanetaClasse(String m, String c, int g, float p){
        this.modelo = m;
        this.cor = c;
        this.carga = g;     
        this.ponta = p;
    }
    
    //ctrl I para criar tudo automaticamente kkkkkkiiii
    
    //metodo construtor mais simples
   // public CanetaClasse(){
     //   this.tampar();
       // this.cor = "azul";
        //toda caneta que eu criar vai ter essas caracteristicas
   // }
    
    //metodos getters e setters são encapsulaamentosã
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int g){
        this.carga = g;
    }
    public boolean getTampar(){
        return this.tampar;
    }
    public void setTampar(boolean t){
        this.tampar = t;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    
    public void status(){
        System.out.println(this.modelo);
        System.out.println(this.cor);
        System.out.println(this.carga);
        System.out.println(this.tampar);
        System.out.println(this.ponta);
    }
    public void rabiscar(){
        if (!tampar){
            System.out.println("rabiscou tudo");
        }else{
            System.out.println("impossivel rabiscar com a caneta tampada");
        }

        
    }
    protected void tampar(){
    this.tampar = true;
    }
    protected void destampar(){
    this.tampar = false;
    }
}
