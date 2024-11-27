import javax.swing.*;
import java.awt.*;

public class Juego {

     
      PalabraOculta palabraOcultaClass = new PalabraOculta();

      public Juego() {
            // Crear la ventana principal (JFrame)
            JFrame ventanaPrincipal = new JFrame("Juego");
            ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanaPrincipal.setSize(800, 800);
            ventanaPrincipal.setLayout(new BorderLayout());

            // Crear un panel de fondo rojo
            JPanel panel = new JPanel();
            panel.setBackground(Color.GRAY);
            panel.setLayout(new BorderLayout(10, 10));

            // Crear un JLabel para mostrar el mensaje de bienvenida
            JLabel label = new JLabel("Bienvenido al Juego del Ahorcado", JLabel.CENTER);
            label.setForeground(Color.WHITE);
            panel.add(label, BorderLayout.CENTER);

            // Agregar el panel a la ventana
            ventanaPrincipal.add(panel, BorderLayout.CENTER);

            // Mostrar un cuadro de diálogo para ingresar el nombre
            String nombre = JOptionPane.showInputDialog(ventanaPrincipal, "Introduce tu nombre:");

            // Verificar si el nombre es válido
            if (nombre != null && !nombre.trim().isEmpty()) {
                  JOptionPane.showMessageDialog(ventanaPrincipal, "Hola, " + nombre + "! Bienvenido al juego.");
                  Figura figura = new Figura();
                  ventanaPrincipal.add(figura);
                  

            } else {
                  JOptionPane.showMessageDialog(ventanaPrincipal,
                              "No ingresaste un nombre, por favor intenta de nuevo.");
            }

            // Hacer visible la ventana
            ventanaPrincipal.setVisible(true);
      }

}
