import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CasesLevel extends javax.swing.JFrame implements ActionListener
{
   
   JButton jb1 = new JButton("1");
   JButton jb2 = new JButton("2");
   JButton jb3 = new JButton("3");
   JButton jb4 = new JButton("4");
   JButton jb5 = new JButton("5");
   JButton jb6 = new JButton("6");
   JButton jb7 = new JButton("7");
   JButton jb8 = new JButton("8");
   JButton jb9 = new JButton("9");
   JButton jb10 = new JButton("10");
   JButton jb11 = new JButton("11");
   JButton jb12 = new JButton("12");
   JButton jb13 = new JButton("13");
   JButton jb14 = new JButton("14");
   JButton jb15 = new JButton("15");
   JButton jb16 = new JButton("16");
   JButton jb17 = new JButton("17");
   JButton jb18 = new JButton("18");
   JButton jb19 = new JButton("19");
   JButton jb20 = new JButton("20");
   JButton jb21 = new JButton("21");
   JButton jb22 = new JButton("22");
   JButton jb23 = new JButton("23");
   JButton jb24 = new JButton("24");
   JButton jb25 = new JButton("25");
   JButton jb26 = new JButton("26");
   JButton jb27 = new JButton("27");
   JButton jb28 = new JButton("28");
   




   
   
   public CasesLevel()
   {
   
      this.setTitle("Select a case");
      this.setSize(800,600);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
      
      JPanel buttons = new JPanel();
      JPanel top = new JPanel();
      JLabel title = new JLabel("Select a Case");
      title.setFont(new Font("Venus Rising",Font.BOLD,28));
      JLabel side1 = new JLabel();
      JLabel side2 = new JLabel();
      JLabel side3 = new JLabel();
      JPanel east = new JPanel();
      JPanel west = new JPanel();
      JPanel south = new JPanel();
      
      title.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
      side1.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
      side2.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
      side3.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
      
      top.add(title);
      east.add(side1);
      west.add(side2);
      south.add(side3);
      
      this.add(top,BorderLayout.NORTH);
      this.add(east,BorderLayout.EAST);
      this.add(west,BorderLayout.WEST);
      this.add(south,BorderLayout.SOUTH);
      buttons.setBackground(new Color(239,123,69));
      top.setBackground(new Color(216,71,39));
      east.setBackground(new Color(216,71,39));
      west.setBackground(new Color(216,71,39));
      south.setBackground(new Color(216,71,39));
      
      jb1.setBackground(new Color(94,177,191));
      jb2.setBackground(new Color(94,177,191));
      jb3.setBackground(new Color(94,177,191));
      jb4.setBackground(new Color(94,177,191));
      jb5.setBackground(new Color(94,177,191));
      jb6.setBackground(new Color(94,177,191));
      jb7.setBackground(new Color(94,177,191));
      jb8.setBackground(new Color(94,177,191));
      jb9.setBackground(new Color(94,177,191));
      jb10.setBackground(new Color(94,177,191));
      jb11.setBackground(new Color(94,177,191));
      jb12.setBackground(new Color(94,177,191));
      jb13.setBackground(new Color(94,177,191));
      jb14.setBackground(new Color(94,177,191));
      jb15.setBackground(new Color(94,177,191));
      jb16.setBackground(new Color(94,177,191));
      jb17.setBackground(new Color(94,177,191));
      jb18.setBackground(new Color(94,177,191));
      jb19.setBackground(new Color(94,177,191));
      jb20.setBackground(new Color(94,177,191));
      jb21.setBackground(new Color(94,177,191));
      jb22.setBackground(new Color(94,177,191));
      jb23.setBackground(new Color(94,177,191));
      jb24.setBackground(new Color(94,177,191));
      jb25.setBackground(new Color(94,177,191));
      jb26.setBackground(new Color(94,177,191));
      jb27.setBackground(new Color(94,177,191));
      jb28.setBackground(new Color(94,177,191));
      
      jb1.setFocusPainted(false);
      
      buttons.setLayout(new GridLayout(0,7,25,20));
      buttons.add(jb1);
      buttons.add(jb2);
      buttons.add(jb3);
      buttons.add(jb4);
      buttons.add(jb5);
      buttons.add(jb6);
      buttons.add(jb7);
      buttons.add(jb8);
      buttons.add(jb9);
      buttons.add(jb10);
      buttons.add(jb11);
      buttons.add(jb12);
      buttons.add(jb13);
      buttons.add(jb14);
      buttons.add(jb15);
      buttons.add(jb16);
      buttons.add(jb17);
      buttons.add(jb18);
      buttons.add(jb19);
      buttons.add(jb20);
      buttons.add(jb21);
      buttons.add(jb22);
      buttons.add(jb23);
      buttons.add(jb24);
      buttons.add(jb25);
      buttons.add(jb26);
      buttons.add(jb27);
      buttons.add(jb28);
      
      
      
      
      this.add(buttons,BorderLayout.CENTER);
      jb1.addActionListener(this);
      jb2.addActionListener(this);
      jb3.addActionListener(this);
      jb4.addActionListener(this);
      jb5.addActionListener(this);
      jb6.addActionListener(this);
      jb7.addActionListener(this);
      jb8.addActionListener(this);
      jb9.addActionListener(this);
      jb10.addActionListener(this);
      jb11.addActionListener(this);
      jb12.addActionListener(this);
      jb13.addActionListener(this);
      jb14.addActionListener(this);
      jb15.addActionListener(this);
      jb16.addActionListener(this);
      jb17.addActionListener(this);
      jb18.addActionListener(this);
      jb19.addActionListener(this);
      jb20.addActionListener(this);
      jb21.addActionListener(this);
      jb22.addActionListener(this);
      jb23.addActionListener(this);
      jb24.addActionListener(this);
      jb25.addActionListener(this);
      jb26.addActionListener(this);
      jb27.addActionListener(this);
      jb28.addActionListener(this);
      
      this.setLocationRelativeTo(null);
   
   }
   
      
   Scoring cl = new Scoring();
   int returnScore = 250;
   
   public int returnScore()
   {
      
      return returnScore;
      
   }
   
   public void actionPerformed(ActionEvent e)
   {
      int value = 0;
      
      if(e.getSource() == jb1)
      {
         value = cl.Scores();
         jb1.setText(String.valueOf(value));
         returnScore = value;
         jb1.setEnabled(false);
         this.setVisible(false);
         value = 0;
         
      
      }else if(e.getSource() == jb2)
      {
         value = cl.Scores();
         jb2.setText(String.valueOf(value));
         returnScore = value;
         jb2.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb3)
      {
      
         value = cl.Scores();
         jb3.setText(String.valueOf(value));
         returnScore = value;
         jb3.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb4)
      {
      
         value = cl.Scores();
         jb4.setText(String.valueOf(value));
         returnScore = value;
         jb4.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb5)
      {
      
         value = cl.Scores();
         jb5.setText(String.valueOf(value));
         returnScore = value;
         jb5.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb6)
      {
      
         value = cl.Scores();
         jb6.setText(String.valueOf(value));
         returnScore = value;
         jb6.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb7)
      {
      
         value = cl.Scores();
         jb7.setText(String.valueOf(value));
         returnScore = value;
         jb7.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb8)
      {
      
         value = cl.Scores();
         jb8.setText(String.valueOf(value));
         returnScore = value;
         jb8.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb9)
      {
      
         value = cl.Scores();
         jb9.setText(String.valueOf(value));
         returnScore = value;
         jb9.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb10)
      {
      
         value = cl.Scores();
         jb10.setText(String.valueOf(value));
         returnScore = value;
         jb10.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb11)
      {
      
         value = cl.Scores();
         jb11.setText(String.valueOf(value));
         returnScore = value;
         jb11.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb12)
      {
      
         value = cl.Scores();
         jb12.setText(String.valueOf(value));
         returnScore = value;
         jb12.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb13)
      {
      
         value = cl.Scores();
         jb13.setText(String.valueOf(value));
         returnScore = value;
         jb13.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb14)
      {
      
         value = cl.Scores();
         jb14.setText(String.valueOf(value));
         returnScore = value;
         jb14.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb15)
      {
      
         value = cl.Scores();
         jb15.setText(String.valueOf(value));
         returnScore = value;
         jb15.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb16)
      {
      
         value = cl.Scores();
         jb16.setText(String.valueOf(value));
         returnScore = value;
         jb16.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb17)
      {
      
         value = cl.Scores();
         jb17.setText(String.valueOf(value));
         returnScore = value;
         jb17.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb18)
      {
      
         value = cl.Scores();
         jb18.setText(String.valueOf(value));
         returnScore = value;
         jb18.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb19)
      {
      
         value = cl.Scores();
         jb19.setText(String.valueOf(value));
         returnScore = value;
         jb19.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb20)
      {
      
         value = cl.Scores();
         jb20.setText(String.valueOf(value));
         returnScore = value;
         jb20.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb21)
      {
      
         value = cl.Scores();
         jb21.setText(String.valueOf(value));
         returnScore = value;
         jb21.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb22)
      {
      
         value = cl.Scores();
         jb22.setText(String.valueOf(value));
         returnScore = value;
         jb22.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb23)
      {
      
         value = cl.Scores();
         jb23.setText(String.valueOf(value));
         returnScore = value;
         jb23.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb24)
      {
      
         value = cl.Scores();
         jb24.setText(String.valueOf(value));
         returnScore = value;
         jb24.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb25)
      {
      
         value = cl.Scores();
         jb25.setText(String.valueOf(value));
         returnScore = value;
         jb25.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb26)
      {
      
         value = cl.Scores();
         jb26.setText(String.valueOf(value));
         returnScore = value;
         jb26.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb27)
      {
      
         value = cl.Scores();
         jb27.setText(String.valueOf(value));
         returnScore = value;
         jb27.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }else if(e.getSource() == jb28)
      {
      
         value = cl.Scores();
         jb28.setText(String.valueOf(value));
         returnScore = value;
         jb28.setEnabled(false);
         this.setVisible(false);
         value = 0;

      
      }


      
   
   }

   public static void main(String[] args)
   {
   
      CasesLevel x = new CasesLevel();
      x.setVisible(true);
         
   }
   
   
class Scoring
{
   
   public int Scores()
   {
      Random r = new Random();
      int random = r.nextInt((500-50)+1)+50;
      return random;
      
   
   }


}




}