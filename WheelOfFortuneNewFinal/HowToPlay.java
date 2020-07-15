import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.border.EmptyBorder;

/*
** ISTE 121
** Mini-project: GUI of Fortune 
** Class HowToPlay instructs the user about how to play the game
** @author: Manal Irfan, Ahmed Abdelaziz, Saeed, Reem
** @version: 4/2/2019
*/

public class HowToPlay extends JFrame implements ActionListener
{
    //Components
   //Panels
   private JPanel jpTop = new JPanel();
   private JPanel jpCenter = new JPanel();
   private JPanel jpBottom = new JPanel();
   
    
   //Labels
   private JLabel jl1 = new JLabel();
   private JLabel jl2 = new JLabel("GUI of Fortune");
   private JLabel jlSubTitle = new JLabel("\n How to Play:");
   private JLabel jl3 = new JLabel("\n 1- Select the Difficulty.");
   private JLabel jl4 = new JLabel("\n 2- Enter Player Names.");
   private JLabel jl5 = new JLabel("\n 3- Observe the Hint and Start Guessing.");
   private JLabel jl6 = new JLabel("\n 4- Guess one character at a time.");
   private JLabel jl7 = new JLabel("\n 5- When a character is guessed correctly, a panel will show up. Choose a box to determine the amount of points you will earn.");
   private JLabel jl8 = new JLabel("\n 6- The player will continue guessing characters until they guess a character wrong, then it's the other player's turn to start guessing. ");
   private JLabel jl9 = new JLabel("\n 7- The Players will go head to head until the winner finishes guessing the game.  The winner is the player with more points.");
   private JLabel jl10 = new JLabel("\n 8- Enjoy :)");
   
   //Buttons
   private JButton jb1 = new JButton("Back");
   
   public HowToPlay()
   {
      this.setLayout(new BorderLayout());
      this.setTitle("GUI of Fortune");
      this.setSize(800,600);
      this.setLocationRelativeTo(null);
      
      
      jpTop.setBackground(new Color(25,114,120));
      jl1.setIcon(new ImageIcon("GUIofFortune.png"));
      jpTop.add(jl1);
      
      jpCenter.setBackground(new Color(238,108,77));
      jpCenter.setLayout(new GridLayout(10,1,50,5));
      jpCenter.add(jl2);
      jpCenter.add(jlSubTitle);
      jpCenter.add(jl3);
      jpCenter.add(jl4);
      jpCenter.add(jl5);
      jpCenter.add(jl6);
      jpCenter.add(jl7);
      jpCenter.add(jl8);
      jpCenter.add(jl9);
      jpCenter.add(jl10);
      
      jpBottom.setBackground(new Color(238,108,77));  
      jb1.setSize(150,30);
      jpBottom.add(jb1);
      
      this.add(jpTop, BorderLayout.NORTH);
      this.add(jpCenter , BorderLayout.CENTER);
      this.add(jpBottom , BorderLayout.SOUTH);
      
      jb1.addActionListener(this);
      
     
      

   }
   
   //main method
        public static void main(String[] args)
        {
            HowToPlay x = new HowToPlay();
            x.setVisible(true);
                
        }
       
       
       public void actionPerformed(ActionEvent e)
       {
       
            if(e.getSource() == jb1)
            {
            
               this.setVisible(false);
            
            }
         
       
       }   
   
}