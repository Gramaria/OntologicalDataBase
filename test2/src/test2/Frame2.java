package test2;

import javax.swing.*;
import java.sql.*;
import org.antlr.v4.runtime.*;

public class Frame2 extends JFrame {

    public Frame2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Введите условия поиска троек");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Объект", "Предикат", "Субъект"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Выполнить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static Connection getDBConnection() {
    Connection con2 = null;
    try {
        Class.forName("org.mariadb.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        System.out.println(e.getMessage());
    }
    try {
        con2 =  DriverManager.getConnection("jdbc:mysql://localhost:3308/triples2","root","mary");
        return con2;
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return con2;
    }
    private void output(Integer id, Integer n) {
        Connection con2=null;
        int id1;
        int id2;
        String s="";
        String pr;
        try {
           con2 = getDBConnection();
           Statement s2 = con2.createStatement();
           String sql01 = "SELECT `object id`, predicate, `subject id` FROM triples WHERE `triple id`='"+id+"';";
           ResultSet r01 = s2.executeQuery(sql01);
           while (r01.next()) {
                  id1 = r01.getInt(1);
                  String sql02 = "SELECT name FROM objects WHERE id='"+id1+"';";
                  ResultSet r02 = s2.executeQuery(sql02);
                  while (r02.next()) 
                    s = r02.getString(1);
                  jTable1.setValueAt(s, n, 0);
                  pr = r01.getString(2);
                  jTable1.setValueAt(pr, n, 1);
                  id2 = r01.getInt(3); 
                  String sql03 = "SELECT name FROM objects WHERE id='"+id2+"';";
                  ResultSet r03 = s2.executeQuery(sql03);
                  while (r03.next()) 
                    s = r03.getString(1);
               	  jTable1.setValueAt(s, n, 2);
            }
           } catch (Exception e) {
              e.printStackTrace();
           }
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String name = jTextField1.getText();
        String a = "";
        int j=0; 
        jTextField1.setText("");
        for (int i=0;i<15;i++){
           jTable1.setValueAt("", i, 0);
           jTable1.setValueAt("", i, 1);
           jTable1.setValueAt("", i, 2);
        }
        if (name.equals("")) {
        JOptionPane.showMessageDialog(null,"Поле не заполнено",
                "Inane error",JOptionPane.ERROR_MESSAGE);
        } else
        {
        try{
        ANTLRInputStream input = new ANTLRInputStream(name+"\n");
		testLexer lexer = new testLexer((CharStream) input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
		testParser parser = new testParser(tokens);
        parser.test();
        a = parser.memory;
        System.out.println(a);
      }catch(Exception e)
      {
         System.out.println("Error: "+e);
      } 
        Connection con2=null;
        int id;
        try {
           con2 = getDBConnection();
           Statement s2 = con2.createStatement();
           ResultSet r01 = s2.executeQuery(a);
           while (r01.next()) {
                  id = r01.getInt(1);
                  output(id,j);
                  j++;
                }
            } catch (Exception e) {
               e.printStackTrace();
            }    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
