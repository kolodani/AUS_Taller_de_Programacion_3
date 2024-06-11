package tp_final;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Presentacion extends JPanel {

    Titulo titulo = new Titulo(); // Título del juego
    ImageIcon imagen = new ImageIcon("app/src/main/resources/ImagenInicio.png"); // Imagen de la presentación

    public Presentacion() {

        // Titulo
        this.add(titulo); // Añade el título a la presentación
        titulo.setBounds(150, 0, 1000, 100); // Posición y tamaño del título

        // tamaño de la presentación
        this.setSize(1000, 200); // Tamaño de la presentación
        this.setBackground(new Color(58, 61, 87));
        this.setVisible(true); // Hace visible la presentación
    }

}
