
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufi
 */
public class Számológép extends JFrame implements ActionListener{
    
                                      //attribútumok
    public static int a;
    
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
    
    private JTextField tf1;

    
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;

    private JPanel p10;
    
    
    
   
    public Számológép() throws HeadlessException{
         super("Számológép");  //String title
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
         
         bt1=new JButton("   ");
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
         
         
         tf1=new JTextField(20);
  
 
         
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();

        p10=new JPanel();

         
         GridLayout gr=new GridLayout(3, 1);
         setLayout(gr);
         GridLayout gr2=new GridLayout(4,6);                //a 4es panel saját felosztást kap 3:2 arányban, panelre panelt is létre tudunk hozni
         p3.setLayout(gr2);
         GridLayout gr3=new GridLayout(1,4);
         p2.setLayout(gr3);
         GridLayout gr5=new GridLayout(3,1);
         p10.setLayout(gr5);
         
         
         p1.add(tf1);
         
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
         
         
         p3.add(bt11);
         p3.add(bt12);
         p3.add(bt13);
         p3.add(bt14);
         p3.add(bt15);
         p3.add(bt16);
         
         
         p3.add(bt17);
         p3.add(bt18);
         p3.add(bt19);
         p3.add(bt20);
         p3.add(bt21);
         p3.add(bt22);
         
         p3.add(bt23);
         p3.add(bt24);
         p3.add(bt25);
         p3.add(bt26);
         p3.add(bt27);
         p3.add(bt28);
         
         p10.add(p1);
         p10.add(p2);
         p10.add(p3);

         
         this.add(p1);
         this.add(p10);
         
         bt27.addActionListener(this);
         bt28.addActionListener(this);
         pack();
         
    }
    
    public static void main(String[] args) {
        Számológép l=new Számológép();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==bt27) {               //+
          a+=Integer.parseInt(tf1.getText());
           
        }
       
      if(e.getSource()==bt28) {              //=
          a+=Integer.parseInt(tf1.getText());
          tf1.setText(Integer.toString(a));
      }
    }

    
}