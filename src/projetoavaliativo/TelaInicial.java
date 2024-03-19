/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetoavaliativo;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class TelaInicial extends javax.swing.JFrame {

    double numero1, numero2;
    String sinal;
    double num2;

    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResult = new javax.swing.JTextField();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnVezes = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txtResult.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });
        txtResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtResultKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultKeyTyped(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 204, 204));
        btn9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 204, 204));
        btn8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 204, 204));
        btn7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnMais.setBackground(new java.awt.Color(204, 204, 255));
        btnMais.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnMais.setText("+");
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(204, 204, 255));
        btnMenos.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 204, 204));
        btn4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 204, 204));
        btn5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 204, 204));
        btn6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 204, 204));
        btn3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 204, 204));
        btn2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btnVezes.setBackground(new java.awt.Color(204, 204, 255));
        btnVezes.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnVezes.setText("*");
        btnVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVezesActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 204, 204));
        btn0.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPonto.setBackground(new java.awt.Color(204, 204, 255));
        btnPonto.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnPonto.setText(".");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnDivisao.setBackground(new java.awt.Color(204, 204, 255));
        btnDivisao.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(204, 204, 255));
        btnIgual.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(204, 204, 255));
        btnLimpar.setText("CE");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 204, 204));
        btn1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVezes, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtResult)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIgual)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public int LimitePonto() {
        int limite = 0;
        if (txtResult.getText().contains(".")) {
            limite++;
        }
        return limite;
    }

    public void InserirTela(String n) {
        String nums = txtResult.getText() + n;
        txtResult.setText(nums);
    }

    public double Negativa(double valor) {
        double aux;
        double teste;

        aux = valor;
        teste = (valor - valor) - aux;
        return teste;
    }

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        InserirTela("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        InserirTela("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        InserirTela("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        numero1 = Double.parseDouble(txtResult.getText());
        txtResult.setText("");
        sinal = "+";
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        switch (txtResult.getText()) {
            case "" ->
                txtResult.setText("-");
            case "-" ->
                sinal = "-";
            default -> {
                numero1 = Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                sinal = "-";
            }
        }

    }//GEN-LAST:event_btnMenosActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        InserirTela("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        InserirTela("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        InserirTela("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        InserirTela("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        InserirTela("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVezesActionPerformed
        numero1 = Double.parseDouble(txtResult.getText());
        txtResult.setText("");
        sinal = "*";
    }//GEN-LAST:event_btnVezesActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        InserirTela("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        int cont = LimitePonto();
        if (cont < 1) {
            InserirTela(".");
        } else {
            return;
        }
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        numero1 = Double.parseDouble(txtResult.getText());
        txtResult.setText("");
        sinal = "/";
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        numero2 = Double.parseDouble(txtResult.getText());
        try {
            switch (sinal) {
                case "+":
                    Soma soma = new Soma();
                    txtResult.setText(Double.toString(soma.Operacao(numero1, numero2)));
                    break;

                case "-":
                    Ioperacoes subtracao = new Subtracao();
                    txtResult.setText(Double.toString(subtracao.Operacao(numero1, numero2)));
                    break;

                case "*":
                    Multiplicacao multiplicacao = new Multiplicacao();
                    txtResult.setText(Double.toString(multiplicacao.Operacao(numero1, numero2)));
                    break;

                case "/":
                    Divisao divisao = new Divisao();
                    txtResult.setText(Double.toString(divisao.Operacao(numero1, numero2)));
                    break;
            }
        } 
        catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(this, "Erro: " +erro.getMessage());
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        InserirTela("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        numero1 = 0;
        numero2 = 0;
        txtResult.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed

    }//GEN-LAST:event_txtResultActionPerformed

    private void txtResultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultKeyPressed

    private void txtResultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtResultKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnVezes;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
