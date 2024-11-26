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
       

        PalabraOculta panelPalabraOcultaJpanel = new PalabraOculta();

        
        Figura panelDeFigura = new Figura();
        VentanaMensaje mensaje = new VentanaMensaje(); // instancia ventana mensaje
        JLabel palabraOculta = new JLabel();

        mensaje.insertMensaje("Nuevo mensaje dinamico.");

        // frame.add(panelDeFigura);
        

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
