package matricula;


public class Ejecutor {

    public static void main(String[] args) {
        
        Fabricante fb = new Fabricante("Rigoberto","Loja");
        
        Automovil auto = new Automovil("1922365891", fb,2007, 50000);
        
        auto.calcularValorMatricula();
        
        System.out.printf("%s\n", auto);
    }
    
}
