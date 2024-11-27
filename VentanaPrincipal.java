import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

public class VentanaPrincipal {
      Figura panelDeFigura = new Figura();
      VentanaMensaje mensaje = new VentanaMensaje(); // instancia ventana mensaje
      PalabraOculta panelPalabraOcultaJpanel = new PalabraOculta();
      Jugador ClaseJugador = new Jugador(); // clase jugador para que se vea el buton de incio y la etiqueta
      public JFrame frame = new JFrame("El Ahorcado");

      public VentanaPrincipal() {

            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLayout(new BorderLayout());

            JLabel palabraOculta = new JLabel();

            mensaje.insertMensaje("Nuevo mensaje dinamico.");

            // frame.add(panelDeFigura);

      }
      // Crea un JFrame y agrega el panel personalizado

      public boolean agregarVentanasDelJuego(JFrame marcoPrincipal) {

            marcoPrincipal.add(panelDeFigura, BorderLayout.WEST);
            marcoPrincipal.add(mensaje, BorderLayout.SOUTH);
            marcoPrincipal.add(panelPalabraOcultaJpanel, BorderLayout.CENTER);
            marcoPrincipal.add(panelPalabraOcultaJpanel, BorderLayout.CENTER);

            return true;
      }

}
