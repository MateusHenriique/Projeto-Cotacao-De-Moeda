package br.com.cotacaoDeMoeda.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.cotacaoDeMoeda.model.Coin;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class FrameView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameView frame = new FrameView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(192, 10, 203, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(192, 87, 203, 25);
		contentPane.add(lblNewLabel_2);
		
		JComboBox<Coin> comboBoxResquestCoin = new JComboBox(Coin.values());
		comboBoxResquestCoin.setBounds(285, 45, 110, 32);
		contentPane.add(comboBoxResquestCoin);
		
		JComboBox comboBoxResponseCoin = new JComboBox(Coin.values());
		comboBoxResponseCoin.setBounds(192, 122, 203, 32);
		contentPane.add(comboBoxResponseCoin);
		
		JSpinner spinner = new JSpinner();
		spinner.setToolTipText("");
		spinner.setModel(new SpinnerNumberModel(Float.valueOf(0), Float.valueOf(0), null, Float.valueOf(1)));
		spinner.setBounds(192, 45, 87, 32);
		contentPane.add(spinner);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(192, 189, 203, 44);
		contentPane.add(lblNewLabel);
		
	}
}
