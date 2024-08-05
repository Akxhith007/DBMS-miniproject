
import Connector.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.lang.String;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Manohar
 */
public class request extends javax.swing.JFrame {

    /**
     * Creates new form stocks
     */
    public request() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        jPanel3.setVisible(false);
    }

    public void updateStock(String qty,String bg)
    {
         try{
          Connection con=jdbc.getCon();
          Statement st2=con.createStatement();
          st2.executeUpdate("Update stock set Stocks=Stocks-'"+qty+"',TotalDonations=TotalDonations+'"+qty+"'  where BloodGroup='"+bg+"'");
          
          
           String sino=jLabel10.getText();
        try{
         // Connection con=jdbc.getCon();
             Statement st1=con.createStatement();
            st1.executeUpdate("delete from request where sino='"+sino+"'");
          
           }
             catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,e); 
           }
        
         try{
         // Connection con=jdbc.getCon();
            Statement st1=con.createStatement();
            ResultSet rs1=st1.executeQuery("select * from request");
          
             jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
             JOptionPane.showMessageDialog(null,"Request Accepted");  
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }    
   }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(216, 50, 60));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, 30));

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 180, 30));

        jButton2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton2.setText("ACCEPT");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton1.setText("REJECT");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 180, 30));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NAME");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BLOOD GROUP");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("QUANTITY");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, -1));

        jLabel10.setForeground(new java.awt.Color(57, 46, 74));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 40, 30));

        jLabel11.setForeground(new java.awt.Color(57, 46, 74));
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 80, 20));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 170, 480, 390);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(300, 80, 910, 560);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1100, 190, 0, 0);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1540, 760));

        jPanel2.setBackground(new java.awt.Color(234, 235, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 100)); // NOI18N
        jLabel1.setText("REQUESTS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 590, 100));

        jButton5.setBackground(new java.awt.Color(234, 235, 234));
        jButton5.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-arrow-50.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         
         try{
          Connection con=jdbc.getCon();
          Statement st1=con.createStatement();
          ResultSet rs1=st1.executeQuery("select sino,ReceiverId,Name,Category,BloodGroup,PhoneNo,RequestDate,Time,Quantity,Status from request");
          
              jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }    
         
    }//GEN-LAST:event_formComponentShown

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminhome().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
    String stat,sino,trick;
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        jPanel3.setVisible(true);
        int index =jTable2.getSelectedRow();
        TableModel Model=jTable2.getModel();
        String id=Model.getValueAt(index,1).toString();
        String bg=Model.getValueAt(index,4).toString();
        String qty=Model.getValueAt(index,8).toString();
        String name=Model.getValueAt(index,2).toString();
        sino=Model.getValueAt(index,0).toString();
        stat=Model.getValueAt(index,9).toString();

        jLabel10.setText(sino);
        jLabel5.setText(name);
        jLabel2.setText(id);
        jLabel3.setText(bg);
        jLabel4.setText(qty);
        jLabel11.setText(stat);
        try
        {
              Connection con=jdbc.getCon();
             Statement st1=con.createStatement();
            ResultSet rs1= st1.executeQuery("select * from request where sino='"+sino+"' ");
            if(rs1.next())
            {
               jLabel12.setText(rs1.getString(11)); 
               trick=jLabel12.getText();
            }
        }  
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e); 
                }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
         jPanel3.setVisible(false);
        String sino=jLabel10.getText();
        String tt=(String)jLabel11.getText();
        int i=Integer.parseInt(trick);
        if(i==0)
        {
        try{
           Connection con=jdbc.getCon();
           Statement st1=con.createStatement();
           st1.executeUpdate("Update request set Status='REJECTED',track='-1' where sino='"+sino+"' ");
          
        }
        catch(Exception e)
            
        {
           JOptionPane.showMessageDialog(null,e); 
        }
        
         try{
             Connection con=jdbc.getCon();
             Statement st1=con.createStatement();
              ResultSet rs1=st1.executeQuery("select sino,ReceiverId,Name,Category,BloodGroup,PhoneNo,RequestDate,Time,Quantity,Status from request");

          
              jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
              JOptionPane.showMessageDialog(null,"Request Rejected");  
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }    
        }
        else
       {
              JOptionPane.showMessageDialog(null,"Action Already Performed");    
             }
        
        
        
       // jLabel10.setText(null);
        //jLabel2.setText(null);
       // jLabel3.setText(null);
       // jLabel4.setText(null);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String qty=jLabel4.getText();
        int str=Integer.parseInt(qty);
        String bg=jLabel3.getText();
        String sino=jLabel10.getText();
       String tt=(String)jLabel12.getText();
      int i=Integer.parseInt(trick);
 
        //JOptionPane.showMessageDialog(null,i);
        
        if(i==0)
        {
           try{
                Connection con=jdbc.getCon();
                Statement st1=con.createStatement();
                ResultSet rs1=st1.executeQuery("select * from stock where BloodGroup='"+bg+"'");
                if(rs1.next())
               {
                     // jLabel11.setText(rs1.getString(2));
                     String m=rs1.getString(2);
                     int s=Integer.parseInt(m);
                     if(s<str)
                    {
                             JOptionPane.showMessageDialog(null,"No suffecient Stocks");  
                     
                     }
        
                
                      else
                    {
                    try{
                         //Connection con1=jdbc.getCon();
                          Statement st2=con.createStatement();
                          st2.executeUpdate("update stock set Stocks=Stocks-'"+qty+"',TotalDonations=TotalDonations+'"+qty+"' where BloodGroup='"+bg+"'");   
                          st2.executeUpdate("update request set Status='ACCEPTED',track='1' where sino='"+sino+"'");
                          JOptionPane.showMessageDialog(null,"Request Accepted");
                        }
                        catch(Exception e)
                      {
                       JOptionPane.showMessageDialog(null,e); 
                      }
                }
          
                }
   
             try{
                      //Connection con=jdbc.getCon();
                       Statement st2=con.createStatement();
                       ResultSet rs2=st2.executeQuery("select sino,ReceiverId,Name,Category,BloodGroup,PhoneNo,RequestDate,Time,Quantity,Status from request");

          
                        jTable2.setModel(DbUtils.resultSetToTableModel(rs2));
                      // JOptionPane.showMessageDialog(null,"Request Accepted");  
           
                }
               catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
              }    
          } 
           catch(Exception e)
            {
                             JOptionPane.showMessageDialog(null,e);
             } 
           
      }
       
        else
        {
            JOptionPane.showMessageDialog(null,"Actoin Already Performed");
        }
        
  

       jPanel3.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
