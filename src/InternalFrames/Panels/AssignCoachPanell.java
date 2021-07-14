package InternalFrames.Panels;

import java.util.ArrayList;
import javaapplication213.Admin;
import javaapplication213.Coach;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AssignCoachPanell extends javax.swing.JPanel 
{
    String[][] Data = { };
    String[] Headers = {"ID" , "First Name" , "Last Name" , "E-mail" , "Password",
                               "Heighy" , "Weight" , "CoachID"};   
    private JTable table;
    public AssignCoachPanell() 
    {
        initComponents();
        /*setSize(480,480);
        setVisible(true);
        //setLayout(null);
        
        table = new JTable(Data,Headers);
        table.setBounds(30,20,480,400);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setViewportView(table);
        add(scrollPane);*/
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
                "ID", "First Name", "Last Name", "E-mail", "Password", "Age", "Gender", "Number Of Members"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
