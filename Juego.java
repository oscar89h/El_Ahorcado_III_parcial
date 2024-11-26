import javax.swing.JLabel;

public class Juego {
      // aqui se va ingresar el nombre del jugador y se guardara en el LS
      PalabraOculta panelPalabraOcultaJpanel = new PalabraOculta();
      Figura panelDeFigura = new Figura();
      VentanaMensaje mensaje = new VentanaMensaje(); // instancia ventana mensaje
      JLabel palabraOculta = new JLabel();

      public void agregarVentajasDelJuego() {
            frame.add(panelDeFigura, BorderLayout.WEST);
            frame.add(mensaje, BorderLayout.SOUTH);
            frame.add(panelPalabraOcultaJpanel, BorderLayout.CENTER);
      }

}