import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.border.EmptyBorder;
import java.net.URL;
import javax.sound.sampled.*;


/*
** ISTE 121
** Mini-project: GUI of Fortune 
** Class MainMenu construct the first frame that the user sees
** @author: Manal Irfan, Ahmed Abdelaziz, Saeed, Reem
** @version: 4/2/2019
*/

public class MainMenu extends JFrame implements ActionListener
{
    //Components
   //Panels
   private JPanel jp1 = new JPanel();
   private JPanel jp2 = new JPanel();
   
   //Labels
   
   private JLabel jl1 = new JLabel();
   
   //buttons
   private JButton jb1 = new JButton("Start");
   private JButton jb2 = new JButton("How to Play");
   private JButton jb3 = new JButton("About");
   
   public MainMenu()
   {
      this.setLayout(new BorderLayout());
      this.setTitle("GUI of Fortune");
      this.setSize(800,600);
      this.setLocationRelativeTo(null);
            
      jp1.setLayout(new FlowLayout());
            
      jp2.setLayout(null);
      jp2.setBackground(new Color(238,108,77)); 
    
      
      jb1.setSize(150,30);
      jb2.setSize(150,30);
      jb3.setSize(150,30);
      
      jb1.setLocation(330,100);
      jb2.setLocation(330,200);
      jb3.setLocation(330,300);
      
      jp2.add(jb1);
      jp2.add(jb2);
      jp2.add(jb3);
      
      jb1.addActionListener(this);
      jb2.addActionListener(this);
      jb3.addActionListener(this);
      
      this.add(jp1,BorderLayout.NORTH);
      this.add(jp2,BorderLayout.CENTER);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      jl1.setIcon(new ImageIcon("GUIofFortune.png"));
      jp1.add(jl1);
      jp1.setBackground(new Color(25,114,120));
      
      
      try {
         // Open an audio input stream.
         URL url = this.getClass().getClassLoader().getResource("Wheel of Fortune Theme Song (online-audio-converter.com).wav");
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
      
      
      
   }     
         
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == jb2)
               { new HowToPlay().setVisible(true); }
               
            else if(e.getSource() == jb1)
               { new SelectLevel().setVisible(true); }
               
            else if(e.getSource() == jb3)
               { new About().setVisible(true); }     
        }
         
   
        //main method
        public static void main(String[] args)
        {
            MainMenu x = new MainMenu();
            x.setVisible(true);
                
        }
        
       
      
}