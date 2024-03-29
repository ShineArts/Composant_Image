/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karimandcoimage;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
//import java.util.Base64;
//import java.sql.Statement;
//import java.sql.ResultSet;
//import com.mysql.jdbc.StringUtils;

/**
 *
 * @author metac
 */
public class Image extends javax.swing.JFrame {

    /**
     * Creates new form LesDonnees
     *
     */
    Connection connexion;
    JFileChooser fichier;
    InputStream stream;
    File file;

    /**
     */
    public Image() {
        initComponents();
        connexion = null;
        fichier = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Images Uniquement", "jpg", "bmp", "jpeg", "png");
        fichier.setFileFilter(filter);
        stream = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelImage = new javax.swing.JLabel();
        jTabbedPaneAccesBDD = new javax.swing.JTabbedPane();
        jPanelConnexion = new javax.swing.JPanel();
        jLabelMDP = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jButtonConnection = new javax.swing.JButton();
        jLabelConnecté = new javax.swing.JLabel();
        jTextFieldAdresse = new javax.swing.JTextField();
        jLabelAdresse = new javax.swing.JLabel();
        jLabelPort = new javax.swing.JLabel();
        jTextFieldPort = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldMDP = new javax.swing.JTextField();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelNom = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonSelectFile = new javax.swing.JButton();
        jButtonSend = new javax.swing.JButton();
        jLabelSuccess = new javax.swing.JLabel();
        jLabelSelect = new javax.swing.JLabel();
        jLabelImage1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelImages = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMDP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMDP.setText("Mot de passe BDD");

        jLabelUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUser.setText("Utilisateur BDD");

        jButtonConnection.setText("Se connecter");
        jButtonConnection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConnectionMouseClicked(evt);
            }
        });

        jLabelConnecté.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConnecté.setText("Non connecté");

        jTextFieldAdresse.setText("www.cnadal.fr");

        jLabelAdresse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelAdresse.setText("Adresse du serveur BDD");

        jLabelPort.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPort.setText("Port (Éventuel)");

        jTextFieldPort.setText("3306");

        jTextFieldNom.setText("sio2_cv");

        jTextFieldMDP.setText("formation2020");

        jTextFieldUser.setText("sio2_cv");

        jLabelNom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNom.setText("Nom de la BDD");

        javax.swing.GroupLayout jPanelConnexionLayout = new javax.swing.GroupLayout(jPanelConnexion);
        jPanelConnexion.setLayout(jPanelConnexionLayout);
        jPanelConnexionLayout.setHorizontalGroup(
            jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
            .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelConnexionLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelConnecté, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelConnexionLayout.createSequentialGroup()
                            .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelMDP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPort, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelAdresse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                            .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldMDP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(jTextFieldUser, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldNom, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldPort)
                                .addComponent(jTextFieldAdresse, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jButtonConnection, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(8, 8, 8)))
        );
        jPanelConnexionLayout.setVerticalGroup(
            jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
            .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConnexionLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelAdresse))
                    .addGap(18, 18, 18)
                    .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPort)
                        .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNom))
                    .addGap(18, 18, 18)
                    .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldMDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMDP))
                    .addGap(22, 22, 22)
                    .addGroup(jPanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelUser))
                    .addGap(39, 39, 39)
                    .addComponent(jButtonConnection)
                    .addGap(22, 22, 22)
                    .addComponent(jLabelConnecté)
                    .addContainerGap()))
        );

        jTabbedPaneAccesBDD.addTab("Connexion", jPanelConnexion);

        jButtonSelectFile.setText("Choisir l'image");
        jButtonSelectFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSelectFileMouseClicked(evt);
            }
        });

        jButtonSend.setText("Envoyer l'image");
        jButtonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSendMouseClicked(evt);
            }
        });

        jLabelSuccess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSuccess.setText("...");

        jLabelSelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSelect.setText("Aucun fichier sélectionné");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImages, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImages, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSuccess)
                    .addComponent(jButtonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jButtonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSuccess)
                                .addGap(0, 0, 0))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(jLabelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(25, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTabbedPaneAccesBDD.addTab("Image", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jTabbedPaneAccesBDD, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTabbedPaneAccesBDD, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConnectionMouseClicked
        if (this.connexion == null) {
            try {
                String ChaineConnexion = "jdbc:mysql://" + jTextFieldAdresse.getText();
                if (jTextFieldPort.getText().equals("")) {
                    ChaineConnexion += "." + jTextFieldPort.getText();
                }
                ChaineConnexion += "/" + jTextFieldNom.getText();

                this.connexion = (Connection) DriverManager.getConnection(ChaineConnexion, jTextFieldUser.getText(), jTextFieldMDP.getText());
                if (this.connexion != null) {
                    jLabelConnecté.setForeground(Color.green);
                    jLabelConnecté.setText("La connexion est désormais active.");
                    jButtonConnection.setText("Se Déconnecter");
                } else {
                    jLabelConnecté.setForeground(Color.red);
                    jLabelConnecté.setText("Non connecté");
                }
            } catch (SQLException ex) {
                jLabelConnecté.setForeground(Color.red);
                jLabelConnecté.setText("Erreur de connexion, vérifiez les données fournies");
                Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            jLabelConnecté.setForeground(Color.red);
            jLabelConnecté.setText("Non connecté");
            jButtonConnection.setText("Se connecter");
            this.connexion = null;
        }
    }//GEN-LAST:event_jButtonConnectionMouseClicked

    private void jButtonSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendMouseClicked
        if (this.connexion != null) {
            //            Modifier le if pour vérifier si une image a été envoyée.
            if (stream != null) {
                if (file.length() <= 3000000) {
                    String req = "select photo from utilisateurs where identifiant='a'";

                    try {
                        Statement maRequeteSQL = this.connexion.createStatement();
                        ResultSet lesTuples = maRequeteSQL.executeQuery(req);
                        if (lesTuples.next()) {
                            //a voir
                            ////                        System.out.println(lesTuples.getString("photo"));
                            //                        String maRequeteSQL2="update photo=? from utilisateurs where identifiant=a";
                            //                        PreparedStatement maRequeteUpdate = this.connexion.prepareStatement(maRequeteSQL2);
                            PreparedStatement maRequeteSQL2 = this.connexion.prepareStatement("update utilisateurs set photo=? where identifiant='a'");
                            maRequeteSQL2.setBinaryStream(1, (InputStream) stream, (int) (file.length()));

                            System.out.println(maRequeteSQL2);
                            Integer update = maRequeteSQL2.executeUpdate();
                            if (update == 1) {
                                jLabelSuccess.setForeground(Color.green);
                                jLabelSuccess.setText("Image modifié !");
                            } else {
                                jLabelSuccess.setForeground(Color.green);
                                jLabelSuccess.setText("Echec de la modification !");
                            }
                        } else {
                            //                        System.out.println("rien n'est retouré....");
                            PreparedStatement maRequete = this.connexion.prepareStatement("insert into utilisateurs values (?,?,?,?,?,?,?,?,?,?)");
                            //                    Échantillons test
                            java.util.Date date = new java.util.Date();
                            java.sql.Date today = new java.sql.Date(date.getTime());
                            //                     juste pour avoir la date

                            maRequete.setString(1, null);
                            maRequete.setInt(2, 0);
                            maRequete.setString(3, "a");
                            maRequete.setString(4, "b");
                            maRequete.setString(5, "c");
                            maRequete.setString(6, "d");
                            maRequete.setString(7, "e");
                            maRequete.setString(8, "f");
                            maRequete.setDate(9, today);
                            maRequete.setBinaryStream(10, (InputStream) stream, (int) (file.length()));
                            Integer create = maRequete.executeUpdate();
                            if (create == 1) {
                                jLabelSuccess.setForeground(Color.green);
                                jLabelSuccess.setText("Image enregistrée !");
                            } else {
                                jLabelSuccess.setForeground(Color.green);
                                jLabelSuccess.setText("Echec de l'enregistrement !");
                            }
                        }

                    } catch (SQLException ex) {
                        jLabelSuccess.setForeground(Color.red);
                        jLabelSuccess.setText("Echec du chargement, l'éxécution de la requête est un échec !!");
                        //  Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println(ex);
                    }
                } else {
                    jLabelSuccess.setForeground(Color.orange);
                    jLabelSuccess.setText("Image trop lourde !!");
                }
            } else {
                jLabelSuccess.setForeground(Color.red);
                jLabelSuccess.setText("Veuillez sélectionner une image !!");
            }
        } else {
            jLabelSuccess.setText("La connexion n'est pas active");
        }
    }//GEN-LAST:event_jButtonSendMouseClicked

    private void jButtonSelectFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSelectFileMouseClicked
        this.file = null;
        int returnval = fichier.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            this.file = fichier.getSelectedFile();
            encodeToBlob();
            String pathFichier = this.file.getAbsolutePath();
            jLabelSelect.setText(pathFichier);
            try {
                //  Lire le Blob en tableau
                byte[] imagebyte = stream.readAllBytes();
                //  Convertion du tableau en image
                //  BufferedImage image = ImageIO.read(new ByteArrayInputStream(imagebytes));
                ImageIcon imageFini = new ImageIcon(new ImageIcon(imagebyte).getImage().getScaledInstance(250, -1, Image.DEFAULT_CURSOR));
                jLabelImages.setIcon(imageFini);
            } catch (Exception e) {
                //Echec de la convertion
                Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, e);
            }

        }
    }//GEN-LAST:event_jButtonSelectFileMouseClicked

       
    
    public void encodeToBlob() {
        try {
            this.stream = new FileInputStream(file);
//            Essai d'un code qui nous permettait d'obtenir l'image en base64 mais pas de l'envoyer.
//            byte[] bytes = new byte[(int)file.length()];
//            fileInputstreamReader.read(bytes);
//            encodedFile = new String(Base64.getEncoder().encode(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Image().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnection;
    private javax.swing.JButton jButtonSelectFile;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JLabel jLabelAdresse;
    private javax.swing.JLabel jLabelConnecté;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelImage1;
    private javax.swing.JLabel jLabelImages;
    private javax.swing.JLabel jLabelMDP;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelSelect;
    private javax.swing.JLabel jLabelSuccess;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelConnexion;
    private javax.swing.JTabbedPane jTabbedPaneAccesBDD;
    private javax.swing.JTextField jTextFieldAdresse;
    private javax.swing.JTextField jTextFieldMDP;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPort;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
