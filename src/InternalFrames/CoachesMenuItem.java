package InternalFrames;

import InternalFrames.Panels.AddCoachPanel;
import InternalFrames.Panels.DeleteCoachPanel;
import InternalFrames.Panels.ListCoachesPanel;
import InternalFrames.Panels.UpdateCoachPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CoachesMenuItem extends javax.swing.JInternalFrame implements ActionListener
{
    private ListCoachesPanel panel1 = new ListCoachesPanel();
    private AddCoachPanel panel2 = new AddCoachPanel();
    private UpdateCoachPanel panel3  = new UpdateCoachPanel();
    private DeleteCoachPanel panel4  = new DeleteCoachPanel();
    private GridBagLayout layout ;
    
    private JPanel LeftPanel = new JPanel();
    private JButton ListCoachesBtn ,AddCoachBtn , UpdateCoachBtn,DeleteCoachBtn;
    private JPanel DynamicPanel = new JPanel();
    
    public CoachesMenuItem() 
    {
        setSize(680,625);
        setVisible(true);
        setClosable(true);  
        setLayout(null);
                 
        ListCoachesBtn = new JButton("List Coaches");
        ListCoachesBtn.setBounds(40,100,120,30);
        add(ListCoachesBtn);
        AddCoachBtn = new JButton("Add Coach");
        AddCoachBtn.setBounds(40,200,120,30);
        add(AddCoachBtn);
        UpdateCoachBtn = new JButton("Update Coach");
        UpdateCoachBtn.setBounds(40,300,120,30);
        add(UpdateCoachBtn);
        add(Box.createRigidArea(new Dimension(0,80)));
        DeleteCoachBtn = new JButton("Delete Coach");
        DeleteCoachBtn.setBounds(40,400,120,30);
        add(DeleteCoachBtn);
                       
        ListCoachesBtn.addActionListener(this);
        AddCoachBtn.addActionListener(this);
        UpdateCoachBtn.addActionListener(this);
        DeleteCoachBtn.addActionListener(this);
        
        layout = new GridBagLayout();
        DynamicPanel.setLayout(layout);
        GridBagConstraints cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        DynamicPanel.setSize(480,625);
        DynamicPanel.setBounds(200,0,480,625);
        
        DynamicPanel.add(panel1 , cons);
        DynamicPanel.add(panel2 , cons);
        DynamicPanel.add(panel3 , cons);
        DynamicPanel.add(panel4 , cons);
      
        panel1.setVisible(false);
        panel2.setVisible(true);
        panel3.setVisible(false);
        panel4.setVisible(false);        
                   
        LeftPanel.setSize(200,625);
        LeftPanel.setBounds(0,0,200,625);
        LeftPanel.setBackground(Color.PINK);
        
        add(LeftPanel);
        add(DynamicPanel);
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
        if(e.getSource() == ListCoachesBtn)
        {
            panel1.setVisible(true); 
            panel2.setVisible(false); 
            panel3.setVisible(false); 
            panel4.setVisible(false);
        }
        else if(e.getSource() == AddCoachBtn)
        {
            panel1.setVisible(false); 
            panel2.setVisible(true); 
            panel3.setVisible(false); 
            panel4.setVisible(false);
        }
        else if(e.getSource() == UpdateCoachBtn)
        {
            panel1.setVisible(false); 
            panel2.setVisible(false); 
            panel3.setVisible(true); 
            panel4.setVisible(false);
        }
        else if(e.getSource() == DeleteCoachBtn)
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
