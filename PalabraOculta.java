import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;


import java.util.Random;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PalabraOculta extends JPanel {

      char[] letrasFalladas;

      PalabraOculta() {
            // Establece un borde azul alrededor del panel
            Border lineBorder = BorderFactory.createLineBorder(Color.BLUE, 5); // Azul, grosor de 5

            // Agrega un margen al lado izquierdo (y otros lados si es necesario)
            Border margin = new EmptyBorder(10, 20, 10, 10); // Top, Left, Bottom, Right

            // Combina el margen y el borde
            this.setBorder(BorderFactory.createCompoundBorder(margin, lineBorder));

            // Establece el tamaño preferido del panel
            this.setPreferredSize(new Dimension(100, 50)); // Ancho y alto deseados
      }

      String[] palabras = {
                  "computadora", "programacion", "desarrollador", "tecnologia", "algoritmo",
                  "base", "cadena", "navegador", "variable", "funcion",
                  "proyecto", "editor", "sintaxis", "compilador", "binario",
                  "internet", "cifrado", "servidor", "cliente", "archivo",
                  "memoria", "bitacora", "logica", "recurso", "paquete",
                  "conexiones", "pila", "cola", "redes", "usuario",
                  "controlador", "protocolo", "modelo", "diseño", "clase",
                  "objeto", "interfaz", "lenguaje", "framework", "herramienta",
                  "estructura", "proceso", "implementacion", "optimizacion", "sistema",
                  "pantalla", "archivo", "simulador", "seguridad", "emulador"
      };

      private String palabraSeleccionada;

      public String palabraSeleccionada() {
            // Random random = new Random();
            // palabraSeleccionada = palabras[random.nextInt(palabras.length)];
            palabraSeleccionada = "emulador";

            return palabraSeleccionada;

      };

      public void insertarPalabraOculta(JLabel palabraOcultaLabel) {

            String palabraSeleccionada = this.palabraSeleccionada();

            Font fuente = new Font("Arial", Font.BOLD, 20);
            palabraOcultaLabel.setFont(fuente);

            StringBuilder palabraConGuines = new StringBuilder();

            for (int i = 0; i < palabraSeleccionada.length(); i++) {
                  palabraConGuines.append("_");
            }

            palabraOcultaLabel.setText(palabraConGuines.toString());

      }

      public void actualizarPalabraOculta(JLabel palabraOculta, String letraIngresada) {
            StringBuilder palabraConGuines = new StringBuilder(palabraOculta.getText());

            for (int i = 0; i < palabraSeleccionada.length(); i++) {
                  if (palabraSeleccionada.charAt(i) == letraIngresada.charAt(0)) {
                        palabraConGuines.setCharAt(i, letraIngresada.charAt(0));
                  }
            }

            palabraOculta.setText(palabraConGuines.toString());

            System.out.println(palabraOculta);
      }

}
