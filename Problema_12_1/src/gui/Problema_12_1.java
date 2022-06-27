package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


import hijos.Auto;
import hijos.Camioneta;
import padre.Vehiculo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_12_1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_12_1 frame = new Problema_12_1();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_12_1() {
		setTitle("Problema_12_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(185, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 444, 563);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 14));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		txtS.setText("");
		Vehiculo v = new Vehiculo("Mitsubishi", "M35-A", "AE20BC1");
		listado(v);
		
		Auto a = new Auto("Nizan", "N15-C", "NI20BC1",50000);
		listado(a);
		
		Camioneta c = new Camioneta("Toyota", "T55-f", "TO20BC2",60000);
		listado(c);
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
	void listado(Vehiculo obj) {
		
		if(obj instanceof Auto) {			
			imprimir(">>>  A U T O");
		} else if (obj instanceof Camioneta) {
			imprimir(">>>  C A M I O N E T A");
		} else {
			imprimir(">>>  V E H I C U L O");
		}
		
		imprimir(obj.datosCompletos());
		imprimir("--------------------");
	}
	
	/*
	void listado(Vehiculo x) {
		imprimir(">>>  V E H I C U L O");
		imprimir(x.datosCompletos());
		imprimir("--------------------");
	}
	void listado(Auto x) {
		imprimir(">>>  A U T O");
		imprimir(x.datosCompletos());
		imprimir("--------------------");
	}
	void listado(Camioneta x) {
		imprimir(">>>  C A M I O N E T A");
		imprimir(x.datosCompletos());
		imprimir("--------------------");
	}
	*/
}
