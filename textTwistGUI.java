// Starter Template 
// import(s) at top of program b4 class line

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class textTwistGUI extends JFrame implements ActionListener{ 
  //Variable and GUIObject Declaration area 
  JLabel[]l,l2,l3,l4,l5,l11;
  JLabel l6,l7,l8,l9,l10;
  JButton[] b1;
  ImageIcon[] icon;

  JFrame frame1=new JFrame();
  public static void main(String[ ] args) 
  {
 new textTwistGUI ();
  }  
  
  public textTwistGUI (){
    //Create object and your code goes here
    this.setLayout(null);
    
    icon= new ImageIcon[8];
    
    icon[0] = new ImageIcon("Logo.png");
    icon[1] = new ImageIcon("B.png");
    icon[2] = new ImageIcon("O.png");
    icon[3] = new ImageIcon("D.png");
    icon[4] = new ImageIcon("E.png");
    icon[5] = new ImageIcon("ball.png");
    icon[6] = new ImageIcon("H.png");
    icon[7] = new ImageIcon("T.png");
    
    l= new JLabel[36];
    l2= new JLabel[24];
    l3=new JLabel[6];
    b1=new JButton[4];
    l4=new JLabel[4];
    l5=new JLabel[6];
    l11=new JLabel[6];

    for (int y=0; y<12;y++){
    for (int x=0; x<3;x++){
      l[(x*y)]=new JLabel("");
      l[(x*y)].setBorder(BorderFactory.createMatteBorder(1,1,1,1,(new Color(133,160,169))));
      l[(x*y)].setBounds(14+(15*x),29+(18*y),13,16);
      l[(x*y)].setBackground(new Color(255,255,255));
      this.add(l[(x*y)]);
      l[(x*y)].setOpaque(true);   
    }
    }
    
    for (int y=0; y<6; y++){
      for (int x=0; x<4; x++){
        l2[(x*y)]=new JLabel("");
        l2[(x*y)].setBorder(BorderFactory.createMatteBorder(1,1,1,1,(new Color(133,160,169))));
        l2[(x*y)].setBounds(14+(15*x),246+(18*y),13,16);
        l2[(x*y)].setBackground(new Color(255,255,255));
        this.add(l2[(x*y)]);
        l2[(x*y)].setOpaque(true);
      }    
    }
    
    for (int x=0; x<6; x++){
      l3[x]=new JLabel("");
      l3[x].setBorder(BorderFactory.createMatteBorder(1,1,1,1,(new Color(133,160,169))));
      l3[x].setBounds(14+(15*x),354,13,16);
      l3[x].setBackground(new Color(255,255,255));
      this.add(l3[x]);
      l3[x].setOpaque(true); 
    }
    
    for (int x=0; x<4; x++){
      b1[x]=new JButton("");
      b1[x].setBounds(171+(82*x),241,72,25);
      b1[x].setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
     // b1[x].setBorder(BorderFactory.createMatteBorder(-2,-2,-2,-2,(new Color(231,255,255))));
      b1[x].setBackground(new Color(248,210,71));
      b1[x].setForeground(new Color(231,255,255));
      this.add(b1[x]);
    }
    b1[2].setFont(new Font("Arial", Font.PLAIN, 6));
    b1[0].setText("TWIST");
    b1[1].setText("ENTER");
    b1[2].setText("LAST WORD");
    b1[3].setText("CLEAR");
    
    for (int x=0; x<4; x++){
      l4[x]=new JLabel("");
      l4[x].setBounds(167,282+(28*x),140,22);
      l4[x].setFont(new Font("Jokerman", Font.PLAIN, 20));
      l4[x].setBackground(new Color(90,191,235));
      l4[x].setForeground(new Color(255,255,255));
      this.add(l4[x]);
      l4[x].setOpaque(true);
    }
    l4[0].setText("SCORE");
    l4[1].setText(" 680");
    l4[2].setText("TIME");
    l4[3].setText("  1:01");
    
    for (int x=0; x<6; x++){
      l5[x]=new JLabel("");
      l5[x].setBorder(BorderFactory.createMatteBorder(2,2,2,2,(new Color(255,255,255))));
      l5[x].setBounds(167+(56*x),92,54,53);      
      l5[x].setFont(new Font("Jokerman", Font.PLAIN, 20));
      l5[x].setBackground(new Color(90,191,235));
      l5[x].setForeground(new Color(255,255,255));
      this.add(l5[x]);
      l5[x].setOpaque(true);
      if (x<4){
        l5[x].setIcon(icon[x+1]);
      }
    }    
    
    l6=new JLabel("");
    l6.setIcon(icon[0]);
    l6.setBounds(287,21,210,61);
    l6.setBackground(new Color(90,191,235));
    this.add(l6);
    l6.setOpaque(true);
    
    l7=new JLabel("");
    l7.setBounds(0,0,600,4);
    l7.setBackground(new Color(225,248,77));
    this.add(l7);
    l7.setOpaque(true);
    
    l8=new JLabel("");
    l8.setBounds(513,0,4,600);
    l8.setBackground(new Color(225,248,77));
    this.add(l8);
    l8.setOpaque(true);
    
    l9=new JLabel("");
    l9.setBounds(0,0,4,600);
    l9.setBackground(new Color(225,248,77));
    this.add(l9);
    l9.setOpaque(true);
    
    l10=new JLabel("");
    l10.setBounds(0,392,600,4);
    l10.setBackground(new Color(225,248,77));
    this.add(l10);
    l10.setOpaque(true);
 
    for (int x=0; x<6;x++){
      if (x<4){
        l11[x]=new JLabel("");
        l11[x].setIcon(icon[5]);
        l11[x].setBounds(181+(52*x),190,30,30);
        l11[x].setBackground(new Color(90,191,235));
        this.add(l11[x]);
        l11[x].setOpaque(true);
      }
      else{
        l11[x]=new JLabel("");
        l11[x].setIcon(icon[x+2]);
        l11[x].setBounds(166+(54*x),180,47,47);
        l11[x].setBackground(new Color(90,191,235));
        this.add(l11[x]);
        l11[x].setOpaque(true);
      }
    }   
    
    this.getContentPane().setBackground(new Color(90,191,235));
    this.getRootPane().setBorder(BorderFactory.createMatteBorder(8,11,8,11,(new Color(0,0,0))));
    
    this.setSize(555,450);
    this.setVisible(true);
  } 
  
  public void actionPerformed(ActionEvent e)
  {
    //Most of the 'action' codes will be attached to buttons
    
    //if (e.getSource()==b1)
    {
    }
    //else if (e.getSource()==b2)
    {
    }
  }
}