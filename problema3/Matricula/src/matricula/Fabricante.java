package matricula;


public class Fabricante {
    
    private String nombre;
    private String ciudad;
    
    public Fabricante(String n, String ciud){
        nombre = n;
        ciudad = ciud;
        
    }
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerCiudad(String x) {
        ciudad = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerCiudad() {
        return ciudad;
    }
}
