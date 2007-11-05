/*
 * VistaServidor.java
 *
 * Created on 5. marraskuuta 2007, 11:38
 */
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author  Marc
 */
public class VistaServidor extends JFrame {
    
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
	
    public VistaServidor(Servidor s) {
        initComponents(s);
    }
     
    private void initComponents(Servidor s) {
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gesti\u00f3 del servidor RMI de MySandwich");
        jLabel1.setText("Pendent d'iniciar el servidor RMI de la PAC 3");

        jButton1.setText("Iniciar Servidor");
        jButton1.addActionListener(s);
                
        jButton2.setText("Aturar Servidor");
        jButton2.addActionListener(s);
        
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
   
    
    
   
}
