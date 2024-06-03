
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Two{
     public static void main(String[] args) {
          JFrame myFrame=new JFrame();
          myFrame.setSize(300,309);
          myFrame.setVisible(true);
          myFrame.setResizable(false);
          myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          JPanel mypanel=new JPanel();
          myFrame.setLocation(400,400);
          myFrame.setBounds(300, 300, 700, 300);

          JButton myButton=new JButton("click me");
          myButton.setText("click me");
          // myButton.setEnabled(false);
          mypanel.add(myButton);
          myFrame.add(mypanel);
          JTextField jtextfield=new JTextField();
               jtextfield.setColumns(25);
               jtextfield.setText("write your name");
               mypanel.add(jtextfield);          
          
          // myFrame.add(myButton);
          
         
     }
}