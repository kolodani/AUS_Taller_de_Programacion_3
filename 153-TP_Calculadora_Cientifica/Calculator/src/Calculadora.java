import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora implements ActionListener {

    private double firstNum;
    private double secondNum;
    //private double result;
    private double memory;
    private double numA, numB, numC;
    private boolean seteado[] = { false, false, false };
    private String operation;
    private String answer;

    JFrame ventana;
    JTextField pantalla;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;

    Font miFuente = new Font("Droid Sans", 1, 24);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculadora() {

        ventana = new JFrame("Calculadora");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1225, 680);
        ventana.setLayout(null);
        ventana.setResizable(false);

        pantalla = new JTextField();
        pantalla.setBounds(20, 20, 1180, 70);
        pantalla.setFont(new Font("Droid Sans", 1, 48));
        pantalla.setBackground(Color.WHITE);
        pantalla.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(miFuente);
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(miFuente);
            numberButtons[i].setFocusable(false);
        }

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        ventana.add(panel);
        ventana.add(negButton);
        ventana.add(delButton);
        ventana.add(clrButton);
        ventana.add(pantalla);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // for (int i = 0; i < 10; i++) {
        //     if (e.getSource() == numberButtons[i]) {
        //         pantalla.setText(pantalla.getText().concat(String.valueOf(i)));
        //     }
        // }

        // if (e.getSource() == decButton) {
        //     pantalla.setText(pantalla.getText().concat("."));
        // }

        // if (e.getSource() == addButton) {
        //     num1 = Double.parseDouble(pantalla.getText());
        //     operator = '+';
        //     pantalla.setText("");
        // }

        // if (e.getSource() == subButton) {
        //     num1 = Double.parseDouble(pantalla.getText());
        //     operator = '-';
        //     pantalla.setText("");
        // }

        // if (e.getSource() == mulButton) {
        //     num1 = Double.parseDouble(pantalla.getText());
        //     operator = '*';
        //     pantalla.setText("");
        // }

        // if (e.getSource() == divButton) {
        //     num1 = Double.parseDouble(pantalla.getText());
        //     operator = '/';
        //     pantalla.setText("");
        // }

        // if (e.getSource() == equButton) {
        //     num2 = Double.parseDouble(pantalla.getText());

        //     switch (operator) {
        //         case '+':
        //             result = num1 + num2;
        //             break;
        //         case '-':
        //             result = num1 - num2;
        //             break;
        //         case '*':
        //             result = num1 * num2;
        //             break;
        //         case '/':
        //             result = num1 / num2;
        //             break;
        //     }

        //     pantalla.setText(String.valueOf(result));
        //     num1 = result;
        // }

        // if (e.getSource() == clrButton) {
        //     pantalla.setText("");
        // }

        // if (e.getSource() == delButton) {
        //     String string = pantalla.getText();
        //     pantalla.setText("");
        //     for (int i = 0; i < string.length() - 1; i++) {
        //         pantalla.setText(pantalla.getText() + string.charAt(i));
        //     }
        // }

        // if (e.getSource() == negButton) {
        //     double temp = Double.parseDouble(pantalla.getText());
        //     temp *= -1;
        //     pantalla.setText(String.valueOf(temp));
        // }
    }

}
