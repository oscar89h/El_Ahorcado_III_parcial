import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jugador {
      String jugadorUno;
      String jugadorDos;
      int score;

      JButton button = new JButton("Ingresar Nombre");
      JTextArea texto = new JTextArea(5, 20);
      JLabel label = new JLabel("Introduce tu nombre:");

      public void IngresarNombre() {
            button.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        String inputText = texto.getText().trim();
                        if (!inputText.isEmpty()) {
                              jugadorUno = inputText;
                              label.setText("Nombre guardado: " + jugadorUno);
                        } else {
                              JOptionPane.showMessageDialog(null, "Por favor, introduce un nombre.", "Error",
                                          JOptionPane.ERROR_MESSAGE);
                        }
                  }
            });
      }
}
