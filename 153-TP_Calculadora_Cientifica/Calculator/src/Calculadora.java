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
    private String auxiliar;

    private JButton jBtn0, jBtn1, jBtn2, jBtn3, jBtn4, jBtn5, jBtn6, jBtn7, jBtn8, jBtn9;
    private JButton jBtnA, jBtnB, jBtnC;
    private JButton jBtnCos, jBtnCosH, jBtnSin, jBtnSinH, jBtnTan, jBtnTanH;
    private JButton jBtnBin, jBtnOctal, jBtnHexa;
    private JButton jBtnSuma, jBtnResta, jBtnMulti, jBtnDiv, jBtnMod, jBtnEleva;
    private JButton jBtnLn, jBtnLog, jBtnCuad, jBtnCub, jBtnRCuad, jBtnRCub, jBtnRound;
    private JButton jBtnAns;
    private JButton jBtnCA;
    private JButton jBtnClr;
    private JButton jBtnDel;
    private JButton jBtnDot;
    private JButton jBtnFacto;
    private JButton jBtnIgual;
    private JButton jBtnPM;
    private JButton jBtnPi;
    private JButton jBtnResol;

    private JButton[] botones = new JButton[45];
    private JButton[] numeros = new JButton[10];
    private JButton[] signos = new JButton[6];
    private JButton[] trigonometria = new JButton[6];
    private JButton[] operaciones = new JButton[7];
    private JButton[] sistemaNumerico = new JButton[3];
    private JButton[] letras = new JButton[3];

    private JTextField pantalla;
    private JFrame ventana;
    private JPanel panel;

    private Font miFuente = new Font("Droid Sans", 1, 24);

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
        signos[0] = botones[3] = jBtnSuma = new JButton("+");
        trigonometria[0] = botones[4] = jBtnCos = new JButton("Cos");
        trigonometria[1] = botones[5] = jBtnSin = new JButton("Sin");
        trigonometria[2] = botones[6] = jBtnTan = new JButton("Tan");
        signos[4] = botones[7] = jBtnMod = new JButton("Mod");
        operaciones[0] = botones[8] = jBtnRound = new JButton("Round");
        numeros[7] = botones[9] = jBtn7 = new JButton("7");
        numeros[8] = botones[10] = jBtn8 = new JButton("8");
        numeros[9] = botones[11] = jBtn9 = new JButton("9");
        signos[1] = botones[12] = jBtnResta = new JButton("-");
        trigonometria[3] = botones[13] = jBtnCosH = new JButton("Cosh");
        trigonometria[4] = botones[14] = jBtnSinH = new JButton("Sinh");
        trigonometria[5] = botones[15] = jBtnTanH = new JButton("Tanh");
        sistemaNumerico[0] = botones[16] = jBtnBin = new JButton("Bin");
        botones[17] = jBtnA = new JButton("a");
        numeros[4] = botones[18] = jBtn4 = new JButton("4");
        numeros[5] = botones[19] = jBtn5 = new JButton("5");
        numeros[6] = botones[20] = jBtn6 = new JButton("6");
        signos[2] = botones[21] = jBtnMulti = new JButton("*");
        botones[22] = jBtnPi = new JButton("Pi");
        operaciones[1] = botones[23] = jBtnLn = new JButton("Ln");
        operaciones[2] = botones[24] = jBtnLog = new JButton("Log");
        sistemaNumerico[1] = botones[25] = jBtnOctal = new JButton("Octal");
        letras[1] = botones[26] = jBtnB = new JButton("b");
        numeros[1] = botones[27] = jBtn1 = new JButton("1");
        numeros[2] = botones[28] = jBtn2 = new JButton("2");
        numeros[3] = botones[29] = jBtn3 = new JButton("3");
        signos[3] = botones[30] = jBtnDiv = new JButton("/");
        operaciones[3] = botones[31] = jBtnCuad = new JButton("x^2");
        operaciones[4] = botones[32] = jBtnCub = new JButton("x^3");
        signos[5] = botones[33] = jBtnEleva = new JButton("x^y");
        sistemaNumerico[2] = botones[34] = jBtnHexa = new JButton("Hexa");
        letras[2] = botones[35] = jBtnC = new JButton("c");
        numeros[0] = botones[36] = jBtn0 = new JButton("0");
        botones[37] = jBtnDot = new JButton(".");
        botones[38] = jBtnPM = new JButton("+/-");
        botones[39] = jBtnIgual = new JButton("=");
        operaciones[5] = botones[40] = jBtnRCuad = new JButton("2√x");
        operaciones[6] = botones[41] = jBtnRCub = new JButton("3√x");
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
        // BOTONES DEL 0 AL 9
        for (int i = 0; i < numeros.length; i++) {
            if (e.getSource() == numeros[i]) {
                pantalla.setText(pantalla.getText().concat(String.valueOf(i)));
            }
        }
        // BOTONES +, -, *, /, %, ^
        for (int i = 0; i < signos.length; i++) {
            if (e.getSource() == signos[i]) {
                firstNum = Double.parseDouble(pantalla.getText());
                pantalla.setText(null);
                operation = signos[i].getText();
            }
        }
        // BOTONES cos, sin, tan, cosh, sinh, tanh
        for (int i = 0; i < trigonometria.length; i++) {
            if (e.getSource() == trigonometria[i]) {
                double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
                ops = Math.toRadians(ops);
                auxiliar = trigonometria[i].getText();
                switch (auxiliar) {
                    case "Cos":
                        ops = Math.cos(ops);
                        break;
                    case "Sin":
                        ops = Math.sin(ops);
                        break;
                    case "Tan":
                        ops = Math.tan(ops);
                        break;
                    case "CosH":
                        ops = Math.cosh(ops);
                        break;
                    case "SinH":
                        ops = Math.sinh(ops);
                        break;
                    case "Tanh":
                        ops = Math.tanh(ops);
                        break;
                    default:
                        break;
                }
                answer = String.format("%.2f", ops);
                pantalla.setText(answer);
            }
        }
        // BOTON DELETE
        if (e.getSource() == jBtnDel) {
            String bsp = null;
            if (pantalla.getText().length() > 0) {
                StringBuilder strB = new StringBuilder(pantalla.getText());
                strB.deleteCharAt(pantalla.getText().length() - 1);
                bsp = strB.toString();
                pantalla.setText(bsp);
            }
        }
        // BOTON CLEAR
        if (e.getSource() == jBtnClr) {
            memory = Double.parseDouble(pantalla.getText());
            pantalla.setText("");
        }
        // BOTON PUNTO
        if (e.getSource() == jBtnDot) {
            if (!pantalla.getText().contains(".")) {
                pantalla.setText(pantalla.getText() + jBtnDot.getText());
            }
        }
        // BOTON Pi
        if (e.getSource() == jBtnPi) {
            double ops = Math.PI;
            pantalla.setText(String.valueOf(ops));
        }
        // BOTON CLEAR ALL
        if (e.getSource() == jBtnCA) {
            pantalla.setText("");
            firstNum = 0;
            secondNum = 0;
            result = 0;
            memory = 0;
            operation = "";
        }
        // BOTON MAS/MENOS +/-
        if (e.getSource() == jBtnPM) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            ops = ops * (-1);
            pantalla.setText(String.valueOf(ops));
        }
        // BOTON Ans
        if (e.getSource() == jBtnAns) {
            pantalla.setText(String.valueOf(memory));
        }
        // BOTON IGUAL =
        if (e.getSource() == jBtnIgual) {
            secondNum = Double.parseDouble(pantalla.getText());
            switch (operation) {
                case "+":
                    result = firstNum + secondNum;
                    pantalla.setText(answer = String.format("%.2f", result));
                    break;
                case "-":
                    result = firstNum - secondNum;
                    pantalla.setText(answer = String.format("%.2f", result));
                    break;
                case "*":
                    result = firstNum * secondNum;
                    pantalla.setText(answer = String.format("%.2f", result));
                    break;
                case "/":
                    result = firstNum / secondNum;
                    pantalla.setText(answer = String.format("%.2f", result));
                    break;
                case "Mod":
                    result = firstNum % secondNum;
                    pantalla.setText(answer = String.format("%.2f", result));
                    break;
                case "x^y":
                    result = Math.pow(firstNum, secondNum);
                    pantalla.setText(answer = String.format("%.2f", result));
                    break;
                default:
                    break;
            }
            firstNum = result;
            memory = result;
            operation = "";
        }
        // BOTONES Round, Ln, Log, x^2, x^3, 2√x, 3√x
        for (int i = 0; i < operaciones.length; i++) {
            if (e.getSource() == operaciones[i]) {
                double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
                auxiliar = operaciones[i].getText();
                switch (auxiliar) {
                    case "Round":
                        ops = Math.round(ops);
                        break;
                    case "Ln":
                        ops = Math.log(ops);
                        break;
                    case "Log":
                        ops = Math.log10(ops);
                        break;
                    case "x^2":
                        ops = Math.pow(ops, 2.0);
                        break;
                    case "x^3":
                        ops = Math.pow(ops, 3.0);
                        break;
                    case "2√x":
                        ops = Math.sqrt(ops);
                        break;
                    case "3√x":
                        ops = Math.cbrt(ops);
                        break;
                    default:
                        break;
                }
                pantalla.setText(String.valueOf(ops));
            }
        }
        // BOTONES Bin, Octal, Hexa
        for (int i = 0; i < sistemaNumerico.length; i++) {
            if (e.getSource() == sistemaNumerico[i]) {
                int a = Integer.parseInt(pantalla.getText());
                auxiliar = sistemaNumerico[i].getText();
                switch (auxiliar) {
                    case "Bin":
                        pantalla.setText(Integer.toString(a, 2));
                        break;
                    case "Octal":
                        pantalla.setText(Integer.toString(a, 8));
                        break;
                    case "Hexa":
                        pantalla.setText(Integer.toString(a, 16));
                        break;
                    default:
                        break;
                }
                pantalla.setText(null);
            }
        }
        // BOTON Factotial
        if (e.getSource() == jBtnFacto) {
            double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
            result = 1.0;
            while (ops > 1) {
                result = result * ops;
                ops--;
            }
            pantalla.setText(String.valueOf(result));
        }
        // BOTONES a, b, c
        for (int i = 0; i < letras.length; i++) {
            auxiliar = letras[i].getText();
            switch (auxiliar) {
                case "a":
                    numA = Double.parseDouble(pantalla.getText());
                    seteado[0] = true;
                    break;
                case "b":
                    numB = Double.parseDouble(pantalla.getText());
                    seteado[1] = true;
                    break;
                case "c":
                    numC = Double.parseDouble(pantalla.getText());
                    seteado[2] = true;
                    break;
                default:
                    break;
            }
            pantalla.setText(null);
        }
        // BOTON Resolvente
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
