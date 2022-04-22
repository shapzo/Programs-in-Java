package POO;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import POO.elHotel.cuartos;

public class prueba extends JFrame {
	JButton salir;
	JLabel Letrero;
	JButton boton2;
	JButton boton3;

	JButton total1;
	JTextField ToT1;
	JButton tiked1;
	JButton Limpiar1;

	JButton total2;
	JTextField ToT2;
	JButton tiked2;
	JButton Limpiar2;

	JLabel tarj1;
	JLabel tarj2;

	JTextField tarjeti1;
	JTextField tarjeti2;
	
	JLabel efec1;
	
	JTextField efe1;

	public JPanel p = new JPanel();

	public prueba() {
		// DELCARACION DE PANELES
		setTitle("Forma de Pago Real Hotel"); // se le da nombre al panel o ventana
		setSize(750, 520); // se le otorgan las dimenciones
		p.setBackground(new java.awt.Color(54,55,56)); // se le da color al panel en este caso es negro
		p.setLayout(null); // se inicia en null
		Container zona = getContentPane(); // constructor y todo lo que aparece en el panel
		// para que aparesca el panel
		setLocationRelativeTo(null);
		zona.add(p); // espara que aparesca todo en el panel

		salir = new JButton(new ImageIcon("atras.png")); // se les asigna su funcion a los constructores
		Letrero = new JLabel("Forma de Pago");
		boton2 = new JButton("Efectivo");
		boton3 = new JButton("Tarjeta");
		
		efec1 = new JLabel("Recibi");
		efe1 = new JTextField();

		tarj1 = new JLabel("Ingresa el nombre del banco");
		tarj2 = new JLabel("Ingresa el numero de tarjeta");

		tarjeti1 = new JTextField();
		tarjeti2 = new JTextField();

		total1 = new JButton("Total");
		ToT1 = new JTextField();
		tiked1 = new JButton("Imprimir Tiket");
		Limpiar1 = new JButton("Limpiar");

		total2 = new JButton("Total");
		ToT2 = new JTextField();
		tiked2 = new JButton("Imprimir Tiket");
		Limpiar2 = new JButton("Limpiar");
		
		/************** personalisacion *****************/
		Letrero.setForeground(new java.awt.Color(1, 196, 134));
		Letrero.setFont(new java.awt.Font("Segoe UI Semibold", 5, 32));
		
		boton2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
		boton2.setBackground(new java.awt.Color(15, 75, 3));
		boton2.setForeground(new java.awt.Color(107, 209, 176));
		
		boton3.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
		boton3.setBackground(new java.awt.Color(15, 75, 3));
		boton3.setForeground(new java.awt.Color(107, 209, 176));
		
		total1.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
		total1.setBackground(new java.awt.Color(134, 0, 0));
		total1.setForeground(new java.awt.Color(2, 176, 36));
		
		total2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
		total2.setBackground(new java.awt.Color(134, 0, 0));
		total2.setForeground(new java.awt.Color(2, 176, 36));
		
		tiked1.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
		tiked1.setBackground(new java.awt.Color(255, 228, 0));
		tiked1.setForeground(new java.awt.Color(102, 108, 130));
		
		tiked2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
		tiked2.setBackground(new java.awt.Color(255, 228, 0));
		tiked2.setForeground(new java.awt.Color(102, 108, 130));
		
		Limpiar1.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
		Limpiar1.setBackground(new java.awt.Color(13, 145, 202));
		Limpiar1.setForeground(new java.awt.Color(3, 45, 64));
		
		Limpiar2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
		Limpiar2.setBackground(new java.awt.Color(13, 145, 202));
		Limpiar2.setForeground(new java.awt.Color(3, 45, 64));
		
		
		efec1.setForeground(new java.awt.Color(232, 17, 144));
		efec1.setFont(new java.awt.Font("Candara Regular", 4, 18));
		
		
		tarj1.setForeground(new java.awt.Color(232, 17, 144));
		tarj1.setFont(new java.awt.Font("Candara Regular", 4, 15));
		
		tarj2.setForeground(new java.awt.Color(232, 17, 144));
		tarj2.setFont(new java.awt.Font("Candara Regular", 4, 15));
		
		
		ToT1.setBorder(new javax.swing.border.LineBorder(Color.red, 3, true));
		ToT1.setBackground(new java.awt.Color(126, 70, 0));
		ToT1.setFont(new java.awt.Font("Lucida Console", 3, 14));
		ToT1.setForeground(Color.magenta);
		
		ToT2.setBorder(new javax.swing.border.LineBorder(Color.red, 3, true));
		ToT2.setBackground(new java.awt.Color(126, 70, 0));
		ToT2.setFont(new java.awt.Font("Lucida Console", 3, 14));
		ToT2.setForeground(Color.magenta);
		
		
		tarjeti1.setBorder(new javax.swing.border.LineBorder(Color.magenta, 3, true));
		tarjeti1.setBackground(new java.awt.Color(131, 16, 220));
		tarjeti1.setFont(new java.awt.Font("Lucida Console", 3, 14));
		tarjeti1.setForeground(Color.yellow);
		
		tarjeti2.setBorder(new javax.swing.border.LineBorder(Color.magenta, 3, true));
		tarjeti2.setBackground(new java.awt.Color(131, 16, 220));
		tarjeti2.setFont(new java.awt.Font("Lucida Console", 3, 14));
		tarjeti2.setForeground(Color.yellow);
		
		efe1.setBorder(new javax.swing.border.LineBorder(Color.magenta, 3, true));
		efe1.setBackground(new java.awt.Color(131, 16, 220));
		efe1.setFont(new java.awt.Font("Lucida Console", 3, 14));
		efe1.setForeground(Color.yellow);

		salir.setBorderPainted(false);
		salir.setContentAreaFilled(false);
		salir.setFocusPainted(false);
		salir.setOpaque(false);

		/******** posicion de los elementos ***************/

		p.add(salir); // se agragan al panel
		p.add(Letrero);
		p.add(boton2);
		p.add(boton3);

		Letrero.setBounds(250, 20, 350, 70); // se les da posicion en el panel
		boton2.setBounds(70, 100, 100, 40);
		boton3.setBounds(350, 100, 100, 40);

		salir.setBounds(280, 380, 100, 50);

		boton2.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
														// usando solo botones
			public void actionPerformed(ActionEvent v) {
				p.add(efec1);
				p.add(efe1);
				
				efec1.setBounds(70, 200, 100, 30);
				efe1.setBounds(200, 200, 100, 25);
				
				p.add(total1);
				p.add(ToT1);
				p.add(tiked1);
				p.add(Limpiar1);

				total1.setBounds(70, 160, 100, 30);
				ToT1.setBounds(200, 160, 100, 25);
				tiked1.setBounds(70, 250, 150, 30);
				Limpiar1.setBounds(70, 310, 150, 30);

			}
		});

		boton3.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
														// usando solo botones
			public void actionPerformed(ActionEvent v) {
				p.add(tarj1);
				p.add(tarj2);
				p.add(tarjeti1);
				p.add(tarjeti2);

				tarj1.setBounds(350, 200, 200, 30);
				tarj2.setBounds(350, 250, 200, 30);
				tarjeti1.setBounds(550, 200, 100, 25);
				tarjeti2.setBounds(550, 250, 100, 25);

				p.add(total2);
				p.add(ToT2);
				p.add(tiked2);
				p.add(Limpiar2);

				total2.setBounds(350, 160, 100, 30);
				ToT2.setBounds(550, 160, 100, 25);
				tiked2.setBounds(350, 300, 150, 30);
				Limpiar2.setBounds(350, 350, 150, 30);

			}
		});

		/*total1.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
														// usando solo botones
			public void actionPerformed(ActionEvent v) {
			    JOptionPane.showMessageDialog(null, "Descuento del 10$ en presio total!!!");
			    double a,b;
			    a = res * 0.20;
			    b = res - a;
				ToT1.setText("$" + b);
			}
		});

		tiked1.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
														// usando solo botones
			public void actionPerformed(ActionEvent v) {
				String ruta = "C:\\Users\\Rodrigo\\Desktop\\Tiked_de_pago.pdf";
				try {
					File arch = new File(ruta);
					FileWriter ro = new FileWriter(arch, true);

					ro.write("-----------Tiked de pago----------------\n");
					ro.write("-------Hotel el entierro ----\n");
					ro.write("-----------Los mejores hoteles de mexico---------- -\n");
					ro.write("-------EL PRECIO A PAGAR ES: -----------\n");
					ro.write("-------" + ToT1.getText() + " pesos---------------------\n");
					ro.write("-------senñor@: " + nom.getText() + "-----------------\n");
					ro.write("-------Numero de personas: " + noper.getText() + "------\n");
					ro.write("-------Fecha de ingreso: " + fechin.getText() + "------\n");
					ro.write("-------Fecha de salida: " + fechsal.getText() + "------\n");
					ro.write("-------Origen del huesped: " + Orig.getText() + "------\n\n");
					ro.write("-------Grasias por su preferencia-------");
					ro.close();
				} catch (Exception er) {
					System.out.println("error" + er);

				}

			}
		});

		Limpiar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				ToT1.setText(null);
				tarjeti1.setText(null);
				tarjeti2.setText(null);

			}
		});

		total2.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
			// usando solo botones
			public void actionPerformed(ActionEvent v) {
			    JOptionPane.showMessageDialog(null, "Descuento del 20$ en presio total!!!");
				double c,d;
			    c = res * 0.20;
			    d = res - c;
				ToT.setText("$" + d);
			}
		});

		tiked2.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
			// usando solo botones
			public void actionPerformed(ActionEvent v) {
				String ruta = "C:\\Users\\Rodrigo\\Desktop\\Tiked_de_pago.pdf";
				try {
					File arch = new File(ruta);
					FileWriter ro = new FileWriter(arch, true);

					ro.write("-----------Tiked de pago----------------\n");
					ro.write("-------Hotel el entierro ----\n");
					ro.write("-----------Los mejores hoteles de mexico---------- -\n");
					ro.write("-------EL PRECIO A PAGAR ES: -----------\n");
					ro.write("-------" + ToT.getText() + " pesos---------------------\n");
					ro.write("-------senñor@: " + nom.getText() + "-----------------\n");
					ro.write("-------Numero de personas: " + noper.getText() + "------\n");
					ro.write("-------Fecha de ingreso: " + fechin.getText() + "------\n");
					ro.write("-------Fecha de salida: " + fechsal.getText() + "------\n");
					ro.write("-------Origen del huesped: " + Orig.getText() + "------\n\n");

					ro.write("-------Pago con tarjeta: " + tarjeti.getText() + "------\n");
					ro.write("-------Iso una transferencia de la cuenta: " + transfer.getText() + "------\n");

					ro.write("-------Grasias por su preferencia-------");
					ro.close();
				} catch (Exception er) {
					System.out.println("error" + er);

				}

			}
		});

		Limpiar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent v) {
				ToT1.setText(null);
				tarjeti1.setText(null);
				tarjeti2.setText(null);

			}
		});*/

		salir.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
														// usando solo botones
			public void actionPerformed(ActionEvent v) {

				dispose(); // es para cerrar la ventana
			}
		});
	}

	public static void main(String... prueba) {
		prueba abrir = new prueba();
		abrir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		abrir.setVisible(true);
		abrir.setResizable(false);
	}

}