import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;

public class NouContracte extends Frame {

	private static final long serialVersionUID = 1L;
	private JButton jButton = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JTextField jTextField = null;
	private JTextField jTextField1 = null;
	private JComboBox jComboBox = null;
	private JTextField jTextField2 = null;
	private JTextField jTextField3 = null;
	/**
	 * This is the default constructor
	 */
	public NouContracte() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabel5 = new JLabel();
		jLabel5.setBounds(new Rectangle(16, 170, 40, 16));
		jLabel5.setText("Import:");
		jLabel4 = new JLabel();
		jLabel4.setBounds(new Rectangle(16, 140, 64, 16));
		jLabel4.setText("Data Baixa:");
		jLabel3 = new JLabel();
		jLabel3.setBounds(new Rectangle(16, 112, 54, 16));
		jLabel3.setText("Data Alta:");
		jLabel2 = new JLabel();
		jLabel2.setBounds(new Rectangle(17, 83, 54, 16));
		jLabel2.setText("Empresa:");
		jLabel1 = new JLabel();
		jLabel1.setBounds(new Rectangle(16, 54, 72, 16));
		jLabel1.setText("ID contracte:");
		jLabel = new JLabel();
		jLabel.setBounds(new Rectangle(15, 26, 200, 16));
		jLabel.setText("Introdueix dades del nou contracte:");
		this.setLayout(null);
		this.setSize(409, 246);
		this.setTitle("Dades del nou contracte");

		this.add(getJButton(), null);
		this.add(jLabel, null);
		this.add(jLabel1, null);
		this.add(jLabel2, null);
		this.add(jLabel3, null);
		this.add(jLabel4, null);
		this.add(jLabel5, null);
		this.add(getJTextField(), null);
		this.add(getJTextField1(), null);
		this.add(getJComboBox(), null);
		this.add(getJTextField2(), null);
		this.add(getJTextField3(), null);
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(13, 201, 386, 33));
			jButton.setText("Acceptar");
		}
		return jButton;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(197, 51, 190, 20));
		}
		return jTextField;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setBounds(new Rectangle(195, 111, 192, 20));
		}
		return jTextField1;
	}

	/**
	 * This method initializes jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JComboBox();
			jComboBox.setBounds(new Rectangle(197, 76, 188, 25));
		}
		return jComboBox;
	}

	/**
	 * This method initializes jTextField2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setBounds(new Rectangle(195, 139, 191, 20));
		}
		return jTextField2;
	}

	/**
	 * This method initializes jTextField3	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setBounds(new Rectangle(195, 166, 190, 20));
		}
		return jTextField3;
	}

}  //  @jve:decl-index=0:visual-constraint="11,-7"
