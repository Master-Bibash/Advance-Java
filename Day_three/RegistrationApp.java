
import java.awt.*;
import javax.swing.*;

public class RegistrationApp {

    JFrame frmMain;
    JLabel lblName, lblGender, lblAge, lblAddress, lblEmpty;
    JCheckBox chkStudent;
    JRadioButton rdoFemale, rdoMale, rdoOthers;
    JTextField txtName, txtAge;
    JTextArea txtAddress;
    JButton btnSave, btnReset;
    JPanel pnlMain, pnlGender;

    Dimension dimText = new Dimension(250, 25);
    Dimension dimLbl = new Dimension(150, 25);

    public RegistrationApp() {
        frmMain = new JFrame("Registration Form");
        frmMain.setSize(new Dimension(500, 500));
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setLocationRelativeTo(null);
        frmMain.setResizable(false);

        pnlGender = new JPanel(true);
        pnlGender.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        rdoFemale = new JRadioButton("Female", true);
        rdoMale = new JRadioButton("Male");
        rdoOthers = new JRadioButton("Others");

        ButtonGroup btnGrpGender = new ButtonGroup();
        btnGrpGender.add(rdoFemale);
        btnGrpGender.add(rdoMale);
        btnGrpGender.add(rdoOthers);

        pnlGender.add(rdoFemale);
        pnlGender.add(rdoMale);
        pnlGender.add(rdoOthers);

        lblName = new JLabel("Name");
        lblName.setPreferredSize(dimLbl);
        lblName.setHorizontalAlignment(JLabel.RIGHT);

        lblGender = new JLabel("Gender");
        lblGender.setPreferredSize(dimLbl);
        lblGender.setHorizontalAlignment(JLabel.RIGHT);

        lblAge = new JLabel("Age");
        lblAge.setPreferredSize(dimLbl);
        lblAge.setHorizontalAlignment(JLabel.RIGHT);

        lblAddress = new JLabel("Address");
        lblAddress.setPreferredSize(dimLbl);
        lblAddress.setHorizontalAlignment(JLabel.RIGHT);

        lblEmpty = new JLabel();
        lblEmpty.setPreferredSize(dimLbl);

        txtName = new JTextField();
        txtName.setPreferredSize(dimText);

        txtAge = new JTextField();
        txtAge.setPreferredSize(dimText);

        txtAddress = new JTextArea(5, 20); // Set rows and columns for the JTextArea
        txtAddress.setLineWrap(true);
        txtAddress.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(txtAddress);

        chkStudent = new JCheckBox("Student?");
        chkStudent.setPreferredSize(dimLbl);

        btnSave = new JButton("Save");
        btnReset = new JButton("Reset");

        pnlMain = new JPanel();
        pnlMain.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        pnlMain.add(lblName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        pnlMain.add(txtName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        pnlMain.add(lblEmpty, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        pnlMain.add(chkStudent, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        pnlMain.add(lblGender, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        pnlMain.add(pnlGender, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        pnlMain.add(lblAge, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        pnlMain.add(txtAge, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        pnlMain.add(lblAddress, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        pnlMain.add(scrollPane, gbc);

        // Add Save and Reset buttons in the same row
        JPanel pnlButtons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pnlButtons.add(btnSave);
        pnlButtons.add(btnReset);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        pnlMain.add(pnlButtons, gbc);

        frmMain.add(pnlMain);
        frmMain.setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationApp();
    }
}
