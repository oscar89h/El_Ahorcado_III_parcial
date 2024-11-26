// import javax.swing.*;
//import java.awt.*;

import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//import javax.swing.border.Border;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        // Crea un JFrame y agrega el panel personalizado
        JFrame frame = new JFrame("El Ahorcado");

        PalabraOculta panelPalabraOcultaJpanel = new PalabraOculta();

        frame.setLayout(new BorderLayout());
        Figura panelDeFigura = new Figura();
        VentanaMensaje mensaje = new VentanaMensaje(); // instancia ventana mensaje
        JLabel palabraOculta = new JLabel();

        mensaje.insertMensaje("Nuevo mensaje dinamico.");

        // frame.add(panelDeFigura);
        frame.add(panelDeFigura, BorderLayout.WEST);
        frame.add(mensaje, BorderLayout.SOUTH);
        frame.add(panelPalabraOcultaJpanel, BorderLayout.CENTER);

        panelPalabraOcultaJpanel.insertarPalabraOculta(palabraOculta);

        String letraIngresada;

        letraIngresada = "m";
        panelPalabraOcultaJpanel.actualizarPalabraOculta(palabraOculta, letraIngresada);

        // Configuración del JFrame
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
