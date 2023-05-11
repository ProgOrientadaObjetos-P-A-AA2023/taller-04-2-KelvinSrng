package banco;


public class Banco {
    
    private String nombre;
    private int numeroSucursales;
    
    public Banco (String nom, int nS){
        nombre = nom;
        numeroSucursales = nS;
    }
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerNumeroSucursales(int x) {
        numeroSucursales = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerNumeroSucursales() {
        return numeroSucursales;
    }
}
