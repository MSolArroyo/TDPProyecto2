package logica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Reloj extends JFrame{
	
	private int h,m,s,ml;
	private boolean parar;
	private JPanel contentPane;
	private Timer t;
	private ActionListener acciones;
	private boolean andando;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reloj frame = new Reloj();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Reloj() {
		

		t= new Timer(10, acciones);
		parar=true;
		
		setType(Type.POPUP);
		setForeground(Color.LIGHT_GRAY);
		setTitle("TIEMPO DE JUEGO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 146);
		this.setLocation(600,100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JLabel etiquetatiempo = new JLabel("00:00:00:00");
		etiquetatiempo.setFont(new Font("Tahoma", Font.PLAIN, 37));
		etiquetatiempo.setBounds(84, 33, 225, 45);
		contentPane.add(etiquetatiempo);
		
		JButton botoncomenzar = new JButton("COMENZAR");
		
		botoncomenzar.setBounds(343, 11, 115, 23);
		contentPane.add(botoncomenzar);
		
		JButton botonpausa = new JButton("PAUSA");
		
		botonpausa.setBounds(343, 45, 115, 23);
		contentPane.add(botonpausa);
		
		
		
		JButton botondetener = new JButton("DETENER");
		botondetener.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String ti;			
				if (t.isRunning())
				{
					t.stop();
					botoncomenzar.setEnabled(true);
				}
				
				botoncomenzar.setText("COMENZAR");
				botonpausa.setEnabled(false);
				botondetener.setEnabled(false);
				h=0;m=0;s=0;ml=0;
				
				ti=actualizarLabel();
				etiquetatiempo.setText(ti);
				
			}
		});
		botondetener.setBounds(343, 79, 115, 23);
		contentPane.add(botondetener);
		
		
		
		botonpausa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				t.stop();
				botoncomenzar.setEnabled(true);
				botoncomenzar.setText("REANUDAR");
				botonpausa.setEnabled(false);
				
			
			
			}
		});

		botoncomenzar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				botoncomenzar.setEnabled(false);

			    t.start();
			    
			    
				botoncomenzar.setEnabled(false);
				botoncomenzar.setText("Reanudar");
				botonpausa.setEnabled(true);
				botondetener.setEnabled(true);
				
				
					String ti;
						
						ml=ml+10;
						if (ml==100) {
							ml=0;
							s++;
							
						}
						if (s==60) {
							s=0;
						m++;
						}
						if (m==60) {
							m=0;
							h++;
						}
						

						ti=actualizarLabel();
						etiquetatiempo.setText(ti);					}  

					
				
				
				
			
		});
		
		
		
	}


	private String actualizarLabel() {
		// TODO Auto-generated method stub
		String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(ml<=9?"0":"")+ml;
		return tiempo;
	}



}
