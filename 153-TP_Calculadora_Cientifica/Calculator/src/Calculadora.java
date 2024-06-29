import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora implements ActionListener {
    // VARIABLES PARA LA LOGICA
    private double firstNum;
    private double secondNum;
    private double result;
    private double memory;
    private double numA, numB, numC;
    // ARREGLO PARA LA RESOLVENTE
    private boolean seteado[] = { false, false, false };
    // CADENAS PARA GUARDAR VALORES DE LOGICA
    private String operation;
    private String answer;
    private String auxiliar;
    // BOTONES DE LA CALCULADORA AGRUPADOS POR FUNCIONES SIMILARES DE LOGICA
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
    // ARREGLOS DE BOTONES PARA LAYOUT Y PARA LOGICA DE LOS MISMOS
    private JButton[] botones = new JButton[45];
    private JButton[] letras = new JButton[3];
    private JButton[] numeros = new JButton[10];
    private JButton[] operaciones = new JButton[7];
    private JButton[] signos = new JButton[6];
    private JButton[] sistemaNumerico = new JButton[3];
    private JButton[] trigonometria = new JButton[6];
    // PANTALLA DONDE SE VEN NUMEROS Y RESULTADOS
    private JTextField pantalla;
    // VENTANA QUE REPRESENTA LA CALCULADORA
    private JFrame ventana;
    // PANEL DONDE VAN TODAS LAS TECLAS
    private JPanel panel;
    // FUENTE DONDE DE LOS BOTONES
    private Font miFuente = new Font("Droid Sans", 1, 24);

    Calculadora() {
        // SETEO DE LA VENTANA
        ventana = new JFrame("Calculadora por Daniel Vinzia");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1225, 680);
        ventana.setLayout(null);
        ventana.setResizable(false);
        // SETEO DE LA PANTALLA
        pantalla = new JTextField();
        pantalla.setBounds(20, 20, 1180, 70);
        pantalla.setFont(new Font("Droid Sans", 1, 48));
        pantalla.setBackground(Color.WHITE);
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        // CREACION DE LOS BOTONES Y ALMACENADOS EN ARREGLOS
        botones[0] = jBtnDel = new JButton("Del");
        botones[1] = jBtnClr = new JButton("C");
        botones[2] = jBtnCA = new JButton("CA");
        botones[3] = signos[0] = jBtnSuma = new JButton("+");
        botones[4] = trigonometria[0] = jBtnCos = new JButton("Cos");
        botones[5] = trigonometria[1] = jBtnSin = new JButton("Sin");
        botones[6] = trigonometria[2] = jBtnTan = new JButton("Tan");
        botones[7] = signos[4] = jBtnMod = new JButton("Mod");
        botones[8] = operaciones[0] = jBtnRound = new JButton("Round");
        botones[9] = numeros[7] = jBtn7 = new JButton("7");
        botones[10] = numeros[8] = jBtn8 = new JButton("8");
        botones[11] = numeros[9] = jBtn9 = new JButton("9");
        botones[12] = signos[1] = jBtnResta = new JButton("-");
        botones[13] = trigonometria[3] = jBtnCosH = new JButton("Cosh");
        botones[14] = trigonometria[4] = jBtnSinH = new JButton("Sinh");
        botones[15] = trigonometria[5] = jBtnTanH = new JButton("Tanh");
        botones[16] = sistemaNumerico[0] = jBtnBin = new JButton("Bin");
        botones[17] = letras[0] = jBtnA = new JButton("a");
        botones[18] = numeros[4] = jBtn4 = new JButton("4");
        botones[19] = numeros[5] = jBtn5 = new JButton("5");
        botones[20] = numeros[6] = jBtn6 = new JButton("6");
        botones[21] = signos[2] = jBtnMulti = new JButton("*");
        botones[22] = jBtnPi = new JButton("Pi");
        botones[23] = operaciones[1] = jBtnLn = new JButton("Ln");
        botones[24] = operaciones[2] = jBtnLog = new JButton("Log");
        botones[25] = sistemaNumerico[1] = jBtnOctal = new JButton("Octal");
        botones[26] = letras[1] = jBtnB = new JButton("b");
        botones[27] = numeros[1] = jBtn1 = new JButton("1");
        botones[28] = numeros[2] = jBtn2 = new JButton("2");
        botones[29] = numeros[3] = jBtn3 = new JButton("3");
        botones[30] = signos[3] = jBtnDiv = new JButton("/");
        botones[31] = operaciones[3] = jBtnCuad = new JButton("x^2");
        botones[32] = operaciones[4] = jBtnCub = new JButton("x^3");
        botones[33] = signos[5] = jBtnEleva = new JButton("x^y");
        botones[34] = sistemaNumerico[2] = jBtnHexa = new JButton("Hexa");
        botones[35] = letras[2] = jBtnC = new JButton("c");
        botones[36] = numeros[0] = jBtn0 = new JButton("0");
        botones[37] = jBtnDot = new JButton(".");
        botones[38] = jBtnPM = new JButton("+/-");
        botones[39] = jBtnIgual = new JButton("=");
        botones[40] = operaciones[5] = jBtnRCuad = new JButton("2√x");
        botones[41] = operaciones[6] = jBtnRCub = new JButton("3√x");
        botones[42] = jBtnFacto = new JButton("x!");
        botones[43] = jBtnAns = new JButton("Ans");
        botones[44] = jBtnResol = new JButton("Resol");
        // SETEO DE BOTONES
        for (int i = 0; i < botones.length; i++) {
            botones[i].setFont(miFuente);
            botones[i].setFocusable(false);
            botones[i].addActionListener(this);
        }
        // SETEO DEL LAYOUT DE LOS BOTONES EN EL PANEL
        panel = new JPanel();
        panel.setBounds(20, 100, 1180, 520);
        panel.setLayout(new GridLayout(5, 9, 20, 20));
        // AGREGO LOS COMPONENTES A LA VENTANA Y SETEO LA MISMA
        for (int i = 0; i < botones.length; i++) {
            panel.add(botones[i]);
        }
        ventana.add(panel);
        ventana.add(pantalla);
        ventana.setVisible(true);
    }
    // LOGICA DE LA INTERECCION CON LA CALCULADORA
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
            }
        }
        // BOTONES a, b, c
        for (int i = 0; i < letras.length; i++) {
            if (e.getSource() == letras[i]) {
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
                pantalla.setText("");
            }
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
    }
}
