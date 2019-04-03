/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Frame1 extends javax.swing.JFrame {

    int number01=0; //ตั้วตั้งในการเช็ด
    int number02=0; 
    int count01=0;
    int round=11;
     
    public Frame1() { 
        initComponents(); //ส่วนประกอบต่างๆของเฟรม
        JB1.setVisible(false);  // ปิดปุ่ม>=
        JB2.setVisible(false);  // ปิดปุ่ม< ไว้ก่อน
    }
    
    public void rannumber(){
        number02=number01;
        number01=(int)(Math.random() * (100));
        numrandom.setText(Integer.toString(number01)); //แปลงเลขเป็นข้อความก่อน
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        heade = new javax.swing.JLabel();
        JB1 = new javax.swing.JButton();
        JB2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        JL1 = new javax.swing.JLabel();
        JL2 = new javax.swing.JLabel();
        JL3 = new javax.swing.JLabel();
        JBack = new javax.swing.JButton();
        JB6 = new javax.swing.JButton();
        Cnumber = new javax.swing.JPanel();
        numrandom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        heade.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        heade.setForeground(new java.awt.Color(255, 255, 255));
        heade.setText("Brain MATH");

        JB1.setBackground(new java.awt.Color(255, 255, 255));
        JB1.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        JB1.setForeground(new java.awt.Color(0, 102, 153));
        JB1.setText("▲");
        JB1.setToolTipText("");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });

        JB2.setBackground(new java.awt.Color(255, 255, 255));
        JB2.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        JB2.setForeground(new java.awt.Color(204, 0, 102));
        JB2.setText("▼");
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        JL1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        JL1.setForeground(new java.awt.Color(255, 255, 255));
        JL1.setText("count");
        JL1.setToolTipText("");

        JL2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JL2.setForeground(new java.awt.Color(255, 255, 255));
        JL2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JL2.setText("0");
        JL2.setToolTipText("");

        JL3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JL3.setForeground(new java.awt.Color(255, 255, 255));
        JL3.setText("/10");
        JL3.setToolTipText("");

        JBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBack.setText("กลับ");
        JBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBackActionPerformed(evt);
            }
        });

        JB6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JB6.setText("START");
        JB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB6)
                .addGap(58, 58, 58)
                .addComponent(JL1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL2)
                    .addComponent(JL3)
                    .addComponent(JL1)
                    .addComponent(JBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Cnumber.setBackground(new java.awt.Color(255, 255, 255));

        numrandom.setBackground(new java.awt.Color(255, 255, 255));
        numrandom.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        numrandom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numrandom.setText("0");

        javax.swing.GroupLayout CnumberLayout = new javax.swing.GroupLayout(Cnumber);
        Cnumber.setLayout(CnumberLayout);
        CnumberLayout.setHorizontalGroup(
            CnumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CnumberLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        CnumberLayout.setVerticalGroup(
            CnumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CnumberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" แล้วนำมาเปรียบเทียบกัลเลขปัจจุบัน  แล้วทำการเลือกว่า  ▲ มากกว่าเท่ากับ หรือ ▼ น้อยกว่า  ง่ายๆใช่ไหมคะ");
        jLabel1.setToolTipText("");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("วิธีการเล่น  : กดปุ่ม START เพื่อเริ่มเล่น กติกามีอยู่ว่าให้จำตัวเลขก่อนหน้า แล้วนำมาเปรียบเทียบกับเลขปัจจุบัน");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(JB2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(heade))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(201, 201, 201)
                            .addComponent(JB1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Cnumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(heade)
                .addGap(18, 18, 18)
                .addComponent(JB1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Cnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(JB2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB2ActionPerformed
    //ส่วนของปุ่มน้อยกว่า
    round--; 
    if(round>0){
        if(number01<number02){
            count01++;
        }
        number02=number01;
        number01=(int)(Math.random() * (100));
        numrandom.setText(Integer.toString(number01));

     }
     else{
        if(number01<number02){ //เช็ดรอบสุดท้ายของเกม
           count01++;
           JL2.setText(Integer.toString(count01));
        }
         JOptionPane.showMessageDialog(null,"ผลคะแนนจ้า : "+count01,"สนุกไหมคะ ?",JOptionPane.INFORMATION_MESSAGE);
         count01=0;
         round=11;
         number01=0;
         numrandom.setText(Integer.toString(number01));
         
        JB1.setVisible(false);  // ปิดปุ่มมากกว่าหรือเท่ากับ ไว้ก่อน
        JB2.setVisible(false);  // ปิดปุ่มน้อยกว่า ไว้ก่อน
        JB6.setVisible(true);   // เปิดปุ่ม start
         
     }
        JL2.setText(Integer.toString(count01));//โชว์คะแนนข้างล่าง lable

    }//GEN-LAST:event_JB2ActionPerformed

    private void JB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB1ActionPerformed
    //สวนของปุ่มมากกว่าหรือเท่ากับ
    round--;
    if(round>0){ // ถ้าไม่ใช่ 0 ทำต่อไปเรื่อยๆ 
        if(number01>=number02){
            count01++;
        }
        number02=number01;
        number01=(int)(Math.random() * (100));
        numrandom.setText(Integer.toString(number01));
    }
     else{ //หมดรอบ
        if(number01>=number02){  //เช็ดรอบสุดท้ายของเกม 
           count01++;
           JL2.setText(Integer.toString(count01)); // โชว์คะแนนข้างล่าง
        }
         JOptionPane.showMessageDialog(null,"ผลคะแนนจ้า : "+count01,"สนุกไหมคะ ?",JOptionPane.INFORMATION_MESSAGE);
         count01=0;
         round=11;
         number01=0;
         numrandom.setText(Integer.toString(number01));//โชว์เลข 0 เมื่อเริ่มเกมใหม่
         
        JB1.setVisible(false);  // ปิดปุ่มมากกว่าหรือเท่ากับ ไว้ก่อน
        JB2.setVisible(false);  // ปิดปุ่มน้อยกว่า ไว้ก่อน
        JB6.setVisible(true);  //  เปิดปุ่ม start
     }
     
        JL2.setText(Integer.toString(count01));
 
    }//GEN-LAST:event_JB1ActionPerformed

    private void JBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBackActionPerformed
        Project form1 = new Project(); // การเปิดหน้า Project แล้วปิดหน้าเกม
        form1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_JBackActionPerformed

    private void JB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB6ActionPerformed
        //ปุ่ม start
        round--; //ทุกครั้งที่ทำกับปุ่มจะลดรอบ
        number01=(int)(Math.random() * (100));
        numrandom.setText(Integer.toString(number01));
        JB1.setVisible(true); // เปิดปุ่มมากกว่าเท่ากับ
        JB2.setVisible(true); // เปิดปุ่มน้อยกว่า
        JB6.setVisible(false); //ปิดปุ่มstart
    }//GEN-LAST:event_JB6ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cnumber;
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB2;
    private javax.swing.JButton JB6;
    private javax.swing.JButton JBack;
    private javax.swing.JLabel JL1;
    private javax.swing.JLabel JL2;
    private javax.swing.JLabel JL3;
    private javax.swing.JLabel heade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel numrandom;
    // End of variables declaration//GEN-END:variables
}
