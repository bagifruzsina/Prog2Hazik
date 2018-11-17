/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat5;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Fufella
 */
public class Számológép extends JFrame implements ActionListener{
    
    public static int a;
    
    private JTextField tf;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private JButton bt8;
    private JButton bt9;
    private JButton bt10;
    private JButton bt11;
    private JButton bt12;
    private JButton bt13;
    private JButton bt14;
    private JButton bt15;
    private JButton bt16;
    private JButton bt17;
    private JButton bt18;
    private JButton bt19;
    private JButton bt20;
    private JButton bt21;
    private JButton bt22;
    private JButton bt23;
    private JButton bt24;
    private JButton bt25;
    private JButton bt26;
    private JButton bt27;
    private JButton bt28;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;
    
    public Számológép() throws HeadlessException {
        super("Számológép");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tf=new JTextField(20);
        bt1=new JButton(" ");
        bt2=new JButton("Backspace");
        bt3=new JButton("CE");
        bt4=new JButton("C");
        bt5=new JButton("MC");
        bt6=new JButton("7");
        bt7=new JButton("8");
        bt8=new JButton("9");
        bt9=new JButton("/");
        bt10=new JButton("sqrt");
        bt11=new JButton("MR");
        bt12=new JButton("4");
        bt13=new JButton("5");
        bt14=new JButton("6");
        bt15=new JButton("*");
        bt16=new JButton("%");
        bt17=new JButton("MS");
        bt18=new JButton("1");
        bt19=new JButton("2");
        bt20=new JButton("3");
        bt21=new JButton("-");
        bt22=new JButton("1/x");
        bt23=new JButton("M+");
        bt24=new JButton("0");
        bt25=new JButton("+/-");
        bt26=new JButton(".");
        bt27=new JButton("+");
        bt28=new JButton("=");
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        p5=new JPanel();
        p6=new JPanel();
        p7=new JPanel();
        
        GridLayout gr=new GridLayout(1,1);
        setLayout(gr);
        GridLayout gr1=new GridLayout(1,1);
        p1.setLayout(gr1);
        GridLayout gr2=new GridLayout(1,4);
        p2.setLayout(gr2);
        GridLayout gr3=new GridLayout(1,6);
        p3.setLayout(gr3);
        GridLayout gr4=new GridLayout(1,6);
        p4.setLayout(gr4);
        GridLayout gr5=new GridLayout(1,6);
        p5.setLayout(gr5);
        GridLayout gr6=new GridLayout(1,6);
        p6.setLayout(gr6);
        GridLayout gr7=new GridLayout(6,1);
        p7.setLayout(gr7);
        
        
        p1.add(tf);
        
        p2.add(bt1);
        p2.add(bt2);
        p2.add(bt3);
        p2.add(bt4);
        
        
        p3.add(bt5);
        p3.add(bt6);
        p3.add(bt7);
        p3.add(bt8);
        p3.add(bt9);
        p3.add(bt10);
        
        p4.add(bt11);
        p4.add(bt12);
        p4.add(bt13);
        p4.add(bt14);
        p4.add(bt15);
        p4.add(bt16);
        
       p5.add(bt17);
       p5.add(bt18);
       p5.add(bt19);
       p5.add(bt20);
       p5.add(bt21);
       p5.add(bt22);
       
       p6.add(bt23);
       p6.add(bt24);
       p6.add(bt25);
       p6.add(bt26);
       p6.add(bt27);
       p6.add(bt28);
        
       p7.add(p1);
       p7.add(p2);
       p7.add(p3);
       p7.add(p4);
       p7.add(p5);
       p7.add(p6);
       
       this.add(p7);
       bt27.addActionListener(this);
       bt28.addActionListener(this);
       
        pack();
    }
    
    public static void main(String[] args) {
        Számológép szg=new Számológép();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==bt27) {
            a+=Integer.parseInt(tf.getText());
        }
        if(e.getSource()==bt28) {
            a+=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(a));
        }
    }
    
    
    
}
