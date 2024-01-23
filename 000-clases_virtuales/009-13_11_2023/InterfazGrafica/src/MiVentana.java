import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;

import java.awt.BorderLayout;
//import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
//import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiVentana extends JFrame {

    private JButton b1;
    private JButton b2;

    public MiVentana() {
        // dimension es una clase que representa un tamaño
        Dimension d = new Dimension(800, 600);
        // setMaximumSize es el tamaño máximo que puede tener la ventana
        setMaximumSize(new Dimension(d));
        // setMinimumSize es el tamaño mínimo que puede tener la ventana
        setMinimumSize(new Dimension(d));
        // setPreferredSize es el tamaño preferido que tiene la ventana
        setPreferredSize(d);
        // setResizable es para que no se pueda cambiar el tamaño de la ventana si esta
        // en false
        // setResizable(false);
        // setLocationRelativeTo es para que la ventana se centre en la pantalla
        setLocationRelativeTo(null);
        // setDefaultCloseOperation es para que la ventana se cierre cuando se presione
        // la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // creo un contenedor para tomar el componente de nivel intermedio que se crea
        // por defecto
        Container ct = getContentPane();
        // ct.setLayout(new FlowLayout());
        b1 = new JButton("B1");
        ct.add(b1, BorderLayout.NORTH);
        b2 = new JButton("B2");
        ct.add(b2, BorderLayout.SOUTH);
        // otra forma es hacerla es una clase interna anonima
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(((JButton) e.getSource()).getText());
                String tmp = b1.getText();
                b1.setText(b2.getText());
                b2.setText(tmp);
            }
        });
        // JPanel panel = new JPanel();
        // panel.setLayout(new GridLayout(2, 3));
        // for (int i = 0; i < 6; i++) {
        //     final JButton j = new JButton("" + i);
        //     switch (i) {
        //         case 0:
        //             j.setBackground(Color.BLUE);
        //             break;
        //         case 1:
        //             j.setBackground(Color.RED);
        //             break;
        //         case 2:
        //             j.setBackground(Color.YELLOW);
        //             break;
        //         case 3:
        //             j.setBackground(Color.PINK);
        //             break;
        //         case 4:
        //             j.setBackground(Color.CYAN);
        //             break;
        //         case 5:
        //             j.setBackground(Color.ORANGE);
        //             break;
        //     }
        //     j.addActionListener(new ActionListener() {
        //         @Override
        //         public void actionPerformed(ActionEvent e) {
        //             j.setBackground(Color.GRAY);
        //         }
        //     });
        //     panel.add(j);
        // }

        // asi se cargan las imagenes
        JLabel etiqueta = new JLabel("Hola");
        ImageIcon ii = new ImageIcon("src/photo.jpg");
        Image i = ii.getImage();
        etiqueta.setIcon(new ImageIcon(i.getScaledInstance(200, 600, Image.SCALE_SMOOTH)));
        ct.add(etiqueta, BorderLayout.CENTER);
    }

    // en vez de hacer una clase aparte para el listener, la hago interna
    // private class MiListener2 implements ActionListener {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         System.out.println(((JButton) e.getSource()).getText());
    //         String tmp = b1.getText();
    //         b1.setText(b2.getText());
    //         b2.setText(tmp);
    //     }
    // }
}
