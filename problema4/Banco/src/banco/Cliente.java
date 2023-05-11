package banco;


public class Cliente {
    
    private String nombres;
    private String apellidos;
    private String cedula;
    
    public Cliente (String noms, String apll, String ced) {
        nombres = noms;
        apellidos = apll;
        cedula = ced;
    }
    
    public void establecerNombres(String x) {
        nombres = x;
    }
    
    public void establecerApellidos(String x) {
        apellidos = x;
    }
    
    public void establecerCedula(String x) {
        cedula = x;
    }
    
    public String obtenerNombres() {
        return nombres;
    }
    
    public String obtenerApellidos() {
        return apellidos;
    }
    
    public String obtenerCedula() {
        return cedula;
    }
}
