
import javax.swing.*;
import java.awt.*;

public class Ventana {
    public static void main(String[] args) {
        JFrame frame = new JFrame("demo");
        // frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.setSize(666, 666);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
