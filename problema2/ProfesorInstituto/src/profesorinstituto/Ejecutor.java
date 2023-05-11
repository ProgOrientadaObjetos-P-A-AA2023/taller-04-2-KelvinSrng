package profesorinstituto;


public class Ejecutor {


    public static void main(String[] args) {
        
        Provincia prov = new Provincia("Zamora Chinchipe",87000);
        
        Profesor prf = new Profesor("Alex", "Sanchez",1500,"1932645781", prov);
        
        prf.calcularSuedoTotal();
        
        System.out.printf("%s\n", prf);
    }
    
}
