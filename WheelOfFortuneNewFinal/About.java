import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.border.EmptyBorder;

/*
** ISTE 121
** Mini-project: GUI of Fortune 
** Class About informs the user about the programmers's behind the curtains
** @author: Manal Irfan, Ahmed Abdelaziz, Saeed, Reem
** @version: 4/2/2019
*/

public class About extends JFrame implements ActionListener
{
    //Components
   //Panels
   private JPanel jpTop = new JPanel();
   private JPanel jpCenter = new JPanel();
   private JPanel jpBottom = new JPanel();
   
    
   //Labels
   private JLabel jl1 = new JLabel();
   private JLabel jl2 = new JLabel(" ");
   private JLabel jl3 = new JLabel("\n Done by: ");
   private JLabel jl4 = new JLabel(" ");
   private JLabel jl5 = new JLabel(" ");
   private JLabel jl6 = new JLabel("Manal Irfan");
   private JLabel jl7 = new JLabel(" ");
   private JLabel jl8 = new JLabel(" ");
   private JLabel jl9 = new JLabel("Saeed Al Ghafli");
   private JLabel jl10 = new JLabel(" ");
   private JLabel jl11 = new JLabel(" ");
   private JLabel jl12 = new JLabel("Reem Al Mulla");
   private JLabel jl13 = new JLabel(" ");
   private JLabel jl14 = new JLabel(" ");
   private JLabel jl15 = new JLabel("Ahmed Abdelaziz");
   private JLabel jl16 = new JLabel(" ");
   
   //Buttons
   private JButton jb1 = new JButton("Back");
   
   public About()
   {
      this.setLayout(new BorderLayout());
      this.setTitle("GUI of Fortune");
      this.setSize(800,600);
      this.setLocationRelativeTo(null);
      
      
      jpTop.setBackground(new Color(25,114,120));
      jl1.setIcon(new ImageIcon("GUIofFortune.png"));
      jpTop.add(jl1);
      
      jpCenter.setBackground(new Color(238,108,77));
      jpCenter.setLayout(new GridLayout(0,3,50,5));
      
      jl3.setFont(new Font("Modern No. 20",Font.BOLD,20));
      jl6.setFont(new Font("Modern No. 20",Font.BOLD,20));
      jl9.setFont(new Font("Modern No. 20",Font.BOLD,20));
      jl12.setFont(new Font("Modern No. 20",Font.BOLD,20));
      jl15.setFont(new Font("Modern No. 20",Font.BOLD,20));
      
      jpCenter.add(jl2);
      jpCenter.add(jl3);
      jpCenter.add(jl4);
      jpCenter.add(jl5);
      jpCenter.add(jl6);
      jpCenter.add(jl7);
      jpCenter.add(jl8);
      jpCenter.add(jl9);
      jpCenter.add(jl10);
      jpCenter.add(jl11);
      jpCenter.add(jl12);
      jpCenter.add(jl13);
      jpCenter.add(jl14);
      jpCenter.add(jl15);
      jpCenter.add(jl16);
      
      jpBottom.setBackground(new Color(238,108,77));  
      jb1.setSize(150,30);
      jpBottom.add(jb1);
      
      this.add(jpTop, BorderLayout.NORTH);
      this.add(jpCenter , BorderLayout.CENTER);
      this.add(jpBottom , BorderLayout.SOUTH);
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      jb1.addActionListener(this);

   }
   
   //main method
        public static void main(String[] args)
        {
            About x = new About();
            x.setVisible(true);
                
        }
        
        public void actionPerformed(ActionEvent e )
        {
        
            if(e.getSource() == jb1)
            {
               this.setVisible(false);
            
            }
        
        }

   
   
}