/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_nazare_pinheiro_version_console;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.Border;

/**
 *
 * @author anaza
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    
    GrilleDeJeu grille;
    int nbCoups;
    int nbLignes;
    int nbColonnes;
    int i;
    int j;
    JComboBox JComboBox1;
    String difficulte;
   
    /**
     *  Affiche un message de victoire en fin de partie 
     */
    public void afficher_message_victoire(){
        switch (difficulte){
            case "facile":
                if (grille.cellulesToutesEteintes()) {
                    jLabel1.setText("Vous avez gagné !");
                    this.pack();
                    this.revalidate();
                }
            case "moyenne" :
                //nbCoups autorisés : 16
                if (nbCoups>16){
                    jLabel1.setText("Vous avez perdu !");
                    this.pack();
                    this.revalidate();
                } else if (nbCoups<=15 && grille.cellulesToutesEteintes()) {
                    jLabel1.setText("Vous avez gagné !");
                    this.pack();
                    this.revalidate();
                }
            case "difficile" :
                //nbCoups autorisés : 11
                if (nbCoups>11){
                    jLabel1.setText("Vous avez perdu !");
                    this.pack();
                    this.revalidate();
                } else if (nbCoups<=10 && grille.cellulesToutesEteintes()) {
                    jLabel1.setText("Vous avez gagné !");
                    this.pack();
                    this.revalidate();
                }
            
        }
    }
    
    /**
     affiche le nombre de coups joués par l'utilisateur 
     */
    public void maj_nbCoups(){
        jLabel3.setText("Nombre de coups Joués : "+ nbCoups);
        this.pack();
        this.revalidate();
    }
    
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() throws IOException {
        
        initComponents();
        
        //initialisation de la grille 
        nbLignes = 4;
        nbColonnes = 4;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
                initialiserPartie();
                PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
                for (int i = 0; i < nbLignes; i++) {
                    for (int j = 0; j < nbColonnes; j++) {
                        CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36); // création d'un bouton
                        PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
                    }
                }
                getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints
                (110, 165, nbColonnes * 40, nbLignes * 40));
                
        //initialisation message victoire
        jLabel1.setText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints
            (115+nbColonnes*40, 135+nbLignes*20, 140, 20));
        
        //initialisation compteur coups 
        jLabel3.setText("Nombre de coups Joués : "+ nbCoups);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints
            (115+nbColonnes*40, 135+nbLignes*40, 250, 20));
        
        
        //initialisation couleur bordure boutons 
        Color purple = new Color(138, 43, 226);
        
        //affiche le niveau de difficulté choisie : 
        jLabel4.setText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints
            (270, 3, 300, 20)); 
        
        //Panneaux vertical
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints
            (20, 165, 1 * 40, nbLignes * 40));
        
        //affichage 
        this.pack();
        this.revalidate();
        
        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbLignes; i++) {
            //ajoute l'image de la fleche dans le JButton 
            BufferedImage bufferedImage = ImageIO.read(new File("fleche_droite.png"));
            Image image1 = bufferedImage.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
            ImageIcon icon1 = new ImageIcon(image1);
            JButton bouton_ligne = new JButton(icon1);
            
            //ajoute une bordure au JButton 
            Border lineborder = BorderFactory.createRaisedBevelBorder();
            Border RaisedBevelBorder = BorderFactory.createLineBorder(purple);
            Border EtchedBorderRaised = BorderFactory.createCompoundBorder(lineborder,RaisedBevelBorder);
            bouton_ligne.setBorder(EtchedBorderRaised);
            
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    nbCoups++;
                    maj_nbCoups();
                    repaint();
                    afficher_message_victoire();
                }
            };
            
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);
        }
        //Panneau horizontal pour l'activation des colonnes
        PanneauBoutonsColonne.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsColonne, new org.netbeans.lib.awtextra.AbsoluteConstraints
        (110,30, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons horizontal (pour les colonnes)
        for (i = 0; i < nbColonnes; i++) {
            BufferedImage bufferedImage = ImageIO.read(new File("fleche_bas.png"));
            Image image = bufferedImage.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(image);
            JButton bouton_colonne = new JButton(icon);
            
            //ajoute une bordure au JButton 
            Border lineborder = BorderFactory.createRaisedBevelBorder();
            Border RaisedBevelBorder = BorderFactory.createLineBorder(purple);
            Border EtchedBorderRaised = BorderFactory.createCompoundBorder(lineborder,RaisedBevelBorder);
            bouton_colonne.setBorder(EtchedBorderRaised);
            
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    nbCoups++;
                    maj_nbCoups();
                    repaint();
                    afficher_message_victoire();
                }
            };
            
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsColonne.add(bouton_colonne);
        }
        //Panneau horizontal 
        PanneauBoutonsDiagMontSup.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsDiagMontSup, new org.netbeans.lib.awtextra.AbsoluteConstraints
        (110, 75, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons horizontal (pour l'activation des diagonales montantes supérieures)
        for (i = 0; i < nbColonnes; i++) {
            //ajoute une immage au JButton
            BufferedImage bufferedImage = ImageIO.read(new File("fleche_montante.png"));
            Image image1 = bufferedImage.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
            ImageIcon icon1 = new ImageIcon(image1);
            JButton bouton_colonne = new JButton(icon1);
            
            //ajoute une bordure au JButton 
            Border lineborder = BorderFactory.createRaisedBevelBorder();
            Border RaisedBevelBorder = BorderFactory.createLineBorder(purple);
            Border EtchedBorderRaised = BorderFactory.createCompoundBorder(lineborder,RaisedBevelBorder);
            bouton_colonne.setBorder(EtchedBorderRaised);
            
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerDiagonaleMontante(j, "oui");
                    nbCoups++;
                    maj_nbCoups();
                    repaint();
                    afficher_message_victoire();
                }
            };
            
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsDiagMontSup.add(bouton_colonne);
        }
        
        
        //Panneau horizontal pour l'activation des diagonales descendantes supérieures
        PanneauBoutonsDiagMDescSup.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsDiagMDescSup, new org.netbeans.lib.awtextra.AbsoluteConstraints
        (110, 120, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons horizontal (pour l'activation des diagonales descendantes supérieures)
        for (i = 0; i < nbColonnes; i++) {
            //ajoute une immage au JButton
            BufferedImage bufferedImage = ImageIO.read(new File("fleche_descendante.png"));
            Image image1 = bufferedImage.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
            ImageIcon icon1 = new ImageIcon(image1);
            JButton bouton_colonne = new JButton(icon1);
            
            //ajoute une bordure au JButton 
            Border lineborder = BorderFactory.createRaisedBevelBorder();
            Border RaisedBevelBorder = BorderFactory.createLineBorder(purple);
            Border EtchedBorderRaised = BorderFactory.createCompoundBorder(lineborder,RaisedBevelBorder);
            bouton_colonne.setBorder(EtchedBorderRaised);
            
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerDiagonaleDescendante(j, "oui");
                    nbCoups++;
                    maj_nbCoups();
                    repaint();
                    afficher_message_victoire();
                }
            };
            
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsDiagMDescSup.add(bouton_colonne);
            
        }
        
        
        //Panneau horizontal pour l'activation des diagonales montantes inférieures
        PanneauBoutonsDiagMontInf.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsDiagMontInf, new org.netbeans.lib.awtextra.AbsoluteConstraints
        (110, 170+nbLignes * 40 , nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons horizontal (pour l'activation des diagonales montantes inférieures)
        for (i = 0; i < nbColonnes; i++) {
            //ajoute une immage au JButton
            BufferedImage bufferedImage = ImageIO.read(new File("fleche_montante.png"));
            Image image1 = bufferedImage.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
            ImageIcon icon1 = new ImageIcon(image1);
            JButton bouton_colonne = new JButton(icon1);
            
            //ajoute une bordure au JButton 
            Border lineborder = BorderFactory.createRaisedBevelBorder();
            Border RaisedBevelBorder = BorderFactory.createLineBorder(purple);
            Border EtchedBorderRaised = BorderFactory.createCompoundBorder(lineborder,RaisedBevelBorder);
            bouton_colonne.setBorder(EtchedBorderRaised);
            
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerDiagonaleMontante(j, "non");
                    nbCoups++;
                    maj_nbCoups();
                    repaint();
                    afficher_message_victoire();
                }
            };
            
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsDiagMontInf.add(bouton_colonne);
            
        }
        
        //Panneau horizontal pour l'activation des diagonales descendantes inférieures
        PanneauBoutonsDiagDescInf.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsDiagDescInf, new org.netbeans.lib.awtextra.AbsoluteConstraints
            (110, 215+nbLignes * 40 , nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons horizontal (pour l'activation des  diagonales descendantes inférieures)
        for (i = 0; i < nbColonnes; i++) {
            //ajoute une immage au JButton
            BufferedImage bufferedImage = ImageIO.read(new File("fleche_descendante.png"));
            Image image1 = bufferedImage.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
            ImageIcon icon1 = new ImageIcon(image1);
            JButton bouton_colonne = new JButton(icon1);
            
            //ajoute une bordure au JButton 
            Border lineborder = BorderFactory.createRaisedBevelBorder();
            Border RaisedBevelBorder = BorderFactory.createLineBorder(purple);
            Border EtchedBorderRaised = BorderFactory.createCompoundBorder(lineborder,RaisedBevelBorder);
            bouton_colonne.setBorder(EtchedBorderRaised);
            
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerDiagonaleDescendante(j, "non");
                    nbCoups++;
                    maj_nbCoups();
                    repaint();
                    afficher_message_victoire();
                }
            };
            
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsDiagDescInf.add(bouton_colonne);
        }
    }

    

    private void initialiserPartie() {
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
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsDiagMontSup = new javax.swing.JPanel();
        PanneauBoutonsColonne = new javax.swing.JPanel();
        PanneauBoutonsDiagMDescSup = new javax.swing.JPanel();
        PanneauBoutonsDiagMontInf = new javax.swing.JPanel();
        PanneauBoutonsDiagDescInf = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(204, 204, 255));
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

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 360, 360));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 360));

        PanneauBoutonsDiagMontSup.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout PanneauBoutonsDiagMontSupLayout = new javax.swing.GroupLayout(PanneauBoutonsDiagMontSup);
        PanneauBoutonsDiagMontSup.setLayout(PanneauBoutonsDiagMontSupLayout);
        PanneauBoutonsDiagMontSupLayout.setHorizontalGroup(
            PanneauBoutonsDiagMontSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsDiagMontSupLayout.setVerticalGroup(
            PanneauBoutonsDiagMontSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsDiagMontSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 360, 20));

        PanneauBoutonsColonne.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout PanneauBoutonsColonneLayout = new javax.swing.GroupLayout(PanneauBoutonsColonne);
        PanneauBoutonsColonne.setLayout(PanneauBoutonsColonneLayout);
        PanneauBoutonsColonneLayout.setHorizontalGroup(
            PanneauBoutonsColonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsColonneLayout.setVerticalGroup(
            PanneauBoutonsColonneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsColonne, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 360, 20));

        PanneauBoutonsDiagMDescSup.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout PanneauBoutonsDiagMDescSupLayout = new javax.swing.GroupLayout(PanneauBoutonsDiagMDescSup);
        PanneauBoutonsDiagMDescSup.setLayout(PanneauBoutonsDiagMDescSupLayout);
        PanneauBoutonsDiagMDescSupLayout.setHorizontalGroup(
            PanneauBoutonsDiagMDescSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsDiagMDescSupLayout.setVerticalGroup(
            PanneauBoutonsDiagMDescSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsDiagMDescSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 360, 20));

        PanneauBoutonsDiagMontInf.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout PanneauBoutonsDiagMontInfLayout = new javax.swing.GroupLayout(PanneauBoutonsDiagMontInf);
        PanneauBoutonsDiagMontInf.setLayout(PanneauBoutonsDiagMontInfLayout);
        PanneauBoutonsDiagMontInfLayout.setHorizontalGroup(
            PanneauBoutonsDiagMontInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsDiagMontInfLayout.setVerticalGroup(
            PanneauBoutonsDiagMontInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsDiagMontInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 360, 20));

        PanneauBoutonsDiagDescInf.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout PanneauBoutonsDiagDescInfLayout = new javax.swing.GroupLayout(PanneauBoutonsDiagDescInf);
        PanneauBoutonsDiagDescInf.setLayout(PanneauBoutonsDiagDescInfLayout);
        PanneauBoutonsDiagDescInfLayout.setHorizontalGroup(
            PanneauBoutonsDiagDescInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsDiagDescInfLayout.setVerticalGroup(
            PanneauBoutonsDiagDescInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsDiagDescInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 360, 20));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jLabel2.setText("Choisissez un niveau de difficulté :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "facile", "moyenne", "difficile"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));
        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String selectedValue = (String) jComboBox1.getSelectedItem();
                difficulte=selectedValue;
                maj_niveau();
            }
        });

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        /*// TODO add your handling code here:
        jComboBox1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String toString = jComboBox1.getSelectedItem().toString();
        difficulte=toString;
        maj_niveau();
        }
        });*/
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void maj_niveau(){
        jLabel4.setText(". Niveau de difficulté du jeu choisi : " + this.difficulte);
        this.pack();
        this.revalidate();
    }
    
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
                try {
                    new FenetrePrincipale().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonsColonne;
    private javax.swing.JPanel PanneauBoutonsDiagDescInf;
    private javax.swing.JPanel PanneauBoutonsDiagMDescSup;
    private javax.swing.JPanel PanneauBoutonsDiagMontInf;
    private javax.swing.JPanel PanneauBoutonsDiagMontSup;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
