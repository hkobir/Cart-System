/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.awt.print.PrinterException;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Hkobir
 */
public class Billing extends javax.swing.JFrame {
    DefaultListModel<String>cart=new DefaultListModel<>();
    Date ob=new Date();
    String date=ob.toString();
int chickenq=0,beepq=0,hamq=0,vegitableq=0;
double chickenp=350.0,beepp=450.0,hamp=250.0,vegitablep=150.0; 
int lamonq=0,orangeq=0,mangoq=0,lachchiq=0;
double lamonp=50.0,orangep=60.0,mangop=70.0,lachchip=150.0; 
double totalp,deliveryp,discount;
Random rand=new Random();
int T_id=rand.nextInt(31222)+5333;


    /**
     * Creates new form P2
     */
    public Billing() {
        initComponents();
    }
    
              public Billing(int chickenq,int beepq,int hamq,int vegitableq,int lamonq,int orangeq,int mangoq,int lachchiq,DefaultListModel<String>cart) {
        initComponents();
        this.cart=cart;
        this.chickenq=chickenq;
        this.beepq=beepq;
        this.hamq=hamq;
        this.vegitableq=vegitableq;
        
        this.lamonq=lamonq;
        this.orangeq=orangeq;
        this.mangoq=mangoq;
        this.lachchiq=lachchiq;
        
        totalp=chickenq*chickenp+beepq*beepp+hamq*hamp+vegitableq*vegitablep+lamonq*lamonp+orangeq*orangep+mangoq*mangop+lachchiq*lachchip;
        cart.addElement("----------------------------------");
           cart.addElement("Sub Total : "+totalp+" Tk.");
           if(totalp>5000){
           discount=(totalp*15)/100;
           totalp=totalp-discount;
           cart.addElement("Discount(15%) : -"+discount+" Tk.");
           
           }
           deliveryp=(totalp*5)/100;
           totalp=totalp+deliveryp;
           cart.addElement("Delivery charge(5%) : +"+deliveryp+" Tk.");
           
            cart.addElement("----------------------------------");
            cart.addElement("Net Amount : "+totalp+" Tk.");
            
        jList1.setModel(cart);
        
        
        
        //ivoice memo
        
        
         reciept.setText("**********************************\n");
         reciept.setText(reciept.getText()+"***********Cafe FAnshi************\n");
        reciept.setText(reciept.getText() +"**********Sales Invoice***********\n");
         reciept.setText(reciept.getText()+"**********************************\n");
         reciept.setText(reciept.getText()+"Date: "+date+"\n");
         reciept.setText(reciept.getText()+"----------------------------------\n");
        for(int i=0;i<cart.getSize();i++){
          
        reciept.setText(reciept.getText()+cart.elementAt(i)+"\n");
        }
        
    }
    
    
          public Billing(int chickenq,int beepq,int hamq,int vegitableq,DefaultListModel<String>cart) {
        initComponents();
        this.cart=cart;
        this.chickenq=chickenq;
        this.beepq=beepq;
        this.hamq=hamq;
        this.vegitableq=vegitableq;
        totalp=chickenq*chickenp+beepq*beepp+hamq*hamp+vegitableq*vegitablep;
        cart.addElement("----------------------------------");
           cart.addElement("Sub Total : "+totalp+" Tk.");
           if(totalp>5000){
           discount=(totalp*15)/100;
           totalp=totalp-discount;
           cart.addElement("Discount(15%) : -"+discount+" Tk.");
           
           }
           deliveryp=(totalp*5)/100;
           totalp=totalp+deliveryp;
           cart.addElement("Delivery charge(5%) : +"+deliveryp+" Tk.");
           
            cart.addElement("----------------------------------");
            cart.addElement("Net Anount : "+totalp+" Tk.");
            
        jList1.setModel(cart);
        
        
        //ivoice memo
        
        
         reciept.setText("**********************************\n");
         reciept.setText(reciept.getText()+"***********Cafe FAnshi************\n");
        reciept.setText(reciept.getText() +"**********Sales Invoice***********\n");
         reciept.setText(reciept.getText()+"**********************************\n");
         reciept.setText(reciept.getText()+"Date: "+date+"\n");
         reciept.setText(reciept.getText()+"----------------------------------\n");
        for(int i=0;i<cart.getSize();i++){
          
        reciept.setText(reciept.getText()+cart.elementAt(i)+"\n");
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

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reciept = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Billing");

        jScrollPane1.setViewportView(jList1);

        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        reciept.setEditable(false);
        reciept.setColumns(20);
        reciept.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        reciept.setRows(5);
        reciept.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        reciept.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(reciept);

        jLabel1.setText("Cart");

        jLabel2.setText("---Sales Invoice---");

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton5)
                .addGap(100, 100, 100)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(115, 115, 115))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Page1().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            reciept.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea reciept;
    // End of variables declaration//GEN-END:variables
}
