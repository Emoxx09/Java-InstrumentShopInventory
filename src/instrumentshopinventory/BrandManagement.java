/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentshopinventory;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Flinchy
 */
public class BrandManagement extends javax.swing.JFrame {

    /**
     * Creates new form BrandManagement
     */
    public BrandManagement() throws FileNotFoundException {
        initComponents();
        showitem();
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
        jLabel5 = new javax.swing.JLabel();
        BrandName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        BrandSelect = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        salesText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Brand Management");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Brand");

        BrandName.setBackground(new java.awt.Color(51, 51, 51));
        BrandName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        BrandName.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(2, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        table.setBackground(new java.awt.Color(51, 51, 51));
        table.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Price", "Stock", "Sales", "Pieces Sold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        BrandSelect.setBackground(new java.awt.Color(51, 51, 51));
        BrandSelect.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BrandSelect.setForeground(new java.awt.Color(255, 255, 255));
        BrandSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Brand" }));
        BrandSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandSelectActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SHOW");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD BRAND");

        home.setBackground(new java.awt.Color(51, 51, 51));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.setToolTipText("");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        remove.setBackground(new java.awt.Color(51, 51, 51));
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setText("REMOVE");
        remove.setToolTipText("");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        salesText.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        salesText.setForeground(new java.awt.Color(255, 255, 255));
        salesText.setText("TOTAL BRAND SALES: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(remove)
                            .addGap(11, 11, 11))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(home))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BrandSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(36, 36, 36)
                        .addComponent(salesText)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BrandSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2)
                                    .addComponent(salesText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(remove))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int continuer = 1;

        if (BrandName.getText().equals("")) {
            continuer = 0;
        }
        
        if (continuer == 1) {
            try {
                String brname = underScorer();
                existChecker(brname);
                BrandName.setText("");
                showitem();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "There seems to be missing fields!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BrandSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandSelectActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BrandSelectActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!BrandSelect.getSelectedItem().equals("Select Brand")){
            showStocks();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please choose a brand!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        try {
            // TODO add your handling code here:
            home();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrandManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        try {
            // TODO add your handling code here:
            String name = BrandName.getText();
            String content = "";
            int continuer = 0;
            Scanner sc = new Scanner (new FileReader("src//BrandNames.txt"));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if (line.equals("")){
                    continue;
                }
                if (line.equals(name)){
                    continuer = 1;
                    continue;
                }
                content = content + line + "\n";
            }
            BufferedWriter bw = new BufferedWriter (new FileWriter("src//BrandNames.txt"));
            bw.append(content);
            bw.close();
            if (continuer == 0){
                JOptionPane.showMessageDialog(null, "That brand name does not exist!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Brand Removed");
            }
            showitem();
            BrandName.setText("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrandManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BrandManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(BrandManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrandManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrandManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrandManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BrandManagement().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(BrandManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public void addItemx() throws IOException {
	String brName = underScorer();
            BufferedWriter bw = new BufferedWriter (new FileWriter ("src\\BrandNames.txt", true));
            bw.append(brName + "\n");
            JOptionPane.showMessageDialog(null, "Brand Added");
            bw.close();
    }
    
    public String underScorer(){
        Scanner sc = new Scanner (BrandName.getText());
        String start = sc.next();
        while(sc.hasNext()){
            start = start + "_" + sc.next();
        }
        return start;
    }
    
    public void existChecker(String brname) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner (new FileReader("src\\BrandNames.txt"));
        int continuer = 1;
        while (sc.hasNextLine()){
            String currBr = sc.nextLine();
            if (!currBr.equals(brname)){
                continue;
            }
            else{
                continuer = 0;
                break;
            }
        }
        if (continuer == 1){
            addItemx();
        }
        else{
            JOptionPane.showMessageDialog(null, "The Brand name already exists!");
        }
    }
    
    public void showitem() throws FileNotFoundException{
        BrandSelect.removeAllItems();
        Scanner sc = new Scanner (new FileReader ("src\\BrandNames.txt"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("")) {
                continue;
            }
            Scanner lineinput = new Scanner (line);
            String name = lineinput.nextLine();
            BrandSelect.addItem(name);
        }
        sc.close();
    }
    public void showStocks() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
                int totalSales = 0;
		try {
			Scanner sc = new Scanner (new FileReader ("src\\Storage.txt"));
			
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
                                Scanner linereader = new Scanner (line);
                                
                                String a1 = linereader.next();
                                String a2 = linereader.next();
                                String a3 = linereader.next();
                                String a4 = linereader.next();
                                String a5 = linereader.next();
                                
				if (line.equals("") || !a5.equals(BrandSelect.getSelectedItem())) {
					continue;
				}
                                String salesLine = getSales (a1);
                                Scanner salesreader = new Scanner (salesLine);
                                int sales = salesreader.nextInt();
                                int piecesSold = salesreader.nextInt();
                                totalSales = totalSales + sales;
                                String line1 = a1 + "\t" + a2 + "\t" + a3 + "\t" + a4 + "\t" + sales + "\t" + piecesSold;
				
				String data[] = line1.split("\t");
				model.addRow(data);
			}
			sc.close();
                        salesText.setText("TOTAL BRAND SALES: " + totalSales);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
    public String getSales(String id) throws FileNotFoundException{
        
        int totalSales = 0;
        int piecesSold = 0;
        Scanner sc = new Scanner (new FileReader("src\\Sales.txt"));
        
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if (line.equals("")){
                continue;
            }
            Scanner linereader = new Scanner (line);
            String id1 = linereader.next();
            String name = linereader.next();
            String brand = linereader.next();
            int pieces = linereader.nextInt();
            int profit = linereader.nextInt();
            
            if (id1.equals(id)){
                totalSales = totalSales + profit;
                piecesSold = piecesSold + pieces;
            }
        }
        
        return totalSales + "\t" + piecesSold;
    }
    
    public void home() throws FileNotFoundException{
        MainFrame mf = new MainFrame();
        mf.show();
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BrandName;
    private javax.swing.JComboBox<String> BrandSelect;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton remove;
    private javax.swing.JLabel salesText;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
