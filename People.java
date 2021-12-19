import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.*; 
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.TableColumnModel;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vedantgrover
 */
public class People extends javax.swing.JFrame {
    Connection con;
    //ResultSet rs = null; 
    

    /**
     * Creates new form People
     */
    public People() {
        initComponents();
        con = Connect.ConnecrDB();
        show_user();
    }
    public ArrayList<PeopleUser> PeopleList(){
        ArrayList<PeopleUser> usersList = new ArrayList<>();
        try{ 
            Class.forName("org.sqlite.JDBC"); 
            Connection con = DriverManager.getConnection("jdbc:sqlite:/Users/vedantgrover/Desktop/internalassessment.db"); 
            String query1="SELECT * FROM People";
            Statement s = con.createStatement();
            TableColumnModel columnModel = jTable1.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(1000);
            columnModel.getColumn(1).setPreferredWidth(1200);
            columnModel.getColumn(2).setPreferredWidth(1200);
            jTable1.setRowHeight(45);
            ResultSet rs = s.executeQuery(query1);
            PeopleUser user;
            while (rs.next()){
                user = new PeopleUser(rs.getInt("Id"), rs.getString("ClientOrStudent"), rs.getString("Name")); 
                usersList.add(user);
                
            }
            
            //s.close();
            
    }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return usersList; 
    }
    public void show_user(){
        ArrayList<PeopleUser> list = PeopleList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[3];
        for(int i=0; i<list.size(); i++ ){
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getClientOrStudent();
            row[2] = list.get(i).getName();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PersonIdTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        ClientOrStudentComboBox = new javax.swing.JComboBox<>();
        BackToMenuButton = new javax.swing.JButton();
        SearchTextField = new javax.swing.JTextField();
        SearchPeopleButton = new javax.swing.JButton();
        AddPeopleButton = new javax.swing.JButton();
        UpdatePeopleButton = new javax.swing.JButton();
        DeletePeopleButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screen Shot 2018-03-16 at 11.49.16 AM.png"))); // NOI18N
        jLabel1.setText("People table");

        jLabel3.setText("Id");

        jLabel4.setText("ClientOrStudent");

        jLabel5.setText("Name");

        PersonIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonIdTextFieldActionPerformed(evt);
            }
        });

        ClientOrStudentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client", "Student" }));

        BackToMenuButton.setBackground(new java.awt.Color(255, 255, 255));
        BackToMenuButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        BackToMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screen Shot 2018-03-16 at 12.20.01 PM.png"))); // NOI18N
        BackToMenuButton.setText("To menu");
        BackToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuButtonActionPerformed(evt);
            }
        });

        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });

        SearchPeopleButton.setBackground(new java.awt.Color(255, 255, 255));
        SearchPeopleButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        SearchPeopleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screen Shot 2018-03-16 at 12.23.15 PM.png"))); // NOI18N
        SearchPeopleButton.setText("Search");
        SearchPeopleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPeopleButtonActionPerformed(evt);
            }
        });

        AddPeopleButton.setBackground(new java.awt.Color(255, 255, 255));
        AddPeopleButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        AddPeopleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screen Shot 2018-03-17 at 11.47.23 AM.png"))); // NOI18N
        AddPeopleButton.setText("Add");
        AddPeopleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPeopleButtonActionPerformed(evt);
            }
        });

        UpdatePeopleButton.setBackground(new java.awt.Color(255, 255, 255));
        UpdatePeopleButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        UpdatePeopleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screen Shot 2018-03-17 at 11.50.32 AM.png"))); // NOI18N
        UpdatePeopleButton.setText("Update");
        UpdatePeopleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePeopleButtonActionPerformed(evt);
            }
        });

        DeletePeopleButton.setBackground(new java.awt.Color(255, 255, 255));
        DeletePeopleButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        DeletePeopleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screen Shot 2018-03-17 at 11.52.43 AM.png"))); // NOI18N
        DeletePeopleButton.setText("Delete");
        DeletePeopleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePeopleButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "ClientOrStudent", "Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BackToMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5))
                                                .addGap(21, 21, 21))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SearchPeopleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ClientOrStudentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PersonIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddPeopleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UpdatePeopleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeletePeopleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchPeopleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PersonIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClientOrStudentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(AddPeopleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdatePeopleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeletePeopleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackToMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PersonIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonIdTextFieldActionPerformed

    private void BackToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuButtonActionPerformed
        dispose(); 
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        //this.setVisible(false);       
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToMenuButtonActionPerformed

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextFieldActionPerformed

    private void SearchPeopleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPeopleButtonActionPerformed
        try{
            String sql = "select * from People where Name=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, SearchTextField.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Id");
                PersonIdTextField.setText(add1);
                String add2 = rs.getString("ClientOrStudent");
                ClientOrStudentComboBox.setSelectedItem(add2);
                String add3 = rs.getString("Name");
                NameTextField.setText(add3);
                pst.close();
                rs.close();

            }
        
            else {
                JOptionPane.showMessageDialog(null, "There is no data under that Name!" );
            }
            
            con.commit();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            

        }
    }//GEN-LAST:event_SearchPeopleButtonActionPerformed

    private void AddPeopleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPeopleButtonActionPerformed
        try{ 
       
            String sqladd = "INSERT into People values(?,?,?)";  
            PreparedStatement pst = con.prepareStatement(sqladd); 
            pst.setInt(1, Integer.parseInt(PersonIdTextField.getText()));
            pst.setString(2, ClientOrStudentComboBox.getSelectedItem().toString());
            pst.setString(3, NameTextField.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Added!");
            con.commit();
            
            //pst.close();
                     
} 
        catch(HeadlessException | NumberFormatException | SQLException e){
    JOptionPane.showMessageDialog(null, e);
    
} 
    
        AddPeopleButton.setEnabled(false);
        People ppl = new People();
        ppl.setVisible(true);
        dispose();
        //this.setVisible(false);
        
    }//GEN-LAST:event_AddPeopleButtonActionPerformed

    private void UpdatePeopleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePeopleButtonActionPerformed
       try{
            String value1 = PersonIdTextField.getText();
            String value2 = (String) ClientOrStudentComboBox.getSelectedItem();
            String value3 = NameTextField.getText();
            String sql = "update People set Id ='"+value1+"', ClientOrStudent ='"+value2+"', Name = '"+value3+"' where Id = '"+value1+"' ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated!");
            
            con.commit();
            
            //pst.close();

        }
        catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
        
        UpdatePeopleButton.setEnabled(false);
        People ppl = new People();
        ppl.setVisible(true);
        dispose();
        //this.setVisible(false);
    
        
    }//GEN-LAST:event_UpdatePeopleButtonActionPerformed

    private void DeletePeopleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePeopleButtonActionPerformed
     try{
            String sql = "delete from People where Id =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, PersonIdTextField.getText());
            pst.execute();

            
            JOptionPane.showMessageDialog(null, "Deleted!");
            
            con.commit();
            
            //pst.close();

        } 
     catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);

        }
        
        DeletePeopleButton.setEnabled(false);
        People ppl = new People();
        ppl.setVisible(true);
        dispose();
        //this.setVisible(false);
        
        
    }//GEN-LAST:event_DeletePeopleButtonActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        PersonIdTextField.setText(model.getValueAt(i, 0).toString());
        ClientOrStudentComboBox.setSelectedItem(model.getValueAt(i, 1).toString());
        NameTextField.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        PersonIdTextField.setText(model.getValueAt(i, 0).toString());
        ClientOrStudentComboBox.setSelectedItem(model.getValueAt(i, 1).toString());
        NameTextField.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new People().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPeopleButton;
    private javax.swing.JButton BackToMenuButton;
    private javax.swing.JComboBox<String> ClientOrStudentComboBox;
    private javax.swing.JButton DeletePeopleButton;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField PersonIdTextField;
    private javax.swing.JButton SearchPeopleButton;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JButton UpdatePeopleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
