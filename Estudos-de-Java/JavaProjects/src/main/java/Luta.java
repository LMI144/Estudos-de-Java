import java.util.Random;
public class Luta {
    private Lutadores desafiado;
    private Lutadores desafiante; 
    private boolean lutaaprovada;
        
    public void marcarluta(Lutadores l1, Lutadores l2){ 
        //equals é equivalente ao "==" para strings
    if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
        this.lutaaprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;
        System.out.println("luta marcada");
    }
    }
    public void lutar(){
    if(lutaaprovada){
        System.out.println("##DESAFIADO##");
        this.desafiado.status();
        System.out.println("##DESAFIANTE##");
        this.desafiante.status();
        
        Random ale = new Random();
        int vencedor = ale.nextInt(2);
        switch(vencedor){
            case 0:
                //vitoria do l1
                System.out.println("GANHOU! O " + this.desafiado.getNome() + " GANHOU!!");
                this.desafiado.ganharluta();
                this.desafiante.perderluta();
                break;
            
            case 1:
                System.out.println("GANHOU! O " + this.desafiante.getNome() + " GANHOU!!");
                this.desafiante.ganharluta();
                this.desafiado.perderluta();
                break;
            
        }       
        
        
        
    }else{
        System.out.println("marcar a caralha da luta primeiro");
    }
    }

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isLutaaprovada() {
        return lutaaprovada;
    }

    public void setLutaaprovada(boolean lutaaprovada) {
        this.lutaaprovada = lutaaprovada;
    }
    
}
