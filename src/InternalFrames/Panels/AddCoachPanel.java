package InternalFrames.Panels;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaapplication213.Admin;
import javaapplication213.Coach;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AddCoachPanel extends javax.swing.JPanel implements ActionListener
{
    private JLabel labelID , labellEmail , labelFirstName , labelLastName , labelAge , 
                   labelGender , labelPassword ,labelSalary;
    private JTextField txtFID , txtFEmail   , txtFFirstName ,  txtFLastName  , txtFAge ,txtfSalary;
    private JPasswordField txtFPassword;
    private JComboBox comboBoxGender;
    private JButton AddBtn;
    
    public AddCoachPanel() 
    { 
        BoxLayout Bigbox = new BoxLayout(this,BoxLayout.Y_AXIS);
        setSize(480,625);
        setVisible(true);       
        setLayout(Bigbox);
        
        labelFirstName = new JLabel("First Name");
        labelFirstName.setFont(new Font("Calibri", Font.PLAIN, 20));
        //labelFirstName.setBounds(100,110,100,30);
        txtFFirstName = new JTextField();
        txtFFirstName.setForeground(Color.BLACK);
        txtFFirstName.setBackground(Color.LIGHT_GRAY);
        txtFFirstName.setFont(new Font("Calibri", Font.PLAIN, 14));
        txtFFirstName.setColumns(20);
        //txtFFirstName.setBounds(200,109,300,30);
        
        labelLastName = new JLabel("Last Name");
        labelLastName.setFont(new Font("Calibri", Font.PLAIN, 20));
        //labelLastName.setBounds(100,160,100,30);
        txtFLastName = new JTextField();
        txtFLastName.setForeground(Color.BLACK);
        txtFLastName.setBackground(Color.LIGHT_GRAY);
        txtFLastName.setFont(new Font("Calibri", Font.PLAIN, 14));
        txtFLastName.setColumns(20);
        ///txtFLastName.setBounds(200,159,300,30);
        
        labellEmail = new JLabel("Email");
        labellEmail.setFont(new Font("Calibri", Font.PLAIN, 20));
        //labellEmail.setBounds(100,210,100,30);
        txtFEmail = new JTextField();
        txtFEmail.setForeground(Color.BLACK);
        txtFEmail.setBackground(Color.LIGHT_GRAY);
        txtFEmail.setFont(new Font("Calibri", Font.PLAIN, 14));
        txtFEmail.setColumns(20);
        //txtFEmail.setBounds(200,209,300,30);
        
        labelPassword = new JLabel("Password");
        labelPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
        //labelPassword.setBounds(100,260,100,30);
        txtFPassword = new JPasswordField();
        txtFPassword.setForeground(Color.BLACK);
        txtFPassword.setBackground(Color.LIGHT_GRAY);
        txtFPassword.setFont(new Font("Calibri", Font.PLAIN, 14));
        txtFPassword.setColumns(20);
        //txtFPassword.setBounds(200,259,300,30);
        
        labelID = new JLabel("ID");
        labelID.setFont(new Font("Calibri", Font.PLAIN, 20));
        //labelID.setBounds(100,310,100,30);
        txtFID = new JTextField();
        txtFID.setForeground(Color.BLACK);
        txtFID.setBackground(Color.LIGHT_GRAY);
        txtFID.setFont(new Font("Calibri", Font.PLAIN, 14));
        txtFID.setColumns(20);
        //txtFID.setBounds(200,309,300,30);
        
        labelAge = new JLabel("Age");
        labelAge.setFont(new Font("Calibri", Font.PLAIN, 20));
        //labelAge.setBounds(100,360,100,30);
        txtFAge = new JTextField();
        txtFAge.setForeground(Color.BLACK);
        txtFAge.setBackground(Color.LIGHT_GRAY);
        txtFAge.setFont(new Font("Calibri", Font.PLAIN, 14));
        txtFAge.setColumns(20);
        //txtFAge.setBounds(200,359,300,30);
            
        labelSalary = new JLabel("Salary");
        //labelSalary.setBounds(100,410,100,30);
        labelSalary.setForeground(Color.BLACK);
        labelSalary.setBackground(Color.LIGHT_GRAY);
        labelSalary.setFont(new Font("Calibri", Font.PLAIN, 14));  
        txtfSalary = new JTextField();
        //txtfSalary.setBounds(200,409,300,30);
        txtfSalary.setForeground(Color.BLACK);
        txtfSalary.setBackground(Color.LIGHT_GRAY);
        txtfSalary.setFont(new Font("Calibri", Font.PLAIN, 14));
        
        labelGender = new JLabel("Gender");
        labelGender.setFont(new Font("Calibri", Font.PLAIN, 20));
        //labelGender.setBounds(100,460,100,30);
        
        String[] Types = {"Female" , "Male"};
        comboBoxGender = new JComboBox(Types);
        //comboBoxGender.setBounds(200,459,300,30);
        comboBoxGender.setForeground(Color.BLACK);
        comboBoxGender.setBackground(Color.LIGHT_GRAY);
            
        AddBtn = new JButton("Add");
        AddBtn.setSize(300,30);
        //AddBtn.setBounds(400,550,300,30);
        AddBtn.setBackground((new Color(1, 50, 67)));
        AddBtn.setForeground(Color.PINK);
        
        AddBtn.addActionListener(this);
        
        add(labelFirstName);
        add(txtFFirstName);
        add(labelLastName);
        add(txtFLastName);
        add(labellEmail);
        add(txtFEmail);
        add(labelPassword);
        add(txtFPassword);
        add(labelID);
        add(txtFID);
        add(labelAge);
        add(txtFAge);
        add(labelSalary);
        add(txtfSalary);
        add(labelGender);
        add(comboBoxGender);       
        add(AddBtn);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == AddBtn)
        {
            if(!txtFFirstName.getText().isEmpty() && !txtFLastName.getText().isEmpty() && !txtFEmail.getText().isEmpty() &&
               txtFPassword.getPassword().length != 0 && !txtFAge.getText().isEmpty() && !txtFID.getText().isEmpty() &&
               !txtfSalary.getText().isEmpty())
            {
                Admin adm = new Admin();
                Coach c = new Coach();
                c.setFirstName(txtFFirstName.getText());
                c.setLastName(txtFLastName.getText());
                c.setEmail(txtFEmail.getText());
                c.setPassword(txtFPassword.getText());
                c.setID(Integer.parseInt(txtFID.getText()) );
                c.setAge(Integer.parseInt(txtFAge.getText()));
                c.setGender(comboBoxGender.getSelectedItem().toString());
                c.setSalary(Double.parseDouble(txtfSalary.getText()));
                if(adm.AddCoach(c))
                {
                    JOptionPane.showMessageDialog(null,"Coach is Added Successfully" , "Successful Process"
                                                      ,JOptionPane.DEFAULT_OPTION);
                    resetPanelData();
                }                
                else
                JOptionPane.showConfirmDialog(null,"Can't Add This Coach" , "Failed Process" ,JOptionPane.WARNING_MESSAGE);
            }
            else
                JOptionPane.showConfirmDialog(null,"Please, Fill All Fields" , "Error" ,JOptionPane.WARNING_MESSAGE); 
        }   
    }

    void resetPanelData() 
    {
        txtFFirstName.setText(""); txtFLastName.setText(""); txtFEmail.setText("");
        txtFPassword.setText("");  txtFID.setText("");        txtFAge.setText("");
        txtfSalary.setText("");         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
