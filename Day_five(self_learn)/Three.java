
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Three {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Event Handling Example");
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
