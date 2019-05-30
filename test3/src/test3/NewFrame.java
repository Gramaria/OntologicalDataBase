package test3;

import java.sql.*;
import javax.swing.*;
import java.io.*;

public class NewFrame extends JFrame {
    
    public NewFrame(String o, String log, String pass) {
        initComponents();
        int r = 0,l = 0, p = 0, d = 0;
        double absdepth = 0, absbreadth = 0, a2;
        double a = data_driven(o, log, pass);
        jTable2.setValueAt(a, 8, 0);
        int[] root = roots(o, log, pass);
        while (root[r] != 0)
            r++;
        int[] path = pathes(root[0], o, log, pass);
        while (path[p] != 0)
            p++;
        int[] leaf = leaves(o, log, pass);
        while (leaf[l] != 0)
            l++;
        for (int i = 0; i < p; i++)
            absdepth = absdepth + path[i];
        jTable2.setValueAt(absdepth, 0, 0);
        jTable2.setValueAt(String.format("%.5f", absdepth / p), 1, 0);
        int[] level = levels(r, root, o, log, pass);
        while (level[d] != 0)
            d++;
        for (int i = 0; i < d; i++)
            absbreadth = absbreadth + level[i];
        jTable2.setValueAt(absbreadth, 2, 0);
        jTable2.setValueAt(String.format("%.5f", absbreadth / d), 3, 0);
        a2 = nG(o, log, pass); 
        jTable2.setValueAt(String.format("%.5f", tSet(o, log, pass)/a2), 4, 0);
        jTable2.setValueAt(String.format("%.5f", l/a2), 5, 0);
        jTable2.setValueAt(predicates(o, log, pass), 6, 0);
        jTable2.setValueAt(String.format("%.5f", predicates(o, log, pass)/a2), 7, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Результаты:");

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Абсолютная глубина"},
                {"Средняя глубина"},
                {"Абсолютная ширина"},
                {"Средняя ширина"},
                {"Метрика запутанности"},
                {"Метрика ветвистости"},
                {"Количество различных типов связей"},
                {"Нормированное количество различных типов связей"},
                {"Полнота словаря"},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Метрика"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(21);
        jScrollPane1.setViewportView(jTable1);

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Значение"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setRowHeight(21);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static Connection getDBConnection(String o, String l, String p) {
    Connection con2 = null;
    try {
        Class.forName("org.mariadb.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        System.out.println(e.getMessage());
    }
    try {
        con2 =  DriverManager.getConnection(o,l,p);
        return con2;
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return con2;
    }
    private static int data_driven(String o, String l, String pass) {
        int id = 0,n = 0,k = 0,p;
        Connection connect = null;
        try {
            connect = getDBConnection(o,l,pass);
            Statement s = connect.createStatement();
            File file = new File("/Рабочая/К курсовой 2017/dictionary.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                n++;
                String sql1 = "SELECT id FROM objects WHERE name='"+line+"';";
                ResultSet r01 = s.executeQuery(sql1);
                while (r01.next()) {
                    id = r01.getInt(1);
                }
                if (id==0)
                    k++;
                id = 0;
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        try {
             if(connect != null)
                   connect.close();
            } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        p = k*100/n;
        return p;
    }
    private static int[] roots(String o, String l, String p) {
        int[] roots = new int[50];
        int id1,id2,i = 0;
        Connection connect = null;
        try {
            connect = getDBConnection(o,l,p);
            Statement s = connect.createStatement();
            String sql1 = "SELECT `object id` FROM triples WHERE predicate='is a';";
            ResultSet r01 = s.executeQuery(sql1);
            while (r01.next()) {
                id2 = 0;
                id1 = r01.getInt(1);
                String sql2 = "SELECT `subject id` FROM triples WHERE `subject id`='"+id1+"';";
                ResultSet r02 = s.executeQuery(sql2);
                while (r02.next()) {
                    id2 = r02.getInt(1);
                }
                if (id2==0) {
                   roots[i] = id1;
                   i++;
                }
            }
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        try {
             if(connect != null)
                   connect.close();
            } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        return roots;
    }
    private static int[] leaves(String o, String l, String p) {
        int[] leaves = new int[100];
        int id1,id2,i = 0;
        Connection connect = null;
        try {
            connect = getDBConnection(o, l, p);
            Statement s = connect.createStatement();
            String sql1 = "SELECT `subject id` FROM triples WHERE predicate='is a';";
            ResultSet r01 = s.executeQuery(sql1);
            while (r01.next()) {
                id2 = 0;
                id1 = r01.getInt(1);
                String sql2 = "SELECT `object id` FROM triples WHERE `object id`='"+id1+"';";
                ResultSet r02 = s.executeQuery(sql2);
                while (r02.next()) {
                    id2 = r02.getInt(1);
                }
                if (id2==0) {
                   leaves[i] = id1;
                   i++;
                }
            }
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        try {
             if(connect != null)
                   connect.close();
            } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        return leaves;
    }
    private static int[] pathes(int root, String o, String l, String p) {
        int[] path = new int[100];
        int[][] nodes = new int[100][100];
        int j, k = 0, r = 1, n = 0;
        Connection connect = null;
        for (int i1 = 0; i1 < 100; i1++) {
            path[i1] = 0;
            for (int i2 = 0; i2 <100; i2++) 
                nodes[i1][i2] = 0;
        }
        nodes[0][0] = 2;
        nodes[0][1] = root;
        try {
            connect = getDBConnection(o, l, p);
            Statement s = connect.createStatement();
            while (nodes[n][0] != 0) {
                for (int i = 1; i < nodes[n][0]; i++) {
                    String sql1 = "SELECT `subject id` FROM triples WHERE `object id`='"+nodes[n][i]+"';";
                    j = 1;
                    ResultSet r01 = s.executeQuery(sql1);
                    while (r01.next()) {
                        nodes[r][j] = r01.getInt(1);
                        j++;
                    }
                    nodes[r][0] = j;
                    if (j == 1) {
                        path[k] = n + 1;
                        k++;
                    }
                    else 
                        r++;   
                }
                n++;
            }
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        try {
             if(connect != null)
                   connect.close();
            } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        return path;
    }
    private static int[] levels(int r,int[] root, String o, String l, String p) {
        int[] levels = new int[100];
        int[][] nodes = new int[100][100];
        int j = 0, k = 0, n = 0, ex = 0;
        Connection connect = null;
        for (int i1 = 0; i1 < 100; i1++) {
            levels[i1] = 0;
            for (int i2 = 0; i2 <100; i2++) 
                nodes[i1][i2] = 0;
        }
        nodes[0] = root;
        levels[0] = r;
        try {
            connect = getDBConnection(o, l, p);
            Statement s = connect.createStatement();
            while (nodes[n][0] != 0) {
                for (int i = 0; i < levels[n]; i++) {
                    String sql1 = "SELECT `subject id` FROM triples WHERE `object id`='"+nodes[n][i]+"';";
                    ResultSet r01 = s.executeQuery(sql1);
                    while (r01.next()) {
                        k = r01.getInt(1);
                        for (int i1 = 0; i1 < n+1; i1++)
                            for (int i2 = 0; i2 < levels[n]; i2++) 
                                if (k == nodes[i1][i2]) 
                                    ex = 1;
                        if (ex == 0) {
                            nodes[n+1][j] = k; 
                            j++;
                        }
                        ex = 0;
                    }
                }
                n++;
                levels[n] = j;
                j = 0;
               
            }
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        try {
             if(connect != null)
                   connect.close();
            } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        return levels;
    }
    private static int predicates(String o, String l, String p) {
        Connection connect = null;
        int id = 0;
        try {
            connect = getDBConnection(o,l,p);
            Statement s = connect.createStatement();
            String sql1 = "SELECT DISTINCT predicate FROM triples;";
            ResultSet r01 = s.executeQuery(sql1);
            while (r01.next()) {
                r01.getString(1);
                id++;
            }
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        try {
             if(connect != null)
                   connect.close();
            } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        return id;
    }
    private static int nG(String o, String l, String p) {
        Connection connect = null;
        int id = 0;
        try {
            connect = getDBConnection(o,l,p);
            Statement s = connect.createStatement();
            String sql1 = "SELECT COUNT(*) FROM objects;";
            ResultSet r01 = s.executeQuery(sql1);
            while (r01.next()) {
                id = r01.getInt(1);
            }
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        try {
             if(connect != null)
                   connect.close();
            } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        return id;
    }
    private static int nT(String o, String l, String p) {
        Connection connect = null;
        int id = 0;
        try {
            connect = getDBConnection(o,l,p);
            Statement s = connect.createStatement();
            String sql1 = "SELECT COUNT(*) FROM triples;";
            ResultSet r01 = s.executeQuery(sql1);
            while (r01.next()) {
                id = r01.getInt(1);
            }
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        try {
             if(connect != null)
                   connect.close();
            } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        return id;
    }
    private static int tSet(String o, String l, String p) {
        Connection connect = null;
        int id = 0, i;
        try {
            connect = getDBConnection(o,l,p);
            Statement s = connect.createStatement();
            for (int j = 1; j <= nG(o, l, p); j++) {
                String sql1 = "SELECT COUNT(*) FROM triples WHERE  predicate='is a'AND`object id`='"+j+"';";
                ResultSet r01 = s.executeQuery(sql1);
                while (r01.next()) {
                    i = r01.getInt(1);
                    if (i > 1)
                        id++;
                }
            }
        } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        try {
             if(connect != null)
                   connect.close();
            } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
