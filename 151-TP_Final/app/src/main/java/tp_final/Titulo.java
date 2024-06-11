package tp_final;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class Titulo extends JLabel{

    public Titulo(){
        this.setText("ELIGE EL COLOR DIFERENTE"); // Texto del título
        this.setFont(new Font("Arial", Font.BOLD, 50)); // Fuente del título
        this.setBounds(0, 0, 800, 100); // Posición y tamaño del título
        this.setForeground(Color.BLACK); // Color del título
        this.setVisible(true); // Hace visible el título
    }
}
