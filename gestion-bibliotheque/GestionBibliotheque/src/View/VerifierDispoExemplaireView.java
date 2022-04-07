/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*; 

public class VerifierDispoExemplaireView extends javax.swing.JFrame {

    /**
     * Creates new form VerifierDispoExemplaireView
     */
    public VerifierDispoExemplaireView() {
        initComponents();
        
        initView(); 
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblNbrExemplaireDispo = new javax.swing.JLabel();
        lblNbrExemplaire = new javax.swing.JLabel();
        btnAnnuler = new javax.swing.JButton();
        btnEmprunter = new javax.swing.JButton();
        lblSearchTitre = new javax.swing.JLabel();
        txtTitre = new javax.swing.JTextField();
        tbnSearch = new javax.swing.JButton();
        lblISBN = new javax.swing.JLabel();
        lblISBNExemplaire = new javax.swing.JLabel();
        lblTitre = new javax.swing.JLabel();
        lblTitreExemplaire = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verifier nombre exemplaires disponible");

        lblNbrExemplaireDispo.setText("Nombre d'exemplaires diponible : ");

        btnAnnuler.setText("Annuler");

        btnEmprunter.setMnemonic('E');
        btnEmprunter.setText("Emprunter");

        lblSearchTitre.setText("Titre:");

        txtTitre.setMaximumSize(new java.awt.Dimension(88, 22));
        txtTitre.setMinimumSize(new java.awt.Dimension(88, 22));

        tbnSearch.setText("Rechercher");

        lblISBN.setText("ISBN :");

        lblTitre.setText("Titre : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearchTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbnSearch))
                            .addComponent(lblISBNExemplaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitreExemplaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEmprunter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnnuler))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNbrExemplaireDispo)
                                .addGap(48, 48, 48)
                                .addComponent(lblNbrExemplaire, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchTitre)
                    .addComponent(txtTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnSearch))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(lblISBNExemplaire))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitre)
                    .addComponent(lblTitreExemplaire))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNbrExemplaire)
                    .addComponent(lblNbrExemplaireDispo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmprunter)
                    .addComponent(btnAnnuler))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>                        

    
    private void initView() {
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerifierDispoExemplaireView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifierDispoExemplaireView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifierDispoExemplaireView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifierDispoExemplaireView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    	
    }
    
    public JButton getBtnEmprunter() {
    	return btnEmprunter; 
    }
    
    // Variables declaration                     
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnEmprunter;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblISBNExemplaire;
    private javax.swing.JLabel lblNbrExemplaire;
    private javax.swing.JLabel lblNbrExemplaireDispo;
    private javax.swing.JLabel lblSearchTitre;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JLabel lblTitreExemplaire;
    private javax.swing.JButton tbnSearch;
    private javax.swing.JTextField txtTitre;
    // End of variables declaration                   
}
