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
        botones[8] = jBtnRound = new JButton("Round");
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

        if (e.getSource() == jBtnDel) {
            String bsp = null;
            if (pantalla.getText().length() > 0) {
                StringBuilder strB = new StringBuilder(pantalla.getText());
                strB.deleteCharAt(pantalla.getText().length() - 1);
                bsp = strB.toString();
                pantalla.setText(bsp);
            }
        }

        if (e.getSource() == jBtnClr) {
            memory = Double.parseDouble(pantalla.getText());
            pantalla.setText("");
        }

        if (e.getSource() == jBtnDot) {
            if (!pantalla.getText().contains(".")) {
                pantalla.setText(pantalla.getText() + jBtnDot.getText());
            }
        }

        if (e.getSource() == jBtnSuma) {
            firstNum = Double.parseDouble(pantalla.getText());
            pantalla.setText(null);
            operation = "+";
        }

        if (e.getSource() == jBtnResta) {
            firstNum = Double.parseDouble(pantalla.getText());
            pantalla.setText(null);
            operation = "-";
        }

        if (e.getSource() == jBtnMulti) {
            firstNum = Double.parseDouble(pantalla.getText());
            pantalla.setText(null);
            operation = "*";
        }

        if (e.getSource() == jBtnDiv) {
            firstNum = Double.parseDouble(pantalla.getText());
            pantalla.setText(null);
            operation = "/";
        }

        if (e.getSource() == jBtnIgual) {
            secondNum = Double.parseDouble(pantalla.getText());
            switch (operation) {
                case "+":
                    result = firstNum + secondNum;
                    answer = String.format("%.2f", result);
                    pantalla.setText(answer);
                    break;
                case "-":
                    result = firstNum - secondNum;
                    answer = String.format("%.2f", result);
                    pantalla.setText(answer);
                    break;
                case "*":
                    result = firstNum * secondNum;
                    answer = String.format("%.2f", result);
                    pantalla.setText(answer);
                    break;
                case "/":
                    result = firstNum / secondNum;
                    answer = String.format("%.2f", result);
                    pantalla.setText(answer);
                    break;
                case "%":
                    result = firstNum % secondNum;
                    answer = String.format("%.2f", result);
                    pantalla.setText(answer);
                    break;
                case "^":
                    result = Math.pow(firstNum, secondNum);
                    answer = String.format("%.2f", result);
                    pantalla.setText(answer);
                    break;
                default:
                    break;
            }
            firstNum = result;
            memory = result;
            operation = "";
        }

        if (e.getSource() == jBtnCA) {
            pantalla.setText("");
            firstNum = 0;
            secondNum = 0;
            result = 0;
            memory = 0;
            operation = "";
        }

        if (e.getSource() == jBtnPM) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = ops * (-1);
            pantalla.setText(String.valueOf(ops));
        }

        if (e.getSource() == jBtnSin) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.toRadians(ops);
            ops = Math.sin(ops);
            answer = String.format("%.2f", ops);
            pantalla.setText(answer);
        }

        if (e.getSource() == jBtnTan) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.toRadians(ops);
            ops = Math.tan(ops);
            answer = String.format("%.2f", ops);
            pantalla.setText(answer);
        }

        if (e.getSource() == jBtnSinH) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.toRadians(ops);
            ops = Math.sinh(ops);
            answer = String.format("%.2f", ops);
            pantalla.setText(answer);
        }

        if (e.getSource() == jBtnFacto) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            result = 1.0;
            while (ops > 1) {
                result = result * ops;
                ops--;
            }
            pantalla.setText(String.valueOf(result));
        }

        if (e.getSource() == jBtnLn) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.log(ops);
            pantalla.setText(String.valueOf(ops));
        }

        if (e.getSource() == jBtnLog) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.log10(ops);
            pantalla.setText(String.valueOf(ops));
        }

        if (e.getSource() == jBtnCub) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.pow(ops, 3.0);
            pantalla.setText(String.valueOf(ops));
        }

        if (e.getSource() == jBtnEleva) {
            firstNum = Double.parseDouble(pantalla.getText());
            pantalla.setText(null);
            operation = "^";
        }

        if (e.getSource() == jBtnRCub) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.cbrt(ops);
            pantalla.setText(String.valueOf(ops));
        }

        if (e.getSource() == jBtnMod) {
            firstNum = Double.parseDouble(pantalla.getText());
            pantalla.setText(null);
            operation = "%";
        }

        if (e.getSource() == jBtnBin) {
            int a = Integer.parseInt(pantalla.getText());
            pantalla.setText(Integer.toString(a, 2));
        }

        if (e.getSource() == jBtnOctal) {
            int a = Integer.parseInt(pantalla.getText());
            pantalla.setText(Integer.toString(a, 8));
        }

        if (e.getSource() == jBtnHexa) {
            int a = Integer.parseInt(pantalla.getText());
            pantalla.setText(Integer.toString(a, 16));
        }

        if (e.getSource() == jBtnCosH) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.toRadians(ops);
            ops = Math.cosh(ops);
            answer = String.format("%.2f", ops);
            pantalla.setText(answer);
        }

        if (e.getSource() == jBtnCos) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.toRadians(ops);
            ops = Math.cos(ops);
            answer = String.format("%.2f", ops);
            pantalla.setText(answer);
        }

        if (e.getSource() == jBtnRCuad) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.sqrt(ops);
            pantalla.setText(String.valueOf(ops));
        }

        if (e.getSource() == jBtnPi) {
            double ops = Math.PI;
            pantalla.setText(String.valueOf(ops));
        }

        if (e.getSource() == jBtnAns) {
            pantalla.setText(String.valueOf(memory));
        }

        if (e.getSource() == jBtnCuad) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.pow(ops, 2.0);
            pantalla.setText(String.valueOf(ops));
        }

        if (e.getSource() == jBtnTanH) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = Math.toRadians(ops);
            ops = Math.tanh(ops);
            answer = String.format("%.2f", ops);
            pantalla.setText(answer);
        }

        if (e.getSource() == jBtnRound) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            long a = Math.round(ops);
            pantalla.setText(String.valueOf(a));
        }

        if (e.getSource() == jBtnA) {
            numA = Double.parseDouble(pantalla.getText());
            seteado[0] = true;
            pantalla.setText(null);
        }

        if (e.getSource() == jBtnB) {
            numB = Double.parseDouble(pantalla.getText());
            seteado[1] = true;
            pantalla.setText(null);
        }

        if (e.getSource() == jBtnC) {
            numC = Double.parseDouble(pantalla.getText());
            seteado[2] = true;
            pantalla.setText(null);
        }

        if (e.getSource() == jBtnResol) {
            double radicando, x1, x2;
            if (seteado[0] && seteado[1] && seteado[2]) {
                if (numA == 0.0) {
                    pantalla.setText("Ecuacion no cuadratica");
                } else {
                    radicando = Math.sqrt((Math.pow(numB, 2.0)) - (4.0 * numA * numC));
                    x1 = ((-numB) + radicando) / (2 * numA);
                    x2 = ((-numB) - radicando) / (2 * numA);
                    pantalla.setText(String.valueOf(x1) + " " + String.valueOf(x2));
                }
            } else {
                pantalla.setText("Falta setear variables");
            }
            for (int i = 0; i < 2; i++) {
                seteado[i] = false;
            }
        }
    }
}
