import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

public class Medical_prescription extends JFrame {
	ButtonGroup grupoDeBotones = new ButtonGroup();
	JPanel panel;
	JButton boton;
	JButton boton1;

	JLabel fondo;

	JLabel Logo;
	JLabel Nombre;
	JLabel Gif1;
	JLabel Gif2;
	JButton Gif3;

	protected String[] consulta;

	public JPanel p = new JPanel();

	public Medical_prescription() {

		setTitle("Doctor's office");
		setSize(1200, 700);
		p.setBackground(Color.black);
		p.setLayout(null);
		setLocation(50, 20);
		Container zona = getContentPane();
		zona.add(p);

		boton = new JButton(new ImageIcon("Imges/medico.png")); /* medical appointment button */
		boton1 = new JButton(new ImageIcon("Imges/reseta.png")); /* recipe button */

		String texto = "Go to consultation";
		boton.setToolTipText(texto);

		String texto1 = "At the moment the doctor is not";
		boton1.setToolTipText(texto1);

		boton.setBorderPainted(false); /* this part here is for the transparency of the buttons */
		boton.setContentAreaFilled(false);
		boton.setFocusPainted(false);
		boton.setOpaque(false);

		boton1.setBorderPainted(false);
		boton1.setContentAreaFilled(false);
		boton1.setFocusPainted(false);
		boton1.setOpaque(false);

		Logo = new JLabel();
		Nombre = new JLabel();
		Gif1 = new JLabel();
		Gif2 = new JLabel();

		fondo = new JLabel();

		Logo = new JLabel(new ImageIcon("Imges/logo.jpg")); /* practice logo image */
		Nombre = new JLabel(new ImageIcon("Imges/nombre.png")); /* office name image */
		Gif1 = new JLabel(new ImageIcon("Imges/corona.gif"));
		Gif2 = new JLabel(new ImageIcon("Imges/corn2.jpg"));
		Gif3 = new JButton(new ImageIcon("Imges/susan.png")); /* hallucinatory gif image to sars cov II */

		Gif3.setBorderPainted(false);
		Gif3.setContentAreaFilled(false);
		Gif3.setFocusPainted(false);
		Gif3.setOpaque(false);

		fondo = new JLabel(new ImageIcon("Imges/fondo.jpg")); /* imagen de fondo */

		boton.setBounds(50, 175, 300, 350);
		boton1.setBounds(825, 175, 300, 350);

		Logo.setBounds(0, 0, 150, 150);
		Nombre.setBounds(150, 0, 1050, 150);
		Gif1.setBounds(0, 550, 150, 150);
		Gif2.setBounds(400, 550, 387, 150);
		Gif3.setBounds(1080, 550, 103, 150);

		fondo.setBounds(0, 150, 1200, 400);

		p.add(boton);
		p.add(boton1);
		p.add(Logo);
		p.add(Nombre);
		p.add(Gif1);
		p.add(Gif2);
		p.add(Gif3);
		p.add(fondo);

		/*boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				try {
					new consulta(); 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});*/

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) { 
				consulta abrir;
				try {
					abrir = new consulta();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				//abrir.main(consulta);

			}
		});
		//setVisible(true);
	}

	public static void main(String... RODRIGO) {
		Medical_prescription Rodrigo = new Medical_prescription();
		Rodrigo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Rodrigo.setVisible(true);
		Rodrigo.setResizable(false);
	}
}
