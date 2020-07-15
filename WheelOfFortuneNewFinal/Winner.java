import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class Winner extends JFrame implements ActionListener
{
   private JLabel jl1;
   private JButton jb1;
   private JPanel jpCenter;
   private JPanel top = new JPanel();
   private JPanel bottom = new JPanel();
   JButton jbQuit = new JButton("Quit");
   JButton jbPlayAgain = new JButton("Play Again");
   
   

  
   

   public Winner()
   {
   
      this.setSize(500,400);
      this.setTitle("The winner is...");
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      
     
      top.setBorder(BorderFactory.createEmptyBorder(0,50,50,50));
      
      
      jl1 = new JLabel();
      jpCenter = new JPanel();
      jb1 = new JButton();
      
      jl1.setText("Winner is here");
      jl1.setFont(new Font("Serif", Font.BOLD, 28));
      
      jpCenter.add(jl1);
      
      this.add(jpCenter,BorderLayout.CENTER);
      this.add(top,BorderLayout.NORTH);
      
      jpCenter.setBackground(new Color(238,108,77));
      top.setBackground(new Color(25,114,120));      
      bottom.setBackground(new Color(238,108,77));
      
      bottom.add(jbQuit);
      bottom.add(jbPlayAgain);
      
      this.add(bottom, BorderLayout.SOUTH);
      
      jbQuit.addActionListener(this);
      jbPlayAgain.addActionListener(this);
      

    
  } 
      

   
   public static void main(String[] args)
   {
      int count = 0;
      Winner x = new Winner();
      x.setVisible(true);
 
      
        
   }
   
   public void actionPerformed(ActionEvent e)
   {
   
      if(e.getSource() == jbQuit)
      {
         JOptionPane.showMessageDialog(null,"Thank you for playing");
         System.exit(0);
      
      }else if(e.getSource() == jbPlayAgain)
      {
      
         new MainMenu().setVisible(true);
         this.setVisible(false);
      
      }
      
   
   }
   
   String winName;
   int Points;
   public void setWinner(String winnerName, int pointsWin)
   {
      
      winName = winnerName;
      Points = pointsWin;
      
      jl1.setText("The winner is " + winName + " with " + Points + " points" );
   
   }
   
  

}