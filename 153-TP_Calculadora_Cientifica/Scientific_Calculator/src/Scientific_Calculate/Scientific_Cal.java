package Scientific_Calculate;

import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author kolodani
 */
public class Scientific_Cal extends JFrame {
    double firstNum;
    double secondNum;
    double result;
    double memory;
    double numA, numB, numC;
    boolean seteado[] = { false, false, false };
    String operation;
    String answer;

    public Scientific_Cal() {
        initComponents();
    }

    private void initComponents() {

        jTxtDisplay = new JTextField();
        jBtn9 = new JButton();
        jBtn7 = new JButton();
        jBtn8 = new JButton();
        jBtnResta = new JButton();
        jBtn4 = new JButton();
        jBtn5 = new JButton();
        jBtn6 = new JButton();
        jBtnMulti = new JButton();
        jBtn1 = new JButton();
        jBtn2 = new JButton();
        jBtn3 = new JButton();
        jBtnDiv = new JButton();
        jBtn0 = new JButton();
        jBtnPunto = new JButton();
        jBtnMasMenos = new JButton();
        jBtnIgual = new JButton();
        jBtnBackSpace = new JButton();
        jBtnClear = new JButton();
        jBtnCA = new JButton();
        jBtnSuma = new JButton();
        jBtnSinh = new JButton();
        jBtnSin = new JButton();
        jBtnLog = new JButton();
        jBtnPi = new JButton();
        jBtnCos = new JButton();
        jBtnCosh = new JButton();
        jBtnTanh = new JButton();
        jBtnTan = new JButton();
        jBtnSqrt = new JButton();
        jBtnPower2 = new JButton();
        jBtnLn = new JButton();
        jBtnRund = new JButton();
        jBtnPower3 = new JButton();
        jBtnBin = new JButton();
        jBtnHex = new JButton();
        jBtnSinh1 = new JButton();
        jBtnAnswer = new JButton();
        jBtnFactorial = new JButton();
        jBtnPower = new JButton();
        jBtnOctal = new JButton();
        jBtnCubica = new JButton();
        jBtnA = new JButton();
        jBtnB = new JButton();
        jBtnC = new JButton();
        jBtnResolv = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTxtDisplay.setFont(new Font("Times New Roman", 1, 36));
        jTxtDisplay.setHorizontalAlignment(JTextField.RIGHT);
        jTxtDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTxtDisplayActionPerformed(evt);
            }
        });
        jTxtDisplay.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                jTxtDisplayKeyTyped(evt);
            }
        });

        jBtn9.setFont(new Font("SansSerif", 3, 24));
        jBtn9.setText("9");
        jBtn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new Font("SansSerif", 3, 24));
        jBtn7.setText("7");
        jBtn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new Font("SansSerif", 3, 24));
        jBtn8.setText("8");
        jBtn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtnResta.setFont(new Font("SansSerif", 3, 24));
        jBtnResta.setText("-");
        jBtnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnRestaActionPerformed(evt);
            }
        });

        jBtn4.setFont(new Font("SansSerif", 3, 24));
        jBtn4.setText("4");
        jBtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new Font("SansSerif", 3, 24));
        jBtn5.setText("5");
        jBtn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new Font("SansSerif", 3, 24));
        jBtn6.setText("6");
        jBtn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtnMulti.setFont(new Font("SansSerif", 3, 24));
        jBtnMulti.setText("*");
        jBtnMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnMultiActionPerformed(evt);
            }
        });

        jBtn1.setFont(new Font("SansSerif", 3, 24));
        jBtn1.setText("1");
        jBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new Font("SansSerif", 3, 24));
        jBtn2.setText("2");
        jBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new Font("SansSerif", 3, 24));
        jBtn3.setText("3");
        jBtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnDiv.setFont(new Font("SansSerif", 3, 24));
        jBtnDiv.setText("/");
        jBtnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnDivActionPerformed(evt);
            }
        });

        jBtn0.setFont(new Font("SansSerif", 3, 24));
        jBtn0.setText("0");
        jBtn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnPunto.setFont(new Font("SansSerif", 3, 24));
        jBtnPunto.setText(".");
        jBtnPunto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnPuntoActionPerformed(evt);
            }
        });

        jBtnMasMenos.setFont(new Font("SansSerif", 3, 24));
        jBtnMasMenos.setText("±");
        jBtnMasMenos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnMasMenosActionPerformed(evt);
            }
        });

        jBtnIgual.setFont(new Font("SansSerif", 3, 24));
        jBtnIgual.setText("=");
        jBtnIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnIgualActionPerformed(evt);
            }
        });

        jBtnBackSpace.setFont(new Font("SansSerif", 3, 24));
        jBtnBackSpace.setText("←");
        jBtnBackSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnBackSpaceActionPerformed(evt);
            }
        });

        jBtnClear.setFont(new Font("SansSerif", 3, 24));
        jBtnClear.setText("C");
        jBtnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnCA.setFont(new Font("SansSerif", 3, 24));
        jBtnCA.setText("CA");
        jBtnCA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCAActionPerformed(evt);
            }
        });

        jBtnSuma.setFont(new Font("SansSerif", 3, 24));
        jBtnSuma.setText("+");
        jBtnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnSumaActionPerformed(evt);
            }
        });

        jBtnSinh.setFont(new Font("SansSerif", 3, 24));
        jBtnSinh.setText("Sinh");
        jBtnSinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnSinhActionPerformed(evt);
            }
        });

        jBtnSin.setFont(new Font("SansSerif", 3, 24));
        jBtnSin.setText("Sin");
        jBtnSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnSinActionPerformed(evt);
            }
        });

        jBtnLog.setFont(new Font("SansSerif", 3, 24));
        jBtnLog.setText("Log");
        jBtnLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnLogActionPerformed(evt);
            }
        });

        jBtnPi.setFont(new Font("SansSerif", 3, 24));
        jBtnPi.setText("Pi");
        jBtnPi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnPiActionPerformed(evt);
            }
        });

        jBtnCos.setFont(new Font("SansSerif", 3, 24));
        jBtnCos.setText("Cos");
        jBtnCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCosActionPerformed(evt);
            }
        });

        jBtnCosh.setFont(new Font("SansSerif", 3, 24));
        jBtnCosh.setText("Cosh");
        jBtnCosh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCoshActionPerformed(evt);
            }
        });

        jBtnTanh.setFont(new Font("SansSerif", 3, 24));
        jBtnTanh.setText("Tanh");
        jBtnTanh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnTanhActionPerformed(evt);
            }
        });

        jBtnTan.setFont(new Font("SansSerif", 3, 24));
        jBtnTan.setText("Tan");
        jBtnTan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnTanActionPerformed(evt);
            }
        });

        jBtnSqrt.setFont(new Font("SansSerif", 3, 24));
        jBtnSqrt.setText("2√x");
        jBtnSqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnSqrtActionPerformed(evt);
            }
        });

        jBtnPower2.setFont(new Font("SansSerif", 3, 24));
        jBtnPower2.setText("x^2");
        jBtnPower2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnPower2ActionPerformed(evt);
            }
        });

        jBtnLn.setFont(new Font("SansSerif", 3, 24));
        jBtnLn.setText("Ln");
        jBtnLn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnLnActionPerformed(evt);
            }
        });

        jBtnRund.setFont(new Font("SansSerif", 3, 24));
        jBtnRund.setText("Rund");
        jBtnRund.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnRundActionPerformed(evt);
            }
        });

        jBtnPower3.setFont(new Font("SansSerif", 3, 24));
        jBtnPower3.setText("x^3");
        jBtnPower3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnPower3ActionPerformed(evt);
            }
        });

        jBtnBin.setFont(new Font("SansSerif", 3, 24));
        jBtnBin.setText("Bin");
        jBtnBin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnBinActionPerformed(evt);
            }
        });

        jBtnHex.setFont(new Font("SansSerif", 3, 24));
        jBtnHex.setText("Hex");
        jBtnHex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnHexActionPerformed(evt);
            }
        });

        jBtnSinh1.setFont(new Font("SansSerif", 3, 24));
        jBtnSinh1.setText("Mod");
        jBtnSinh1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnSinh1ActionPerformed(evt);
            }
        });

        jBtnAnswer.setFont(new Font("SansSerif", 3, 24));
        jBtnAnswer.setText("Ans");
        jBtnAnswer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnAnswerActionPerformed(evt);
            }
        });

        jBtnFactorial.setFont(new Font("SansSerif", 3, 24));
        jBtnFactorial.setText("x!");
        jBtnFactorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnFactorialActionPerformed(evt);
            }
        });

        jBtnPower.setFont(new Font("SansSerif", 3, 24));
        jBtnPower.setText("x^y");
        jBtnPower.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnPowerActionPerformed(evt);
            }
        });

        jBtnOctal.setFont(new Font("SansSerif", 3, 24));
        jBtnOctal.setText("Octal");
        jBtnOctal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnOctalActionPerformed(evt);
            }
        });

        jBtnCubica.setFont(new Font("SansSerif", 3, 24));
        jBtnCubica.setText("3√x");
        jBtnCubica.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCubicaActionPerformed(evt);
            }
        });

        jBtnA.setFont(new Font("SansSerif", 3, 24));
        jBtnA.setText("a");
        jBtnA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnAActionPerformed(evt);
            }
        });

        jBtnB.setFont(new Font("SansSerif", 3, 24));
        jBtnB.setText("b");
        jBtnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnBActionPerformed(evt);
            }
        });

        jBtnC.setFont(new Font("SansSerif", 3, 24));
        jBtnC.setText("c");
        jBtnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnCActionPerformed(evt);
            }
        });

        jBtnResolv.setFont(new Font("SansSerif", 3, 24));
        jBtnResolv.setText("Resol");
        jBtnResolv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jBtnResolvActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBtn7,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtn8,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtn9,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnResta,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnPi,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnCos,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnCosh,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBtn0,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnPunto,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnMasMenos,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnIgual,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnPower3,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnBin,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnHex,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBtnBackSpace,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnClear,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnCA,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnSuma,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnLog,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnSin,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnSinh,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jBtn4,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        70,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBtn5,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        70,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBtn6,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        70,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBtnMulti,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        70,
                                                                                        GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jBtn1,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        70,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBtn2,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        70,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBtn3,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        70,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBtnDiv,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        70,
                                                                                        GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jBtnPower2,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        100,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBtnLn,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        100,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBtnRund,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        100,
                                                                                        GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jBtnSqrt,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        100,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBtnTan,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        100,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jBtnTanh,
                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                        100,
                                                                                        GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBtnAnswer,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnA,
                                                                        GroupLayout.PREFERRED_SIZE, 98,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBtnOctal,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnResolv,
                                                                        GroupLayout.PREFERRED_SIZE, 98,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBtnSinh1,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBtnCubica,
                                                                        GroupLayout.PREFERRED_SIZE, 100,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jBtnPower,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jBtnFactorial,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jBtnC,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                98,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jBtnB,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(jTxtDisplay, GroupLayout.PREFERRED_SIZE, 718,
                                                        GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTxtDisplay, GroupLayout.PREFERRED_SIZE, 62,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jBtnSinh1, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnCubica,
                                                                GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jBtnAnswer,
                                                                GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnA, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBtnFactorial,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jBtnPower,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBtnB,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jBtnC,
                                                                        GroupLayout.PREFERRED_SIZE, 70,
                                                                        GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jBtnOctal, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnResolv,
                                                                GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jBtnBackSpace,
                                                                GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnClear, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnCA, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnSuma, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnSinh, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnSin, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnLog, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jBtn7, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn8, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn9, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnResta, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnCosh, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnCos, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnPi, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jBtn4, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn5, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn6, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnMulti, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnTanh, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnTan, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnSqrt, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jBtn1, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn2, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtn3, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnDiv, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnRund, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnLn, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnPower2,
                                                                GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jBtn0, GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnPunto, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnMasMenos,
                                                                GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnIgual, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnHex, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnBin, GroupLayout.PREFERRED_SIZE,
                                                                70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBtnPower3,
                                                                GroupLayout.PREFERRED_SIZE, 70,
                                                                GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(34, Short.MAX_VALUE)));
        pack();
    }

    private void jBtn9ActionPerformed(ActionEvent evt) {
        String iNum = jTxtDisplay.getText() + jBtn9.getText();
        jTxtDisplay.setText(iNum);
    }

    private void jBtn7ActionPerformed(ActionEvent evt) {
        String iNum = jTxtDisplay.getText() + jBtn7.getText();
        jTxtDisplay.setText(iNum);
    }

    private void jBtn8ActionPerformed(ActionEvent evt) {
        String iNum = jTxtDisplay.getText() + jBtn8.getText();
        jTxtDisplay.setText(iNum);
    }

    private void jBtnRestaActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText(null);
        operation = "-";
    }

    private void jBtn4ActionPerformed(ActionEvent evt) {
        String iNum = jTxtDisplay.getText() + jBtn4.getText();
        jTxtDisplay.setText(iNum);
    }

    private void jBtn5ActionPerformed(ActionEvent evt) {
        String iNum = jTxtDisplay.getText() + jBtn5.getText();
        jTxtDisplay.setText(iNum);
    }

    private void jBtn6ActionPerformed(ActionEvent evt) {
        String iNum = jTxtDisplay.getText() + jBtn6.getText();
        jTxtDisplay.setText(iNum);
    }

    private void jBtnMultiActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText(null);
        operation = "*";
    }

    private void jBtn1ActionPerformed(ActionEvent evt) {
        String iNum = jTxtDisplay.getText() + jBtn1.getText();
        jTxtDisplay.setText(iNum);
    }

    private void jBtn2ActionPerformed(ActionEvent evt) {
        String iNum = jTxtDisplay.getText() + jBtn2.getText();
        jTxtDisplay.setText(iNum);
    }

    private void jBtn3ActionPerformed(ActionEvent evt) {
        String iNum = jTxtDisplay.getText() + jBtn3.getText();
        jTxtDisplay.setText(iNum);
    }

    private void jBtnDivActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText(null);
        operation = "/";
    }

    private void jBtn0ActionPerformed(ActionEvent evt) {
        String iNum = jTxtDisplay.getText() + jBtn0.getText();
        jTxtDisplay.setText(iNum);
    }

    private void jBtnPuntoActionPerformed(ActionEvent evt) {
        if (!jTxtDisplay.getText().contains(".")) {
            jTxtDisplay.setText(jTxtDisplay.getText() + jBtnPunto.getText());
        }
    }

    private void jBtnMasMenosActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = ops * (-1);
        jTxtDisplay.setText(String.valueOf(ops));
    }

    private void jBtnIgualActionPerformed(ActionEvent evt) {
        secondNum = Double.parseDouble(jTxtDisplay.getText());
        if (operation == "+") {
            result = firstNum + secondNum;
            answer = String.format("%.2f", result);
            jTxtDisplay.setText(answer);
        } else if (operation == "-") {
            result = firstNum - secondNum;
            answer = String.format("%.2f", result);
            jTxtDisplay.setText(answer);
        } else if (operation == "*") {
            result = firstNum * secondNum;
            answer = String.format("%.2f", result);
            jTxtDisplay.setText(answer);
        } else if (operation == "/") {
            result = firstNum / secondNum;
            answer = String.format("%.2f", result);
            jTxtDisplay.setText(answer);
        } else if (operation == "%") {
            result = firstNum % secondNum;
            answer = String.format("%.2f", result);
            jTxtDisplay.setText(answer);
        } else if (operation == "^") {
            result = Math.pow(firstNum, secondNum);
            answer = String.format("%.2f", result);
            jTxtDisplay.setText(answer);
        }
        firstNum = result;
        memory = result;
        operation = "";
    }

    private void formWindowActivated(WindowEvent evt) {
        this.setResizable(false);
    }

    private void jBtnBackSpaceActionPerformed(ActionEvent evt) {
        String bsp = null;
        if (jTxtDisplay.getText().length() > 0) {
            StringBuilder strB = new StringBuilder(jTxtDisplay.getText());
            strB.deleteCharAt(jTxtDisplay.getText().length() - 1);
            bsp = strB.toString();
            jTxtDisplay.setText(bsp);
        }
    }

    private void jBtnClearActionPerformed(ActionEvent evt) {
        jTxtDisplay.setText("");
    }

    private void jBtnCAActionPerformed(ActionEvent evt) {
        jTxtDisplay.setText("");
        firstNum = 0;
        secondNum = 0;
        result = 0;
        memory = 0;
        operation = "";
    }

    private void jBtnSumaActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText(null);
        operation = "+";
    }

    private void jTxtDisplayActionPerformed(ActionEvent evt) {

    }

    private void jBtnSinhActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.toRadians(ops);
        ops = Math.sinh(ops);
        answer = String.format("%.2f", ops);
        jTxtDisplay.setText(answer);
    }

    private void jBtnSinActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.toRadians(ops);
        ops = Math.sin(ops);
        answer = String.format("%.2f", ops);
        jTxtDisplay.setText(answer);
    }

    private void jBtnLogActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.log10(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }

    private void jBtnPiActionPerformed(ActionEvent evt) {
        double ops = Math.PI;
        jTxtDisplay.setText(String.valueOf(ops));
    }

    private void jBtnCosActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.toRadians(ops);
        ops = Math.cos(ops);
        answer = String.format("%.2f", ops);
        jTxtDisplay.setText(answer);
    }

    private void jBtnCoshActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.toRadians(ops);
        ops = Math.cosh(ops);
        answer = String.format("%.2f", ops);
        jTxtDisplay.setText(answer);
    }

    private void jBtnTanhActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.toRadians(ops);
        ops = Math.tanh(ops);
        answer = String.format("%.2f", ops);
        jTxtDisplay.setText(answer);
    }

    private void jBtnTanActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.toRadians(ops);
        ops = Math.tan(ops);
        answer = String.format("%.2f", ops);
        jTxtDisplay.setText(answer);
    }

    private void jBtnSqrtActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.sqrt(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }

    private void jBtnPower2ActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.pow(ops, 2.0);
        jTxtDisplay.setText(String.valueOf(ops));
    }

    private void jBtnLnActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.log(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }

    private void jBtnRundActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        long a = Math.round(ops);
        jTxtDisplay.setText(String.valueOf(a));
    }

    private void jBtnPower3ActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.pow(ops, 3.0);
        jTxtDisplay.setText(String.valueOf(ops));
    }

    private void jBtnBinActionPerformed(ActionEvent evt) {
        int a = Integer.parseInt(jTxtDisplay.getText());
        jTxtDisplay.setText(Integer.toString(a, 2));
    }

    private void jBtnHexActionPerformed(ActionEvent evt) {
        int a = Integer.parseInt(jTxtDisplay.getText());
        jTxtDisplay.setText(Integer.toString(a, 16));
    }

    private void jTxtDisplayKeyTyped(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }

    private void jBtnSinh1ActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText(null);
        operation = "%";
    }

    private void jBtnAnswerActionPerformed(ActionEvent evt) {
        jTxtDisplay.setText(String.valueOf(memory));
    }

    private void jBtnFactorialActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        result = 1.0;
        while (ops > 1) {
            result = result * ops;
            ops--;
        }
        jTxtDisplay.setText(String.valueOf(result));
    }

    private void jBtnPowerActionPerformed(ActionEvent evt) {
        firstNum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText(null);
        operation = "^";
    }

    private void jBtnOctalActionPerformed(ActionEvent evt) {
        int a = Integer.parseInt(jTxtDisplay.getText());
        jTxtDisplay.setText(Integer.toString(a, 8));
    }

    private void jBtnCubicaActionPerformed(ActionEvent evt) {
        double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        ops = Math.cbrt(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }

    private void jBtnAActionPerformed(ActionEvent evt) {
        numA = Double.parseDouble(jTxtDisplay.getText());
        seteado[0] = true;
        jTxtDisplay.setText(null);
    }

    private void jBtnBActionPerformed(ActionEvent evt) {
        numB = Double.parseDouble(jTxtDisplay.getText());
        seteado[1] = true;
        jTxtDisplay.setText(null);
    }

    private void jBtnCActionPerformed(ActionEvent evt) {
        numC = Double.parseDouble(jTxtDisplay.getText());
        seteado[2] = true;
        jTxtDisplay.setText(null);
    }

    private void jBtnResolvActionPerformed(ActionEvent evt) {
        double radicando, x1, x2;
        if (seteado[0] && seteado[1] && seteado[2]) {
            if (numA == 0.0) {
                jTxtDisplay.setText("Ecuacion no cuadratica");
            } else {
                radicando = Math.sqrt((Math.pow(numB, 2.0)) - (4.0 * numA * numC));
                x1 = ((-numB) + radicando) / (2 * numA);
                x2 = ((-numB) - radicando) / (2 * numA);
                jTxtDisplay.setText(String.valueOf(x1) + " " + String.valueOf(x2));
            }
        } else {
            jTxtDisplay.setText("Falta setear variables");
        }
        for (int i = 0; i < 2; i++) {
            seteado[i] = false;
        }
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scientific_Cal().setVisible(true);
            }
        });
    }

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
    private JButton jBtnAnswer;
    private JButton jBtnB;
    private JButton jBtnBackSpace;
    private JButton jBtnBin;
    private JButton jBtnC;
    private JButton jBtnCA;
    private JButton jBtnClear;
    private JButton jBtnCos;
    private JButton jBtnCosh;
    private JButton jBtnCubica;
    private JButton jBtnDiv;
    private JButton jBtnFactorial;
    private JButton jBtnHex;
    private JButton jBtnIgual;
    private JButton jBtnLn;
    private JButton jBtnLog;
    private JButton jBtnMasMenos;
    private JButton jBtnMulti;
    private JButton jBtnOctal;
    private JButton jBtnPi;
    private JButton jBtnPower;
    private JButton jBtnPower2;
    private JButton jBtnPower3;
    private JButton jBtnPunto;
    private JButton jBtnResolv;
    private JButton jBtnResta;
    private JButton jBtnRund;
    private JButton jBtnSin;
    private JButton jBtnSinh;
    private JButton jBtnSinh1;
    private JButton jBtnSqrt;
    private JButton jBtnSuma;
    private JButton jBtnTan;
    private JButton jBtnTanh;
    private JTextField jTxtDisplay;
}
