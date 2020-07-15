import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectLevel extends JFrame implements ActionListener 
{
         
      String level;
      JRadioButton jbEasy = new JRadioButton("Easy");
      JRadioButton jbMedium = new JRadioButton("Medium");
      JRadioButton jbHard = new JRadioButton("Hard");
      JButton jbBegin = new JButton("Begin");


      
      public String getLevel()
      {
         if(jbEasy.isSelected())
         {       
            level = "Easy";
            
         }else if(jbHard.isSelected())
         {
            level = "Hard";
         
         }
         
         return level;
         
      
      }
      
      public SelectLevel()
      {
         // Components
         JLabel lbLevel = new JLabel("Select the level of difficulty", JLabel.CENTER);
         JPanel jp1 = new JPanel();
         ButtonGroup bg1 = new ButtonGroup();
         bg1.add(jbEasy);
         bg1.add(jbHard);
         jbEasy.setSelected(true);
         
         lbLevel.setFont(new Font("Serif",Font.BOLD,28));
         jbEasy.setFont(new Font("Courier",Font.PLAIN,20));
         jbMedium.setFont(new Font("Courier",Font.PLAIN,20));
         jbHard.setFont(new Font("Courier",Font.PLAIN,20));
         jbEasy.setOpaque(false);
         jbHard.setOpaque(false);
         this.setLocation(500,200);


         
         //Start Button Panel
         JPanel ButtonPanel = new JPanel();
         ButtonPanel.setLayout(new FlowLayout());
         ButtonPanel.add(jbBegin);
         ButtonPanel.setBackground(new Color(238,108,77));
         ButtonPanel.setPreferredSize(new Dimension(100,75));
         
        
         //Level Panel
         jp1.setLayout(new GridLayout(0,1,30,50));
         jp1.add(lbLevel);
         jp1.add(jbEasy);
         jp1.add(jbHard);
         jp1.setBackground(new Color(25,114,120));
         
         this.setTitle("Select Level");
         this.setSize(600,500);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setLayout(new BorderLayout());
         this.add(jp1);
         this.add(ButtonPanel,BorderLayout.SOUTH);
         jbBegin.addActionListener(this);
                                                 
               
      }
      
      public void actionPerformed(ActionEvent e)
      {
         SelectLevel y = new SelectLevel();
         
          if(e.getSource() == jbBegin && jbEasy.isSelected())
          {
              
            new Level_Easy().setVisible(true);
            this.setVisible(false);
          
          }else if(e.getSource() == jbBegin && jbHard.isSelected())
          {
            new Level_Hard().setVisible(true);
            this.setVisible(false);   
            
          }
      
      }

      public static void main(String[] args)
      {
         
         SelectLevel x = new SelectLevel();
         x.setVisible(true);
      
      }
      
      
   
}