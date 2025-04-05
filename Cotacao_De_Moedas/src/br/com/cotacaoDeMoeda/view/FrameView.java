package br.com.cotacaoDeMoeda.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.cotacaoDeMoeda.controller.AppController;
import br.com.cotacaoDeMoeda.model.Coin;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JLabel lblOriginCoin = new JLabel("Moeda de Origem:");
		lblOriginCoin.setBounds(192, 10, 203, 25);
		contentPane.add(lblOriginCoin);
		
		JLabel lblResposeCoin = new JLabel("Cotação para:");
		lblResposeCoin.setBounds(192, 87, 203, 25);
		contentPane.add(lblResposeCoin);
		
		JComboBox<Coin> comboBoxResquestCoin = new JComboBox(Coin.values());
		comboBoxResquestCoin.setBounds(289, 45, 110, 32);
		contentPane.add(comboBoxResquestCoin);
		
		JComboBox comboBoxResponseCoin = new JComboBox(Coin.values());
		comboBoxResponseCoin.setBounds(192, 122, 205, 32);
		contentPane.add(comboBoxResponseCoin);
		
		JSpinner spinner = new JSpinner();
		spinner.setToolTipText("");
		spinner.setModel(new SpinnerNumberModel(Float.valueOf(0), Float.valueOf(0), null, Float.valueOf(1)));
		spinner.setBounds(192, 45, 87, 32);
		contentPane.add(spinner);
		
		JLabel lblResult = new JLabel("");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(192, 209, 203, 44);
		contentPane.add(lblResult);
		
		JButton btnConfirm = new JButton("Confirmar");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppController.cotationAction("BRL", "EUR");
			}
		});
		btnConfirm.setBounds(246, 178, 85, 21);
		contentPane.add(btnConfirm);
		
	}
}
