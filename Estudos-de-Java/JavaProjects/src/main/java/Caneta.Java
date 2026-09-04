public class Caneta {
    public static void main(String[] args) {
      /*  //o objeto é uma nova instancia da classe canetaclasse
       CanetaClasse c1 = new CanetaClasse();
       c1.modelo = "bic";
       c1.cor = "azul";
      //privado c1.carga = 100;
      //c1.tampar = true;
      // so consigo acesar atributos privados atraves de metodos publicos --> conceito de encapsulamento
       c1.status();
       c1.destampar();
       c1.rabiscar();

       CanetaClasse c2 = new CanetaClasse();
       c2.setModelo("bic");
       c2.setCor("vermelho");
       c2.setCarga(100);
       c2.tampar();
       c2.status();
       */
        //passar os paramentros do metodo contrutor pra cá
        CanetaClasse c3 = new CanetaClasse("bic", "verde", 70, 6.0f);
        c3.status();
    }
}
