package InternalFrames.Panels;

import java.util.ArrayList;
import javaapplication213.Admin;
import javaapplication213.Member;
import javax.swing.table.DefaultTableModel;

public class ListMembersPanel extends javax.swing.JPanel {

    public ListMembersPanel() 
    {
        initComponents();
        AddRows();
    }

    public void AddRows()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] rowData = new Object[9];
        
        Admin m = new Admin();
        ArrayList<Member> list = new ArrayList<>();
        list = m.ListMembers();
        for(int i=0; i<list.size(); i++)
        {
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getFirstName();
            rowData[2] = list.get(i).getLastName();
            rowData[3] = list.get(i).getEmail();
            rowData[4] = list.get(i).getAge();
            rowData[5] = list.get(i).getGender();
            rowData[6] = list.get(i).getHeight();
            rowData[7] = list.get(i).getWeight();
            rowData[8] = list.get(i).getCoachID();
            model.addRow(rowData);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "E-mail", "Age", "Gender", "Height", "Weight", "Coach Id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
