import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.*;

/*
 * Client.java
 *
 * Created on 10. marraskuuta 2007, 0:24
 */
/**
 *
 * @author  Marc
 */
public class Client extends JFrame {

	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JScrollPane jScrollPane1;
	private JTable jTable1;
	private JTable jTable2;
	private JComboBox jComboBox1;
	private JDialog jDialog1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JTextField jTextField4;

	private Vector<String> vEmpresa = new Vector<String>();
	private Vector<String> vContracte = new Vector<String>();

	ClientModel cm;

	public Client() {
		cm = new ClientModel();
		initComponents();
	}

	private void initComponents() {
		jButton1 = new JButton();
		jButton2 = new JButton();
		jButton3 = new JButton();
		jButton4 = new JButton();
		jScrollPane1 = new JScrollPane();
		jTable1 = new JTable();
		jTable2 = new JTable();

		vEmpresa.add("ID Empresa");
		vEmpresa.add("Nom");
		vEmpresa.add("Adreça");
		vEmpresa.add("Data de registre");

		vContracte.add("ID Contracte");
		vContracte.add("ID Empresa");
		vContracte.add("Data d'alta ");
		vContracte.add("Data de rescició");
		vContracte.add("Import");

		jDialog1 = new JDialog(this, true);
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		jButton5 = new JButton();
		jTextField1 = new JTextField();
		jTextField2 = new JTextField();
		jTextField3 = new JTextField();
		jTextField4 = new JTextField();
		jComboBox1 = new JComboBox();

		jDialog1.setTitle("Dades del nou contracte");
		jLabel1.setText("Introdu\u00efu les dades del nou contracte:");
		jLabel2.setText("ID Contracte:");
		jLabel3.setText("Empresa:");
		jLabel4.setText("Data d'alta:");
		jLabel5.setText("Data de rescici\u00f3: ");
		jLabel6.setText("Import:");

		jButton5.setText("Acceptar");
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		GroupLayout jDialog1Layout = new GroupLayout(jDialog1.getContentPane());
		jDialog1.getContentPane().setLayout(jDialog1Layout);
		jDialog1Layout
				.setHorizontalGroup(jDialog1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(
								jDialog1Layout
										.createSequentialGroup()
										.addGap(29, 29, 29)
										.addGroup(
												jDialog1Layout
														.createParallelGroup(
																GroupLayout.Alignment.LEADING)
														.addGroup(
																jDialog1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel6)
																		.addPreferredGap(
																				LayoutStyle.ComponentPlacement.RELATED,
																				125,
																				Short.MAX_VALUE)
																		.addComponent(
																				jTextField4,
																				GroupLayout.PREFERRED_SIZE,
																				96,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jDialog1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5)
																		.addPreferredGap(
																				LayoutStyle.ComponentPlacement.RELATED,
																				78,
																				Short.MAX_VALUE)
																		.addComponent(
																				jTextField3,
																				GroupLayout.PREFERRED_SIZE,
																				96,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jDialog1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				LayoutStyle.ComponentPlacement.RELATED,
																				105,
																				Short.MAX_VALUE)
																		.addComponent(
																				jTextField2,
																				GroupLayout.PREFERRED_SIZE,
																				96,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(jLabel1)
														.addGroup(
																jDialog1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jDialog1Layout
																						.createParallelGroup(
																								GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel3))
																		.addGap(
																				95,
																				95,
																				95)
																		.addGroup(
																				jDialog1Layout
																						.createParallelGroup(
																								GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jComboBox1,
																								0,
																								96,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField1,
																								GroupLayout.DEFAULT_SIZE,
																								96,
																								Short.MAX_VALUE))))
										.addGap(34, 34, 34)).addGroup(
								jDialog1Layout.createSequentialGroup().addGap(
										139, 139, 139).addComponent(jButton5)
										.addContainerGap(106, Short.MAX_VALUE)));
		jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				jDialog1Layout.createSequentialGroup().addGap(23, 23, 23)
						.addComponent(jLabel1).addGap(29, 29, 29).addGroup(
								jDialog1Layout.createParallelGroup(
										GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel2).addComponent(
												jTextField1,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addGap(17, 17, 17).addGroup(
								jDialog1Layout.createParallelGroup(
										GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel3).addComponent(
												jComboBox1,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addGap(19, 19, 19).addGroup(
								jDialog1Layout.createParallelGroup(
										GroupLayout.Alignment.LEADING)
										.addComponent(jLabel4,
												GroupLayout.Alignment.TRAILING)
										.addComponent(jTextField2,
												GroupLayout.Alignment.TRAILING,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addGap(22, 22, 22).addGroup(
								jDialog1Layout.createParallelGroup(
										GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel5).addComponent(
												jTextField3,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addGap(24, 24, 24).addGroup(
								jDialog1Layout.createParallelGroup(
										GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel6).addComponent(
												jTextField4,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(
								LayoutStyle.ComponentPlacement.RELATED, 27,
								Short.MAX_VALUE).addComponent(jButton5)
						.addContainerGap()));

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("MySandwich. TDP PAC3 Tardor 2007 - Universitat Oberta de Catalunya");
		jButton1.setText("Connexi\u00f3 RMI");
		jButton2.setText("Llistat empreses");
		jButton3.setText("Llistat Contractes");
		jButton4.setText("Nou contracte");

		jButton2.setEnabled(false);
		jButton3.setEnabled(false);
		jButton4.setEnabled(false);
		
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}

		});

		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(
						jScrollPane1, GroupLayout.DEFAULT_SIZE, 684,
						Short.MAX_VALUE).addContainerGap()).addGroup(
				layout.createSequentialGroup().addGap(40, 40, 40).addComponent(
						jButton1).addPreferredGap(
						LayoutStyle.ComponentPlacement.RELATED, 68,
						Short.MAX_VALUE).addComponent(jButton2).addGap(63, 63,
						63).addComponent(jButton3).addGap(65, 65, 65)
						.addComponent(jButton4).addGap(42, 42, 42)));
		layout.setVerticalGroup(layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(
						jScrollPane1, GroupLayout.PREFERRED_SIZE, 255,
						GroupLayout.PREFERRED_SIZE).addPreferredGap(
						LayoutStyle.ComponentPlacement.RELATED, 15,
						Short.MAX_VALUE).addGroup(
						layout.createParallelGroup(
								GroupLayout.Alignment.BASELINE).addComponent(
								jButton1).addComponent(jButton3).addComponent(
								jButton2).addComponent(jButton4))
						.addContainerGap()));
		pack();
	}

	private void jButton1ActionPerformed( ActionEvent evt) {
	// Creem Connexio amb el Client

		cm.connexioRMI();

		jButton1.setEnabled(false);
		jButton2.setEnabled(true);
		jButton3.setEnabled(true);
		jButton4.setEnabled(true);

	}//GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		jScrollPane1.setViewportView(jTable1);
		Vector<Vector> v;
		try {
			v = cm.llistaPartners();

			jTable1.setModel(new DefaultTableModel(v, vEmpresa));

		} catch (RemoteException e) {

			e.printStackTrace();
		}
	}

	private void jButton3ActionPerformed(ActionEvent evt) {

		jScrollPane1.setViewportView(jTable2);
		Vector<Vector> v;
		try {
			v = cm.llistaContractes();

			jTable2.setModel(new DefaultTableModel(v, vContracte));

			Object[] possibilities = (cm.llistaNomsEmpreses()).toArray();
			String s = (String) JOptionPane.showInputDialog(this,
					"De quina empresa vol veure els contractes?\n",
					"Seleccioni empresa", JOptionPane.PLAIN_MESSAGE, null,
					possibilities, possibilities[0]);

			if ((s != null) && (s.length() > 0)) {
				v = cm.llistaContractes(s);

				jTable2.setModel(new DefaultTableModel(v, vContracte));

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	private void jButton4ActionPerformed(ActionEvent evt) {

		try {
			jComboBox1.setModel(new DefaultComboBoxModel((cm.llistaNomsEmpreses()).toArray()));
			jDialog1.setVisible(true);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		

	}

	private void jButton5ActionPerformed(ActionEvent evt) {
		
		try {
			cm.inserirContracte(jTextField1.getText(), (String)jComboBox1.getSelectedItem(), jTextField2.getText(), jTextField3.getText(), jTextField4.getText());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Client().setVisible(true);
			}
		});
	}

}
