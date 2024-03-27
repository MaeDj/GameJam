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
import java.util.Random;
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
    boolean resultat, reponseRecommencer;

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
                        imageResizeLivre = image1.getScaledInstance(plateauFrame.get(0).getWidth() + 10, plateauFrame.get(0).getHeight(), Image.SCALE_SMOOTH);
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
        } catch (Exception e) {
            System.out.println("mauvaise image ");
        }
        infos.setText("----début de la partie----");
        jeu1.j1 = new Joueur();
        jeu1.j1.setNbPt(0);
        jeu1.j1.setPosition(0);
        plateauFrame.get(jeu1.j1.getPosition()).setIcon(new ImageIcon(imageResize));
        deFrame.setEnabled(false);
        nbPoint.setText("0/20");
        
        evenementFrame.setText("");
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
        findepartie = new javax.swing.JFrame();
        labelfindepartie = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        deFrame = new javax.swing.JButton();
        infos = new javax.swing.JLabel();
        nbPoint = new javax.swing.JLabel();
        evenementFrame = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        newGame = new javax.swing.JMenu();

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
                .addGroup(questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(questionAPoser, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(questionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rep1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionLayout.createSequentialGroup()
                .addGroup(questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(questionLayout.createSequentialGroup()
                        .addGroup(questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, questionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rep3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rep2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(resultatQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(questionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quit)))
                .addGap(23, 23, 23))
        );
        questionLayout.setVerticalGroup(
            questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(questionAPoser, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(rep1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(questionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(rep2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultatQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)))
                .addComponent(rep3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(quit)
                .addGap(25, 25, 25))
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
                .addGap(95, 95, 95)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(miseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
        );
        miseLayout.setVerticalGroup(
            miseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miseLayout.createSequentialGroup()
                .addGroup(miseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(miseLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(miseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(miseLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(miseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(483, Short.MAX_VALUE))
        );

        jButton1.setText("Quitter");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout findepartieLayout = new javax.swing.GroupLayout(findepartie.getContentPane());
        findepartie.getContentPane().setLayout(findepartieLayout);
        findepartieLayout.setHorizontalGroup(
            findepartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findepartieLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(labelfindepartie, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, findepartieLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        findepartieLayout.setVerticalGroup(
            findepartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, findepartieLayout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(labelfindepartie, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addGap(218, 218, 218))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deFrame.setText("lancer le dé");
        deFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deFrameMouseClicked(evt);
            }
        });
        deFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deFrameActionPerformed(evt);
            }
        });

        infos.setText("Infos");

        nbPoint.setText("pt");

        evenementFrame.setText("jLabel1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(deFrame)
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(evenementFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addComponent(infos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nbPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(evenementFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addComponent(deFrame)
                .addGap(250, 250, 250))
        );

        newGame.setText("New Game");
        newGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newGameMouseClicked(evt);
            }
        });
        jMenuBar1.add(newGame);

        setJMenuBar(jMenuBar1);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deFrameActionPerformed

    private void rep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rep2ActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        // TODO add your handling code here:
        this.miseDuJoueur = Integer.parseInt(label1.getText());
        mise.setVisible(false);
        question.setVisible(true);

        question.setSize(900, 900);
        this.PoserQuestionFrame();

    }//GEN-LAST:event_label1MouseClicked

    private void label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label2MouseClicked
        // TODO add your handling code here:
        this.miseDuJoueur = Integer.parseInt(label2.getText());
        mise.setVisible(false);
        question.setVisible(true);

        question.setSize(900, 900);
        this.PoserQuestionFrame();

    }//GEN-LAST:event_label2MouseClicked

    private void label3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label3MouseClicked
        // TODO add your handling code here:
        this.miseDuJoueur = Integer.parseInt(label3.getText());
        mise.setVisible(false);
        question.setVisible(true);

        question.setSize(900, 900);
        this.PoserQuestionFrame();

    }//GEN-LAST:event_label3MouseClicked

    private void rep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rep1ActionPerformed

    private void rep1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rep1MouseClicked
        // TODO add your handling code here:
        Question event = (Question) jeu1.plateau1.get(jeu1.j1.getPosition());
        if (event.getReponse()[4] == "1") {
            resultatQuestion.setText("Bravo ! +" + miseDuJoueur);
            resultat = true;
        } else {
            resultatQuestion.setText("Raté ! -" + miseDuJoueur);
            resultat = false;
        }
        rep1.setEnabled(false);
        rep2.setEnabled(false);
        rep3.setEnabled(false);
        quit.setEnabled(true);
    }//GEN-LAST:event_rep1MouseClicked

    private void rep2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rep2MouseClicked
        // TODO add your handling code here:
        Question event = (Question) jeu1.plateau1.get(jeu1.j1.getPosition());
        if (event.getReponse()[4] == "2") {
            resultatQuestion.setText("Bravo ! +" + miseDuJoueur);
            resultat = true;
        } else {
            resultatQuestion.setText("Raté ! -" + miseDuJoueur);
            resultat = false;
        }
        rep1.setEnabled(false);
        rep2.setEnabled(false);
        rep3.setEnabled(false);
        quit.setEnabled(true);
    }//GEN-LAST:event_rep2MouseClicked

    private void rep3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rep3MouseClicked
        // TODO add your handling code here:
        Question event = (Question) jeu1.plateau1.get(jeu1.j1.getPosition());
        if (event.getReponse()[4] == "3") {
            resultatQuestion.setText("Bravo ! +" + miseDuJoueur);
            resultat = true;
        } else {
            resultatQuestion.setText("Raté ! -" + miseDuJoueur);
            resultat = false;
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
        int nbPtGagneOuPerdu;
        if (resultat) {
            nbPtGagneOuPerdu = miseDuJoueur;
        } else {
            nbPtGagneOuPerdu = -miseDuJoueur;
        }
        if (jeu1.j1.isaUnBonus() && nbPtGagneOuPerdu > 0) {
            System.out.println("Grace à votre précédente action vous remportez un point de plus à la question ");
            jeu1.j1.setNbPt(jeu1.j1.getNbPt() + nbPtGagneOuPerdu + 1);
            jeu1.j1.setaUnBonus(false);
        } else {
            jeu1.j1.setNbPt(jeu1.j1.getNbPt() + nbPtGagneOuPerdu);// nombre positif ou négatif 
        }
        if (jeu1.j1.getNbPt() > 20) {
            jeu1.j1.setNbPt(20);
        }
        if (jeu1.j1.getNbPt() < 0) {
            jeu1.j1.setNbPt(0);
        }
        nbPoint.setText(String.valueOf(jeu1.j1.getNbPt()) + "/20");
        question.setVisible(false);
        this.setVisible(true);
        deFrame.setEnabled(true);

    }//GEN-LAST:event_quitMouseClicked

    private void newGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseClicked
        // TODO add your handling code here:  

        FrameJeuOieIdmc newFrame = new FrameJeuOieIdmc();
        newFrame.setVisible(true);
        newFrame.deFrame.setEnabled(true);
        newFrame.infos.setText("Veuillez lancer le dé ");


    }//GEN-LAST:event_newGameMouseClicked

    private void recommencerouiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recommencerouiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recommencerouiActionPerformed

    private void recommencerouiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recommencerouiMouseClicked
        // TODO add your handling code here:
        reponseRecommencer = true;
    }//GEN-LAST:event_recommencerouiMouseClicked

    private void recommencernonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recommencernonMouseClicked
        // TODO add your handling code here:
        reponseRecommencer = false;
    }//GEN-LAST:event_recommencernonMouseClicked

    private void deFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deFrameMouseClicked
        // TODO add your handling code here:
        deFrame.setEnabled(false);
        plateauFrame.get(jeu1.j1.getPosition()).setIcon(null);
        Random ra = new Random();
        jeu1.de = ra.nextInt(5) + 1;
        infos.setText("Vous avancez de " + jeu1.de);

        jeu1.j1.setPosition(jeu1.j1.getPosition() + jeu1.de);
        if (jeu1.j1.getPosition() >= 31) {
             if (jeu1.j1.getNbPt() >= 10) {
                labelfindepartie.setText("Vous avez eu votre année!");

            } else {
                labelfindepartie.setText("Vous redoublez...Peut être l'année prochaine! ");

            }
            findepartie.setVisible(true);
            findepartie.setSize(900, 900);
           
        }
        plateauFrame.get(jeu1.j1.getPosition()).setIcon(new ImageIcon(imageResize));

        if (jeu1.plateau1.get(jeu1.j1.getPosition()) instanceof Malus) {//si l'event est un malus

            Malus malus = (Malus) jeu1.plateau1.get(jeu1.j1.getPosition());
            evenementFrame.setText(malus.nom);
            jeu1.j1.setNbPt(jeu1.j1.getNbPt() + (malus.points));
            if (jeu1.j1.getNbPt() < 0) {
                jeu1.j1.setNbPt(0);
                nbPoint.setText(String.valueOf(jeu1.j1.getNbPt()));
            }
            nbPoint.setText(String.valueOf(jeu1.j1.getNbPt()));

            nbPoint.setText(String.valueOf(jeu1.j1.getNbPt()) + "/20");

            deFrame.setEnabled(true);
        } else if (jeu1.plateau1.get(jeu1.j1.getPosition()) instanceof Bonus) {// si l'event est un bonus 

            Bonus bonus = (Bonus) jeu1.plateau1.get(jeu1.j1.getPosition());
            evenementFrame.setText(bonus.nom);

            jeu1.j1.setNbPt(jeu1.j1.getNbPt() + (bonus.points));// on ajoute au joueur son nb de points
            nbPoint.setText(String.valueOf(jeu1.j1.getNbPt()) + "/20");
            if (jeu1.j1.getNbPt() > 20) {
                jeu1.j1.setNbPt(20);
                nbPoint.setText(String.valueOf(jeu1.j1.getNbPt()) + "/20");

            }
            deFrame.setEnabled(true);

        } else if (jeu1.plateau1.get(jeu1.j1.getPosition()) instanceof Question) {// si l'event est une question
            Question question1 = (Question) jeu1.plateau1.get(jeu1.j1.getPosition());

            this.setVisible(false);
            mise.setVisible(true);
            mise.setSize(900, 900);

        } else if (jeu1.plateau1.get(jeu1.j1.getPosition()) instanceof Plus) {// si la case octroie un bonus au joueur sur la prichaine question 

            Plus plus = (Plus) jeu1.plateau1.get(jeu1.j1.getPosition());
            evenementFrame.setText(plus.nom);
            jeu1.j1.setaUnBonus(true);//change le booleen de joueur en true 
            deFrame.setEnabled(true);
        } else if (jeu1.plateau1.get(jeu1.j1.getPosition()) instanceof Neutre) {
            Neutre neutre = (Neutre) jeu1.plateau1.get(jeu1.j1.getPosition());
            evenementFrame.setText(neutre.nom);
            deFrame.setEnabled(true);

        }


    }//GEN-LAST:event_deFrameMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    public void PoserQuestionFrame() {
        Question event = (Question) jeu1.plateau1.get(jeu1.j1.getPosition());
        questionAPoser.setText(event.getReponse()[0]);
        rep1.setEnabled(true);
        rep2.setEnabled(true);
        rep3.setEnabled(true);
        resultatQuestion.setText("");
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
            java.util.logging.Logger.getLogger(FrameJeuOieIdmc.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameJeuOieIdmc.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameJeuOieIdmc.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameJeuOieIdmc.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton deFrame;
    private javax.swing.JLabel evenementFrame;
    private javax.swing.JFrame findepartie;
    private javax.swing.JLabel infos;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton label1;
    private javax.swing.JButton label2;
    private javax.swing.JButton label3;
    private javax.swing.JLabel labelfindepartie;
    private javax.swing.JFrame mise;
    private javax.swing.JLabel miseLabel;
    private javax.swing.JLabel nbPoint;
    private javax.swing.JMenu newGame;
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
