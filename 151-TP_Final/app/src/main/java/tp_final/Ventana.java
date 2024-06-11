package tp_final;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class Ventana extends JFrame {

    Presentacion presentacion = new Presentacion(); // Presentación del juego dentro de la ventana

    public Ventana() {

        // Configuración de la ventana
        this.setTitle("ELIGE EL COLOR DIFERENTE"); // Título de la ventana
        this.setSize(1000, 800); // Tamaño de la ventana
        this.setMinimumSize(this.getSize()); // Tamaño mínimo de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la ventana cierra el programa
        this.getContentPane().setBackground(new Color(0,0,0)); // Color de fondo de la ventana

        // Icono de la ventana
        ImageIcon icon = new ImageIcon("app/src/main/resources/logo.png"); // Icono de la ventana
        this.setIconImage(icon.getImage()); // Asigna el icono a la ventana

        // Presentación del juego
        this.add(presentacion); // Añade la presentación a la ventana

        this.setVisible(true); // Hace visible la ventana
    }
}
