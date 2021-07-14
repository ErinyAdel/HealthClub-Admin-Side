package InternalFrames;

import InternalFrames.Panels.AddMemberPanel;
import InternalFrames.Panels.DeleteMemberPanel;
import InternalFrames.Panels.ListMembersPanel;
import InternalFrames.Panels.UpdateMemberPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MembersMenuItem extends javax.swing.JInternalFrame implements ActionListener
{
    private ListMembersPanel panel1 = new ListMembersPanel();
    private AddMemberPanel panel2 = new AddMemberPanel();
    private UpdateMemberPanel panel3  = new UpdateMemberPanel();
    private DeleteMemberPanel panel4  = new DeleteMemberPanel();
    private GridBagLayout layout ;
    
    private JPanel LeftPanel = new JPanel();
    private JButton ListMembersBtn ,AddMemberBtn , UpdateMemberBtn ,DeleteMemberBtn;
    private JPanel DaynamicPanel = new JPanel();
    public MembersMenuItem() 
    {
        setSize(680,625);
        setVisible(true);
        setClosable(true);    
        setLayout(null);
          
        ListMembersBtn = new JButton("List Members");
        ListMembersBtn.setBounds(40,100,120,30);
        add(ListMembersBtn);
        add(Box.createRigidArea(new Dimension(0,80)));
        AddMemberBtn = new JButton("Add Member");
        AddMemberBtn.setBounds(40,200,120,30);
        add(AddMemberBtn);
        add(Box.createRigidArea(new Dimension(0,80)));
        UpdateMemberBtn = new JButton("Update Member");
        UpdateMemberBtn.setBounds(40,300,120,30);
        add(UpdateMemberBtn);
        add(Box.createRigidArea(new Dimension(0,80)));
        DeleteMemberBtn = new JButton("Delete Member");
        DeleteMemberBtn.setBounds(40,400,120,30);
        add(DeleteMemberBtn);
        add(Box.createRigidArea(new Dimension(0,80)));
               
        ListMembersBtn.addActionListener(this);
        AddMemberBtn.addActionListener(this);
        UpdateMemberBtn.addActionListener(this);
        DeleteMemberBtn.addActionListener(this);
        
        layout = new GridBagLayout();
        DaynamicPanel.setLayout(layout);
        GridBagConstraints cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        DaynamicPanel.setSize(480,625);
        DaynamicPanel.setBounds(200,0,480,625);
        DaynamicPanel.setOpaque(false);
        
        DaynamicPanel.add(panel1 , cons);
        DaynamicPanel.add(panel2 , cons);
        DaynamicPanel.add(panel3 , cons);
        DaynamicPanel.add(panel4 , cons);
        panel1.setVisible(false);
        panel2.setVisible(true);
        panel3.setVisible(false);
        panel4.setVisible(false);
           
        LeftPanel.setSize(200,625);
        LeftPanel.setBounds(0,0,200,625);
        LeftPanel.setBackground(Color.PINK);
        
        add(LeftPanel);
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
       if(e.getSource() == ListMembersBtn)
        {
            panel1.setVisible(true);
            panel2.setVisible(false); 
            panel3.setVisible(false); 
            panel4.setVisible(false);
        }
        else if(e.getSource() == AddMemberBtn)
        {
            panel1.setVisible(false);
            panel2.setVisible(true); 
            panel3.setVisible(false); 
            panel4.setVisible(false);
        }
        else if(e.getSource() == UpdateMemberBtn)
        {
            panel1.setVisible(false);
            panel2.setVisible(false); 
            panel3.setVisible(true); 
            panel4.setVisible(false);
        }
        else if(e.getSource() == DeleteMemberBtn)
        {
            panel1.setVisible(false);
            panel2.setVisible(false); 
            panel3.setVisible(false); 
            panel4.setVisible(true);
        }    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
