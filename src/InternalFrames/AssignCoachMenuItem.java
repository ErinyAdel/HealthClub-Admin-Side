package InternalFrames;

import InternalFrames.Panels.AddCoachPanel;
import InternalFrames.Panels.AssignCoachPanell;
import InternalFrames.Panels.DeleteCoachPanel;
import InternalFrames.Panels.ListCoachesPanel;
import InternalFrames.Panels.UpdateCoachPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication213.Admin;
import javaapplication213.Coach;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AssignCoachMenuItem extends javax.swing.JInternalFrame implements ActionListener
{
    private AssignCoachPanell panel1 = new AssignCoachPanell();
    private GridBagLayout layout ;
    
    private JPanel DaynamicPanel = new JPanel();
    private JButton assignBtn ,listBtn ,okBtn , searcBtn1 , searcBtn2;
    private JFrame frame;
    private JTextField txtfSearch1 , txtfSearch2 ,txtfmemberid , txtfcoachid , txtfnoofmembers;
    private JLabel labelmemberid , labelcoachid , labelnoofmembers;
    private Coach c = new Coach();
    public AssignCoachMenuItem()
    {
        setSize(680,625);
        setVisible(true);
        setClosable(true);  
        setLayout(null);
        
        listBtn = new JButton("List Coachs");
        listBtn.setBounds(500,500,100,30);
        listBtn.addActionListener(this);
        add(listBtn);
        
        assignBtn = new JButton("Assign Coach");
        assignBtn.setBounds(380,500,100,30);
        assignBtn.addActionListener(this);   
        add(assignBtn);
        
        layout = new GridBagLayout();
        DaynamicPanel.setLayout(layout);
        GridBagConstraints cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        DaynamicPanel.setBounds(0,0,480,480);
        
        DaynamicPanel.add(panel1 , cons);      
        panel1.setVisible(false);               
        add(DaynamicPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == listBtn)
        {
            panel1.setVisible(true);           
        }
        if(e.getSource() == assignBtn)
        {
                frame = new JFrame();
                frame.setSize(600,600);
                frame.setVisible(true);
                frame.setLayout(null);
                
                txtfSearch1 = new JTextField();
                txtfSearch1.setBounds(220,50,180,30);
                frame.add(txtfSearch1);
                
                searcBtn1 = new JButton("Search Coach");
                searcBtn1.setBounds(300,120,100,30);
                frame.add(searcBtn1);
                searcBtn1.addActionListener(this) ;
                frame.add(searcBtn1);
                
                labelcoachid = new JLabel("Coach ID");
                labelcoachid.setBounds(220,300,80,30);
                frame.add(labelcoachid);
                
                labelnoofmembers = new JLabel("Number Of Members");
                labelnoofmembers.setBounds(220,350,80,30);
                frame.add(labelnoofmembers);
                
                txtfcoachid = new JTextField();
                txtfcoachid.setBounds(280,300,100,30);
                frame.add(txtfcoachid);
                txtfcoachid.setEditable(false);
                
                txtfnoofmembers = new JTextField();
                txtfnoofmembers.setBounds(280,350,100,30);
                frame.add(txtfnoofmembers);
                txtfnoofmembers.setEditable(false);
                
                
                txtfSearch2 = new JTextField();
                txtfSearch2.setBounds(20,50,180,30);
                frame.add(txtfSearch2);
                
                searcBtn2 = new JButton("Search Member");
                searcBtn2.setBounds(20,120,100,30);
                searcBtn2.addActionListener(this) ;
                frame.add(searcBtn2);
                
                labelmemberid = new JLabel("Member ID");
                labelmemberid.setBounds(20,300,80,30);
                frame.add(labelmemberid);
                
                txtfmemberid = new JTextField();
                txtfmemberid.setBounds(80,300,100,30);
                frame.add(txtfmemberid);
                txtfmemberid.setEditable(false);
              
                okBtn = new JButton("Ok");
                okBtn.setBounds(300,400,130,30);
                frame.add(okBtn);
                okBtn.addActionListener(this);                
        }
        if(e.getSource() == searcBtn1)
        { 
            Admin c = new Admin();   
            if(c.SearchCoach(Integer.parseInt(txtfSearch1.getText())))
            {
                int i = c.getIndex(Integer.parseInt(txtfSearch1.getText()));
                int coachid = Admin.getCoaches().get(i).getID();
                int nomofmem =  Admin.getCoaches().get(i).getNumOfMembers();
                txtfcoachid.setText(String.valueOf(coachid)); 
                txtfnoofmembers.setText(String.valueOf(nomofmem));
            }
            else
                JOptionPane.showMessageDialog(null,"This ID is not Found" , "Alert"
                                                        ,JOptionPane.DEFAULT_OPTION); 
        }
        if(e.getSource() == searcBtn2)
        {   
            Admin m = new Admin();
            if(c.SearchMember(Integer.parseInt(txtfSearch2.getText())))
            {
                int i = m.getIndexOfMembersArrList(Integer.parseInt(txtfSearch2.getText()));
                int coachid = Admin.getMembers().get(i).getID();
                txtfmemberid.setText(String.valueOf(coachid)); 
            }
            else
                JOptionPane.showMessageDialog(null,"This ID is not Found" , "Alert"
                                                        ,JOptionPane.DEFAULT_OPTION); 
        }            
        if(e.getSource() == okBtn)
        {
            if(c.AssignCoach(Integer.parseInt(txtfSearch2.getText()),Integer.parseInt(txtfSearch1.getText())))
            {
                JOptionPane.showMessageDialog(null,"This Coach is Assigned To This Member" , "Alert"
                            ,JOptionPane.DEFAULT_OPTION);
                resetPanelData();
            }
                    
            else
                JOptionPane.showMessageDialog(null,"Can't Assign This Coach to This Member" , "Alert" 
                                                                            ,JOptionPane.DEFAULT_OPTION );
        }                        
    }

    void resetPanelData() 
    {
        txtfSearch1.setText(""); txtfSearch2.setText(""); txtfcoachid.setText("");
        txtfmemberid.setText("");  txtfnoofmembers.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
