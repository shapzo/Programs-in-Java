package POO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Programa2 extends JFrame {
	ButtonGroup grupoDeBotones = new ButtonGroup();
	JPanel panel;
	JButton boton;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JLabel fondo;

	protected String[] Suma;
	protected String[] Resta;
	protected String[] Divicion;
	protected String[] Multi;

	public JPanel p = new JPanel();

	public Programa2() {

		setTitle("Operaciones basicas");
		setSize(400, 600);
		p.setBackground(Color.black);
		p.setLayout(null);
		Container zona = getContentPane();

		zona.add(p);

		boton = new JButton("Suma");
		boton1 = new JButton("Resta");
		boton2 = new JButton("Divicion");
		boton3 = new JButton("Multiplicacion");
		boton4 = new JButton(new ImageIcon("salir.png"));

		boton4.setBorderPainted(false);
		boton4.setContentAreaFilled(false);
		boton4.setFocusPainted(false);
		boton4.setOpaque(false);

		fondo = new JLabel();
		fondo.setIcon(new ImageIcon("image.png"));
		fondo.setBounds(1, 1, 400, 600);

		boton.setFont(new java.awt.Font("Consolas", 2, 20));
		boton1.setFont(new java.awt.Font("Consolas", 2, 20));
		boton2.setFont(new java.awt.Font("Consolas", 2, 20));
		boton3.setFont(new java.awt.Font("Consolas", 2, 15));
		boton4.setFont(new java.awt.Font("Consolas", 2, 20));

		boton.setBounds(25, 120, 150, 50);
		boton1.setBounds(215, 120, 150, 50);
		boton2.setBounds(25, 270, 150, 50);
		boton3.setBounds(215, 270, 150, 50);
		boton4.setBounds(125, 390, 100, 100);

		boton.setBackground(new java.awt.Color(8, 173, 100));
		boton1.setBackground(new java.awt.Color(59, 38, 164));
		boton2.setBackground(new java.awt.Color(8, 173, 100));
		boton3.setBackground(new java.awt.Color(59, 38, 164));

		p.add(boton);
		p.add(boton1);
		p.add(boton2);
		p.add(boton3);
		p.add(boton4);
		p.add(fondo);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				Suma abrir = new Suma();
				abrir.main(Suma);

			}
		});

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				Resta abrir = new Resta();
				abrir.main(Resta);

			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				Divicion abrir = new Divicion();
				abrir.main(Divicion);

			}
		});

		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				Multi abrir = new Multi();
				abrir.main(Multi);

			}
		});

		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				dispose();
			}
		});

		setVisible(true);
	}

	public static void main(String... RODRIGO) {
		Programa2 Rodrigo = new Programa2();
		Rodrigo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
