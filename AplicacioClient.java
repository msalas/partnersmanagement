import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JTextField;

public class AplicacioClient extends Frame {

	private static final long serialVersionUID = 1L;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JButton jButton2 = null;
	private JButton jButton3 = null;
	private JTextField jTextField = null;

	/**
	 * This is the default constructor
	 */
	public AplicacioClient() {
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
		this.setSize(586, 196);
		this.setTitle("MySandwich. TDP PAC3 Tardor 2007. Universitat Oberta de Catalunya");

		this.add(getJButton(), null);
		this.add(getJButton1(), null);
		this.add(getJButton2(), null);
		this.add(getJButton3(), null);
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
			jButton.setBounds(new Rectangle(15, 150, 111, 26));
			jButton.setText("Connexió RMI");
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
			jButton1.setBounds(new Rectangle(136, 150, 130, 26));
			jButton1.setText("Llistat Empreses");
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
			jButton2.setBounds(new Rectangle(276, 150, 152, 26));
			jButton2.setText("Llistat de Contractes");
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
			jButton3.setBounds(new Rectangle(434, 150, 114, 26));
			jButton3.setText("Nou contracte");
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
			jTextField.setBounds(new Rectangle(151, 58, 304, 20));
			jTextField.setText("BENVINGUTS AL SISTEMA 'GESTOR DE PARTNERS'");
		}
		return jTextField;
	}

}  //  @jve:decl-index=0:visual-constraint="76,36"
