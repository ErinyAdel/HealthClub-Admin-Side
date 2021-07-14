package InternalFrames.Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaapplication213.Admin;
import javaapplication213.Member;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AddMemberPanel extends javax.swing.JPanel implements ActionListener
{
    private JLabel labelID , labellEmail , labelFirstName , labelLastName , labelAge , 
                   labelGender , labelPassword  , labelHeight , labelWeight;
    private JTextField txtFID , txtFEmail   , txtFFirstName ,  txtFLastName  , txtFAge ,txtfHeight , txtfWeight;
    private JPasswordField txtFPassword;
    private JComboBox comboBoxGender;
    private JButton AddBtn;
    
    public AddMemberPanel() 
    { 
        BoxLayout Bigbox = new BoxLayout(this,BoxLayout.Y_AXIS);
        setSize(480,625);
        setVisible(true);       
        setLayout(Bigbox);
        
        labelFirstName = new JLabel("First Name");
        labelFirstName.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtFFirstName = new JTextField();
        txtFFirstName.setForeground(Color.BLACK);
        txtFFirstName.setBackground(Color.LIGHT_GRAY);
        txtFFirstName.setFont(new Font("Calibri", Font.PLAIN, 14));
        
        labelLastName = new JLabel("Last Name");
        labelLastName.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtFLastName = new JTextField();
        txtFLastName.setForeground(Color.BLACK);
        txtFLastName.setBackground(Color.LIGHT_GRAY);
        txtFLastName.setFont(new Font("Calibri", Font.PLAIN, 14));
        
        labellEmail = new JLabel("Email");
        labellEmail.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtFEmail = new JTextField();
        txtFEmail.setForeground(Color.BLACK);
        txtFEmail.setBackground(Color.LIGHT_GRAY);
        txtFEmail.setFont(new Font("Calibri", Font.PLAIN, 14));

        
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
            
        
        labelHeight = new JLabel("Height");
        labelHeight.setForeground(Color.BLACK);
        labelHeight.setBackground(Color.LIGHT_GRAY);
        labelHeight.setFont(new Font("Calibri", Font.PLAIN, 14));  
        txtfHeight = new JTextField();
        txtfHeight.setForeground(Color.BLACK);
        txtfHeight.setBackground(Color.LIGHT_GRAY);
        txtfHeight.setFont(new Font("Calibri", Font.PLAIN, 14));
        
        labelWeight = new JLabel("Weight");
        labelWeight.setForeground(Color.BLACK);
        labelWeight.setBackground(Color.LIGHT_GRAY);
        labelWeight.setFont(new Font("Calibri", Font.PLAIN, 14));  
        txtfWeight = new JTextField();
        txtfWeight.setForeground(Color.BLACK);
        txtfWeight.setBackground(Color.LIGHT_GRAY);
        txtfWeight.setFont(new Font("Calibri", Font.PLAIN, 14));
        
        
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
        add(labelHeight);
        add(txtfHeight);
        add(labelWeight);
        add(txtfWeight);
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
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == AddBtn)
        {
            if(!txtFFirstName.getText().isEmpty() && !txtFLastName.getText().isEmpty() && !txtFEmail.getText().isEmpty() &&
               txtFPassword.getPassword().length != 0 && !txtFAge.getText().isEmpty() && !txtFID.getText().isEmpty() &&
               !txtfHeight.getText().isEmpty() && !txtfWeight.getText().isEmpty())
                {
                    Admin adm = new Admin();
                    Member m = new Member();
                    m.setFirstName(txtFFirstName.getText());
                    m.setLastName(txtFLastName.getText());
                    m.setEmail(txtFEmail.getText());
                    m.setPassword(txtFPassword.getText());
                    m.setID(Integer.parseInt(txtFID.getText()) );
                    m.setAge(Integer.parseInt(txtFAge.getText()));
                    m.setGender(comboBoxGender.getSelectedItem().toString());
                    m.setHeight(Double.parseDouble(txtfHeight.getText()));
                    m.setWeight(Double.parseDouble(txtfWeight.getText()));
                    if(adm.AddMember(m))
                    {
                        JOptionPane.showMessageDialog(null,"Member is Added Successfully" , "Successful Process"
                                                          ,JOptionPane.DEFAULT_OPTION);
                        resetPanelData();
                    }                
                    else
                    JOptionPane.showConfirmDialog(null,"Can't Add This Member" , "Failed Process" ,JOptionPane.WARNING_MESSAGE);
            }
            else
                JOptionPane.showConfirmDialog(null,"Please, Fill All Fields" , "Error" ,JOptionPane.WARNING_MESSAGE); 
        }   
    }
    void resetPanelData() 
    {
        txtFFirstName.setText(""); txtFLastName.setText(""); txtFEmail.setText("");
        txtFPassword.setText("");  txtFID.setText("");        txtFAge.setText("");    
        txtfHeight.setText("");    txtfWeight.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
