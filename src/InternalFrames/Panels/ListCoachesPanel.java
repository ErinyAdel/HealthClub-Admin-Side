package InternalFrames.Panels;

import java.util.ArrayList;
import javaapplication213.Admin;
import javaapplication213.Coach;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ListCoachesPanel extends javax.swing.JPanel 
{
    private TableModel tableMode;
    private JTable table;
    public ListCoachesPanel() 
    {
        /*Object[][] Data = { };
    
        Object[] Headers = {"ID" , "First Name" , "Last Name" , "E-mail" , "Age" , "Salary" , "Gender" , "Number Of Members"};
    
        setSize(400,150);
        setVisible(true);
        
        tableMode = new DefaultTableModel(Data,Headers);
        
        table = new JTable();
        table.setBounds(30,40,200,300);
        JScrollPane scrollPane = new JScrollPane(table);
        
        add(scrollPane);*/
        initComponents();
        AddRows();
    }

    public void AddRows()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] rowData = new Object[8];
        
        Admin c = new Admin();
        ArrayList<Coach> list = new ArrayList<>();
        list = c.ListCoaches();
        for(int i=0; i<list.size(); i++)
        {
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getFirstName();
            rowData[2] = list.get(i).getLastName();
            rowData[3] = list.get(i).getEmail();
            rowData[4] = list.get(i).getAge();
            rowData[5] = list.get(i).getGender();
            rowData[6] = list.get(i).getSalary();
            rowData[7] = list.get(i).getNumOfMembers();
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
                "ID", "First Name", "Last Name", "E-mail", "Age", "Gender", "Salary", "Number Of Members"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
