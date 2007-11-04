import java.awt.Frame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class SeleccioEmpresa extends Frame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JButton jButton = null;
	private JComboBox jComboBox = null;
	/**
	 * This is the default constructor
	 */
	public SeleccioEmpresa() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabel1 = new JLabel();
		jLabel1.setBounds(new Rectangle(32, 75, 29, 16));
		jLabel1.setText("Nom:");
		jLabel = new JLabel();
		jLabel.setBounds(new Rectangle(29, 48, 257, 16));
		jLabel.setText("¿De quina empresa vol veure els contractes?");
		this.setLayout(null);
		this.setSize(300, 166);
		this.setTitle("Seleccioni Empresa");

		this.add(jLabel, null);
		this.add(jLabel1, null);
		this.add(getJButton(), null);
		this.add(getJComboBox(), null);
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(29, 127, 243, 26));
			jButton.setText("Acceptar");
		}
		return jButton;
	}

	/**
	 * This method initializes jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JComboBox();
			jComboBox.setBounds(new Rectangle(74, 72, 192, 36));
		}
		return jComboBox;
	}

}  //  @jve:decl-index=0:visual-constraint="163,12"
