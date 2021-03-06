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
        
        ImageIcon img = new ImageIcon(getClass().getResource("/ressources/icon.png"));
        setIconImage(img.getImage());
        
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
    	
        btnGrpTypeSearch = new javax.swing.ButtonGroup();
        pnlTypeDeRecherche = new javax.swing.JPanel();
        radioExemplaire = new javax.swing.JRadioButton();
        radioThese = new javax.swing.JRadioButton();
        pnlSearch = new javax.swing.JPanel();
        lblNbrExemplaireDispo = new javax.swing.JLabel();
        lblNbrExemplaire = new javax.swing.JLabel();
        btnAnnuler = new javax.swing.JButton();
        btnEmprunter = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtTitre = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblSecond = new javax.swing.JLabel();
        lblSecondText = new javax.swing.JLabel();
        lblThird = new javax.swing.JLabel();
        lblThirdText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verifier nombre exemplaires disponibles");

        pnlTypeDeRecherche.setBorder(javax.swing.BorderFactory.createTitledBorder("Type de recherche"));

        btnGrpTypeSearch.add(radioExemplaire);
        radioExemplaire.setSelected(true);
        radioExemplaire.setText("Exemplaire");

        btnGrpTypeSearch.add(radioThese);
        radioThese.setText("These");

        javax.swing.GroupLayout pnlTypeDeRechercheLayout = new javax.swing.GroupLayout(pnlTypeDeRecherche);
        pnlTypeDeRecherche.setLayout(pnlTypeDeRechercheLayout);
        pnlTypeDeRechercheLayout.setHorizontalGroup(
            pnlTypeDeRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTypeDeRechercheLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioExemplaire, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radioThese, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        pnlTypeDeRechercheLayout.setVerticalGroup(
            pnlTypeDeRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTypeDeRechercheLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnlTypeDeRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioExemplaire)
                    .addComponent(radioThese))
                .addGap(24, 24, 24))
        );

        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Recherche"));

        lblNbrExemplaireDispo.setText("Nombre d'exemplaires diponible : ");

        btnAnnuler.setText("Annuler");

        btnEmprunter.setText("Emprunter");
        btnEmprunter.setMnemonic('E');
        btnEmprunter.setEnabled(false);

        lblId.setText("ISBN : ");

        txtTitre.setMaximumSize(new java.awt.Dimension(88, 22));
        txtTitre.setMinimumSize(new java.awt.Dimension(88, 22));

        btnSearch.setText("Rechercher");
        btnSearch.setMnemonic('R');

        lblSecond.setText("Titre : ");

        lblThird.setText("Auteur : ");

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(lblSecond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlSearchLayout.createSequentialGroup()
                                .addComponent(txtTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch))
                            .addComponent(lblSecondText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSearchLayout.createSequentialGroup()
                            .addComponent(lblThird, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblThirdText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSearchLayout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(lblNbrExemplaireDispo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNbrExemplaire, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSearchLayout.createSequentialGroup()
                            .addGap(211, 211, 211)
                            .addComponent(btnEmprunter)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAnnuler)
                            .addGap(0, 12, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(32, 32, 32)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecond)
                    .addComponent(lblSecondText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThird)
                    .addComponent(lblThirdText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNbrExemplaireDispo)
                    .addComponent(lblNbrExemplaire, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmprunter)
                    .addComponent(btnAnnuler))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTypeDeRecherche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnlTypeDeRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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
    
    public JButton getBtnSearch() {
    	return btnSearch; 
    }
    
    public JButton getBtnAnnuler() {
    	return btnAnnuler; 
    }
    
    public javax.swing.JRadioButton getRadioExemplaire() {
		return radioExemplaire;
	}

	public javax.swing.JRadioButton getRadioThese() {
		return radioThese;
	}

	public javax.swing.JTextField getTxtTitre() {
		return txtTitre;
	}

	public JLabel getLblId() {
		return lblId; 
	}
	
	public JLabel getLblSecond() {
		return lblSecond; 
	}
	
	public JLabel getLblSecondText() {
		return lblSecondText; 
	}
	
	public JLabel getLblThirdText() {
		return lblThirdText; 
	}
	
	public JLabel getLblThird() {
		return lblThird; 
	}
	
	public JLabel getLblNombreExemplaireDisponible() {
		return lblNbrExemplaire; 
	}


	// Variables declaration                     
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnEmprunter;
    private javax.swing.ButtonGroup btnGrpTypeSearch;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNbrExemplaire;
    private javax.swing.JLabel lblNbrExemplaireDispo;
    private javax.swing.JLabel lblSecond;
    private javax.swing.JLabel lblSecondText;
    private javax.swing.JLabel lblThird;
    private javax.swing.JLabel lblThirdText;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlTypeDeRecherche;
    private javax.swing.JRadioButton radioExemplaire;
    private javax.swing.JRadioButton radioThese;
    private javax.swing.JTextField txtTitre;
    // End of variables declaration   
    
    
	public void triggerErrorMessage(String msj, String title) {
		
		JOptionPane.showMessageDialog(this, msj, title, JOptionPane.ERROR_MESSAGE);
		
	}

	public void triggerSQLError(String msj, String title) {
		
		JOptionPane.showMessageDialog(this, msj, title, JOptionPane.ERROR_MESSAGE);
		
	}

	public void triggerWarningMessage(String msj, String title) {

		JOptionPane.showMessageDialog(this, msj, title, JOptionPane.WARNING_MESSAGE);
		
	}
}
