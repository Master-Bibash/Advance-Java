
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RegistrationApp {

    String url = "jdbc:mysql://localhost:3306/registrationApp";
    String username = "root";
    String password = "password";

    JFrame frmMain;
    JLabel lblName, lblGender, lblAge, lblAddress, lblEmpty;
    JCheckBox chkStudent;
    JRadioButton rdoFemale, rdoMale, rdoOthers;
    JTextField txtName, txtAge;
    JTextArea txtAddress;
    JButton btnSave, btnReset;
    JPanel pnlMain, pnlGender;
    JTable tblData;
    DefaultTableModel tblModel;

    Dimension dimText = new Dimension(400, 30); // Width set for text fields
    Dimension dimTextArea = new Dimension(400, 100);
    Dimension dimLbl = new Dimension(150, 30);

    public RegistrationApp() {
        frmMain = new JFrame("Registration Form");
        frmMain.setSize(new Dimension(800, 600));  // Increased the frame size
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

        txtAddress = new JTextArea();
        txtAddress.setLineWrap(true);
        txtAddress.setWrapStyleWord(true);
        txtAddress.setPreferredSize(dimTextArea);
        JScrollPane scrollPane = new JScrollPane(txtAddress);
        scrollPane.setPreferredSize(dimTextArea);

        chkStudent = new JCheckBox("Student?");
        chkStudent.setPreferredSize(dimLbl);

        btnSave = new JButton("Save");
        btnReset = new JButton("Reset");

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savePerson();
                loadData();
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });

        pnlMain = new JPanel();
        pnlMain.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Name field
        gbc.gridx = 0;
        gbc.gridy = 0;
        pnlMain.add(lblName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Allow horizontal stretching
        gbc.weightx = 1.0; // Allow text field to expand
        pnlMain.add(txtName, gbc);

        // Empty label for spacing
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE; // Reset to default
        gbc.weightx = 0; // Reset weight
        pnlMain.add(lblEmpty, gbc);

        // Student checkbox
        gbc.gridx = 1;
        gbc.gridy = 1;
        pnlMain.add(chkStudent, gbc);

        // Gender radio buttons
        gbc.gridx = 0;
        gbc.gridy = 2;
        pnlMain.add(lblGender, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        pnlMain.add(pnlGender, gbc);

        // Age field
        gbc.gridx = 0;
        gbc.gridy = 3;
        pnlMain.add(lblAge, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Allow horizontal stretching
        gbc.weightx = 1.0; // Allow text field to expand
        pnlMain.add(txtAge, gbc);

        // Address field
        gbc.gridx = 0;
        gbc.gridy = 4;
        pnlMain.add(lblAddress, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Allow horizontal stretching
        gbc.weightx = 1.0; // Allow text area to expand
        pnlMain.add(scrollPane, gbc);

        // Buttons
        JPanel pnlButtons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pnlButtons.add(btnSave);
        pnlButtons.add(btnReset);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        pnlMain.add(pnlButtons, gbc);

        // Table to display data
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Name", "Gender", "Age", "Address", "Student"});
        tblData = new JTable(tblModel);
        JScrollPane tblScrollPane = new JScrollPane(tblData);
        tblScrollPane.setPreferredSize(new Dimension(750, 200));

        // Add table to the frame
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        pnlMain.add(tblScrollPane, gbc);

        frmMain.add(pnlMain);
        frmMain.setVisible(true);

        loadData();
    }

    private void savePerson() {
        String name = txtName.getText();
        String gender = "";
        if (rdoFemale.isSelected()) {
            gender = "Female";
        } else if (rdoMale.isSelected()) {
            gender = "Male";
        } else if (rdoOthers.isSelected()) {
            gender = "Others";
        }
        String ageText = txtAge.getText();
        int age;
        try {
            age = Integer.parseInt(ageText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frmMain, "Please enter a valid age.");
            return;
        }

        String address = txtAddress.getText();
        boolean isStudent = chkStudent.isSelected();

        try (Connection con = DriverManager.getConnection(url, username, password)) {
            String sql = "INSERT INTO Person(name, gender, age, address, is_student) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, name);
                pstmt.setString(2, gender);
                pstmt.setInt(3, age);
                pstmt.setString(4, address);
                pstmt.setBoolean(5, isStudent);

                int rowInserted = pstmt.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(frmMain, "A new person has been inserted.");
                } else {
                    JOptionPane.showMessageDialog(frmMain, "Insertion failed.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frmMain, "Error: " + ex.getMessage());
        }
    }

    private void loadData() {
        tblModel.setRowCount(0);
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            String sql = "SELECT name, gender, age, address, is_student FROM Person";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("name");
                    String gender = rs.getString("gender");
                    int age = rs.getInt("age");
                    String address = rs.getString("address");
                    boolean isStudent = rs.getBoolean("is_student");

                    tblModel.addRow(new Object[]{name, gender, age, address, isStudent});
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frmMain, "Error: " + ex.getMessage());
        }
    }

    private void resetForm() {
        txtName.setText("");
        txtAge.setText("");
        txtAddress.setText("");
        chkStudent.setSelected(false);
        rdoFemale.setSelected(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistrationApp();
        });
    }
}
