package aula13;
public class Aula13{
    public static void main(String[] args) {
    //Programa principal
    Cachorro c = new Cachorro();
    c.emitirSom();
    
    System.out.println("--------------------");
    
    c.reagir("olha o papa");
    c.reagir("oi doguinho");
    c.reagir("vai apanhar");
    
    System.out.println("--------------------");   
    
    c.reagir(true);
    c.reagir(false);
    
    System.out.println("--------------------");
    
    c.reagir(11, 45);
    c.reagir(12, 39);
    c.reagir(19, 19);
    
    System.out.println("--------------------");
    
    c.reagir(1, 9f);
    c.reagir(6, 9f);
    c.reagir(2, 13f);
    c.reagir(7, 15f);
    
    }
    
}
