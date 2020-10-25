package logica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
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
	public inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("BIENVENIDOS");
		label.setFont(new Font("Rockwell Condensed", Font.PLAIN, 44));
		label.setBounds(172, 119, 196, 65);
		contentPane.add(label);
		
		JButton button = new JButton("PARQUIMETROS");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			 
			}
		});
		button.setForeground(Color.GRAY);
		button.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(182, 194, 155, 23);
		contentPane.add(button);
	}

}
