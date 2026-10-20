public class Videojuego {
    // Atributos públicos
    public String nombre;
    public String genero;

    //Atributos por defecto no tienen public ni private dentro del mismo paquete
    String version;
    boolean activo;

    // Métodos públicos
    public void mostrarInformacion() {
        System.out.println("Información del Videojuego");
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Versión: " + version);
        System.out.println("Estado activo: " + activo);
    }

    public void iniciar() {
        activo = true;
        System.out.println("El juego " + nombre + " ha sido iniciado.");
    }

    // Métodos por defecto
    void cerrar() {
        activo = false;
        System.out.println("El juego " + nombre + " se ha cerrado.");
    }

    void mostrarVersion() {
        System.out.println("La versión de " + nombre + " es: " + version);
    }
}