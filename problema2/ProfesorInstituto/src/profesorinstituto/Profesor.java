package profesorinstituto;


public class Profesor {
    
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia prov;
    
    public Profesor (String nom, String apell, double sueldoB, String ced, Provincia pr) {
        nombre = nom;
        apellido = apell;
        sueldoBasico = sueldoB;
        cedula = ced;
        prov = pr;
    }
    
    
    
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerApellido(String x) {
        apellido = x;
    }
    
    public void establecerSuedoBasico(double x) {
        sueldoBasico = x;
    }
    
    public void calcularSuedoTotal() {
        sueldoTotal = (sueldoBasico * 0.2)+ sueldoBasico;
    }
    
    public void establecerCedula(String x) {
        cedula = x;
    }
    
    public void establecerProv(Provincia x) {
        prov = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public double obtenerSuedoBasico() {
        return sueldoBasico;
    }
    
    public double obtenerSuedoTotal() {
        return sueldoTotal;
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    public Provincia obtenerProv() {
        return prov;
    }
    
    
    public String toString() {
        String mensaje = String.format("Profesor Instituto\n" +
                "Nombre: %s\n" +
                "Apellido: %s\n" +
                "Sueldo basico: %.2f\n" +
                "Sueldo total: %.2f\n" +
                "Nombre de la provincia: %s\n" +
                "Numero de habitantes: %s\n",
                // obtenerUsuario().obtenerNombre(),
                obtenerNombre(),
                obtenerApellido(),
                obtenerSuedoBasico(),
                obtenerSuedoTotal(),
                obtenerProv().obtenerNombre(),
                obtenerProv().obtenerNumeroHabitantes());
        return mensaje;
    }
}
