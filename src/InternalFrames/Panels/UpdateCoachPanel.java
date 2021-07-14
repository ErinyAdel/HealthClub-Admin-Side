package InternalFrames.Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaapplication213.Admin;
import javaapplication213.Coach;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UpdateCoachPanel extends javax.swing.JPanel implements ActionListener
{
    private JButton SearchBtn , UpdateBtn;
    private JLabel labelSearch  , labelID , labelFName , labelLName , labelEmail , labelPassword, labelAge , labelSalary , labelNumOfMembers;
    private JTextField txtfSearch , txtfID, txtfFName  , txtfLName  , txtfEmail , txtfAge , txtfSalary , txtfNumOfMembers;
    private JPasswordField txtfPassword;
    public UpdateCoachPanel() 
    {
        BoxLayout SmallBox = new BoxLayout(this,BoxLayout.Y_AXIS);      
        setSize(480,625);
        setVisible(true);
        setLayout(SmallBox);
        
        labelSearch = new JLabel("Search By ID");
        //labelSearch.setBounds(100,100,70,30);
        labelSearch.setFont(new Font("", Font.PLAIN, 16));
        add(labelSearch);        
        txtfSearch = new JTextField();
        //txtfSearch.setBounds(140,100,100,30);
        txtfSearch.setFont(new Font("", Font.PLAIN, 14));
        add(txtfSearch);
        
        SearchBtn = new JButton("Search");
        //SearchBtn.setBounds(100,150,80,30);
        SearchBtn.setBackground((new Color(1, 50, 67)));
        SearchBtn.setForeground(Color.PINK);
        SearchBtn.addActionListener(this);
        add(SearchBtn);
             
        labelID = new JLabel("ID");
        //labelID.setBounds(100,100,70,30);
        labelSearch.setFont(new Font("", Font.PLAIN, 14));
        add(labelID);        
        txtfID = new JTextField();
        //txtfID.setBounds(140,100,100,30);
        txtfID.setFont(new Font("", Font.PLAIN, 14));
        txtfID.setBackground(Color.LIGHT_GRAY);
        add(txtfID);
        
        labelFName = new JLabel("First Name");
        //labelFName.setBounds(100,100,70,30);
        labelFName.setFont(new Font("", Font.PLAIN, 14));
        add(labelFName);        
        txtfFName = new JTextField();
        //txtfFName.setBounds(140,100,100,30);
        txtfFName.setFont(new Font("", Font.PLAIN, 14));
        txtfFName.setBackground(Color.LIGHT_GRAY);
        add(txtfFName);
        
        labelLName = new JLabel("Last Name");
        //labelLName.setBounds(100,100,70,30);
        labelLName.setFont(new Font("", Font.PLAIN, 14));
        add(labelLName);        
        txtfLName = new JTextField();
        //txtfLName.setBounds(140,100,100,30);
        txtfLName.setFont(new Font("", Font.PLAIN, 14));
        txtfLName.setBackground(Color.LIGHT_GRAY);
        add(txtfLName);
        
        labelEmail = new JLabel("E-mail");
        //labelEmail.setBounds(100,100,70,30);
        labelEmail.setFont(new Font("", Font.PLAIN, 14));
        add(labelEmail);        
        txtfEmail = new JTextField();
        //txtfEmail.setBounds(140,100,100,30);
        txtfEmail.setFont(new Font("", Font.PLAIN, 14));
        txtfEmail.setBackground(Color.LIGHT_GRAY);
        add(txtfEmail);
        
        labelPassword = new JLabel("Password");
        //labelPassword.setBounds(100,100,70,30);
        labelPassword.setFont(new Font("", Font.PLAIN, 14));
        add(labelPassword);        
        txtfPassword = new JPasswordField();
        //txtfPassword.setBounds(140,100,100,30);
        txtfPassword.setFont(new Font("", Font.PLAIN, 14));
        txtfPassword.setBackground(Color.LIGHT_GRAY);
        add(txtfPassword);
        
        labelAge = new JLabel("Age");
        //labelAge.setBounds(100,100,70,30);
        labelAge.setFont(new Font("", Font.PLAIN, 14));
        add(labelAge);        
        txtfAge = new JTextField();
        //txtfAge.setBounds(140,100,100,30);
        txtfAge.setFont(new Font("", Font.PLAIN, 14));
        txtfAge.setBackground(Color.LIGHT_GRAY);
        add(txtfAge);       
        
        labelSalary = new JLabel("Salary");
        //labelSalary.setBounds(100,100,70,30);
        labelSalary.setFont(new Font("", Font.PLAIN, 14));
        add(labelSalary);        
        txtfSalary = new JTextField();
        //txtfSalary.setBounds(140,100,100,30);
        txtfSalary.setFont(new Font("", Font.PLAIN, 14));
        txtfSalary.setBackground(Color.LIGHT_GRAY);
        add(txtfSalary);
        
        labelNumOfMembers = new JLabel("Number of Members");
        labelNumOfMembers.setFont(new Font("", Font.PLAIN, 14));
        add(labelNumOfMembers);        
        txtfNumOfMembers = new JTextField();
        txtfNumOfMembers.setFont(new Font("", Font.PLAIN, 14));
        txtfNumOfMembers.setBackground(Color.LIGHT_GRAY);
        add(txtfNumOfMembers);
        
        UpdateBtn = new JButton("Update");
        UpdateBtn.setBounds(200,150,80,30);
        UpdateBtn.setBackground((new Color(1, 50, 67)));
        UpdateBtn.setForeground(Color.PINK);
        UpdateBtn.addActionListener(this);
        add(UpdateBtn);
        
        txtfNumOfMembers.setEditable(false);
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
        if(e.getSource() == SearchBtn)
        {
            Admin c = new Admin();  
            if( c.SearchCoach(Integer.parseInt(txtfSearch.getText())) )
            {
                int i = c.indexOfCoachesArrList(Integer.parseInt(txtfSearch.getText()));
                txtfEmail.setText(Admin.getCoaches().get(i).getEmail());
                txtfFName.setText(Admin.getCoaches().get(i).getFirstName());
                txtfID.setText(String.valueOf(Admin.getCoaches().get(i).getID()));           
                txtfLName.setText(Admin.getCoaches().get(i).getLastName());    
                txtfAge.setText(String.valueOf(Admin.getCoaches().get(i).getAge()));
                txtfSalary.setText(String.valueOf(Admin.getCoaches().get(i).getSalary()));  
                txtfNumOfMembers.setText(String.valueOf(Admin.getCoaches().get(i).getNumOfMembers()));
            }
           else
            JOptionPane.showMessageDialog(null,"This ID is not Found" , "Alert"
                                                    ,JOptionPane.DEFAULT_OPTION);     
        }
        if(e.getSource() == UpdateBtn)
        {
            Admin adm = new Admin();
            Coach c = new Coach();
            int SearchID  = Integer.parseInt(txtfSearch.getText());        
            if(adm.UpdateCoach(c,SearchID))
            {
                JOptionPane.showMessageDialog(null,"These Data is Updated Successfully" , "Alert"
                                                   ,JOptionPane.DEFAULT_OPTION);
                resetTextFieldData();  
            }
            else
                JOptionPane.showMessageDialog(null,"These Data is not updated" , "Alert"
                                               ,JOptionPane.DEFAULT_OPTION);
        }
    }
    
    void resetTextFieldData() 
    {
        txtfSearch.setText(""); txtfLName.setText("");
        txtfID.setText("");      txtfEmail.setText("");
        txtfFName.setText("");   txtfAge.setText("");
        txtfSalary.setText("");  txtfNumOfMembers.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
