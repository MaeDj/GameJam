/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gamejamjeuoie;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author mae
 */
public class FrameJeuOieIdmc extends javax.swing.JFrame {

    ArrayList<JLabel> plateauFrame = new ArrayList<>();
    Image imageResize;
    Image imageResizeLivre;
    Jeu jeu1 = new Jeu();
    int miseDuJoueur;
    boolean resultat;

    /**
     * Creates new form FrameJeuOieIdmc
     */
    public FrameJeuOieIdmc() {
        initComponents();
        int Horiz, Vert;
        Horiz = 170;
        Vert = 150;

        for (int i = 0; i < 33; i++) { // on créé notre plateau

            plateauFrame.add(i, new JLabel());
            if (i == 32) {
                plateauFrame.get(i).setText("Diplôme!!!");
            } else {
                if (jeu1.plateau1.plateau.get(i) instanceof Bonus) {
                    plateauFrame.get(i).setOpaque(rootPaneCheckingEnabled);
                    plateauFrame.get(i).setBackground(Color.BLUE);
                } else if (jeu1.plateau1.plateau.get(i) instanceof Malus) {
                    plateauFrame.get(i).setOpaque(rootPaneCheckingEnabled);
                    plateauFrame.get(i).setBackground(Color.red);
                } else if (jeu1.plateau1.plateau.get(i) instanceof Question) {
                    plateauFrame.get(i).setOpaque(rootPaneCheckingEnabled);
                    plateauFrame.get(i).setBackground(Color.GREEN);
                } else if (jeu1.plateau1.plateau.get(i) instanceof Plus) {
                    BufferedImage image1 = null;
                    try {
                        image1 = ImageIO.read(new File(".\\livre.jfif"));
                        imageResizeLivre= image1.getScaledInstance(plateauFrame.get(0).getWidth() + 10, plateauFrame.get(0).getHeight(), Image.SCALE_SMOOTH);
                        plateauFrame.get(i).setIcon(new ImageIcon(imageResizeLivre));
                    } catch (Exception e) {
                        System.out.println("mauvaise imageLivre ");
                    }
                }
                plateauFrame.get(i).setText(String.valueOf(i + 1));

            }

            plateauFrame.get(i).setLocation(Horiz, Vert);// on pose le Jlabel à 300px à l'horizontal et à 300 px à la verticale et on avance de 70 px à chaque label vers la droite 

            plateauFrame.get(i).setSize(70, 70);

            panel1.add(plateauFrame.get(i));
            Horiz = Horiz + 70;
            panel1.repaint();
            if (i == 7 || i == 15 || i == 23) { // des qu'on arrive en bout de ligne on descend de 70 px aussi pour rester proportionnel
                Vert = Vert + 70;
                Horiz = 170;
            }
            plateauFrame.get(i).setVerticalAlignment(SwingConstants.CENTER);// affiche le texte au milieu de la case 
            plateauFrame.get(i).setHorizontalAlignment(SwingConstants.CENTER);
            // code inspiré de https://stackoverflow.com/questions/39798401/how-to-make-a-border-fit-around-a-jlabel
            plateauFrame.get(i).setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            // on change la bordure en noir avec la méthode setBorder de la classe JComponent qui est extends par la classe JLabel 

        }

        Horiz = 100;
        Vert = 150;
        JLabel[] retourLigne = new JLabel[4];
        for (int j = 0; j < 4; j++) {
            retourLigne[j] = new JLabel();
            if (j == 0) {
                retourLigne[j].setText("L1=>");
            } else {
                retourLigne[j].setText("=>");
            }
            retourLigne[j].setLocation(Horiz, Vert);// on pose le Jlabel à 300px à l'horizontal et à 300 px à la verticale et on avance de 70 px à chaque label vers la droite 

            retourLigne[j].setSize(70, 70);

            panel1.add(retourLigne[j]);
            Horiz = Horiz + 70;
            panel1.repaint();

            Vert = Vert + 70;
            Horiz = 100;

            retourLigne[j].setVerticalAlignment(SwingConstants.CENTER);// affiche le texte au milieu de la case 
            retourLigne[j].setHorizontalAlignment(SwingConstants.CENTER);
            // code inspiré de https://stackoverflow.com/questions/39798401/how-to-make-a-border-fit-around-a-jlabel
            retourLigne[j].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
            // on change la bordure en noir avec la méthode setBorder de la classe JComponent qui est extends par la classe JLabel 

        }

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(".\\eleve.jfif"));
            imageResize = image.getScaledInstance(plateauFrame.get(0).getWidth() + 10, plateauFrame.get(0).getHeight(), Image.SCALE_SMOOTH);
            plateauFrame.get(0).setIcon(new ImageIcon(imageResize));
        } catch (Exception e) {
            System.out.println("mauvaise image ");
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

        question = new javax.swing.JFrame();
        questionAPoser = new javax.swing.JLabel();
        rep1 = new javax.swing.JButton();
        rep2 = new javax.swing.JButton();
        rep3 = new javax.swing.JButton();
        resultatQuestion = new javax.swing.JLabel();
        quit = new javax.swing.JButton();
        mise = new javax.swing.JFrame();
        miseLabel = new javax.swing.JLabel();
        label1 = new javax.swing.JButton();
        label2 = new javax.swing.JButton();
        label3 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        de = new javax.swing.JButton();
        infos = new javax.swing.JLabel();
        nbPoint = new javax.swing.JLabel();

        questionAPoser.setText("Question à poser");

        rep1.setText("rep1");
        rep1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rep1MouseClicked(evt);
            }
        });
        rep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep1ActionPerformed(evt);
            }
        });

        rep2.setText("rep2");
        rep2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rep2MouseClicked(evt);
            }
        });
        rep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep2ActionPerformed(evt);
            }
        });

        rep3.setText("rep3");
        rep3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rep3MouseClicked(evt);
            }
        });
        rep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep3ActionPerformed(evt);
            }
        });

        resultatQuestion.setText("Bravo/Raté");

        quit.setText("Quitter");
        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout questionLayout = new javax.swing.GroupLayout(question.getContentPane());
        question.getContentPane().setLayout(questionLayout);
        questionLayout.setHorizontalGroup(
            questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quit)
                    .addGroup(questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(questionAPoser, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(questionLayout.createSequentialGroup()
                            .addGroup(questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rep2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rep3, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(resultatQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        questionLayout.setVerticalGroup(
            questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(questionAPoser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rep1)
                .addGroup(questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(rep2))
                    .addGroup(questionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultatQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(rep3)
                .addGap(18, 18, 18)
                .addComponent(quit)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        miseLabel.setText("Quelle mise souhaitez vous tenter?");

        label1.setText("1");
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
        });

        label2.setText("2");
        label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label2MouseClicked(evt);
            }
        });

        label3.setText("3");
        label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout miseLayout = new javax.swing.GroupLayout(mise.getContentPane());
        mise.getContentPane().setLayout(miseLayout);
        miseLayout.setHorizontalGroup(
            miseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(miseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(miseLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        miseLayout.setVerticalGroup(
            miseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miseLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(miseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(miseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        de.setText("lancer le dé");
        de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deActionPerformed(evt);
            }
        });

        infos.setText("Infos");

        nbPoint.setText("pt");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(infos, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(nbPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(de)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nbPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(infos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 556, Short.MAX_VALUE)
                .addComponent(de)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deActionPerformed

    private void rep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rep2ActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        // TODO add your handling code here:
        this.miseDuJoueur = Integer.parseInt(label1.getText());
    }//GEN-LAST:event_label1MouseClicked

    private void label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label2MouseClicked
        // TODO add your handling code here:
        this.miseDuJoueur = Integer.parseInt(label2.getText());
    }//GEN-LAST:event_label2MouseClicked

    private void label3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label3MouseClicked
        // TODO add your handling code here:
        this.miseDuJoueur = Integer.parseInt(label3.getText());
    }//GEN-LAST:event_label3MouseClicked

    private void rep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rep1ActionPerformed

    private void rep1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rep1MouseClicked
        // TODO add your handling code here:
        Question event = (Question) jeu1.plateau1.get(jeu1.j1.getPosition());
        if(event.getReponse()[4]=="1"){
            resultatQuestion.setText("Bravo !");
            resultat=true;
        }
        else{
            resultatQuestion.setText("Raté !");
            resultat=false;
        }
        rep1.setEnabled(false);
        rep2.setEnabled(false);
        rep3.setEnabled(false);
        quit.setEnabled(true);
    }//GEN-LAST:event_rep1MouseClicked

    private void rep2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rep2MouseClicked
        // TODO add your handling code here:
        Question event = (Question) jeu1.plateau1.get(jeu1.j1.getPosition());
        if(event.getReponse()[4]=="2"){
            resultatQuestion.setText("Bravo !");
            resultat=true;
        }
        else{
            resultatQuestion.setText("Raté !");
            resultat=false;
        }
        rep1.setEnabled(false);
        rep2.setEnabled(false);
        rep3.setEnabled(false);
        quit.setEnabled(true);
    }//GEN-LAST:event_rep2MouseClicked

    private void rep3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rep3MouseClicked
        // TODO add your handling code here:
        Question event = (Question) jeu1.plateau1.get(jeu1.j1.getPosition());
        if(event.getReponse()[4]=="3"){
            resultatQuestion.setText("Bravo !");
            resultat=true;
        }
        else{
            resultatQuestion.setText("Raté !");
            resultat=false;
        }
        rep1.setEnabled(false);
        rep2.setEnabled(false);
        rep3.setEnabled(false);
        quit.setEnabled(true);
    }//GEN-LAST:event_rep3MouseClicked

    private void rep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rep3ActionPerformed

    private void quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseClicked
        // TODO add your handling code here:
        mise.setEnabled(false);
        question.setEnabled(false);
    }//GEN-LAST:event_quitMouseClicked

    public void PoserQuestionFrame(){
        Question event = (Question) jeu1.plateau1.get(jeu1.j1.getPosition());
        questionAPoser.setText(event.getReponse()[0]);
        rep1.setText(event.getReponse()[1]);
        rep2.setText(event.getReponse()[2]);
        rep3.setText(event.getReponse()[3]);
        quit.setEnabled(false);
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
            java.util.logging.Logger.getLogger(FrameJeuOieIdmc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameJeuOieIdmc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameJeuOieIdmc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameJeuOieIdmc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameJeuOieIdmc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton de;
    private javax.swing.JLabel infos;
    private javax.swing.JButton label1;
    private javax.swing.JButton label2;
    private javax.swing.JButton label3;
    private javax.swing.JFrame mise;
    private javax.swing.JLabel miseLabel;
    private javax.swing.JLabel nbPoint;
    private java.awt.Panel panel1;
    private javax.swing.JFrame question;
    private javax.swing.JLabel questionAPoser;
    private javax.swing.JButton quit;
    private javax.swing.JButton rep1;
    private javax.swing.JButton rep2;
    private javax.swing.JButton rep3;
    private javax.swing.JLabel resultatQuestion;
    // End of variables declaration//GEN-END:variables
}
