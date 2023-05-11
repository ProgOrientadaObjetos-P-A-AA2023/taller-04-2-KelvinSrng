package estudiante;


public class Universidad {
    
    private String nombre;
    private String direccion;
    
    public Universidad(String n, String d){
        nombre = n;
        direccion = d;
        
    }
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerDireccion(String x) {
        direccion = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerDireccion() {
        return direccion;
    }
}
