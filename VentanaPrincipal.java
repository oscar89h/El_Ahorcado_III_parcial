import javax.swing.JFrame;
import java.awt.BorderLayout;

public class VentanaPrincipal {

      public VentanaPrincipal() {

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JFrame frame = new JFrame("El Ahorcado");
        frame.setLayout(new BorderLayout());

        panelPalabraOcultaJpanel.insertarPalabraOculta(palabraOculta);

        String letraIngresada;

        letraIngresada = "m";
        panelPalabraOcultaJpanel.actualizarPalabraOculta(palabraOculta, letraIngresada);

        // Configuración del JFrame
      }
 // Crea un JFrame y agrega el panel personalizado

      frame.add(panelDeFigura, BorderLayout.WEST);
      frame.add(mensaje, BorderLayout.SOUTH);
      frame.add(panelPalabraOcultaJpanel, BorderLayout.CENTER);
}
