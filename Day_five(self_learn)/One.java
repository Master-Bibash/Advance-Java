
import javax.swing.*;

class  One{
     public static void main(String[] args){
          JFrame myframe=new JFrame("this is a test");
          myframe.setSize(400,300);
          myframe.setLocation(400,400);
          myframe.setResizable(true);
          myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          //Jpanel
          JPanel mypanel=new JPanel();

         

          //textfield
          JTextField myTextField =new JTextField("enter some words");

          //jbutton
         JButton mybtn = new JButton("click me");

          //add in jpanel
          mypanel.add(myTextField);

          mypanel.add(mybtn);

          //add jpanel in jframe 

          myframe.add(mypanel);

          myframe.setVisible(true);

          //jpassword field
          JPasswordField mypass=new JPasswordField();

          //jtextarea
          JTextArea mytextarea=new JTextArea();
          mytextarea.setRows(5);
          mypanel.add(mytextarea);

          mypanel.add(mypass);

          //checkbox
          JCheckBox mycheckbox=new JCheckBox();

          mypanel.add(mycheckbox);

          //jradio button
          
          JRadioButton myradiobtn=new JRadioButton();
          mypanel.add(myradiobtn);

          //jcombobox

          JComboBox jcombobox=new JComboBox();
          mypanel.add(jcombobox);

          //jtable

          JTable mytable=new JTable(1,10);
          mypanel.add(mytable);

          //jlist
          JList mylist=new JList();
          mypanel.add(mylist);







          
     }
}