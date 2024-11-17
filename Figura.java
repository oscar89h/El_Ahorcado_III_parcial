import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Figura extends JPanel {

      @Override
      protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Establece el grosor del borde a 3 píxeles
            g2d.setStroke(new BasicStroke(3));

            // Dibuja un círculo en relación al panel
            g2d.setColor(Color.BLACK);
            g2d.drawOval(110, 202, 40, 40); // Coordenadas relativas al panel Figura

            // Cambia el grosor del borde a 4 píxeles
            g2d.setStroke(new BasicStroke(4));

            // Dibuja un rectángulo
            g2d.setColor(Color.RED);
            g2d.fillRect(35, 150, 100, 5); // Línea horizontal
            g2d.fillRect(35, 150, 5, 250); // Línea vertical
            g2d.fillRect(130, 152, 5, 50); // Línea vertical corta

            // Dibuja las partes del cuerpo en relación al panel
            g2d.setColor(Color.BLACK);
            g2d.drawLine(60, 70, 80, 120); // Línea diagonal izquierda
            g2d.drawLine(90, 70, 100, 120); // Línea diagonal derecha
      }

      public Figura() {
            // Establece un borde azul alrededor del panel
            Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 2); // Azul, grosor de 5

            // Agrega un margen al lado izquierdo (y otros lados si es necesario)
            Border margin = new EmptyBorder(10, 20, 10, 10); // Top, Left, Bottom, Right

            // Combina el margen y el borde
            this.setBorder(BorderFactory.createCompoundBorder(margin, lineBorder));

            // Establece el tamaño preferido del panel
            this.setPreferredSize(new Dimension(250, 200)); // Ancho y alto deseados
      }
}