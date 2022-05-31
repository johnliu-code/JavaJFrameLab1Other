/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalab1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author yongjiangliu
 */
public class InscriptionFrame extends JFrame implements ActionListener {
    
    private static JTextField nomField; 
    private static JTextField naisField; 
    private static JTextField prenomField;     
    private static JButton press; 
    
    InscriptionFrame(){
        JFrame frame = new JFrame("Inscription");
        
        frame.setSize(630, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel_ins = new JPanel();
        JPanel panel_nom = new JPanel();
        JPanel panel_nais = new JPanel();
        JPanel panel_prenom = new JPanel();
        JPanel panel_btn = new JPanel();
        
        panel_ins.setBackground(Color.orange);
        panel_ins.setPreferredSize(new Dimension(0, 50));
        panel_nom.setBackground(Color.magenta); 
        panel_nom.setPreferredSize(new Dimension(200, 0));
        panel_nais.setBackground(Color.magenta); 
        panel_nais.setPreferredSize(new Dimension(200, 0));
        panel_prenom.setBackground(Color.magenta); 
        panel_prenom.setPreferredSize(new Dimension(200, 0));
        panel_btn.setBackground(Color.pink); 
        panel_btn.setPreferredSize(new Dimension(0, 80));
        
        JLabel inscription = new JLabel ("Inscription");
        inscription.setForeground(Color.white);
        inscription.setFont(new Font("Arial", Font.BOLD, 30));
        panel_ins.add(inscription);

        JLabel nom = new JLabel ("Nom");
        nom.setForeground(Color.white);
        nom.setFont(new Font("Arial", Font.PLAIN, 12));
        panel_nom.add(nom);
        
        nomField = new JTextField(15);
        panel_nom.add(nomField);
              
        JLabel naissance = new JLabel ("Anne de Naissance");
        naissance.setForeground(Color.white);
        naissance.setFont(new Font("Arial", Font.PLAIN, 12));
        panel_nais.add(naissance);
        
        naisField = new JTextField(15);
        panel_nais.add(naisField);
        
        JLabel prenom = new JLabel ("Prenom");
        prenom.setForeground(Color.white);
        prenom.setFont(new Font("Arial", Font.PLAIN, 12));
        panel_prenom.add(prenom);
        
        prenomField = new JTextField(15);
        panel_prenom.add(prenomField);
        
        panel_btn.setLayout(null);
        
        press = new JButton("PRESS");
        press.setBounds(210, 25, 200, 30);
        press.setForeground(Color.black);
        press.setBackground(Color.gray);
        press.setFont(new Font("Arial", Font.PLAIN, 12));
        panel_btn.add(press);
        
        press.addActionListener(this);
        
        frame.setLayout(new BorderLayout(10,10));
        
        frame.add(panel_ins, BorderLayout.NORTH);
        frame.add(panel_nom, BorderLayout.WEST);
        frame.add(panel_nais, BorderLayout.CENTER);
        frame.add(panel_prenom, BorderLayout.EAST);
        frame.add(panel_btn, BorderLayout.SOUTH);
                                            
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String annenaisance = naisField.getText();
        int age = 2022 -  Integer.parseInt(annenaisance);
        if(e.getSource() == press){
            System.out.println("Nom : " + nomField.getText() + "; Prenom : " + prenomField.getText() + "; Age : " + age);
        }
    }
    
}
