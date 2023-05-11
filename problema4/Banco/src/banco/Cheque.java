package banco;


public class Cheque {
    
    private Cliente clt;
    private Banco bnc;
    private double valor;
    private double comision;
    
    public Cheque(Cliente ct, Banco bn, double V){
        clt = ct;
        bnc = bn;
        valor = V;
    }
    
    public void establecerValor(double x) {
        valor = x;
    }
    
    public void establecerClt(Cliente x) {
        clt = x;
    }
    
    public void establecerBnc(Banco x) {
        bnc = x;
    }
    
    public Cliente obtenerClt() {
        return clt;
    }
    
    public Banco obtenerBnc() {
        return bnc;
    }
    
    public double obtenerValor() {
        return valor;
    }
    
    public void calcularComision() {
        comision = valor * 0.0003;
    }
    
    public double obtenerComision() {
        return comision;
    }
    
    public String toString() {
        String mensaje = String.format("CHEQUE\n" +
                "Nombres del cliente: %s\n" +
                "Apellidos: %s\n" +
                "Cedula: %s\n" +
                "Nombre del banco: %s\n" +
                "Numero de sucursales: %d\n" +
                "Comision: %.2f\n",
                // obtenerUsuario().obtenerNombre(),
                obtenerClt().obtenerNombres(),
                obtenerClt().obtenerApellidos(),
                obtenerClt().obtenerCedula(),
                obtenerBnc().obtenerNombre(),
                obtenerBnc().obtenerNumeroSucursales(),
                obtenerComision());
        return mensaje;
    }
}
