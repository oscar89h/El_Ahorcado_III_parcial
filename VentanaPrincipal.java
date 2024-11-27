import javax.swing.*;

public class VentanaPrincipal {
      JFrame frame;

      public VentanaPrincipal() {
            frame = new JFrame("Juego");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            frame.setLayout(null); // Cambiar si necesitas layouts específicos
            frame.setVisible(true);
      }
}
