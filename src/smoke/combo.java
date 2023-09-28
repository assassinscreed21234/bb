package smoke;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class combo {

	private JFrame frmPizzeriaThePatrio;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_2;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JSlider slider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					combo window = new combo();
					window.frmPizzeriaThePatrio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public combo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPizzeriaThePatrio = new JFrame();
		frmPizzeriaThePatrio.setTitle("PIZZERIA THE PATRIO");
		frmPizzeriaThePatrio.setBounds(100, 100, 674, 438);
		frmPizzeriaThePatrio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzeriaThePatrio.getContentPane().setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(15, 82, 130, 22);
		frmPizzeriaThePatrio.getContentPane().add(comboBox);
		
		slider = new JSlider();
		slider.setBounds(15, 36, 200, 26);
		frmPizzeriaThePatrio.getContentPane().add(slider);
		
		JLabel lblNewLabel = new JLabel("    CANTIDAD");
		lblNewLabel.setBounds(22, 12, 80, 24);
		frmPizzeriaThePatrio.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    ESPECIALIDAD");
		lblNewLabel_1.setBounds(22, 61, 112, 21);
		frmPizzeriaThePatrio.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("           TAMAÑO");
		lblNewLabel_2.setBounds(25, 115, 113, 22);
		frmPizzeriaThePatrio.getContentPane().add(lblNewLabel_2);
		
		btnNewButton = new JButton("BORRAR");
		btnNewButton.setBounds(174, 102, 89, 23);
		frmPizzeriaThePatrio.getContentPane().add(btnNewButton);
		
		rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(25, 144, 109, 23);
		frmPizzeriaThePatrio.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(25, 170, 109, 23);
		frmPizzeriaThePatrio.getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(25, 196, 109, 23);
		frmPizzeriaThePatrio.getContentPane().add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setBounds(22, 222, 109, 23);
		frmPizzeriaThePatrio.getContentPane().add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("COMPLEMENTOS");
		lblNewLabel_3.setBounds(15, 238, 267, 22);
		frmPizzeriaThePatrio.getContentPane().add(lblNewLabel_3);
		
		chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(15, 267, 97, 23);
		frmPizzeriaThePatrio.getContentPane().add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(15, 293, 97, 23);
		frmPizzeriaThePatrio.getContentPane().add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(15, 319, 97, 23);
		frmPizzeriaThePatrio.getContentPane().add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_3.setBounds(15, 346, 97, 23);
		frmPizzeriaThePatrio.getContentPane().add(chckbxNewCheckBox_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(combo.class.getResource("/smoke/pizza-cafe-logo-pizza-icon-illustration-graphic-emblem-pizza-of-perfect-for-fast-food-restaurant-simple-flat-style-pizza-logo-vector.jpg")));
		lblNewLabel_5.setBounds(385, 12, 200, 173);
		frmPizzeriaThePatrio.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(combo.class.getResource("/smoke/ea8ab546c6674daf501f75cfea3da7b5-patriotas-de-nueva-inglaterra-ftbol-americano.png")));
		lblNewLabel_4.setBounds(349, 174, 267, 116);
		frmPizzeriaThePatrio.getContentPane().add(lblNewLabel_4);
	}
}
