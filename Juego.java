import javax.swing.*;
import java.awt.*;
public class Juego extends Jugador {
      // aqui se va ingresar el nombre del jugador y se guardara en el LS
      JPanel panelTextoInicial = new JPanel();
     
           
      public Juego() {
            panelTextoInicial.setPreferredSize(new Dimension(300, 100));
            panelTextoInicial.setBackground(Color.RED); // Set the background color
            panelTextoInicial.setLayout(new BorderLayout());
            VentanaPrincipal ventanPrincial = new VentanaPrincipal();

            panelTextoInicial.add(new JScrollPane(texto));
            panelTextoInicial.add(button);
            panelTextoInicial.add(label);

            IngresarNombre();
            ventanPrincial.frame.add(panelTextoInicial);

      }

}