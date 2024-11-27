
//import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class Jugador {

     // Scanner scanner = new Scanner(System.in);
      String jugadorUno;
      String jugadorDos;
      int score;
      JButton button = new JButton("Ingresar Nombre");
      JTextArea texto = new JTextArea(5, 20);
      JLabel label = new JLabel();

      public void IngresarNombre() {
            button.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        String inputText = texto.getText();
                        label.setText(inputText);
                  }
            });
      }

      public void guardarEnLS() {

      }

}