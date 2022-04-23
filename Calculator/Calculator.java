import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
	ButtonGroup grupoDeBotones = new ButtonGroup();
	JPanel panel;
	JButton boton;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;

	protected String[] Addition;
	protected String[] Subtraction;
	protected String[] Divicion;
	protected String[] Multi;

	public JPanel p = new JPanel();

	public Calculator() {

		setTitle("Basic operations");
		setSize(400, 600);
		setLocationRelativeTo(null);
		p.setBackground(Color.black);
		p.setLayout(null);
		Container zona = getContentPane();

		zona.add(p);

		boton = new JButton("Addition");
		boton1 = new JButton("Subtraction");
		boton2 = new JButton("Division");
		boton3 = new JButton("Multiplication");
		boton4 = new JButton(new ImageIcon("Images/exit.png"));

		boton4.setBorderPainted(false);
		boton4.setContentAreaFilled(false);
		boton4.setFocusPainted(false);
		boton4.setOpaque(false);

		boton.setFont(new java.awt.Font("comfortaa", 1, 20));
		boton1.setFont(new java.awt.Font("comfortaa", 1, 20));
		boton2.setFont(new java.awt.Font("comfortaa", 1, 20));
		boton3.setFont(new java.awt.Font("comfortaa", 1, 15));

		boton.setBounds(25, 120, 150, 50);
		boton1.setBounds(215, 120, 150, 50);
		boton2.setBounds(25, 270, 150, 50);
		boton3.setBounds(215, 270, 150, 50);
		boton4.setBounds(125, 390, 100, 100);

		boton.setBackground(new java.awt.Color(8, 173, 127));
		boton1.setBackground(new java.awt.Color(2, 158, 198));
		boton2.setBackground(new java.awt.Color(8, 173, 127));
		boton3.setBackground(new java.awt.Color(2, 158, 198));

		boton.setForeground(new java.awt.Color(4, 4, 4));
		boton1.setForeground(new java.awt.Color(4, 4, 4));
		boton2.setForeground(new java.awt.Color(4, 4, 4));
		boton3.setForeground(new java.awt.Color(4, 4, 4));

		p.add(boton);
		p.add(boton1);
		p.add(boton2);
		p.add(boton3);
		p.add(boton4);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				Addition open = new Addition();
				open.main(Addition);

			}
		});

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				Subtraction open = new Subtraction();
				open.main(Subtraction);

			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				Divicion open = new Divicion();
				open.main(Divicion);

			}
		});

		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				Multi open = new Multi();
				open.main(Multi);

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
		Calculator Rodrigo = new Calculator();
		Rodrigo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
