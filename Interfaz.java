package cuadradomagico;

import java.awt.event.KeyEvent;

/*
 * @author Benja
 */
public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Verificar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        C1 = new javax.swing.JTextField();
        C2 = new javax.swing.JTextField();
        C3 = new javax.swing.JTextField();
        C4 = new javax.swing.JTextField();
        C5 = new javax.swing.JTextField();
        C6 = new javax.swing.JTextField();
        C7 = new javax.swing.JTextField();
        C8 = new javax.swing.JTextField();
        C9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuadrado Mágico");
        setBackground(new java.awt.Color(101, 101, 255));
        setMinimumSize(new java.awt.Dimension(270, 270));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Cuadrado Mágico");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 40));

        Verificar.setText("Verificar");
        Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 281, -1, -1));

        Limpiar.setText("Limpiar");
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 281, -1, -1));

        C1.setBackground(new java.awt.Color(0, 0, 204));
        C1.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C1KeyTyped(evt);
            }
        });
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, 50));

        C2.setBackground(new java.awt.Color(255, 0, 51));
        C2.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C2KeyTyped(evt);
            }
        });
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 60, 50));

        C3.setBackground(new java.awt.Color(0, 0, 204));
        C3.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        C3.setForeground(new java.awt.Color(255, 255, 255));
        C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C3KeyTyped(evt);
            }
        });
        getContentPane().add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 60, 50));

        C4.setBackground(new java.awt.Color(255, 0, 51));
        C4.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        C4.setForeground(new java.awt.Color(255, 255, 255));
        C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C4KeyTyped(evt);
            }
        });
        getContentPane().add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 50));

        C5.setBackground(new java.awt.Color(0, 0, 204));
        C5.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        C5.setForeground(new java.awt.Color(255, 255, 255));
        C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C5KeyTyped(evt);
            }
        });
        getContentPane().add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 60, 50));

        C6.setBackground(new java.awt.Color(255, 0, 51));
        C6.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        C6.setForeground(new java.awt.Color(255, 255, 255));
        C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C6KeyTyped(evt);
            }
        });
        getContentPane().add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 60, 50));

        C7.setBackground(new java.awt.Color(0, 0, 204));
        C7.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        C7.setForeground(new java.awt.Color(255, 255, 255));
        C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C7KeyTyped(evt);
            }
        });
        getContentPane().add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, 50));

        C8.setBackground(new java.awt.Color(255, 0, 51));
        C8.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        C8.setForeground(new java.awt.Color(255, 255, 255));
        C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C8KeyTyped(evt);
            }
        });
        getContentPane().add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 60, 50));

        C9.setBackground(new java.awt.Color(0, 0, 204));
        C9.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        C9.setForeground(new java.awt.Color(255, 255, 255));
        C9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                C9KeyTyped(evt);
            }
        });
        getContentPane().add(C9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 60, 50));

        pack();
    }// </editor-fold>                        

    private void VerificarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void C1KeyTyped(java.awt.event.KeyEvent evt) {                            
        char num = evt.getKeyChar();
        if (((num < '1') || (num > '9')) && (num != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (C1.getText().length() == 1) {
            evt.consume();
        }
    }                           

    private void C2KeyTyped(java.awt.event.KeyEvent evt) {                            
        char num = evt.getKeyChar();
        if (((num < '1') || (num > '9')) && (num != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (C2.getText().length() == 1) {
            evt.consume();
        }
        //p.matriz(1, 0, num);
    }                           

    private void C3KeyTyped(java.awt.event.KeyEvent evt) {                            
        char num = evt.getKeyChar();
        if (((num < '1') || (num > '9')) && (num != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (C3.getText().length() == 1) {
            evt.consume();
        }
        //p.matriz(2, 0, num);
    }                           

    private void C4KeyTyped(java.awt.event.KeyEvent evt) {                            
        char num = evt.getKeyChar();
        if (((num < '1') || (num > '9')) && (num != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (C4.getText().length() == 1) {
            evt.consume();
        }
        //p.matriz(0, 1, num);
    }                           

    private void C5KeyTyped(java.awt.event.KeyEvent evt) {                            
        char num = evt.getKeyChar();
        if (((num < '1') || (num > '9')) && (num != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (C5.getText().length() == 1) {
            evt.consume();
        }
        //p.matriz(1, 1, num);
    }                           

    private void C6KeyTyped(java.awt.event.KeyEvent evt) {                            
        char num = evt.getKeyChar();
        if (((num < '1') || (num > '9')) && (num != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (C6.getText().length() == 1) {
            evt.consume();
        }
        //p.matriz(2, 1, num);
    }                           

    private void C7KeyTyped(java.awt.event.KeyEvent evt) {                            
        char num = evt.getKeyChar();
        if (((num < '1') || (num > '9')) && (num != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (C7.getText().length() == 1) {
            evt.consume();
        }
        //p.matriz(0, 2, num);
    }                           

    private void C8KeyTyped(java.awt.event.KeyEvent evt) {                            
        char num = evt.getKeyChar();
        if (((num < '1') || (num > '9')) && (num != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (C8.getText().length() == 1) {
            evt.consume();
        }
        //p.matriz(1, 2, num);
    }                           

    private void C9KeyTyped(java.awt.event.KeyEvent evt) {                            
        char num = evt.getKeyChar();
        if (((num < '1') || (num > '9')) && (num != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (C9.getText().length() == 1) {
            evt.consume();
        }
        //p.matriz(2, 2, num);
    }                           

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
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JTextField C1;
    private javax.swing.JTextField C2;
    private javax.swing.JTextField C3;
    private javax.swing.JTextField C4;
    private javax.swing.JTextField C5;
    private javax.swing.JTextField C6;
    private javax.swing.JTextField C7;
    private javax.swing.JTextField C8;
    private javax.swing.JTextField C9;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Verificar;
    // End of variables declaration                   
}
