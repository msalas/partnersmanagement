import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JTextField;

public class AplicacioServidor extends Frame {

	private static final long serialVersionUID = 1L;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JTextField jTextField = null;

	/**
	 * This is the default constructor
	 */
	public AplicacioServidor() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setLayout(null);
		this.setSize(314, 145);
		this.setTitle("Gestió del Servidor RMI de MySandwich");

		this.add(getJButton(), null);
		this.add(getJButton1(), null);
		this.add(getJTextField(), null);
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(36, 86, 120, 26));
			jButton.setText("Iniciar Servidor");
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
			jButton1.setBounds(new Rectangle(161, 86, 121, 26));
			jButton1.setText("Aturar Servidor");
		}
		return jButton1;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(37, 48, 243, 20));
			jTextField.setText("Pendent d'iniciar el servidor RMI de la PAC3");
		}
		return jTextField;
	}

}  //  @jve:decl-index=0:visual-constraint="161,38"
