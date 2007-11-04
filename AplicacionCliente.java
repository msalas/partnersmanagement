import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Rectangle;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class AplicacionCliente extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;  //  @jve:decl-index=0:visual-constraint="63,253"

	private JButton jButton = null;

	private JButton jButton1 = null;

	private JButton jButton2 = null;

	private JButton jButton3 = null;

	private JTextField jTextField = null;

	/**
	 * This is the default constructor
	 */
	public AplicacionCliente() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(608, 241);
		this.setContentPane(getJContentPane());
		this.setTitle("MySandwich. TDS PAC3 Otoño 2007. Universitat Oberta de Catalunya");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setSize(new Dimension(535, 166));
			jContentPane.add(getJButton(), null);
			jContentPane.add(getJButton1(), null);
			jContentPane.add(getJButton2(), null);
			jContentPane.add(getJButton3(), null);
			jContentPane.add(getJTextField(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setName("jButton");
			jButton.setBounds(new Rectangle(16, 148, 111, 26));
			jButton.setText("Conexión RMI");
		}
		return jButton;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBounds(new Rectangle(148, 148, 137, 26));
			jButton1.setText("Listado Empresas");
		}
		return jButton1;
	}

	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setBounds(new Rectangle(303, 148, 135, 26));
			jButton2.setText("Listado Contratos");
		}
		return jButton2;
	}

	/**
	 * This method initializes jButton3	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setBounds(new Rectangle(457, 148, 121, 26));
			jButton3.setText("Nuevo Contrato");
		}
		return jButton3;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(142, 51, 266, 50));
			jTextField.setText("Bienvenidos al sistema 'Gestor de Partners'");
		}
		return jTextField;
	}

}  //  @jve:decl-index=0:visual-constraint="67,5"
