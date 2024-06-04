
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;
public class Three{
     public static void main(String[] args) {
          JFrame myFrmae=new JFrame("MySwing Application");
          myFrmae.setTitle("My Swing Application");
          myFrmae.setSize(500,500);
          myFrmae.setLocation(100,200);
          myFrmae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          JTextField textfieldfirstname=new JTextField("Username");
          JButton myButton=new JButton("Submit");
          JTextField textSecondname = new JTextField("Username");
         textfieldfirstname.setPreferredSize(new Dimension(200, 25));

          textfieldfirstname.setPreferredSize(new Dimension(200,25));
          myButton.setPreferredSize(new Dimension(80,20));
          JPanel myPanel=new JPanel();
          
          myPanel.add(textfieldfirstname);
          
          myPanel.add(textSecondname);
          myPanel.add(myButton);
          myPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
          myPanel.add(textfieldfirstname,BorderLayout.NORTH);
          myPanel.add(textSecondname, BorderLayout.SOUTH);
          myPanel.add(myButton, BorderLayout.EAST);
          
          myFrmae.setVisible(true);
          myFrmae.add(myPanel);





     }
}