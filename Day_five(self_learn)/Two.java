
import java.awt.TextField;
import javax.swing.*;

class Two {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Login Form");
        myFrame.setSize(700, 600); // Increased size to accommodate the table
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mypanel = new JPanel(null);
        myFrame.add(mypanel);

        JLabel namLabel = new JLabel("Enter your name");
        namLabel.setBounds(10, 20, 120, 25);
        TextField namefield = new TextField(10);
        namefield.setBounds(140, 20, 165, 25);

        JLabel passwordLabel = new JLabel("Enter your password");
        passwordLabel.setBounds(10, 60, 120, 25);
        JPasswordField mypassword = new JPasswordField(10);
        mypassword.setBounds(140, 60, 165, 25);

        JCheckBox myCheckBox = new JCheckBox("Remember me");
        myCheckBox.setBounds(140, 100, 150, 25);

        JLabel genderlabel = new JLabel("Gender");
        genderlabel.setBounds(10, 140, 120, 25);

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        JRadioButton r3 = new JRadioButton("Others");
        r1.setBounds(140, 140, 90, 25);
        r2.setBounds(230, 140, 90, 25);
        r3.setBounds(320, 140, 90, 25);

        JLabel Age = new JLabel("Age");
        Age.setBounds(10, 180, 120, 25);
        TextField ageField = new TextField();
        ageField.setBounds(140, 180, 165, 25);

        JLabel Address = new JLabel("Address");
        Address.setBounds(10, 220, 120, 25);
        TextField addressField = new TextField();
        addressField.setBounds(140, 220, 160, 90);

        JButton subButton = new JButton();
        subButton.setText("Submit");
        subButton.setBounds(140, 320, 100, 25);
        JButton resetButton1 = new JButton();
        resetButton1.setText("Reset");
        resetButton1.setBounds(250, 320, 100, 25);

        // Sample data for the table
        String data[][] = {{"101", "Amit", "670000"},
        {"102", "Jai", "780000"},
        {"103", "Sachin", "700000"}};
        String column[] = {"ID", "NAME", "SALARY"};

        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(10, 360, 650, 200); // Adjusted bounds to fit within the frame

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        mypanel.add(namLabel);
        mypanel.add(namefield);
        mypanel.add(passwordLabel);
        mypanel.add(mypassword);
        mypanel.add(myCheckBox);
        mypanel.add(genderlabel);
        mypanel.add(r1);
        mypanel.add(r2);
        mypanel.add(r3);
        mypanel.add(Age);
        mypanel.add(ageField);
        mypanel.add(Address);
        mypanel.add(addressField);
        mypanel.add(subButton);
        mypanel.add(resetButton1);
        mypanel.add(sp);

        myFrame.setVisible(true);
    }
}
