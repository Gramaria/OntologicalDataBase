package test2;

import javax.swing.*;
import java.sql.*;

public class NewFrame extends JFrame {
 
    public NewFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 200));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Введите триплет");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setToolTipText("");
        jTextField1.setName(""); // NOI18N

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Субъект");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Предикат");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Субъект");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Сохранить");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton1)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Label");
        jTextField1.getAccessibleContext().setAccessibleName("f1");
        jTextField2.getAccessibleContext().setAccessibleName("f2");
        jTextField3.getAccessibleContext().setAccessibleName("f3");
        jLabel2.getAccessibleContext().setAccessibleName("l1");
        jLabel3.getAccessibleContext().setAccessibleName("l2");
        jLabel4.getAccessibleContext().setAccessibleName("l3");
        jButton1.getAccessibleContext().setAccessibleName("b1");

        getAccessibleContext().setAccessibleName("b1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String object = jTextField1.getText();
        String predicate = jTextField2.getText();
        String subject = jTextField3.getText();
        Connection con = null;
        int id1=0;
        int id2=0;
        int id=0;
        if (object.equals("")||subject.equals("")||predicate.equals("")) {
        JOptionPane.showMessageDialog(null,"Все поля должны быть заполнены",
                "Inane error",JOptionPane.ERROR_MESSAGE);
        } else
        {
           try {
           Class.forName("org.mariadb.jdbc.Driver");
           con =  DriverManager.getConnection("jdbc:mysql://localhost:3308/triples2","root","mary");
           Statement s = con.createStatement();
        
           String sql01 = "SELECT id FROM objects WHERE name='"+object+"';";
           s.executeQuery(sql01);
           ResultSet r01 = s.executeQuery(sql01);
           while (r01.next()) {
               id1 = r01.getInt(1);
            }
           String sql02 = "SELECT id FROM objects WHERE name='"+subject+"';";
           s.executeQuery(sql02);
           ResultSet r02 = s.executeQuery(sql02);
           while (r02.next()) {
               id2 = r02.getInt(1);
            }
           String sql0 = "SELECT `triple id` FROM triples "
                   + "WHERE (predicate='"+predicate+"' AND `object id`='"+id1+"' AND `subject id`='"+id2+"');";
           s.executeQuery(sql0);
           ResultSet r0 = s.executeQuery(sql0);
           while (r0.next()) {
               id = r0.getInt(1);
            }
           if (id==0)   {
              if (id1==0)  {
                 PreparedStatement sql1 = con.prepareStatement ("INSERT INTO objects (name) VALUES (?)");
                 sql1.setString(1,object);
                 sql1.executeUpdate();
              
                 String sql3 = "SELECT MAX(id) FROM  objects ";
                 ResultSet r1 = s.executeQuery(sql3);
                 while (r1.next()) {
                     id1 = r1.getInt(1);
                 }
               }
              if (id2==0)   {
                 PreparedStatement sql2 = con.prepareStatement ("INSERT INTO objects (name) VALUES (?)");
                 sql2.setString(1,subject);
                 sql2.executeUpdate();
           
                 String sql4 = "SELECT MAX(id) FROM  objects ";
                 ResultSet r2 = s.executeQuery(sql4);
                 while (r2.next()) {
                  id2 = r2.getInt(1);
                 }
               }
               PreparedStatement sql5 = con.prepareStatement
                  ("INSERT INTO `triples` (`predicate`,`object id`,`subject id`) VALUES (?,?,?)");
               sql5.setString(1,predicate);
               sql5.setInt(2, id1);
               sql5.setInt(3, id2);
               sql5.executeUpdate();

               System.out.println("Record Inserted Successfully");
               jTextField1.setText("");
               jTextField2.setText("");
               jTextField3.setText("");
               //dispose();
               //System.exit(0);
           }
           else  JOptionPane.showMessageDialog(null,"Такая тройка уже есть в базе",
                "Inane error",JOptionPane.ERROR_MESSAGE);
           } catch (Exception e) {
             // TODO Auto-generated catch block
              e.printStackTrace();
           }
                // Close
            try {
             if(con != null)
                   con.close();
            } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
