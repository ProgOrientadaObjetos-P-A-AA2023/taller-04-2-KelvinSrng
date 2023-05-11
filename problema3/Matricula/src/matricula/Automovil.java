package matricula;


public class Automovil {
    
    private String cedula;
    private Fabricante fbct;
    private int anio;
    private double valor;
    private double valorMatricula;
    
    public Automovil (String cd, Fabricante fab, int a, double v) {
        cedula = cd;
        fbct = fab;
        anio = a;
        valor = v;
    }
    
    
    public void establecerCedula(String x) {
        cedula = x;
    }
    
    public void establecerFabricante(Fabricante x) {
        fbct = x;
    }
    
    public void establecerAnio(int x) {
        anio = x;
    }
    
    public void establecerValor(double x) {
        valor = x;
    }
    
    public void calcularValorMatricula() {
        valorMatricula = (valor * (2023- anio))* 0.0002;
        // valorMatricula = ((valor * 0.0002)* 2023- anio);
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    public Fabricante obtenerFbct(){
        return fbct;
    }
    
    public int obtenerAnio() {
        return anio;
    }
    
    public double obtenerValor() {
        return valor;
    }
    
    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    
    public String toString() {
        String mensaje = String.format("Factura de Matricula\n" +
                "Numero de cedula: %s\n" +
                "Nombre del fabricante: %s\n" +
                "Ciudad de origen: %s\n" +
                "Año de fabricacion: %d\n" +
                "Valor del vehiculo: %.2f\n" +
                "Valor de la matricula: %.2f\n",
                // obtenerUsuario().obtenerNombre(),
                obtenerCedula(),
                obtenerFbct().obtenerNombre(),
                obtenerFbct().obtenerCiudad(),
                obtenerAnio(),
                obtenerValor(),
                obtenerValorMatricula());
        return mensaje;
    }
}
