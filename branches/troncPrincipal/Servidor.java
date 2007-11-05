import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
/*
 * Servidor.java
 *
 * Created on 5. marraskuuta 2007, 11:38
 */

/**
 *
 * @author  Marc
 */
public class Servidor extends JFrame {
    
    
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private ServidorModel sm;
    public Servidor() {
        
        sm = new ServidorModel();
        initComponents();
    }
    
   
    
    private void initComponents() {
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gesti\u00f3 del servidor RMI de MySandwich");
        jLabel1.setText("Pendent d'iniciar el servidor RMI de la PAC 3");

        jButton1.setText("Iniciar Servidor");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Aturar Servidor");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jLabel1))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pack();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {

        sm.aturarServidor();
        jLabel1.setText("Servidor Aturat!");
        jLabel1.setForeground(Color.RED);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {

        sm.engegarServidor();
        jLabel1.setText("Servidor Engegat!");
        jLabel1.setForeground(Color.BLUE);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servidor().setVisible(true);
            }
        });
    }
   
}
