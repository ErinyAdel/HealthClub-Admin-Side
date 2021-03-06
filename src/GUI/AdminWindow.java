package GUI;

import InternalFrames.AssignCoachMenuItem;
import InternalFrames.CoachesMenuItem;
import InternalFrames.MembersMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AdminWindow extends javax.swing.JFrame implements ActionListener
{
    private JMenuBar menubar = new JMenuBar();
    private JMenu menuFile , menuCoaches , menuMembers;
    private JMenuItem File_Report , File_Exit , Coaches_AssignC , Coaches , Members ;
    private JDesktopPane desktop = new JDesktopPane();  
    
    public AdminWindow() 
    {      
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello Admin");
        setLocationRelativeTo(null);
        
        menuFile = new JMenu("File");
        menuCoaches = new JMenu("Coaches");
        menuMembers = new JMenu("Members");
       
        menubar.add(menuFile);
        menubar.add(menuCoaches);
        menubar.add(menuMembers);
        setJMenuBar(menubar);
               
        File_Report = new JMenuItem("Reports");
        File_Report.addActionListener(this);
        File_Exit = new JMenuItem("Exit");
        File_Exit.addActionListener(this);
        menuFile.add(File_Report);
        menuFile.add(File_Exit);
                 
        Coaches = new JMenuItem("Coaches");
        Coaches.addActionListener(this);
        Coaches_AssignC = new JMenuItem("Assign Coach");
        Coaches_AssignC.addActionListener(this);
        menuCoaches.add(Coaches);
        menuCoaches.add(Coaches_AssignC);
              
        Members = new JMenuItem("Members");
        Members.addActionListener(this);
        menuMembers.add(Members);
        
        desktop.setBounds(0,0,680,680);
        add(desktop);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWindow().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == Coaches)
        {
            CoachesMenuItem internalFrame = new CoachesMenuItem();
            desktop.add(internalFrame);
            internalFrame.setVisible(true);
        }
        else if(e.getSource() == Members)
        {
            MembersMenuItem internalFrame = new MembersMenuItem();
            desktop.add(internalFrame);
            internalFrame.setVisible(true);
        }
        else if(e.getSource() == Coaches_AssignC)
        {
            AssignCoachMenuItem internalFrame = new AssignCoachMenuItem();
            desktop.add(internalFrame);
            internalFrame.setVisible(true);
        }
        else if(e.getSource() == File_Report)
        {
            
        }
        else if(e.getSource() == File_Exit)
        {
            int ch = JOptionPane.showConfirmDialog(null, "Are you Sure");
            if (ch == JOptionPane.OK_OPTION)
                System.exit(0);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
