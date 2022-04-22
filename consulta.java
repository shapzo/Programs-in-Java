package POO;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class consulta extends JFrame {

	JPanel panel;
	JLabel Logo;
	JLabel Nombre;
	JLabel Gif;

	JButton sintoma;
	JButton salir;
	JButton Total;
	JButton Limpiar;
	JButton Impri;

	JLabel nom, apll, estado, sex, edad, enfcro, sars, cost;
	JTextField no, apl, costo;
	JComboBox<String> est, sets, ed;

	ButtonGroup a = new ButtonGroup();
	JRadioButton a1 = new JRadioButton("Si", false);
	JRadioButton a2 = new JRadioButton("No", false);

	JRadioButton c = new JRadioButton();
	Checkbox c1 = new Checkbox("Canser");
	Checkbox c2 = new Checkbox("Tos");
	Checkbox c3 = new Checkbox("Progeria");
	Checkbox c4 = new Checkbox("Elefantiasis");
	Checkbox c5 = new Checkbox("Argiria");
	Checkbox c6 = new Checkbox("Tricotilomanía");

	protected String[] reseta;

	public JPanel p = new JPanel();

	public consulta() throws IOException {

		setTitle("Consulta Medica");
		setSize(600, 750);
		p.setBackground(Color.gray);
		p.setLayout(null);
		setLocation(400, 10);
		Container zona = getContentPane();

		zona.add(p);

		/*--------------------------area del logo y principio---------------------*/

		Logo = new JLabel(); /* declaracion de los labels para la imagenes */
		Nombre = new JLabel();
		Gif = new JLabel();

		Logo = new JLabel(new ImageIcon("logo.jpg")); /* imagen del logo del consultorio */
		Nombre = new JLabel(new ImageIcon("nombre2.png")); /* imagen del nobre del consultorio CAMBIRA EL FONOD */
		Gif = new JLabel(new ImageIcon()); /* imagen del gif alucivo al sars cov II CAMBIAR EL FONODO */

		/*-----------------------------area de pago y salida-----------------------------*/

		salir = new JButton(new ImageIcon("atras (1).png"));
		costo = new JTextField();
		cost = new JLabel("El presio a pagar es: ");
		Total = new JButton("Total");
		Limpiar = new JButton("Limpiar");
		Impri = new JButton("Imprimir tiked de pago");

		String texto = "Regresar";
		salir.setToolTipText(texto);

		cost.setForeground(Color.orange);
		cost.setFont(new java.awt.Font("Comic Sans MS", 2, 20));

		costo.setBorder(new javax.swing.border.LineBorder(Color.yellow, 3, true));
		costo.setBackground(Color.blue);
		costo.setFont(new java.awt.Font("Comic Sans MS", 2, 20));
		costo.setForeground(Color.pink);

		salir.setFont(new java.awt.Font("Consolas", 2, 20));
		Total.setFont(new java.awt.Font("Consolas", 2, 20));
		Limpiar.setFont(new java.awt.Font("Consolas", 2, 20));
		Impri.setFont(new java.awt.Font("Consolas", 2, 20));

		salir.setBackground(new java.awt.Color(8, 173, 100));
		Total.setBackground(new java.awt.Color(8, 173, 100));
		Limpiar.setBackground(new java.awt.Color(8, 173, 100));
		Impri.setBackground(new java.awt.Color(8, 173, 100));
		/*--------------------------------primera parte------------------------------*/
		nom = new JLabel("Nombre´s: ");
		apll = new JLabel("Apellidos´s: ");
		no = new JTextField();
		apl = new JTextField();

		nom.setForeground(Color.lightGray);
		apll.setForeground(Color.orange);
;
		nom.setFont(new java.awt.Font("Segoe UI Semibold", 5, 30));
		apll.setFont(new java.awt.Font("Comic Sans MS", 2, 20));

		no.setBorder(new javax.swing.border.LineBorder(Color.yellow, 3, true));
		no.setBackground(Color.blue);
		apl.setBorder(new javax.swing.border.LineBorder(Color.yellow, 3, true));
		apl.setBackground(Color.blue);

		no.setFont(new java.awt.Font("Comic Sans MS", 2, 20));
		apl.setFont(new java.awt.Font("Comic Sans MS", 2, 20));

		no.setForeground(Color.pink);
		apl.setForeground(Color.pink);

		/*-----------------------------------segunda parte-----------------------------------*/

		edad = new JLabel("Seleccoine su edad. ");
		sex = new JLabel("seleccione su sexo. ");
		estado = new JLabel("Estado de procedencia. ");
		est = new JComboBox<String>();
		sets = new JComboBox<String>();
		ed = new JComboBox<String>();

		est.setForeground(Color.green);
		est.setFont(new java.awt.Font("Comic Sans MS", 2, 15));

		sets.setForeground(Color.green);
		sets.setFont(new java.awt.Font("Comic Sans MS", 2, 15));

		ed.setForeground(Color.green);
		ed.setFont(new java.awt.Font("Comic Sans MS", 2, 15));

		edad.setForeground(Color.orange);
		edad.setFont(new java.awt.Font("Comic Sans MS", 2, 20));

		sex.setForeground(Color.orange);
		sex.setFont(new java.awt.Font("Comic Sans MS", 2, 20));

		estado.setForeground(Color.orange);
		estado.setFont(new java.awt.Font("Comic Sans MS", 2, 20));

		/*----------------------------------ultima parte-------------------------------------*/
		enfcro = new JLabel("¿Esta contagiado del coronavirus? ");

		a1.setForeground(Color.black);
		a1.setFont(new java.awt.Font("Comic Sans MS", 2, 14));
		a2.setForeground(Color.black);
		a2.setFont(new java.awt.Font("Comic Sans MS", 2, 14));

		sintoma = new JButton("seleccione los sintomas que padese.");
		sintoma.setBounds(90, 400, 440, 30);

		enfcro.setForeground(Color.orange);
		enfcro.setFont(new java.awt.Font("Comic Sans MS", 2, 20));

		sintoma.setFont(new java.awt.Font("Consolas", 2, 20));
		sintoma.setBackground(new java.awt.Color(8, 173, 100));

		/*--------------------------------------------acciones de los botones--------------*/

		sintoma.addActionListener(new ActionListener() { // añadir a la lista
			public void actionPerformed(ActionEvent v) {

				c1.setFont(new java.awt.Font("Comic Sans MS", 2, 18));
				c2.setFont(new java.awt.Font("Comic Sans MS", 2, 18));
				c3.setFont(new java.awt.Font("Comic Sans MS", 2, 18));
				c4.setFont(new java.awt.Font("Comic Sans MS", 2, 18));
				c5.setFont(new java.awt.Font("Comic Sans MS", 2, 18));
				c6.setFont(new java.awt.Font("Comic Sans MS", 2, 18));

				c1.setBounds(25, 430, 100, 30);
				c2.setBounds(230, 430, 100, 30);
				c3.setBounds(416, 430, 100, 30);
				c4.setBounds(25, 480, 100, 30);
				c5.setBounds(230, 480, 100, 30);
				c6.setBounds(416, 480, 100, 30);

				p.add(c1);
				p.add(c2);
				p.add(c3);
				p.add(c4);
				p.add(c5);
				p.add(c6);

			}

		});

		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				dispose();

			}
		});

		Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {

				int res = 0;

				if (c1.getState() == true) {
					res = res + 2600;
				}
				if (c2.getState() == true) {
					res = res + 15500;
				}
				if (c3.getState() == true) {
					res = res + 850;
				}
				if (c4.getState() == true) {
					res = res + 720;
				}
				if (c4.getState() == true) {
					res = res + 260;
				}
				if (c6.getState() == true) {
					res = res + 500;
				}
				costo.setText("$" + res);

			}
		});

		Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				costo.setText(null);
				no.setText(null);
				apl.setText(null);
				c1.setState(false);
				c2.setState(false);
				c3.setState(false);
				c4.setState(false);
				c5.setState(false);
			}
		});

		Impri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				String ruta = "C:\\Users\\Rodrigo\\Desktop\\Tiked_de_pago.txt";
				try {
					File arch = new File(ruta);
					FileWriter ro = new FileWriter(arch, true);

					ro.write("-----------Tiked de pago----------------\n");
					ro.write("-------Servicios de consulta medica ----\n");
					ro.write("-----------LIFE LINE MEDICAL---------- -\n");
					ro.write("-------EL PRECIO A PAGAR ES: -----------\n");
					ro.write("-------" + costo.getText() + " pesos---------------------\n");
					ro.write("-------senñor@: " + no.getText() + "-----------------\n");
					ro.write("-------con apellidos: " + apl.getText() + "------\n");
					ro.write("-------Grasias por su preferencia-------");
					ro.close();
				} catch (Exception er) {
					System.out.println("error" + er);

				}

			}
		});

		/*-----------------------posicionamiento de los elementos ene l panel------------------*/

		nom.setBounds(25, 180, 150, 30);
		apll.setBounds(25, 215, 150, 30);
		no.setBounds(200, 180, 200, 30);
		apl.setBounds(200, 215, 200, 30);

		edad.setBounds(25, 255, 250, 30);
		sex.setBounds(25, 290, 250, 30);
		estado.setBounds(25, 325, 250, 30);

		ed.setBounds(315, 255, 150, 30);
		sets.setBounds(315, 290, 150, 30);
		est.setBounds(315, 325, 150, 30);

		enfcro.setBounds(25, 365, 350, 30);

		a1.setBounds(355, 365, 50, 30);
		a2.setBounds(415, 365, 50, 30);

		Logo.setBounds(0, 0, 150, 150);
		Nombre.setBounds(150, 0, 450, 150);
		Gif.setBounds(0, 750, 1200, 150);

		salir.setBounds(400, 560, 100, 50);
		costo.setBounds(25, 560, 100, 30);
		cost.setBounds(25, 530, 250, 35);
		Total.setBounds(135, 560, 100, 30);
		Limpiar.setBounds(135, 595, 120, 30);
		Impri.setBounds(95, 630, 300, 30);

		/*------------------------se agregan elementos ----------------------*/

		p.add(nom);
		p.add(apll);
		p.add(no);
		p.add(apl);
		p.add(edad);
		p.add(sex);
		p.add(estado);

		/*----------------------------------esto es para los combobox--------------------*/
		p.add(est);
		est.addItem("Elige una opcion");
		est.addItem("Edomex");
		est.addItem("CDMX");
		est.addItem("Hidalgo");
		est.addItem("Morelia");
		est.addItem("Puebla");
		est.addItem("Guerrero");
		est.addItem("Michoacan");

		p.add(sets);
		sets.addItem("Elige una opcion");
		sets.addItem("Hombre");
		sets.addItem("Mujer");
		sets.addItem("Gay");
		sets.addItem("Bisexual");
		sets.addItem("Pansexual");
		sets.addItem("Asexual");

		p.add(ed);
		ed.addItem("Elige una opcion");
		ed.addItem("18 a 25");
		ed.addItem("26 a 35");
		ed.addItem("36 a 45");
		ed.addItem("46 a 55");
		ed.addItem("56 a 60");
		ed.addItem("60 y mas");

		/*---------------------------lo demas k falta---------------------*/

		p.add(enfcro);
		p.add(a1);
		p.add(a2);

		p.add(sintoma);

		p.add(Logo);
		p.add(Nombre);
		p.add(Gif);

		p.add(salir);
		p.add(costo);
		p.add(cost);
		p.add(Total);
		p.add(Limpiar);
		p.add(Impri);

	}

	public static void main(String... RODRIGO) throws IOException {
		consulta Rodrigo = new consulta();
		Rodrigo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Rodrigo.setVisible(true);
	}

}
