import java.io.*;

public class UsuarioDatos {
      private final String archivoDatos = "datos.txt";

      public void guardarDatos(String nombre, int puntaje) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoDatos, true))) {
                  writer.write(nombre + " " + puntaje);
                  writer.newLine();
                  System.out.println("Datos guardados correctamente.");

            } catch (Exception e) {
                  System.out.println("Error al guardar los datos: ");
            }
      }

      public void mastrarDatos() {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivoDatos))) {
                  String linea;
                  System.out.println("Datos de los jugadores: ");
                  while ((linea = reader.readLine()) != null) {
                        String[] textos = linea.split(",");
                        System.out.println("Jugador: " + textos[0] + " - Puntajes: " + textos[1]);
                  }
            } catch (IOException e) {
                  System.err.println("Error al leer los datos: " + e.getMessage());
            }

      }
}
