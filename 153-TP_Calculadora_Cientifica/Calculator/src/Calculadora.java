import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora implements ActionListener {

    private double firstNum;
    private double secondNum;
    private double result;
    private double memory;
    private double numA, numB, numC;
    private boolean seteado[] = { false, false, false };
    private String operation;
    private String answer;

    private JButton jBtn0;
    private JButton jBtn1;
    private JButton jBtn2;
    private JButton jBtn3;
    private JButton jBtn4;
    private JButton jBtn5;
    private JButton jBtn6;
    private JButton jBtn7;
    private JButton jBtn8;
    private JButton jBtn9;
    private JButton jBtnA;
    private JButton jBtnAns;
    private JButton jBtnB;
    private JButton jBtnBin;
    private JButton jBtnC;
    private JButton jBtnCA;
    private JButton jBtnClr;
    private JButton jBtnCos;
    private JButton jBtnCosH;
    private JButton jBtnCuad;
    private JButton jBtnCub;
    private JButton jBtnDel;
    private JButton jBtnDiv;
    private JButton jBtnDot;
    private JButton jBtnEleva;
    private JButton jBtnFacto;
    private JButton jBtnHexa;
    private JButton jBtnIgual;
    private JButton jBtnLn;
    private JButton jBtnLog;
    private JButton jBtnMod;
    private JButton jBtnMulti;
    private JButton jBtnOctal;
    private JButton jBtnPM;
    private JButton jBtnPi;
    private JButton jBtnRCuad;
    private JButton jBtnRCub;
    private JButton jBtnResol;
    private JButton jBtnResta;
    private JButton jBtnRound;
    private JButton jBtnSin;
    private JButton jBtnSinH;
    private JButton jBtnSuma;
    private JButton jBtnTan;
    private JButton jBtnTanH;
    private JTextField pantalla;
    private JFrame ventana;
    private JPanel panel;
    
    Font miFuente = new Font("Droid Sans", 1, 24);
    JButton[] botones = new JButton[45];
    JButton[] numeros = new JButton[10];

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
        pantalla.setHorizontalAlignment(JTextField.RIGHT);

        botones[0] = jBtnDel = new JButton("Del");
        botones[1] = jBtnClr = new JButton("C");
        botones[2] = jBtnCA = new JButton("CA");
        botones[3] = jBtnSuma = new JButton("+");
        botones[4] = jBtnCos = new JButton("Cos");
        botones[5] = jBtnSin = new JButton("Sin");
        botones[6] = jBtnTan = new JButton("Tan");
        botones[7] = jBtnMod = new JButton("Mod");
        botones[8] = jBtnRound = new JButton("R");
        numeros[7] = botones[9] = jBtn7 = new JButton("7");
        numeros[8] = botones[10] = jBtn8 = new JButton("8");
        numeros[9] = botones[11] = jBtn9 = new JButton("9");
        botones[12] = jBtnResta = new JButton("-");
        botones[13] = jBtnCosH = new JButton("Cosh");
        botones[14] = jBtnSinH = new JButton("Sinh");
        botones[15] = jBtnTanH = new JButton("Tanh");
        botones[16] = jBtnBin = new JButton("Bin");
        botones[17] = jBtnA = new JButton("a");
        numeros[4] = botones[18] = jBtn4 = new JButton("4");
        numeros[5] = botones[19] = jBtn5 = new JButton("5");
        numeros[6] = botones[20] = jBtn6 = new JButton("6");
        botones[21] = jBtnMulti = new JButton("*");
        botones[22] = jBtnPi = new JButton("Pi");
        botones[23] = jBtnLn = new JButton("Ln");
        botones[24] = jBtnLog = new JButton("Log");
        botones[25] = jBtnOctal = new JButton("Octal");
        botones[26] = jBtnB = new JButton("b");
        numeros[1] = botones[27] = jBtn1 = new JButton("1");
        numeros[2] = botones[28] = jBtn2 = new JButton("2");
        numeros[3] = botones[29] = jBtn3 = new JButton("3");
        botones[30] = jBtnDiv = new JButton("/");
        botones[31] = jBtnCuad = new JButton("x^2");
        botones[32] = jBtnCub = new JButton("x^3");
        botones[33] = jBtnEleva = new JButton("x^y");
        botones[34] = jBtnHexa = new JButton("Hexa");
        botones[35] = jBtnC = new JButton("c");
        numeros[0] = botones[36] = jBtn0 = new JButton("0");
        botones[37] = jBtnDot = new JButton(".");
        botones[38] = jBtnPM = new JButton("+/-");
        botones[39] = jBtnIgual = new JButton("=");
        botones[40] = jBtnRCuad = new JButton("2√x");
        botones[41] = jBtnRCub = new JButton("3√x");
        botones[42] = jBtnFacto = new JButton("x!");
        botones[43] = jBtnAns = new JButton("Ans");
        botones[44] = jBtnResol = new JButton("Resol");

        for (int i = 0; i < botones.length; i++) {
            botones[i].setFont(miFuente);
            botones[i].setFocusable(false);
            botones[i].addActionListener(this);
        }

        panel = new JPanel();
        panel.setBounds(20, 100, 1180, 520);
        panel.setLayout(new GridLayout(5, 9, 20, 20));

        for (int i = 0; i < botones.length; i++) {
            panel.add(botones[i]);
        }

        ventana.add(panel);
        ventana.add(pantalla);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < numeros.length; i++) {
            if (e.getSource() == numeros[i]) {
                pantalla.setText(pantalla.getText().concat(String.valueOf(i)));
            }
        }


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
