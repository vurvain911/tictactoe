/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 *
 * @author WHITECODER
 */
public class tictactoe extends javax.swing.JFrame {

    
    
    private String start = "X";
    private int xCount = 0;
    private int oCount = 0;

    public tictactoe() {
        initComponents();
    }
    
    
    private void gameScore()
    {
        firstPlayerPoints.setText(String.valueOf(xCount));
        secondPlayerPoints.setText(String.valueOf(oCount));
    }
    
    private void pickPlayer()
    {
        if(start.equalsIgnoreCase("X"))
        {
            start = "O";
        }
        else
        {
            start = "X";
        }
    }
    
    private void gameStatus()
    {
        String b1 = A1.getText();
        String b2 = A2.getText();
        String b3 = A3.getText();
       
        String b4 = B1.getText();
        String b5 = B2.getText();
        String b6 = B3.getText();
        
        String b7 = C1.getText();
        String b8 = C2.getText();
        String b9 = C3.getText();
        
        
        // PLAYER X CODING
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player " + firstPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            A1.setBackground(Color.GREEN);
            A2.setBackground(Color.GREEN);
            A3.setBackground(Color.GREEN);
            
        }
        
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player " + firstPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            B1.setBackground(Color.PINK);
            B2.setBackground(Color.PINK);
            B3.setBackground(Color.PINK);           
        }
         
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player " + firstPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            C1.setBackground(Color.YELLOW);
            C2.setBackground(Color.YELLOW);
            C3.setBackground(Color.YELLOW);           
        }
        
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player " + firstPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            A1.setBackground(Color.ORANGE);
            B1.setBackground(Color.ORANGE);
            C1.setBackground(Color.ORANGE);           
        }
        
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player " + firstPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            A2.setBackground(Color.PINK);
            B2.setBackground(Color.PINK);
            C2.setBackground(Color.PINK);           
        }
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player " + firstPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            A3.setBackground(Color.YELLOW);
            B3.setBackground(Color.YELLOW);
            C3.setBackground(Color.YELLOW);           
        }
        
        
        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player " + firstPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            A1.setBackground(Color.ORANGE);
            B2.setBackground(Color.ORANGE);
            C3.setBackground(Color.ORANGE);           
        }
        
        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player " + firstPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            A3.setBackground(Color.PINK);
            B2.setBackground(Color.PINK);
            C1.setBackground(Color.PINK);           
        }
        
        
        
        // PLAYER O CODING
        
        
        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player " + secondPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            A1.setBackground(Color.ORANGE);
            A2.setBackground(Color.ORANGE);
            A3.setBackground(Color.ORANGE);
            
        }
        
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player " + secondPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            B1.setBackground(Color.PINK);
            B2.setBackground(Color.PINK);
            B3.setBackground(Color.PINK);           
        }
         
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player " + secondPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            C1.setBackground(Color.YELLOW);
            C2.setBackground(Color.YELLOW);
            C3.setBackground(Color.YELLOW);           
        }
        
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player " + firstPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            A1.setBackground(Color.ORANGE);
            B1.setBackground(Color.ORANGE);
            C1.setBackground(Color.ORANGE);           
        }
        
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player " + secondPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            A2.setBackground(Color.PINK);
            B2.setBackground(Color.PINK);
            C2.setBackground(Color.PINK);           
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player " + secondPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            A3.setBackground(Color.YELLOW);
            B3.setBackground(Color.YELLOW);
            C3.setBackground(Color.YELLOW);           
        }
        
        
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player " + secondPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            A1.setBackground(Color.ORANGE);
            B2.setBackground(Color.ORANGE);
            C3.setBackground(Color.ORANGE);           
        }
        
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player " + secondPlayerName.getText() + " wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            A3.setBackground(Color.PINK);
            B2.setBackground(Color.PINK);
            C1.setBackground(Color.PINK);           
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        scoreBoard = new javax.swing.JPanel();
        firstPlayer = new javax.swing.JLabel();
        secondPlayer = new javax.swing.JLabel();
        firstPlayerPoints = new javax.swing.JLabel();
        secondPlayerPoints = new javax.swing.JLabel();
        firstPlayer3 = new javax.swing.JLabel();
        firstPlayer5 = new javax.swing.JLabel();
        firstPlayerName = new javax.swing.JTextField();
        secondPlayerName = new javax.swing.JTextField();
        firstPlayer1 = new javax.swing.JLabel();
        firstPlayer2 = new javax.swing.JLabel();
        Restart = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        Restart1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE GAME");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Title.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("TicTacToe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(258, 258, 258))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addContainerGap())
        );

        A1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        C1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        scoreBoard.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        firstPlayer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstPlayer.setText("X Player");

        secondPlayer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        secondPlayer.setText("O Player");

        firstPlayerPoints.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstPlayerPoints.setText("0");

        secondPlayerPoints.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        secondPlayerPoints.setText("0");

        firstPlayer3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstPlayer3.setText(":");

        firstPlayer5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstPlayer5.setText(":");

        firstPlayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstPlayerNameActionPerformed(evt);
            }
        });

        firstPlayer1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstPlayer1.setText("Score");

        firstPlayer2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firstPlayer2.setText("Score");

        javax.swing.GroupLayout scoreBoardLayout = new javax.swing.GroupLayout(scoreBoard);
        scoreBoard.setLayout(scoreBoardLayout);
        scoreBoardLayout.setHorizontalGroup(
            scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scoreBoardLayout.createSequentialGroup()
                        .addComponent(firstPlayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstPlayerName)
                        .addGap(18, 18, 18)
                        .addComponent(firstPlayer1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(scoreBoardLayout.createSequentialGroup()
                        .addComponent(secondPlayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secondPlayerName)
                        .addGap(18, 18, 18)
                        .addComponent(firstPlayer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstPlayer5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondPlayerPoints)
                    .addComponent(firstPlayerPoints))
                .addGap(32, 32, 32))
        );
        scoreBoardLayout.setVerticalGroup(
            scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreBoardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstPlayer)
                        .addComponent(firstPlayerPoints)
                        .addComponent(firstPlayer3)
                        .addComponent(firstPlayer1)))
                .addGap(40, 40, 40)
                .addGroup(scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondPlayer)
                    .addComponent(secondPlayerPoints)
                    .addComponent(firstPlayer5)
                    .addComponent(secondPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstPlayer2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Restart.setBackground(new java.awt.Color(0, 0, 0));
        Restart.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Restart.setForeground(new java.awt.Color(255, 255, 255));
        Restart.setText("RESTART");
        Restart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Restart.setBorderPainted(false);
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });

        Quit.setBackground(new java.awt.Color(0, 0, 0));
        Quit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Quit.setForeground(new java.awt.Color(255, 255, 255));
        Quit.setText("QUIT");
        Quit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Quit.setBorderPainted(false);
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        Restart1.setBackground(new java.awt.Color(0, 0, 0));
        Restart1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Restart1.setForeground(new java.awt.Color(255, 255, 255));
        Restart1.setText("Write down your names in the empty boxes");
        Restart1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Restart1.setBorderPainted(false);
        Restart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Restart1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Restart, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scoreBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Restart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scoreBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Restart1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Restart, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(A3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(C2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        // TODO add your handling code here:
        
        A1.setText(null);
        A2.setText(null);
        A3.setText(null);
        
        B1.setText(null);
        B2.setText(null);
        B3.setText(null);
        
        C1.setText(null);
        C2.setText(null);
        C3.setText(null);
        
        A1.setBackground(Color.LIGHT_GRAY);
        A2.setBackground(Color.LIGHT_GRAY);
        A3.setBackground(Color.LIGHT_GRAY);
        
        B1.setBackground(Color.LIGHT_GRAY);
        B2.setBackground(Color.LIGHT_GRAY);
        B3.setBackground(Color.LIGHT_GRAY);
        
        C1.setBackground(Color.LIGHT_GRAY);
        C2.setBackground(Color.LIGHT_GRAY);
        C3.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_RestartActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to quit?", 
                "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_QuitActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        
        A1.setText(start);
        
        if(start.equalsIgnoreCase("X"))
        {
           A1.setForeground(Color.BLACK);
        }
        else
        {
            A1.setForeground(Color.DARK_GRAY);
        }
        
        pickPlayer();
        gameStatus();
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        
        A2.setText(start);
        
        if(start.equalsIgnoreCase("X"))
        {
           A2.setForeground(Color.BLACK);
        }
        else
        {
            A2.setForeground(Color.DARK_GRAY);
        }
        
        pickPlayer();
        gameStatus();
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        A3.setText(start);
        
        if(start.equalsIgnoreCase("X"))
        {
           A3.setForeground(Color.BLACK);
        }
        else
        {
            A3.setForeground(Color.DARK_GRAY);
        }
        
        pickPlayer();
        gameStatus();
    }//GEN-LAST:event_A3ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        B1.setText(start);
        
        if(start.equalsIgnoreCase("X"))
        {
           B1.setForeground(Color.BLACK);
        }
        else
        {
            B1.setForeground(Color.DARK_GRAY);
        }
        
        pickPlayer();
        gameStatus();
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        B2.setText(start);
        
        if(start.equalsIgnoreCase("X"))
        {
           B2.setForeground(Color.BLACK);
        }
        else
        {
            B2.setForeground(Color.DARK_GRAY);
        }
        
        pickPlayer();
        gameStatus();
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        B3.setText(start);
        
        if(start.equalsIgnoreCase("X"))
        {
           B3.setForeground(Color.BLACK);
        }
        else
        {
            B3.setForeground(Color.DARK_GRAY);
        }
        
        pickPlayer();
        gameStatus();
    }//GEN-LAST:event_B3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        C3.setText(start);
        
        if(start.equalsIgnoreCase("X"))
        {
           C3.setForeground(Color.BLACK);
        }
        else
        {
            C3.setForeground(Color.DARK_GRAY);
        }
        
        pickPlayer();
        gameStatus();
    }//GEN-LAST:event_C3ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        C2.setText(start);
        
        if(start.equalsIgnoreCase("X"))
        {
           C2.setForeground(Color.BLACK);
        }
        else
        {
            C2.setForeground(Color.DARK_GRAY);
        }
        
        pickPlayer();
        gameStatus();
    }//GEN-LAST:event_C2ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        C1.setText(start);
        
        if(start.equalsIgnoreCase("X"))
        {
           C1.setForeground(Color.BLACK);
        }
        else
        {
            C1.setForeground(Color.DARK_GRAY);
        }
        
        pickPlayer();
        gameStatus();
    }//GEN-LAST:event_C1ActionPerformed

    private void firstPlayerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstPlayerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstPlayerNameActionPerformed

    private void Restart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Restart1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Restart1ActionPerformed

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
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton Quit;
    private javax.swing.JButton Restart;
    private javax.swing.JButton Restart1;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel firstPlayer;
    private javax.swing.JLabel firstPlayer1;
    private javax.swing.JLabel firstPlayer2;
    private javax.swing.JLabel firstPlayer3;
    private javax.swing.JLabel firstPlayer5;
    private javax.swing.JTextField firstPlayerName;
    private javax.swing.JLabel firstPlayerPoints;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel scoreBoard;
    private javax.swing.JLabel secondPlayer;
    private javax.swing.JTextField secondPlayerName;
    private javax.swing.JLabel secondPlayerPoints;
    // End of variables declaration//GEN-END:variables
}
