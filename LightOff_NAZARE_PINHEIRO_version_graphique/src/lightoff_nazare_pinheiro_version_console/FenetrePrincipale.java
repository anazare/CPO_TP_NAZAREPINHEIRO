/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_nazare_pinheiro_version_console;

import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author anaza
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeJeu grille;
    int nbCoups;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 7;
        int nbColonnes = 7;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        initialiserPartie();
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36); // cr�ation d'un bouton
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }

    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        btnLigne1 = new javax.swing.JButton();
        btnLigne2 = new javax.swing.JButton();
        btnLigne3 = new javax.swing.JButton();
        btnLigne4 = new javax.swing.JButton();
        btnLigne5 = new javax.swing.JButton();
        btnLigne6 = new javax.swing.JButton();
        btnLigne7 = new javax.swing.JButton();
        btnColonne1 = new javax.swing.JButton();
        btnColonne2 = new javax.swing.JButton();
        btnColonne3 = new javax.swing.JButton();
        btnColonne4 = new javax.swing.JButton();
        btnColonne5 = new javax.swing.JButton();
        btnColonne6 = new javax.swing.JButton();
        btnColonne7 = new javax.swing.JButton();
        btnDiagSup1 = new javax.swing.JButton();
        btnDiagSup2 = new javax.swing.JButton();
        btnDiagSup3 = new javax.swing.JButton();
        btnDiagSup4 = new javax.swing.JButton();
        btnDiagSup5 = new javax.swing.JButton();
        btnDiagSup6 = new javax.swing.JButton();
        btnDiagSup7 = new javax.swing.JButton();
        btnDiagInf1 = new javax.swing.JButton();
        btnDiagInf2 = new javax.swing.JButton();
        btnDiagInf3 = new javax.swing.JButton();
        btnDiagInf4 = new javax.swing.JButton();
        btnDiagInf5 = new javax.swing.JButton();
        btnDiagInf6 = new javax.swing.JButton();
        btnDiagInf7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDiagSupM1 = new javax.swing.JButton();
        btnDiagSupM2 = new javax.swing.JButton();
        btnDiagSupM3 = new javax.swing.JButton();
        btnDiagSupM4 = new javax.swing.JButton();
        btnDiagSupM5 = new javax.swing.JButton();
        btnDiagSupM6 = new javax.swing.JButton();
        btnDiagSupM7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnDiagInfM4 = new javax.swing.JButton();
        btnDiagInfM3 = new javax.swing.JButton();
        btnDiagInfM1 = new javax.swing.JButton();
        btnDiagInfM7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnDiagInfM5 = new javax.swing.JButton();
        btnDiagInfM2 = new javax.swing.JButton();
        btnDiagInfM6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(255, 204, 204));
        PanneauGrille.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 360, 360));

        btnLigne1.setText("btnLigne0");
        btnLigne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        btnLigne2.setText("btnLigne1");
        btnLigne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        btnLigne3.setText("btnLigne2");
        btnLigne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        btnLigne4.setText("btnLigne3");
        btnLigne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        btnLigne5.setText("btnLigne4");
        btnLigne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btnLigne6.setText("btnLigne5");
        btnLigne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        btnLigne7.setText("btnLigne6");
        btnLigne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        btnColonne1.setText("C0");
        btnColonne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 50, -1));

        btnColonne2.setText("C1");
        btnColonne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 50, -1));

        btnColonne3.setText("C2");
        btnColonne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 50, -1));

        btnColonne4.setText("C3");
        btnColonne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 60, -1));

        btnColonne5.setText("C4");
        btnColonne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 50, -1));

        btnColonne6.setText("C5");
        btnColonne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 50, -1));

        btnColonne7.setText("C6");
        btnColonne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 50, -1));

        btnDiagSup1.setText("D0");
        btnDiagSup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSup1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 50, -1));

        btnDiagSup2.setText("D1");
        btnDiagSup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSup2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 50, -1));

        btnDiagSup3.setText("D2");
        btnDiagSup3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSup3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 50, -1));

        btnDiagSup4.setText("D3");
        btnDiagSup4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSup4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSup4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 60, -1));

        btnDiagSup5.setText("D4");
        btnDiagSup5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSup5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSup5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 50, -1));

        btnDiagSup6.setText("D5");
        btnDiagSup6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSup6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSup6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 50, -1));

        btnDiagSup7.setText("D6");
        btnDiagSup7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSup7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSup7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 50, -1));

        btnDiagInf1.setText("D0");
        btnDiagInf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInf1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 50, -1));

        btnDiagInf2.setText("D1");
        btnDiagInf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInf2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 50, -1));

        btnDiagInf3.setText("D2");
        btnDiagInf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInf3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 50, -1));

        btnDiagInf4.setText("D3");
        btnDiagInf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInf4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 60, -1));

        btnDiagInf5.setText("D4");
        btnDiagInf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInf5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 50, -1));

        btnDiagInf6.setText("D5");
        btnDiagInf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInf6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 50, -1));

        btnDiagInf7.setText("D6");
        btnDiagInf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInf7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 50, -1));

        jLabel1.setText("Diagonale descendante");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, 20));

        jLabel2.setText("Diagonale descendante");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, 20));

        btnDiagSupM1.setText("D0");
        btnDiagSupM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSupM1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSupM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, -1));

        btnDiagSupM2.setText("D1");
        btnDiagSupM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSupM2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSupM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 50, -1));

        btnDiagSupM3.setText("D2");
        btnDiagSupM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSupM3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSupM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 50, -1));

        btnDiagSupM4.setText("D3");
        btnDiagSupM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSupM4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSupM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 60, -1));

        btnDiagSupM5.setText("D4");
        btnDiagSupM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSupM5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSupM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 50, -1));

        btnDiagSupM6.setText("D5");
        btnDiagSupM6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSupM6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSupM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 50, -1));

        btnDiagSupM7.setText("D6");
        btnDiagSupM7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSupM7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSupM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 50, -1));

        jLabel3.setText("Diagonale montante");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 20));

        btnDiagInfM4.setText("D3");
        btnDiagInfM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInfM4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInfM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 60, -1));

        btnDiagInfM3.setText("D2");
        btnDiagInfM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInfM3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInfM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 50, -1));

        btnDiagInfM1.setText("D0");
        btnDiagInfM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInfM1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInfM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 50, -1));

        btnDiagInfM7.setText("D6");
        btnDiagInfM7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInfM7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInfM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 50, -1));

        jLabel4.setText("Diagonale montante");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, 20));

        btnDiagInfM5.setText("D4");
        btnDiagInfM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInfM5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInfM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 50, -1));

        btnDiagInfM2.setText("D1");
        btnDiagInfM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInfM2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInfM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 50, -1));

        btnDiagInfM6.setText("D5");
        btnDiagInfM6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInfM6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInfM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne1ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(0);
        repaint();
    }//GEN-LAST:event_btnLigne1ActionPerformed

    private void btnLigne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne2ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(1);
        repaint();
    }//GEN-LAST:event_btnLigne2ActionPerformed

    private void btnLigne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne3ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(2);
        repaint();
    }//GEN-LAST:event_btnLigne3ActionPerformed

    private void btnLigne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne4ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(3);
        repaint();
    }//GEN-LAST:event_btnLigne4ActionPerformed

    private void btnLigne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne7ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(6);
        repaint();
    }//GEN-LAST:event_btnLigne7ActionPerformed

    private void btnLigne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne5ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(4);
        repaint();
    }//GEN-LAST:event_btnLigne5ActionPerformed

    private void btnLigne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne6ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(5);
        repaint();
    }//GEN-LAST:event_btnLigne6ActionPerformed

    private void btnColonne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne7ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(6);
        repaint();
    }//GEN-LAST:event_btnColonne7ActionPerformed

    private void btnColonne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne1ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(0);
        repaint();
    }//GEN-LAST:event_btnColonne1ActionPerformed

    private void btnColonne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne2ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(1);
        repaint();
    }//GEN-LAST:event_btnColonne2ActionPerformed

    private void btnColonne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne3ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(2);
        repaint();
    }//GEN-LAST:event_btnColonne3ActionPerformed

    private void btnColonne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne4ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(3);
        repaint();
    }//GEN-LAST:event_btnColonne4ActionPerformed

    private void btnColonne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne5ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(4);
        repaint();
    }//GEN-LAST:event_btnColonne5ActionPerformed

    private void btnColonne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne6ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(5);
        repaint();
    }//GEN-LAST:event_btnColonne6ActionPerformed

    private void btnDiagSup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSup1ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(0, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSup1ActionPerformed

    private void btnDiagSup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSup2ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(1, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSup2ActionPerformed

    private void btnDiagSup3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSup3ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(2, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSup3ActionPerformed

    private void btnDiagSup4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSup4ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(3, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSup4ActionPerformed

    private void btnDiagSup5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSup5ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(4, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSup5ActionPerformed

    private void btnDiagSup6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSup6ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(5, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSup6ActionPerformed

    private void btnDiagSup7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSup7ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(6, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSup7ActionPerformed

    private void btnDiagInf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInf1ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(0, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInf1ActionPerformed

    private void btnDiagInf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInf2ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(1, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInf2ActionPerformed

    private void btnDiagInf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInf3ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(2, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInf3ActionPerformed

    private void btnDiagInf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInf4ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(3, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInf4ActionPerformed

    private void btnDiagInf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInf5ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(4, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInf5ActionPerformed

    private void btnDiagInf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInf6ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(5, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInf6ActionPerformed

    private void btnDiagInf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInf7ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante(6, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInf7ActionPerformed

    private void btnDiagSupM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSupM1ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(0, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSupM1ActionPerformed

    private void btnDiagSupM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSupM2ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(1, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSupM2ActionPerformed

    private void btnDiagSupM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSupM3ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(2, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSupM3ActionPerformed

    private void btnDiagSupM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSupM4ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(3, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSupM4ActionPerformed

    private void btnDiagSupM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSupM5ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(4, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSupM5ActionPerformed

    private void btnDiagSupM6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSupM6ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(5, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSupM6ActionPerformed

    private void btnDiagSupM7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSupM7ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(6, "oui");
        repaint();
    }//GEN-LAST:event_btnDiagSupM7ActionPerformed

    private void btnDiagInfM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInfM1ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(0, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInfM1ActionPerformed

    private void btnDiagInfM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInfM2ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(1, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInfM2ActionPerformed

    private void btnDiagInfM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInfM3ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(2, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInfM3ActionPerformed

    private void btnDiagInfM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInfM4ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(3, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInfM4ActionPerformed

    private void btnDiagInfM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInfM5ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(4, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInfM5ActionPerformed

    private void btnDiagInfM6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInfM6ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(5, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInfM6ActionPerformed

    private void btnDiagInfM7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInfM7ActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante(6, "non");
        repaint();
    }//GEN-LAST:event_btnDiagInfM7ActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnColonne1;
    private javax.swing.JButton btnColonne2;
    private javax.swing.JButton btnColonne3;
    private javax.swing.JButton btnColonne4;
    private javax.swing.JButton btnColonne5;
    private javax.swing.JButton btnColonne6;
    private javax.swing.JButton btnColonne7;
    private javax.swing.JButton btnDiagInf1;
    private javax.swing.JButton btnDiagInf2;
    private javax.swing.JButton btnDiagInf3;
    private javax.swing.JButton btnDiagInf4;
    private javax.swing.JButton btnDiagInf5;
    private javax.swing.JButton btnDiagInf6;
    private javax.swing.JButton btnDiagInf7;
    private javax.swing.JButton btnDiagInfM1;
    private javax.swing.JButton btnDiagInfM2;
    private javax.swing.JButton btnDiagInfM3;
    private javax.swing.JButton btnDiagInfM4;
    private javax.swing.JButton btnDiagInfM5;
    private javax.swing.JButton btnDiagInfM6;
    private javax.swing.JButton btnDiagInfM7;
    private javax.swing.JButton btnDiagSup1;
    private javax.swing.JButton btnDiagSup2;
    private javax.swing.JButton btnDiagSup3;
    private javax.swing.JButton btnDiagSup4;
    private javax.swing.JButton btnDiagSup5;
    private javax.swing.JButton btnDiagSup6;
    private javax.swing.JButton btnDiagSup7;
    private javax.swing.JButton btnDiagSupM1;
    private javax.swing.JButton btnDiagSupM2;
    private javax.swing.JButton btnDiagSupM3;
    private javax.swing.JButton btnDiagSupM4;
    private javax.swing.JButton btnDiagSupM5;
    private javax.swing.JButton btnDiagSupM6;
    private javax.swing.JButton btnDiagSupM7;
    private javax.swing.JButton btnLigne1;
    private javax.swing.JButton btnLigne2;
    private javax.swing.JButton btnLigne3;
    private javax.swing.JButton btnLigne4;
    private javax.swing.JButton btnLigne5;
    private javax.swing.JButton btnLigne6;
    private javax.swing.JButton btnLigne7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
