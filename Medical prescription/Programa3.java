import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Programa3 extends JFrame {
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

	public Programa3() {

		setTitle("Consulatorio Medico");
		setSize(1218, 739);
		p.setBackground(Color.black);
		p.setLayout(null);
		setLocation(50, 20);
		Container zona = getContentPane();
		zona.add(p);

		boton = new JButton(new ImageIcon("Img/medico.png")); /* boton de cita medica */
		boton1 = new JButton(new ImageIcon("Img/reseta.png")); /* boton de receta */

		String texto = "Ir a consulta";
		boton.setToolTipText(texto);

		String texto1 = "De momento el doctor no esta";
		boton1.setToolTipText(texto1);

		boton.setBorderPainted(false); /* esta parte de aqui es para la transparencia de los botones */
		boton.setContentAreaFilled(false);
		boton.setFocusPainted(false);
		boton.setOpaque(false);

		boton1.setBorderPainted(false);
		boton1.setContentAreaFilled(false);
		boton1.setFocusPainted(false);
		boton1.setOpaque(false);

		Logo = new JLabel(); /* declaracion de los labels para la imagenes */
		Nombre = new JLabel();
		Gif1 = new JLabel();
		Gif2 = new JLabel();

		fondo = new JLabel();

		Logo = new JLabel(new ImageIcon("Img/logo.jpg")); /* imagen del logo del consultorio */
		Nombre = new JLabel(new ImageIcon("Img/nombre.png")); /* imagen del nobre del consultorio */
		Gif1 = new JLabel(new ImageIcon("Img/corona.gif"));
		Gif2 = new JLabel(new ImageIcon("Img/corn2.jpg"));
		Gif3 = new JButton(new ImageIcon("Img/susan.png")); /* imagen del gif alucivo al sars cov II */

		Gif3.setBorderPainted(false);
		Gif3.setContentAreaFilled(false);
		Gif3.setFocusPainted(false);
		Gif3.setOpaque(false);

		fondo = new JLabel(new ImageIcon("Img/fondo.jpg")); /* imagen de fondo */

		boton.setBounds(50, 175, 300, 350); /* posicionamiento de los botones e imagenes */
		boton1.setBounds(825, 175, 300, 350);

		Logo.setBounds(0, 0, 150, 150);
		Nombre.setBounds(150, 0, 1050, 150);
		Gif1.setBounds(0, 550, 150, 150);
		Gif2.setBounds(400, 550, 387, 150);
		Gif3.setBounds(1080, 550, 103, 150);

		fondo.setBounds(0, 150, 1200, 400);

		p.add(boton); /* se agregan al panel todos los botones y cosas de la interfaz */
		p.add(boton1);
		p.add(Logo);
		p.add(Nombre);
		p.add(Gif1);
		p.add(Gif2);
		p.add(Gif3);
		p.add(fondo);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				try {
					POO.consulta.main(consulta);
				} catch (IOException e) {

					e.printStackTrace();
				}

			}
		});

		setVisible(true);

	}

	public static void main(String... RODRIGO) {
		Programa3 Rodrigo = new Programa3();
		Rodrigo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
