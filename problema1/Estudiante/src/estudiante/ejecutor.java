package estudiante;


public class ejecutor {

    public static void main(String[] args) {
        
        Universidad u = new Universidad("Universidad Nacional de Loja","Av. Pio Jaramillo Alvarado");
        
        Estudiante est = new Estudiante("Alex", 8.5, 9.5, 7.9, u);
        
        est.calcularPromedio();
        
        System.out.printf("%s\n", est);
    }
    
}
