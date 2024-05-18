package tp_final;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class Ventana extends JFrame{

    public Ventana(){
        this.setTitle("ELIGE EL COLOR"); // Título de la ventana
        this.setSize(1000, 800); // Tamaño de la ventana
        this.setMinimumSize(this.getSize()); // Tamaño mínimo de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la ventana cierra el programa
        this.setVisible(true); // Hace visible la ventana

        ImageIcon icon = new ImageIcon("app/src/main/resources/logo.png"); // Icono de la ventana
        this.setIconImage(icon.getImage()); // Asigna el icono a la ventana
        this.getContentPane().setBackground(new Color(158, 61, 87)); // Color de fondo de la ventana
    }
}
