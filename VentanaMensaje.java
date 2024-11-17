import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class VentanaMensaje extends JPanel {
      // Establece un borde azul alrededor del panel

      private JLabel etiqueta;

      VentanaMensaje() {
            Border lineBorder = BorderFactory.createLineBorder(Color.RED, 8); // Azul, grosor de 5

            // Agrega un margen al lado izquierdo (y otros lados si es necesario)
            Border margin = new EmptyBorder(10, 20, 10, 10); // Top, Left, Bottom, Right

            // Combina el margen y el borde
            this.setBorder(BorderFactory.createCompoundBorder(margin, lineBorder));

            // Establece el tamaño preferido del panel
            this.setPreferredSize(new Dimension(300, 100)); // Ancho y alto deseados

            // Crea la etiqueta inicial
            etiqueta = new JLabel("Texto inicial");
            etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta.setFont(new Font("Arial", Font.BOLD, 16));
            etiqueta.setForeground(Color.BLUE);

            this.add(etiqueta, BorderLayout.CENTER);
      }

      public void insertMensaje(String texto) {
            etiqueta.setText(texto);
      }

}
