/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {
        
    
    private String StartG="X";
    private int xcount =0;
    private int ycount=0;
    public Tic_Tac_Toe() {
        initComponents();
    }
    private void gameScore()
    {
        pla1.setText(String.valueOf(xcount));
        pla2.setText(String.valueOf(ycount));
    }
    private void choose_pla()
    {
        if(StartG.equalsIgnoreCase("X"))
        {
            StartG ="O";
        }
        else
        {
            StartG="X";
        }
    }
    private void WinningGame()
    {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        if(b1==("X") && b2 ==("X") && b3 ==("X"))
        {
            xcount++;
            gameScore();
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
        if(b1==("O") && b2 ==("O") && b3 ==("O"))
        {
            ycount++;
            gameScore();
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         if(b4==("X") && b5 ==("X") && b6 ==("X"))
        {
            xcount++;
            gameScore();
            btn4.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn6.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
         if(b4==("O") && b5 ==("O") && b6 ==("O"))
        {
            ycount++;
            gameScore();
            btn4.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn6.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
          if(b7==("X") && b8 ==("X") && b9 ==("X"))
        {
            xcount++;
            gameScore();
            btn7.setBackground(Color.ORANGE);
            btn8.setBackground(Color.ORANGE);
            btn9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
          if(b7==("O") && b8 ==("O") && b9 ==("O"))
        {
            ycount++;
            gameScore();
            btn7.setBackground(Color.ORANGE);
            btn8.setBackground(Color.ORANGE);
            btn9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
           if(b1==("X") && b4 ==("X") && b7 ==("X"))
        {
            xcount++;
            gameScore();
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
           if(b1==("O") && b4 ==("O") && b7 ==("O"))
        {
            ycount++;
            gameScore();
            btn1.setBackground(Color.ORANGE);
            btn4.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
            if(b2==("X") && b5 ==("X") && b8 ==("X"))
        {
            xcount++;
            gameScore();
            btn2.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn8.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
            if(b2==("O") && b5 ==("O") && b8 ==("O"))
        {
            ycount++;
            gameScore();
            btn2.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn8.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
             if(b3==("X") && b6 ==("X") && b9 ==("X"))
        {
            xcount++;
            gameScore();
            btn3.setBackground(Color.ORANGE);
            btn6.setBackground(Color.ORANGE);
            btn9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
           if(b3==("O") && b6 ==("O") && b9 ==("O"))
        {
            ycount++;
            gameScore();
            btn3.setBackground(Color.ORANGE);
            btn6.setBackground(Color.ORANGE);
            btn9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        } 
            if(b1==("X") && b5 ==("X") && b9 ==("X"))
        {
            xcount++;
            gameScore();
            btn1.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
            if(b1==("O") && b5 ==("O") && b9 ==("O"))
        {
            ycount++;
            gameScore();
            btn1.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
             if(b3==("X") && b5 ==("X") && b7 ==("X"))
        {
            xcount++;
            gameScore();
            btn3.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
              if(b3==("O") && b5 ==("O") && b7 ==("O"))
        {
            ycount++;
            gameScore();
            btn3.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnex = new javax.swing.JButton();
        btnrst = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pla1 = new javax.swing.JTextField();
        pla2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Tic Tac Toe ");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnex.setBackground(new java.awt.Color(204, 102, 255));
        btnex.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnex.setText("Exit");
        btnex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexActionPerformed(evt);
            }
        });

        btnrst.setBackground(new java.awt.Color(255, 0, 51));
        btnrst.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnrst.setText("Reset");
        btnrst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrstActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Player 1   :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Player 2   :");

        pla1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pla1.setForeground(new java.awt.Color(51, 0, 255));
        pla1.setText("xxxxxxxxxxxxxxxxx");

        pla2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pla2.setForeground(new java.awt.Color(0, 0, 255));
        pla2.setText("xxxxxxxxxxxxxxxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pla1)
                    .addComponent(pla2))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pla1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pla2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnrst, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnex, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnrst, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnex, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnexActionPerformed

    private void btnrstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrstActionPerformed
        // TODO add your handling code here:
        btn1.setText(" ");
        btn1.setEnabled(true);
        btn1.setBackground(Color.WHITE);
        
        btn2.setText(" ");
        btn2.setEnabled(true);
        btn2.setBackground(Color.WHITE);
        
        btn3.setText(" ");
        btn3.setEnabled(true);
        btn3.setBackground(Color.WHITE);
        
        btn4.setText(" ");
        btn4.setEnabled(true);
        btn4.setBackground(Color.WHITE);
        
        btn5.setText(" ");
        btn5.setEnabled(true);
        btn5.setBackground(Color.WHITE);
        
        btn6.setText(" ");
        btn6.setEnabled(true);
        btn6.setBackground(Color.WHITE);
        
        btn7.setText(" ");
        btn7.setEnabled(true);
        btn7.setBackground(Color.WHITE);
        
        btn8.setText(" ");
        btn8.setEnabled(true);
        btn8.setBackground(Color.WHITE);
        
        btn9.setText(" ");
        btn9.setEnabled(true);
        btn9.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnrstActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
         btn1.setText(StartG);
          if(StartG.equalsIgnoreCase("X"))
        {
              btn1.setForeground(Color.RED);
        }
        else
        {
            btn1.setForeground(Color.MAGENTA);
        }
          choose_pla();
          WinningGame();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(StartG);
          if(StartG.equalsIgnoreCase("X"))
        {
            btn2.setForeground(Color.RED);
        }
        else
        {
            btn2.setForeground(Color.MAGENTA);
        }
          choose_pla();
          WinningGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        btn3.setText(StartG);
          if(StartG.equalsIgnoreCase("X"))
        {
            btn3.setForeground(Color.RED);
        }
        else
        {
            btn3.setForeground(Color.MAGENTA);
        }
          choose_pla();
          WinningGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btn4.setText(StartG);
          if(StartG.equalsIgnoreCase("X"))
        {
            btn4.setForeground(Color.RED);
        }
        else
        {
            btn4.setForeground(Color.MAGENTA);
        }
          choose_pla();
          WinningGame();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        btn5.setText(StartG);
          if(StartG.equalsIgnoreCase("X"))
        {
            btn5.setForeground(Color.RED);
        }
        else
        {
            btn5.setForeground(Color.MAGENTA);
        }
          choose_pla();
          WinningGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        btn6.setText(StartG);
          if(StartG.equalsIgnoreCase("X"))
        {
            btn6.setForeground(Color.RED);
        }
        else
        {
            btn6.setForeground(Color.MAGENTA);
        }
          choose_pla();
          WinningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btn7.setText(StartG);
          if(StartG.equalsIgnoreCase("X"))
        {
            btn7.setForeground(Color.RED);
        }
        else
        {
            btn7.setForeground(Color.MAGENTA);
        }
          choose_pla();
          WinningGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btn8.setText(StartG);
          if(StartG.equalsIgnoreCase("X"))
        {
            btn8.setForeground(Color.RED);
        }
        else
        {
            btn8.setForeground(Color.MAGENTA);
        }
          choose_pla();
          WinningGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btn9.setText(StartG);
          if(StartG.equalsIgnoreCase("X"))
        {
            btn9.setForeground(Color.RED);
        }
        else
        {
            btn9.setForeground(Color.MAGENTA);
        }
          choose_pla();
          WinningGame();
    }//GEN-LAST:event_btn9ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnex;
    private javax.swing.JButton btnrst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pla1;
    private javax.swing.JTextField pla2;
    // End of variables declaration//GEN-END:variables
}
