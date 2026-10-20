public class MainVideojuego {
    public static void main(String[] args) {
        // 1. Crear el primer videojuego
        Videojuego juego1 = new Videojuego();
        juego1.nombre = "Minecraft";
        juego1.genero = "Aventura / Sandbox";
        juego1.version = "1.20";
        juego1.activo = true;

        // 2. Crear el segundo videojuego
        Videojuego juego2 = new Videojuego();
        juego2.nombre = "FIFA 26";
        juego2.genero = "Deportes";
        juego2.version = "2.0";
        juego2.activo = false;

        // 3. Crear el tercer videojuego
        Videojuego juego3 = new Videojuego();
        juego3.nombre = "Tetris";
        juego3.genero = "Puzle";
        juego3.version = "1.0";
        juego3.activo = true;

        // Mostrar la información de los 3 objetos para comprobar que cada uno conserva sus datos
        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();
    }
}