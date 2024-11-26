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

            // Cambia el grosor del borde a 4 píxeles
            g2d.setStroke(new BasicStroke(4));

            // Dibuja un rectángulo
            g2d.setColor(Color.BLACK);

            g2d.fillRect(35, 40, 116, 5); // Línea horizontal
            g2d.fillRect(35, 40, 5, 250); // Línea vertical
            g2d.fillRect(146, 42, 5, 17); // Línea vertical corta

            // partes del cuerpo

            // cabeza
            g2d.setColor(Color.BLACK);
            g2d.drawOval(130, 60, 40, 40); // Coordenadas (x, y) y dimensiones (ancho, alto)

            // Cambia el grosor del borde a 4 píxeles
            g2d.setStroke(new BasicStroke(4));

            // cuerpo
            g2d.drawLine(150, 100, 150, 160); // Desde el centro inferior de la cabeza hacia abajo

            // Brazo izquierdo
            g2d.drawLine(150, 110, 120, 140);
            // Brazo derecho
            g2d.drawLine(150, 110, 180, 140);

            // Pierna izquierda

            g2d.drawLine(150, 160, 130, 200); // Desde el final del cuerpo hacia abajo y a la izquierda

            // Pierna derecha
            g2d.drawLine(150, 160, 170, 200); // Desde el final del cuerpo hacia abajo y a la derecha

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