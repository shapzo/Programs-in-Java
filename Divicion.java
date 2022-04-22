package POO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Divicion extends JFrame {
	ButtonGroup grupoDeBotones = new ButtonGroup();
	JPanel panel;
	JButton boton;
	JButton boton1;
	JButton boton2;

	JLabel etiqueta;
	JLabel etiqueta1;
	JLabel etiqueta2;

	JTextField campo;
	JTextField campo1;
	JTextField campo2;

	JLabel fondo;

	public JPanel p = new JPanel();

	public Divicion() {

		setTitle("Suma");
		setSize(600, 600);
		p.setBackground(Color.black);
		p.setLayout(null);
		Container zona = getContentPane();

		zona.add(p);

		etiqueta = new JLabel("Ingrese el 1° numero: ");
		etiqueta1 = new JLabel("Ingrese el 2° numero: ");
		etiqueta2 = new JLabel("Resultado: ");

		campo = new JTextField(" ");
		campo1 = new JTextField(" ");
		campo2 = new JTextField(" ");

		boton = new JButton("Dividir");
		boton1 = new JButton("Limpiar");
		boton2 = new JButton(new ImageIcon("flecha.png"));

		campo.setBorder(new javax.swing.border.LineBorder(Color.yellow, 3, true));
		campo.setBackground(Color.blue);
		campo1.setBorder(new javax.swing.border.LineBorder(Color.yellow, 3, true));
		campo1.setBackground(Color.blue);
		campo2.setBorder(new javax.swing.border.LineBorder(Color.red, 3, true));
		campo2.setBackground(Color.green);

		campo.setFont(new java.awt.Font("Comic Sans MS", 2, 20));
		campo1.setFont(new java.awt.Font("Comic Sans MS", 2, 20));
		campo2.setFont(new java.awt.Font("Comic Sans MS", 2, 20));

		campo.setForeground(Color.pink);
		campo1.setForeground(Color.pink);
		campo2.setForeground(Color.red);

		etiqueta.setForeground(Color.orange);
		etiqueta1.setForeground(Color.orange);
		etiqueta2.setForeground(Color.orange);

		etiqueta.setFont(new java.awt.Font("Comic Sans MS", 2, 20));
		etiqueta1.setFont(new java.awt.Font("Comic Sans MS", 2, 20));
		etiqueta2.setFont(new java.awt.Font("Comic Sans MS", 2, 20));

		boton.setFont(new java.awt.Font("Consolas", 2, 20));
		boton1.setFont(new java.awt.Font("Consolas", 2, 20));
		boton2.setFont(new java.awt.Font("Consolas", 2, 20));

		etiqueta.setBounds(25, 50, 180, 30);
		etiqueta1.setBounds(25, 130, 180, 30);
		etiqueta2.setBounds(25, 300, 180, 30);

		campo.setBounds(190, 50, 150, 30);
		campo1.setBounds(190, 130, 150, 30);
		campo2.setBounds(185, 300, 150, 30);

		boton.setBounds(185, 200, 150, 50);
		boton1.setBounds(350, 295, 150, 35);
		boton2.setBounds(185, 400, 150, 50);

		fondo = new JLabel();
		fondo.setIcon(new ImageIcon("image1.jpg"));
		fondo.setBounds(1, 1, 600, 600);

		boton.setBackground(new java.awt.Color(112, 24, 224));
		boton1.setBackground(new java.awt.Color(24, 163, 224));

		p.add(etiqueta);
		p.add(etiqueta1);
		p.add(etiqueta2);

		p.add(campo);
		p.add(campo1);
		p.add(campo2);

		p.add(boton);
		p.add(boton1);
		p.add(boton2);
		p.add(fondo);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {

				String cad1 = campo.getText();
				String cad2 = campo1.getText();

				double x1 = Double.parseDouble(cad1);
				double x2 = Double.parseDouble(cad2);

				double suma = x1 / x2;

				campo2.setText("= " + suma);

			}
		});

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				campo.setText(null);
				campo1.setText(null);
				campo2.setText(null);

			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				dispose();

			}
		});

	}

	public static void main(String... RODRIGO) {
		Divicion Rodrigo = new Divicion();
		Rodrigo.setVisible(true);
		Rodrigo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
