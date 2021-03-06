/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crossdomainsentiment;

import java.util.ArrayList;

/**
 *
 * @author Elcot
 */
public class FriendEnemy extends javax.swing.JFrame {

    /**
     * Creates new form FriendEnemy
     */
    public FriendEnemy() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Friend Attraction and Enemy Dispersion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(579, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setText("Friend Attraction and Enemy Dispersion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Rule 3: Similarity Measurement");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
static ArrayList sourcepositives=new ArrayList(); //TP
static        ArrayList sourcenegatives=new ArrayList(); //FP
 static   ArrayList targetpositives=new ArrayList(); //FN
 static       ArrayList targetnegatives=new ArrayList(); //TN
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                
        for(int i=0;i<SentimentClassification.sourceafterSentiClassi.size();i++)
        {
            if(!(PivotsMatching.fori.contains(""+i)))
            {
                String s=SentimentClassification.sourceafterSentiClassi.get(i).toString().trim();
                String sp[]=s.trim().split(" --> ");
                if(sp[1].trim().equals("Positive"))
                {
                    sourcepositives.add(s.trim()+"@@"+i);
                }
                else if(sp[1].trim().equals("Negative"))
                {
                    sourcenegatives.add(s.trim()+"@@"+i);
                }
                else if(sp[1].trim().equals("Neutral"))
                {
                    sourcepositives.add(s.trim().replaceAll("Neutral", "Positive")+"@@"+i);
                }
            }
        }
        
               
        for(int j=0;j<SentimentClassification.targetafterSentiClassi.size();j++)
        {
            if(!(PivotsMatching.forj.contains(""+j)))
            {
                String s=SentimentClassification.targetafterSentiClassi.get(j).toString().trim();
                String sp[]=s.trim().split(" --> ");
                if(sp[1].trim().equals("Positive"))
                {
                    targetpositives.add(s.trim()+"@@"+j);
                }
                else if(sp[1].trim().equals("Negative"))
                {
                    targetnegatives.add(s.trim()+"@@"+j);
                }   
                else if(sp[1].trim().equals("Neutral"))
                {
                    targetpositives.add(s.trim().replaceAll("Neutral", "Positive")+"@@"+j);
                }
            }
        }        
        System.out.println("sourcepositives.size() 1: "+sourcepositives.size());
        System.out.println("targetpositives.size() 2: "+targetpositives.size());
        System.out.println("sourcenegatives.size() 3: "+sourcenegatives.size());
        System.out.println("targetnegatives.size()4 : "+targetnegatives.size());
        
        int posmin=0;
        if(sourcepositives.size()<=targetpositives.size())
        {
            posmin=sourcepositives.size();
        }
        else
        {
            posmin=targetpositives.size();
        }
        
        jTextArea1.append("==========================================\n            Friend Attraction\n==========================================\n");
        for(int i=0;i<posmin;i++)
        {
            String s=sourcepositives.get(i).toString().trim();
            String sp[]=s.trim().split("@@");
            PivotsMatching.fori.add(sp[1].trim());
            String t=targetpositives.get(i).toString().trim();
            String sp1[]=t.trim().split("@@");
            PivotsMatching.forj.add(sp1[1].trim());
            jTextArea1.append("Source --> "+s.trim()+"\nTarget --> "+t.trim()+"\n\n");
        }
        
        int negmin=0;
        if(sourcenegatives.size()<=targetnegatives.size())
        {
            negmin=sourcenegatives.size();
        }
        else
        {
            negmin=targetnegatives.size();
        }
        
        jTextArea1.append("==========================================\n            Enemy Dispersion\n==========================================\n");
        for(int i=0;i<negmin;i++)
        {
            String s=sourcenegatives.get(i).toString().trim();
            String sp[]=s.trim().split("@@");
            PivotsMatching.fori.add(sp[1].trim());
            String t=targetnegatives.get(i).toString().trim();
            String sp1[]=t.trim().split("@@");
            PivotsMatching.forj.add(sp1[1].trim());
            jTextArea1.append("Source --> "+s.trim()+"\nTarget --> "+t.trim()+"\n\n");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SimilarityMeasurement mf=new SimilarityMeasurement();
        mf.setTitle("Similarity Measurement");
        mf.setVisible(true);
        mf.setResizable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FriendEnemy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FriendEnemy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FriendEnemy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FriendEnemy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FriendEnemy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
