package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import hijos.Particular;
import hijos.Profesional;
import padre.Licencia;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_12_2 extends JFrame implements ActionListener {
	
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
					Problema_12_2 frame = new Problema_12_2();
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
	public Problema_12_2() {
		setTitle("Problema_12_2");
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
		Licencia l = new Licencia("ClaseA", "A", "25/06/2022", "25/06/2026");
		imprimir(l);
		
		Particular p = new Particular("ClaseB", "B", "24/06/2022", "25/06/2026",70845594);
		imprimir(p);
		
		Profesional x = new Profesional("ClaseC", "C", "23/06/2022", "25/06/2026", "asdwa045");
		imprimir(x);
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
	void imprimir(Licencia x) {
		imprimir(">>>>>>>Licencia<<<<<<<");
		imprimir(x.datosDelBrevete());
		imprimir("----------------------");
	}
	
	void imprimir(Particular x) {
		imprimir(">>>>>>>Particular<<<<<<<");
		imprimir(x.datosLicenciaParticular());
		imprimir("----------------------");
	}
	
	void imprimir(Profesional x) {
		imprimir(">>>>>>>Profesional<<<<<<<");
		imprimir(x.datosLicenciaProfesional());
		imprimir("----------------------");
	}
}
