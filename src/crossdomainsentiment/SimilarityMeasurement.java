/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crossdomainsentiment;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Elcot
 */
public class SimilarityMeasurement extends javax.swing.JFrame {

    /**
     * Creates new form SimilarityMeasurement
     */
    public SimilarityMeasurement() {
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

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Similarity Measurement");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addContainerGap(744, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Similarity Measurement");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Calculation Result");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("PivotsMatching.fori: "+PivotsMatching.fori);
        System.out.println("PivotsMatching.forj: "+PivotsMatching.forj);
        System.out.println("SentimentClassification.sourceafterSentiClassi.size(): "+SentimentClassification.sourceafterSentiClassi.size());
        System.out.println("SentimentClassification.targetafterSentiClassi.size(): "+SentimentClassification.targetafterSentiClassi.size());
        
        ArrayList sourceremain=new ArrayList();
        for(int i=0;i<SentimentClassification.sourceafterSentiClassi.size();i++)
        {
            if(!(PivotsMatching.fori.contains(""+i)))
            {
                String s=SentimentClassification.sourceafterSentiClassi.get(i).toString().trim();
                sourceremain.add(s.trim());
            }
        }
        
        ArrayList targetremain=new ArrayList();
        for(int j=0;j<SentimentClassification.targetafterSentiClassi.size();j++)
        {
            if(!(PivotsMatching.forj.contains(""+j)))
            {
                String s=SentimentClassification.targetafterSentiClassi.get(j).toString().trim();
                targetremain.add(s.trim());
            }
        }
        
        System.out.println("sourceremain.size(): "+sourceremain.size());
        System.out.println("targetremain.size(): "+targetremain.size());
        
        ArrayList noreptar=new ArrayList();
        
        for(int i=0;i<sourceremain.size();i++)
        {            
            String src=sourceremain.get(i).toString().trim();
            
            ArrayList couonly=new ArrayList();
            ArrayList couwithj=new ArrayList();
            for(int j=0;j<targetremain.size();j++)
            {
                //if(!(PivotsMatching.forj.contains(""+j)))
                //{
                    String tar=targetremain.get(j).toString().trim();
                    if(!(noreptar.contains(tar.trim())))
                    {
                        double similar=similarity(src.trim(), tar.trim());
                        couonly.add(similar);
                        couwithj.add(similar+"#"+j);
                    }
                //}
            }
            if(!(couonly.isEmpty()))
            {
        //    System.out.println("couonly: "+couonly);
            Collections.sort(couonly, Collections.reverseOrder());            
            String max=couonly.get(0).toString().trim();
            int j1=0;
            for(int j=0;j<couwithj.size();j++)
            {
                String st[]=couwithj.get(j).toString().trim().split("#");
                if(st[0].trim().equals(max.trim()))
                {
                    j1=Integer.parseInt(st[1].trim());                    
                    break;
                }                
            }
            String tar=targetremain.get(j1).toString().trim();
            noreptar.add(tar.trim());
            PivotsMatching.fori.add(""+i);
            PivotsMatching.forj.add(""+j1);
            jTextArea1.append("Source --> "+src.trim()+"\nTarget --> "+tar.trim()+"\n\n");
            System.out.println("Source: "+src.trim());
            System.out.println("Target: "+tar.trim());
            System.out.println("Similarity: "+max.trim());
            System.out.println("=====================================");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CalculationFrame rf=new CalculationFrame();
        rf.setTitle("View Results");
        rf.setVisible(true);
        rf.setResizable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(SimilarityMeasurement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimilarityMeasurement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimilarityMeasurement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimilarityMeasurement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //   SimilarityMeasurement.editDistance("ok from man made stage workland comes from", "This is my string");
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

    public static double similarity(String s1, String s2) {
    String longer = s1, shorter = s2;
    if (s1.length() < s2.length()) { // longer should always have greater length
      longer = s2; shorter = s1;
    }
    int longerLength = longer.length();
    if (longerLength == 0) { return 1.0; /* both strings are zero length */ }
    /* // If you have StringUtils, you can use it to calculate the edit distance:
    return (longerLength - StringUtils.getLevenshteinDistance(longer, shorter)) /
                               (double) longerLength; */
    return (longerLength - editDistance(longer, shorter)) / (double) longerLength;

  }
    public static int editDistance(String s1, String s2) {
   
        s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
 //  System.out.println(s1 +"  =   "+s2);
    int[] costs = new int[s2.length() + 1];
    
    for (int i = 0; i <= s1.length(); i++) {
      int lastValue = i;
      for (int j = 0; j <= s2.length(); j++) {
          
        if (i == 0)
          costs[j] = j;
        else {
          if (j > 0) {
            int newValue = costs[j - 1];
            if (s1.charAt(i - 1) != s2.charAt(j - 1))
              newValue = Math.min(Math.min(newValue, lastValue),
                  costs[j]) + 1;
            costs[j - 1] = lastValue;
            lastValue = newValue;
          }
        }
      //  System.out.println("cost inside j "+lastValue);
      }
    
      if (i > 0)
        costs[s2.length()] = lastValue;
       // System.out.println("cost inside i "+lastValue);
    }
    return costs[s2.length()];
  }
}
