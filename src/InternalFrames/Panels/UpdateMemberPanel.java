package InternalFrames.Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaapplication213.Admin;
import javaapplication213.Coach;
import javaapplication213.Member;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UpdateMemberPanel extends javax.swing.JPanel implements ActionListener
{
    private JButton SearchBtn , UpdateBtn;
    private JLabel labelSearch  , labelID , labelFName , labelLName , labelEmail , labelAge , labelPassword,
                    lebelHeight , labelWeight , labelCoachID;
    private JTextField txtfSearch , txtfID, txtfFName  , txtfLName  , txtfEmail , txtfAge , txtfPass ,
                    txtfHeight , txtfWeight , txtfCoachID;
    
    public UpdateMemberPanel() 
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
        txtfPass = new JPasswordField();
        txtfPass.setFont(new Font("", Font.PLAIN, 14));
        txtfPass.setBackground(Color.LIGHT_GRAY);
        add(txtfPass);
        
        labelAge = new JLabel("Age");
        //labelAge.setBounds(100,100,70,30);
        labelAge.setFont(new Font("", Font.PLAIN, 14));
        add(labelAge);        
        txtfAge = new JTextField();
        //txtfAge.setBounds(140,100,100,30);
        txtfAge.setFont(new Font("", Font.PLAIN, 14));
        txtfAge.setBackground(Color.LIGHT_GRAY);
        add(txtfAge);       
        
        lebelHeight = new JLabel("Height");
        //labelSalary.setBounds(100,100,70,30);
        lebelHeight.setFont(new Font("", Font.PLAIN, 14));
        add(lebelHeight);        
        txtfHeight = new JTextField();
        txtfHeight.setFont(new Font("", Font.PLAIN, 14));
        txtfHeight.setBackground(Color.LIGHT_GRAY);
        add(txtfHeight);
        
        labelWeight = new JLabel("Weight");
        labelWeight.setFont(new Font("", Font.PLAIN, 14));
        add(labelWeight);        
        txtfWeight = new JTextField();
        txtfWeight.setFont(new Font("", Font.PLAIN, 14));
        txtfWeight.setBackground(Color.LIGHT_GRAY);
        add(txtfWeight);
        
        labelCoachID = new JLabel("Coach_ID");
        labelCoachID.setFont(new Font("", Font.PLAIN, 14));
        add(labelCoachID);        
        txtfCoachID = new JTextField();
        txtfCoachID.setFont(new Font("", Font.PLAIN, 14));
        txtfCoachID.setBackground(Color.LIGHT_GRAY);
        add(txtfCoachID);
        
        
        UpdateBtn = new JButton("Update");
        UpdateBtn.setBounds(200,150,80,30);
        UpdateBtn.setBackground((new Color(1, 50, 67)));
        UpdateBtn.setForeground(Color.PINK);
        UpdateBtn.addActionListener(this);
        add(UpdateBtn);
        
        txtfCoachID.setEditable(false);
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
            Admin m = new Admin();
            if(m.SearchMember(Integer.parseInt(txtfSearch.getText())))
            {
                int i = m.getIndexOfMembersArrList(Integer.parseInt(txtfSearch.getText()));
                txtfEmail.setText(Admin.getMembers().get(i).getEmail());
                txtfFName.setText(Admin.getMembers().get(i).getFirstName());
                txtfID.setText(String.valueOf(Admin.getMembers().get(i).getID()));           
                txtfLName.setText(Admin.getMembers().get(i).getLastName());    
                txtfAge.setText(String.valueOf(Admin.getMembers().get(i).getAge()));
                txtfHeight.setText(String.valueOf(Admin.getMembers().get(i).getHeight()));  
                txtfWeight.setText(String.valueOf(Admin.getMembers().get(i).getWeight()));  
                txtfCoachID.setText(String.valueOf(Admin.getMembers().get(i).getCoachID()));  
            }
           else
            JOptionPane.showMessageDialog(null,"This ID is not Found" , "Alert"
                                                    ,JOptionPane.DEFAULT_OPTION);     
        }
        if(e.getSource() == UpdateBtn)
        {
            Admin adm = new Admin();
            Member m = new Member();
            int SearchID  = Integer.parseInt(txtfSearch.getText());        
            if(adm.UpdateMember(m,SearchID))
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
        txtfSearch.setText("");  txtfLName.setText("");  txtfAge.setText("");
        txtfID.setText("");      txtfEmail.setText("");  txtfFName.setText("");           
        txtfCoachID.setText(""); txtfHeight.setText(""); txtfWeight.setText(""); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
