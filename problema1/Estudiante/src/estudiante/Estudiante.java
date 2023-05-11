package estudiante;


public class Estudiante {
    
    private String nombre;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;
    private Universidad universidad;
    
    public Estudiante (String nom, double m1, double m2, double m3, Universidad u) {
        nombre = nom;
        materia1 = m1;
        materia2 = m2;
        materia3 = m3;
        universidad = u;
    }

    
    

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerMateria1(double x) {
        materia1 = x;
    }
    
    public void establecerMateria2(double x) {
        materia2 = x;
    }

    public void establecerMateria3(double x) {
        materia3 = x;
    }

    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3) / 3;
    }

    public void establecerUniversidad(Universidad x) {
        universidad = x;
    }
    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerMateria1() {
        return materia1;
    }

    public double obtenerMateria2() {
        return materia2;
    }

    public double obtenerMateria3() {
        return materia3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public Universidad obtenerUniversidad() {
        return universidad;
    }
    
    public String toString() {
        String mensaje = String.format("Notas Estudiante\n" +
                "Nombre: %s\n" +
                "Materia 1: %.2f\n" +
                "Materia 2: %.2f\n" +
                "Materia 3: %.2f\n" +
                "Promedio: %.2f\n" +
                "Nombre de la universidad: %s\n" +
                "Direccion: %s\n",
                // obtenerUsuario().obtenerNombre(),
                obtenerNombre(),
                obtenerMateria1(),
                obtenerMateria2(),
                obtenerMateria3(),
                obtenerPromedio(),
                obtenerUniversidad().obtenerNombre(),
                obtenerUniversidad().obtenerDireccion());
        return mensaje;
    }
}
