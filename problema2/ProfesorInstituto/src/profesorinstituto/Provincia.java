package profesorinstituto;

public class Provincia {

    private String nombre;
    private int numeroHabitantes;
    
    public Provincia(String n, int num){
        nombre = n;
        numeroHabitantes = num;
        
    }
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerNumeroHabitantes(int x) {
        numeroHabitantes = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerNumeroHabitantes() {
        return numeroHabitantes;
    }
}
