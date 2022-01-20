package aula13;
public class Cachorro extends Lobo {
    //Métodos públicos
    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }
    
    public void reagir(String frase) {
        if ("olha o papa".equals(frase) || "oi doguinho".equals(frase)) {
            System.out.println("Abanando meu rabinho auau");
        } else {
            System.out.println("Ruarrrrr");
        }
    }
    
    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanando rabinho");
        } else if (hora >= 18){
            System.out.println("Aiai que humano bobo");
        } else {
            System.out.println("Abanando o rabinho auau");
        }
    }
    
    public void reagir(boolean dono) {
        if(dono == true) {
            System.out.println("Abanando rabinho");
        } else {
            System.out.println("Ruarrrrrr auauau ruarrrrrr");
        }
    }
    
    public void reagir(int idade, float peso) {
        if (idade<5) {
            if (peso<10) {
                System.out.println("Abanando rabinho");
            } else {
                System.out.println("Auauau");
            }
        } else if (peso < 10){
            System.out.println("Ruarrrrrr");
        } else {
            System.out.println("Aiai que humano bobo");
        }
            
    }
}
