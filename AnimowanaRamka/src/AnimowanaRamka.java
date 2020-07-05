 import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;


public class AnimowanaRamka extends JFrame {

 private JPanel contentPane;
    
 Timer tm;
 int i = 0;
 
 /**
 * Launch the application.
 */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
    	AnimowanaRamka frame = new AnimowanaRamka();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
 * Create the frame.
 */
 public AnimowanaRamka() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 450, 300);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JPanel panel = new JPanel();
  panel.setBackground(Color.ORANGE);
  panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
  panel.setBounds(155, 95, 110, 44);
  contentPane.add(panel);
  panel.setLayout(null);
  
  JButton btnNewButton = new JButton("Przycisk");
  btnNewButton.setBounds(10, 11, 89, 23);
  panel.add(btnNewButton);
  btnNewButton.addActionListener(new ActionListener() {
  	public void actionPerformed(ActionEvent e) {
  	}
  });
  
  tm = new Timer(10, new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent e) {
    
    panel.setBackground(new Color(i,180,50));
    i++;
    
    if (i>=255) {
    	i=0;
    }
   }
  });
  
  tm.start();
  
 }
}