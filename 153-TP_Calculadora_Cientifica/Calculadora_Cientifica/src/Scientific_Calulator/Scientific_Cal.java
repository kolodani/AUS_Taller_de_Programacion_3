package Scientific_Calulator;

import java.awt.event.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.*;

public class Scientific_Cal extends JFrame {
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

    public Scientific_Cal() {
        initComponents();
    }

    private void initComponents() {

        pantalla = new JTextField();
        jBtn7 = new JButton("7");
        jBtnDel = new JButton("Del");
        jBtn0 = new JButton("0");
        jBtn4 = new JButton("4");
        jBtn1 = new JButton("1");
        jBtnClr = new JButton("C");
        jBtn8 = new JButton("8");
        jBtn5 = new JButton("5");
        jBtn2 = new JButton("2");
        jBtnDot = new JButton(".");
        jBtnSuma = new JButton("+");
        jBtnResta = new JButton("-");
        jBtnMulti = new JButton("*");
        jBtnDiv = new JButton("/");
        jBtnIgual = new JButton("=");
        jBtn9 = new JButton("9");
        jBtnCA = new JButton("CA");
        jBtnPM = new JButton("+/-");
        jBtn6 = new JButton("6");
        jBtn3 = new JButton("3");
        jBtnSin = new JButton("Sin");
        jBtnTan = new JButton("Tan");
        jBtnSinH = new JButton("Sinh");
        jBtnFacto = new JButton("x!");
        jBtnLn = new JButton("Ln");
        jBtnLog = new JButton("Log");
        jBtnCub = new JButton("x^3");
        jBtnEleva = new JButton("x^y");
        jBtnRCub = new JButton("3√x");
        jBtnMod = new JButton("Mod");
        jBtnBin = new JButton("Bin");
        jBtnOctal = new JButton("Octal");
        jBtnHexa = new JButton("Hexa");
        jBtnCosH = new JButton("Cosh");
        jBtnCos = new JButton("Cos");
        jBtnRCuad = new JButton("2√x");
        jBtnPi = new JButton("Pi");
        jBtnAns = new JButton("Ans");
        jBtnCuad = new JButton("x^2");
        jBtnTanH = new JButton("Tanh");
        jBtnRound = new JButton("R");
        jBtnA = new JButton("a");
        jBtnB = new JButton("b");
        jBtnC = new JButton("c");
        jBtnResol = new JButton("Resol");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pantalla.setFont(new Font("Droid Sans", 1, 48));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });

        jBtn7.setFont(new Font("Droid Sans", 1, 24));

        jBtn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtnDel.setFont(new Font("Droid Sans", 1, 24));
        jBtnDel.setHorizontalTextPosition(SwingConstants.CENTER);
        jBtnDel.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBtnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnDelActionPerformed(evt);
            }
        });

        jBtn0.setFont(new Font("Droid Sans", 1, 24));
        jBtn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new Font("Droid Sans", 1, 24));
        jBtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new Font("Droid Sans", 1, 24));
        jBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtnClr.setFont(new Font("Droid Sans", 1, 24));
        jBtnClr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnClrActionPerformed(evt);
            }
        });

        jBtn8.setFont(new Font("Droid Sans", 1, 24));
        jBtn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new Font("Droid Sans", 1, 24));
        jBtn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new Font("Droid Sans", 1, 24));
        jBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtnDot.setFont(new Font("Droid Sans", 1, 24));
        jBtnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        jBtnSuma.setFont(new Font("Droid Sans", 1, 24));
        jBtnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnSumaActionPerformed(evt);
            }
        });

        jBtnResta.setFont(new Font("Droid Sans", 1, 24));
        jBtnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnRestaActionPerformed(evt);
            }
        });

        jBtnMulti.setFont(new Font("Droid Sans", 1, 24));
        jBtnMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnMultiActionPerformed(evt);
            }
        });

        jBtnDiv.setFont(new Font("Droid Sans", 1, 24));
        jBtnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnDivActionPerformed(evt);
            }
        });

        jBtnIgual.setFont(new Font("Droid Sans", 1, 24));
        jBtnIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnIgualActionPerformed(evt);
            }
        });

        jBtn9.setFont(new Font("Droid Sans", 1, 24));
        jBtn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnCA.setFont(new Font("Droid Sans", 1, 24));
        jBtnCA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCAActionPerformed(evt);
            }
        });

        jBtnPM.setFont(new Font("Droid Sans", 1, 24));
        jBtnPM.setToolTipText("");
        jBtnPM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnPMActionPerformed(evt);
            }
        });

        jBtn6.setFont(new Font("Droid Sans", 1, 24));
        jBtn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new Font("Droid Sans", 1, 24));
        jBtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnSin.setFont(new Font("Droid Sans", 1, 24));
        jBtnSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnSinActionPerformed(evt);
            }
        });

        jBtnTan.setFont(new Font("Droid Sans", 1, 24));
        jBtnTan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnTanActionPerformed(evt);
            }
        });

        jBtnSinH.setFont(new Font("Droid Sans", 1, 24));
        jBtnSinH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnSinHActionPerformed(evt);
            }
        });

        jBtnFacto.setFont(new Font("Droid Sans", 1, 24));
        jBtnFacto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnFactoActionPerformed(evt);
            }
        });

        jBtnLn.setFont(new Font("Droid Sans", 1, 24));
        jBtnLn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnLnActionPerformed(evt);
            }
        });

        jBtnLog.setFont(new Font("Droid Sans", 1, 24));
        jBtnLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnLogActionPerformed(evt);
            }
        });

        jBtnCub.setFont(new Font("Droid Sans", 1, 24));
        jBtnCub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCubActionPerformed(evt);
            }
        });

        jBtnEleva.setFont(new Font("Droid Sans", 1, 24));
        jBtnEleva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnElevaActionPerformed(evt);
            }
        });

        jBtnRCub.setFont(new Font("Droid Sans", 1, 24));
        jBtnRCub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnRCubActionPerformed(evt);
            }
        });

        jBtnMod.setFont(new Font("Droid Sans", 1, 24));
        jBtnMod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnModActionPerformed(evt);
            }
        });

        jBtnBin.setFont(new Font("Droid Sans", 1, 24));
        jBtnBin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnBinActionPerformed(evt);
            }
        });

        jBtnOctal.setFont(new Font("Droid Sans", 1, 24));
        jBtnOctal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnOctalActionPerformed(evt);
            }
        });

        jBtnHexa.setFont(new Font("Droid Sans", 1, 24));
        jBtnHexa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnHexaActionPerformed(evt);
            }
        });

        jBtnCosH.setFont(new Font("Droid Sans", 1, 24));
        jBtnCosH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCosHActionPerformed(evt);
            }
        });

        jBtnCos.setFont(new Font("Droid Sans", 1, 24));
        jBtnCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCosActionPerformed(evt);
            }
        });

        jBtnRCuad.setFont(new Font("Droid Sans", 1, 24));
        jBtnRCuad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnRCuadActionPerformed(evt);
            }
        });

        jBtnPi.setFont(new Font("Droid Sans", 1, 24));
        jBtnPi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnPiActionPerformed(evt);
            }
        });

        jBtnAns.setFont(new Font("Droid Sans", 1, 24));
        jBtnAns.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnAnsActionPerformed(evt);
            }
        });

        jBtnCuad.setFont(new Font("Droid Sans", 1, 24));
        jBtnCuad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCuadActionPerformed(evt);
            }
        });

        jBtnTanH.setFont(new Font("Droid Sans", 1, 24));
        jBtnTanH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnTanHActionPerformed(evt);
            }
        });

        jBtnRound.setFont(new Font("Droid Sans", 1, 24));
        jBtnRound.setMargin(new Insets(0, 14, 0, 14));
        jBtnRound.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnRoundActionPerformed(evt);
            }
        });

        jBtnA.setFont(new Font("Droid Sans", 1, 24));
        jBtnA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnAActionPerformed(evt);
            }
        });

        jBtnB.setFont(new Font("Droid Sans", 1, 24));
        jBtnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnBActionPerformed(evt);
            }
        });

        jBtnC.setFont(new Font("Droid Sans", 1, 24));
        jBtnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCActionPerformed(evt);
            }
        });

        jBtnResol.setFont(new Font("Droid Sans", 1, 24));
        jBtnResol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnResolActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(pantalla)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBtn0, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn4, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn7, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnDel, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn1, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBtnDot, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn5, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn8, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnClr, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn2, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBtnPM, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn6, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn9, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnCA, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn3, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBtnIgual, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnMulti, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnResta, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnSuma, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnDiv, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBtnRCuad, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnPi, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnCosH, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnCos, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnCuad, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBtnRCub, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnLn, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnSinH, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnSin, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnCub, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBtnFacto, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnLog, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnTanH, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnTan, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnEleva, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBtnAns, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnOctal, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnBin, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnMod, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnHexa, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBtnResol, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnB, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnA, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnRound, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnC, GroupLayout.PREFERRED_SIZE,
                                                                115, GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pantalla, GroupLayout.PREFERRED_SIZE, 70,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnDel, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtn7, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtn4, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtn1, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtn0, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnClr, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtn8, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtn5, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtn2, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnDot, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnCA, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtn9, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtn6, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtn3, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnPM, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnSuma, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnResta, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnMulti, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnDiv, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnIgual, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnCos, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnCosH, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnPi, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnCuad, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnRCuad, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnSin, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnSinH, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnLn, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnCub, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnRCub, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnTan, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnTanH, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnLog, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnEleva, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnFacto, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnMod, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnBin, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnOctal, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnHexa, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnAns, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnRound, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnA, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnB, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBtnC, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, Short.MAX_VALUE)
                                                .addComponent(jBtnResol, GroupLayout.PREFERRED_SIZE, 90,
                                                        GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)));

        pack();
    }

    private void jBtn7ActionPerformed(ActionEvent evt) {
        String iNum = pantalla.getText() + jBtn7.getText();
        pantalla.setText(iNum);
    }

    private void jBtnDelActionPerformed(ActionEvent evt) {
        String bsp = null;
        if (pantalla.getText().length() > 0) {
            StringBuilder strB = new StringBuilder(pantalla.getText());
            strB.deleteCharAt(pantalla.getText().length() - 1);
            bsp = strB.toString();
            pantalla.setText(bsp);
        }
    }

    private void jBtn0ActionPerformed(ActionEvent evt) {
        String iNum = pantalla.getText() + jBtn0.getText();
        pantalla.setText(iNum);
    }

    private void jBtn4ActionPerformed(ActionEvent evt) {
        String iNum = pantalla.getText() + jBtn4.getText();
        pantalla.setText(iNum);
    }

    private void jBtn1ActionPerformed(ActionEvent evt) {
        String iNum = pantalla.getText() + jBtn1.getText();
        pantalla.setText(iNum);
    }

    private void jBtnClrActionPerformed(ActionEvent evt) {
        memory = Double.parseDouble(pantalla.getText());
        pantalla.setText("");
    }

    private void jBtn8ActionPerformed(ActionEvent evt) {
        String iNum = pantalla.getText() + jBtn8.getText();
        pantalla.setText(iNum);
    }

    private void jBtn5ActionPerformed(ActionEvent evt) {
        String iNum = pantalla.getText() + jBtn5.getText();
        pantalla.setText(iNum);
    }

    private void jBtn2ActionPerformed(ActionEvent evt) {
        String iNum = pantalla.getText() + jBtn2.getText();
        pantalla.setText(iNum);
    }

    private void jBtnDotActionPerformed(ActionEvent evt) {
        if (!pantalla.getText().contains(".")) {
            pantalla.setText(pantalla.getText() + jBtnDot.getText());
        }
    }

    private void jBtnSumaActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(pantalla.getText());
        pantalla.setText(null);
        operation = "+";
    }

    private void jBtnRestaActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(pantalla.getText());
        pantalla.setText(null);
        operation = "-";
    }

    private void jBtnMultiActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(pantalla.getText());
        pantalla.setText(null);
        operation = "*";
    }

    private void jBtnDivActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(pantalla.getText());
        pantalla.setText(null);
        operation = "/";
    }

    private void jBtnIgualActionPerformed(ActionEvent evt) {
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

    private void jBtn9ActionPerformed(ActionEvent evt) {
        String iNum = pantalla.getText() + jBtn9.getText();
        pantalla.setText(iNum);
    }

    private void jBtnCAActionPerformed(ActionEvent evt) {
        pantalla.setText("");
        firstNum = 0;
        secondNum = 0;
        result = 0;
        memory = 0;
        operation = "";
    }

    private void jBtnPMActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = ops * (-1);
        pantalla.setText(String.valueOf(ops));
    }

    private void jBtn6ActionPerformed(ActionEvent evt) {
        String iNum = pantalla.getText() + jBtn6.getText();
        pantalla.setText(iNum);
    }

    private void jBtn3ActionPerformed(ActionEvent evt) {
        String iNum = pantalla.getText() + jBtn3.getText();
        pantalla.setText(iNum);
    }

    private void jBtnSinActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.toRadians(ops);
        ops = Math.sin(ops);
        answer = String.format("%.2f", ops);
        pantalla.setText(answer);
    }

    private void jBtnTanActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.toRadians(ops);
        ops = Math.tan(ops);
        answer = String.format("%.2f", ops);
        pantalla.setText(answer);
    }

    private void jBtnSinHActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.toRadians(ops);
        ops = Math.sinh(ops);
        answer = String.format("%.2f", ops);
        pantalla.setText(answer);
    }

    private void jBtnFactoActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        result = 1.0;
        while (ops > 1) {
            result = result * ops;
            ops--;
        }
        pantalla.setText(String.valueOf(result));
    }

    private void jBtnLnActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.log(ops);
        pantalla.setText(String.valueOf(ops));
    }

    private void jBtnLogActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.log10(ops);
        pantalla.setText(String.valueOf(ops));
    }

    private void jBtnCubActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.pow(ops, 3.0);
        pantalla.setText(String.valueOf(ops));
    }

    private void jBtnElevaActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(pantalla.getText());
        pantalla.setText(null);
        operation = "^";
    }

    private void jBtnRCubActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.cbrt(ops);
        pantalla.setText(String.valueOf(ops));
    }

    private void jBtnModActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(pantalla.getText());
        pantalla.setText(null);
        operation = "%";
    }

    private void jBtnBinActionPerformed(ActionEvent evt) {
        int a = Integer.parseInt(pantalla.getText());
        pantalla.setText(Integer.toString(a, 2));
    }

    private void jBtnOctalActionPerformed(ActionEvent evt) {
        int a = Integer.parseInt(pantalla.getText());
        pantalla.setText(Integer.toString(a, 8));
    }

    private void jBtnHexaActionPerformed(ActionEvent evt) {
        int a = Integer.parseInt(pantalla.getText());
        pantalla.setText(Integer.toString(a, 16));
    }

    private void jBtnCosHActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.toRadians(ops);
        ops = Math.cosh(ops);
        answer = String.format("%.2f", ops);
        pantalla.setText(answer);
    }

    private void jBtnCosActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.toRadians(ops);
        ops = Math.cos(ops);
        answer = String.format("%.2f", ops);
        pantalla.setText(answer);
    }

    private void jBtnRCuadActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.sqrt(ops);
        pantalla.setText(String.valueOf(ops));
    }

    private void jBtnPiActionPerformed(ActionEvent evt) {
        double ops = Math.PI;
        pantalla.setText(String.valueOf(ops));
    }

    private void jBtnAnsActionPerformed(ActionEvent evt) {
        pantalla.setText(String.valueOf(memory));
    }

    private void jBtnCuadActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.pow(ops, 2.0);
        pantalla.setText(String.valueOf(ops));
    }

    private void jBtnTanHActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        ops = Math.toRadians(ops);
        ops = Math.tanh(ops);
        answer = String.format("%.2f", ops);
        pantalla.setText(answer);
    }

    private void jBtnRoundActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(pantalla.getText()));
        long a = Math.round(ops);
        pantalla.setText(String.valueOf(a));
    }

    private void jBtnAActionPerformed(ActionEvent evt) {
        numA = Double.parseDouble(pantalla.getText());
        seteado[0] = true;
        pantalla.setText(null);
    }

    private void jBtnBActionPerformed(ActionEvent evt) {
        numB = Double.parseDouble(pantalla.getText());
        seteado[1] = true;
        pantalla.setText(null);
    }

    private void jBtnCActionPerformed(ActionEvent evt) {
        numC = Double.parseDouble(pantalla.getText());
        seteado[2] = true;
        pantalla.setText(null);
    }

    private void jBtnResolActionPerformed(ActionEvent evt) {
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

    private void pantallaActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void formWindowActivated(WindowEvent evt) {
        this.setResizable(false);
        this.setSize(1225, 680);
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Scientific_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scientific_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scientific_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scientific_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scientific_Cal().setVisible(true);
            }
        });
    }
}
