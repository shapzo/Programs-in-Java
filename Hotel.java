package POO;

import java.awt.Container.*;/*LIBRERIA CONTAINER*/
import javax.swing.*;/*LIBRERIA CON PANEL DE GRAFICOS*/

public class Hotel/* SE DECLARA LA CLASE */
{
	String cliente, fecha_ingreso, fecha_salida, banco, salida;
	int personas, cuarto, tarjeta, transferencia, buffet, buffet1;
	int buffet2, buffet3, tequila, cerveza, refresco, revista, condon;
	int surtida, enchilada, trip, car, lancha, niños, guarderia, hospedaje, dias;/* DECLARAS VARIABLES TIPO ENTERO */

	int premier, plus, sumatotal;

	public Hotel()/* INICIALIZA UN CONSTRUCTOR */
	{

		plus = 0;
	}// fin constructor

	public void reservacion()/* INICIALIZAMOS LA FUNCION RESERVACION */
	{
		sumatotal = 0;
		cuarto = 0;
		buffet = 0;
		buffet1 = 0;
		buffet2 = 0;
		buffet3 = 0;
		tequila = 0;
		cerveza = 0;
		refresco = 0;
		revista = 0;
		condon = 0;
		surtida = 0;
		enchilada = 0;
		trip = 0;
		car = 0;
		lancha = 0;
		guarderia = 0;
		hospedaje = 0;
		dias = 0;
		premier = 0;
		plus = 0;
		String str;/* DECLRAMOS VARIABLE TIPO CADENA */
		boolean flag;/* DECLARAMOS BANDERA BOOLEAN (FALSO O VERDADERO) */

		do/* REPETICIONES CON DO */
		{
			flag = false;/* LA BANDERA SE INICIALIZA FALSO */
			str = JOptionPane.showInputDialog("Teclee nombre del cliente");/* PEDIMOS QUE INTRODUZCA SU NOMBRE */
			for (int j = 0; j < str.length(); j++)/* FOR PARA RECORRER CADA LETRA QUE TECLEA EL USUARIO */
				if ((int) str.charAt(j) >= 48 && (int) str.charAt(j) <= 58)/*
																			 * SI SE CUMPLE DESDE QUE J SEA MAYOR QUE 48
																			 * Y MENOR QUE 58 SEGUN EL CODIGO ASCII
																			 */
					flag = true;/* SI LA BANDERA ES VERDADERA */
		} while (flag);/* FINALIZA EL DO */
		cliente = (str);/* SE GUARDA EN VARIABLE CLIENTE */

		do/* REPETICIONES CON DO */
		{
			flag = false;/* LA BANDERA SE INICIALIZA FALSO */
			str = JOptionPane
					.showInputDialog("Teclee numero de personas");/* PEDIMOS QUE INTRODUZCA NUMERO DE PERSINAS */
			for (int j = 0; j < str.length(); j++)/* FOR PARA RECORRER CADA LETRA QUE TECLEA EL USUARIO */
				if ((int) str.charAt(j) < 48 || (int) str.charAt(j) > 58)/*
																			 * SI SE CUMPLE DESDE QUE J SEA MENOR QUE 48
																			 * Y MAYOR QUE 58 SEGUN EL CODIGO ASCII
																			 */
					flag = true;/* SI LA BANDERA ES VERDADERA */
		} while (flag);/* SE GUARDA EN VARIABLE CLIENTE */
		personas = Integer.parseInt(str);/* SE GUARDA EN VARIABLE PERSONAS Y SE HACE LA CONVERCION A ENTERO */

		str = JOptionPane.showInputDialog("Teclee fecha de ingreso");/* PEDIMOS QUE INTRODUZCA SU FECHA */
		fecha_ingreso = (str);/* SE GUARDA EN VARIABLE FECHA_INGRESO */
		str = JOptionPane.showInputDialog("Teclee fecha de salida");/* PEDIMOS QUE INTRODUZCA SU FECHA */
		fecha_salida = (str);/* SE GUARDA EN VARIABLE FECHA_SALIDA */
		salida += "\n\n Nombre del cliente:" + cliente + "\nNumero de persona:" + personas + "\nFecha de ingreso:"
				+ fecha_ingreso + "\nFecha de salida:" + fecha_salida + "\n";/* CONCATENAMOS */
		JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
		areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
		JOptionPane.showMessageDialog(null, areaSalida, "Area de reservacion:\n",
				JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
	}// fin funcion reservacion

	public void cuartos()/* INICIALIZAMOS LA FUNCION CUARTOS */
	{

		int op;/* DECLRAMOS VARIABLE TIPO ENTERO */
		op = Integer.parseInt(JOptionPane.showInputDialog(
				"Tecllee tipo de cuarto... \n1)Sencillo. \n2)Doble. \n3)Suit."));/* DECLRAMOS MENU DE OPCIONES */
		if (op == 1)/* SI LA OP ES UNO */
		{
			cuarto = 800;
			JOptionPane.showMessageDialog(null,
					"Eligio cuarto sencillo con un costo de $800 por noche");/* MOSTRAMOS MENSAJE */
			salida += "Eligio cuarto sencillo con un costo de:$" + cuarto + "\n";/* CONCATENAMOS EN SALIDA */
		} // fin if(op==1)
		if (op == 2)/* SI La OP ES 2 */
		{
			cuarto = 1400;
			JOptionPane.showMessageDialog(null,
					"Eligio cuarto doble con un costo de $1400 por noche");/* MOSTRAMOS MENSAJE */
			salida += "Eligio cuarto doble con un costo de:$" + cuarto + "\n";/* CONCATENAMOS EN SALIDA */
		} // fin if(op==2)
		if (op == 3)/* SI La OP ES 2 */
		{
			cuarto = 1800;
			JOptionPane.showMessageDialog(null,
					"Eligio cuarto suit con un costo de $1800 por noche");/* MOSTRAMOS MENSAJE */
			salida += "Eligio cuarto suit con un costo de:$" + cuarto + "\n";/* CONCATENAMOS EN SALIDA */

		} // fin if(op==3)
	}// fin funcion cuartos

	public void descuento()/* INICIALIZAMOS LA FUNCION DESCUENTO */
	{
		int d;/* DECLARAMOS VARIABLE ENTERA */
		d = Integer.parseInt(JOptionPane.showInputDialog(
				"Teclee la opcion... \n1)Cliente plus. \n2)Cliente premier."));/* DECLRAMOS MENU DE OPCIONES */
		if (d == 1)/* SI La d ES 1 */
		{
			int op;/* DECLRAMOS VARIABLE TIPO ENTERO */
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Tecllee tipo de cuarto... \n1)Sencillo. \n2)Doble. \n3)Suit."));/* DECLRAMOS MENU DE OPCIONES */
			if (op == 1)/* SI LA OP ES UNO */
			{

				JOptionPane.showMessageDialog(null,
						"Eligio cuarto sencillo con un costo de $400 con decuento del 50% por noche");/*
																										 * MOSTRAMOS
																										 * MENSAJE
																										 */
				salida += "Eligio cuarto sencillo con un costo de:$" + 800 / 2
						+ "con descuento de 50%\n";/* CONCATENAMOS EN SALIDA */
				premier = 800 / 2;
			} // fin if(op==1)
			if (op == 2)/* SI La OP ES 2 */
			{

				JOptionPane.showMessageDialog(null,
						"Eligio cuarto doble con un costo de $700con decuento del 50% por noche");/*
																									 * MOSTRAMOS MENSAJE
																									 */
				salida += "Eligio cuarto doble con un costo de:$" + 1400 / 2
						+ "con descuento de 50%\n";/* CONCATENAMOS EN SALIDA */
				premier = 1400 / 2;
			} // fin if(op==2)
			if (op == 3)/* SI La OP ES 2 */
			{

				JOptionPane.showMessageDialog(null,
						"Eligio cuarto suit con un costo de $900con decuento del 50% por noche");/* MOSTRAMOS MENSAJE */
				salida += "Eligio cuarto suit con un costo de:$" + 1800 / 2
						+ "con descuento de 50%\n";/* CONCATENAMOS EN SALIDA */
				premier = 1800 / 2;
			} // fin if(op==3)
		} // fin if(d==1)
		if (d == 2)/* SI La d ES 2 */
		{
			int op;/* DECLRAMOS VARIABLE TIPO ENTERO */
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Tecllee tipo de cuarto... \n1)Sencillo. \n2)Doble. \n3)Suit."));/* DECLRAMOS MENU DE OPCIONES */
			if (op == 1)/* SI LA OP ES UNO */
			{

				JOptionPane.showMessageDialog(null,
						"Eligio cuarto sencillo con un costo de $200 con decuento del 75% por noche");/*
																										 * MOSTRAMOS
																										 * MENSAJE
																										 */
				salida += "Eligio cuarto sencillo con un costo de:$" + 800 / 4
						+ "con descuento de 75%\n";/* CONCATENAMOS EN SALIDA */
				plus = 800 / 4;
			} // fin if(op==1)
			if (op == 2)/* SI La OP ES 2 */
			{

				JOptionPane.showMessageDialog(null,
						"Eligio cuarto doble con un costo de $350con decuento del 75% por noche");/*
																									 * MOSTRAMOS MENSAJE
																									 */
				salida += "Eligio cuarto doble con un costo de:$" + 1400 / 4
						+ "con descuento de 75%\n";/* CONCATENAMOS EN SALIDA */
				plus = 1400 / 4;
			} // fin if(op==2)
			if (op == 3)/* SI La OP ES 2 */
			{

				JOptionPane.showMessageDialog(null,
						"Eligio cuarto suit con un costo de $450con decuento del 75% por noche");/* MOSTRAMOS MENSAJE */
				salida += "Eligio cuarto suit con un costo de:$" + 1800 / 4
						+ "con descuento de 75%\n";/* CONCATENAMOS EN SALIDA */
				plus = 1800 / 4;
			} // fin if(op==3)
		} // fin if(d==2)
	}// fin funcion descuento

	public void pago()/* INICIALIZAMOS LA FUNCION PAGO */
	{
		int x;/* DECLARAMOS VARIABLE ENTERA */
		x = Integer.parseInt(JOptionPane.showInputDialog(
				"Teclee la opcion... \n1)Efectivo. \n2)Otra forma de forma de pago."));/* DECLRAMOS MENU DE OPCIONES */
		if (x == 1)/* SI La X ES 1 */
		{
			JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
			areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
			JOptionPane.showMessageDialog(null, areaSalida, "Reporte del servicio:\n",
					JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
		} // fin (x==1)
		if (x == 2)/* SI La X ES 2 */
		{
			int y;/* DECLARAMOS VARIABLE ENTERA */
			y = Integer.parseInt(JOptionPane.showInputDialog(
					"1)Pago con tarjeta. \n2)Transferencia por linea"));/* DECLRAMOS MENU DE OPCIONES */
			if (y == 1)/* SI La Y ES 1 */
			{
				String a;/* DECLARAMOS VARIABLE CADENA */
				a = JOptionPane.showInputDialog("Teclee el numero de su tarjeta.");/* PEDIMOS QUE INTRIDUZCA TARJETA */
				tarjeta = Integer.parseInt(a);/* GUARDAMOS EL NUMERO EN TARJETA Y SE HACE LA COMBERCION */
				salida += "Su numero de tarjeta es:" + tarjeta + "\n";/* CONCATENAMOS EN SALIDA */
			} // fin if(y==1)
			if (y == 2)/* SI La Y ES 2 */
			{
				String b;/* DECLARAMOS VARIA DE CADENA */
				b = JOptionPane.showInputDialog(
						"Teclee el numero de transferencia.");/* PEDIMOS QUE INTRIDUZCA TRANSFERENCIA */
				transferencia = Integer.parseInt(b);/* GUARDAMOS EL NUMERO EN TRANSFERENCIA Y SE HACE LA COMBERCION */
				salida += "Su numero de transferencia es:" + transferencia + "\n";/* CONCATENAMOS EN SALIDA */
				b = JOptionPane
						.showInputDialog("Teclee nombre del banco al que pertenese.");/* PEDIMOS QUE INTRIDUZCA BANCO */
				banco = (b);/* GUARDAMOS VARIABLE BANCO */
				salida += "El nombre del banco es:" + banco + "\n";/* CONCATENAMOS EN SALIDA */
			} // fin if(y==2)
			JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
			areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
			JOptionPane.showMessageDialog(null, areaSalida, "Area de salida:\n",
					JOptionPane.PLAIN_MESSAGE);/* IMPRIME LA SALIDA */
		} // fin (x==2)
	}// fin funcion pago

	public void registro()/* COMIENZO DE LA FUNCION REGISTRO */
	{
		JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
		areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
		JOptionPane.showMessageDialog(null, areaSalida, "Area de registro:\n",
				JOptionPane.PLAIN_MESSAGE);/* IMPRIME LA SALIDA */
	}// fin funcion registro

	public void buffet()/* COMIENZA LA FUNCION BUFFET */
	{
		int bu;/* DECLARAMOS VARIABLE TIPO ENTERO */
		do/* CICLO DE RETORNO */
		{
			bu = Integer.parseInt(JOptionPane.showInputDialog(
					"Teclee la opcion de buffet: \n1)Desayuno,comida y cena por dia . \n2)Desayuno por dia. \n3)Comida por dia. \n4)Cena por dia. \n5)Regresar al menu principal."));
			if (bu == 1)/* CONDICION */
			{

				salida += "Desayuno, comida y cena por:" + personas + "personas es:$" + personas * 300
						+ "\n";/* CONCATENAMOS EN SALIDA */
				buffet = personas * 300;/* GUARDAMOS EL VALOR EN LA BARIABLE BUFFET */
				JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
				areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
				JOptionPane.showMessageDialog(null, areaSalida, "Area de buffet:\n",
						JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
			} // fin if(bu==1)
			if (bu == 2)/* CONDICION */
			{

				salida += "Desayuno, por:" + personas + "personas es:$" + personas * 100 + "\n";
				;/* CONCATENAMOS EN SALIDA */
				buffet1 = personas * 100;/* GUARDAMOS EL VALOR EN LA BARIABLE BUFFETIT */
				JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
				areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
				JOptionPane.showMessageDialog(null, areaSalida, "Area de buffet:\n",
						JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
			} // fin if(bu==2)
			if (bu == 3)/* CONDICION */
			{

				salida += "Comida, por:" + personas + "personas es:$" + personas * 150 + "\n";
				;/* CONCATENAMOS EN SALIDA */
				buffet2 = personas * 150;/* GUARDAMOS EL VALOR EN LA BARIABLE BUFFETITO */
				JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
				areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
				JOptionPane.showMessageDialog(null, areaSalida, "Area de buffet:\n",
						JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
			} // fin if(bu==3)
			if (bu == 4)/* CONDICION */
			{
				salida += "Cena, por:" + personas + "personas es:$" + personas * 150 + "\n";
				;/* CONCATENAMOS EN SALIDA */
				buffet3 = personas * 150;/* GUARDAMOS VALORES EN BUFFE */
				JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
				areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
				JOptionPane.showMessageDialog(null, areaSalida, "Area de buffet:\n",
						JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
			} // fin if(bu==4)
		} while ((bu == 1) || (bu == 2) || (bu == 3) || (bu == 4));/* CICLO DE OPCIONES A ELEGIR */
	}// fin de la funcion buffet

	public void room()/* COMIENZA LA FUNCION ROOM */
	{
		int o;/* DECLARAMOS VARIABLE TIPO ENTERO */
		o = Integer.parseInt(JOptionPane.showInputDialog(
				"Teclee la opcion: \n1)Bebidas. \n2)Aperitivos. \n3)Articulos."));/* DECLRAMOS MENU DE OPCIONES */
		if (o == 1)/* CONDICION */
		{
			int b;/* DECLARAMOS VARIABLE TIPO ENTERO */
			b = Integer.parseInt(JOptionPane.showInputDialog(
					"Teclee la opcion: \n1)Tequila Casador. \n2)Cervesa Tecate. \n3)Agua simple, de sabor o refresco."));/*
																															 * DECLRAMOS
																															 * MENU
																															 * DE
																															 * OPCIONES
																															 */
			if (b == 1)/* CONDICION */
			{
				tequila = 400;
				salida += "El costo la botella de tequila casador es de:$" + tequila + "\n";/* CONCATENAMOS */

			} // fin de if(b==1)
			if (b == 2)/* CONDICION */
			{
				cerveza = 300;/* GUARDAMOS VALOR */
				salida += "El costo del 24 de cervesas es de:$" + cerveza + "\n";/* CONCATENAMOS */

			} // fin de if(b==2)
			if (b == 3)/* CONDICION */
			{
				refresco = 20;/* GUARDAMOS VALOR */
				salida += "El costo de agua simple, de sabor o refresco es de:$" + refresco + "\n";/* CONCATENAMOS */

			} // fin de if(b==3)
			JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
			areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
			JOptionPane.showMessageDialog(null, areaSalida, "Area de bebidas:\n",
					JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
		} // fin de if(o==1)
		if (o == 2)/* CONDICION */
		{
			int b;/* DECLARAMOS VARIABLE TIPO ENTERO */
			b = Integer.parseInt(JOptionPane.showInputDialog(
					"Teclee la opcion: \n1)Botana enchilada . \n2)Botana frita."));/* DECLRAMOS MENU DE OPCIONES */
			if (b == 1)/* CONDICION */
			{
				enchilada = 50;
				salida += "El costo de la botana enchilada es de:$" + enchilada + "\n";/* CONCATENAMOS */

			} // fin de if(b==1)
			if (b == 2)/* CONDICION */
			{
				surtida = 50;
				salida += "El costo de la botana surtida es de:$" + surtida + "\n";/* CONCATENAMOS */

			} // fin de if(b==2)
			JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
			areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
			JOptionPane.showMessageDialog(null, areaSalida, "Area de botanas:\n",
					JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
		} // fin de if(o==2)
		if (o == 3)/* CONDICION */
		{
			int b;/* DECLARAMOS VARIABLE TIPO ENTERO */
			b = Integer.parseInt(JOptionPane
					.showInputDialog("Teclee la opcion: \n1)Condones . \n2)Revistas."));/* DECLRAMOS MENU DE OPCIONES */
			if (b == 1)/* CONDICION */
			{
				condon = 10;
				salida += "El costo de condon es de:$" + condon + "\n";/* CONCATENAMOS */

			} // fin de if(b==1)
			if (b == 2)/* CONDICION */
			{
				revista = 100;
				salida += "El costo de revita es de:$" + revista + "\n";/* CONCATENAMOS */

			} // fin de if(b==2)
			JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
			areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
			JOptionPane.showMessageDialog(null, areaSalida, "Area de articulos:\n",
					JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
		} // fin de if(o==3)
	}// fin de funcion Room_service

	public void trip()/* COMIENZO DE LA FUNCION TRIP */
	{
		int o;/* DECLARAMOS VARIABLE TIPO ENTERO */
		o = Integer.parseInt(JOptionPane.showInputDialog(
				"Teclee la opcion: \n1)Trip en globo. \n2)Trip en camion. \n3)Trip en lancha."));/*
																									 * DECLRAMOS MENU DE
																									 * OPCIONES
																									 */
		if (o == 1)/* CONDICION */
		{
			int b;/* DECLARAMOS VARIABLE TIPO ENTERO */
			b = Integer.parseInt(JOptionPane.showInputDialog(
					"Teclee la opcion: \n1)Trip en globo por 1 hora. \n2)Trip en globo por 2 hora. \n3)Trip en globo por 3 hora."));/*
																																	 * DECLRAMOS
																																	 * MENU
																																	 * DE
																																	 * OPCIONES
																																	 */
			if (b == 1)/* CONDICION */
			{
				trip = 1000;
				salida += "El costo del trip por 1 hora es de es de:$" + trip + "\n";/* CONCATENAMOS EN SALIDA */

			} // fin de if(b==1)
			if (b == 2)/* CONDICION */
			{
				trip = 2000;
				salida += "El costo del trip por 2 hora es de es de:$" + trip + "\n";/* CONCATENAMOS EN SALIDA */

			} // fin de if(b==2)
			if (b == 3)/* CONDICION */
			{
				trip = 2500;
				salida += "El costo del trip por 3 hora es de es de:$" + trip + "\n";/* CONCATENAMOS EN SALIDA */

			} // fin de if(b==3)
			JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
			areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
			JOptionPane.showMessageDialog(null, areaSalida, "Area de trips:\n",
					JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
		} // fin de if(o==1)
		if (o == 2)/* CONDICION */
		{
			int b;/* DECLRAMOS VARIABLE TIPO ENTERO */
			b = Integer.parseInt(JOptionPane.showInputDialog(
					"Teclee la opcion: \n1)2 horas . \n2)3 tres horas."));/* DECLRAMOS MENU DE OPCIONES */
			if (b == 1)/* CONDICION */
			{
				car = 400;
				salida += "El costo de trip en carro por dos horas es de:$" + car + "\n";/* CONCATENAMOS EN SALIDA */

			} // fin de if(b==1)
			if (b == 2)/* CONDICION */
			{
				car = 700;
				salida += "El costo de trip en carro de tres horas es de:$" + car + "\n";/* CONCATENAMOS EN SALIDA */

			} // fin de if(b==2)
			JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
			areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
			JOptionPane.showMessageDialog(null, areaSalida, "Area de trips:\n",
					JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
		} // fin de if(o==2)
		if (o == 3)/* CONDICION */
		{
			int b;/* DECLARAMOS VARIABLE TIPO ENTERO */
			b = Integer.parseInt(JOptionPane
					.showInputDialog("Teclee la opcion: \n1)5 horas . \n2)12 horas."));/* DECLRAMOS MENU DE OPCIONES */
			if (b == 1) {
				lancha = 700;
				salida += "El costo del trip en lancha por 5 horas es de:$" + lancha + "\n";/* CONCATENAMOS EN SALIDA */

			} // fin de if(b==1)
			if (b == 2)/* CONDICION */
			{
				lancha = 2000;
				salida += "El costo del trip en lancha por 12 horas es de:$" + lancha
						+ "\n";/* CONCATENAMOS EN SALIDA */

			} // fin de if(b==2)
			JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
			areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
			JOptionPane.showMessageDialog(null, areaSalida, "Area de trips:\n",
					JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
		} // fin de if(o==3)
	}// fin de funcion Room_service

	public void guarderia()/* INICIALIZAMOS LA FUNCION GUARDERIA */
	{
		String st;
		;/* DECLRAMOS VARIABLE TIPO CADENA */
		int op;/* DECLRAMOS VARIABLE TIPO ENTERO */
		op = Integer.parseInt(JOptionPane.showInputDialog(
				"Teclee opcion... \n1)Niños menores de 5 años. \n2)Niños mayores de 5 años."));/*
																								 * DECLRAMOS MENU DE
																								 * OPCIONES
																								 */
		if (op == 1)/* SI LA OP ES UNO */
		{
			JOptionPane.showMessageDialog(null,
					"Eligio niño menor de 5 años con un costo de $50 por niño, por hora");/* MOSTRAMOS MENSAJE */
			st = JOptionPane.showInputDialog("Teclee numero de niños");/* PEDIMOS QUE INTRODUZCA NUMERO DE NIÑOS */
			niños = Integer.parseInt(st);/* SE GUARDA EN VARIABLE NIÑOS Y SE HACE LA CONVERCION A ENTERO */
			salida += "Su total de niños apagar es de:$" + niños * 50 + "\n";/* CONCATENAMOS EN SALIDA */
			guarderia = niños * 50;
		} // fin if(op==1)
		if (op == 2)/* SI La OP ES 2 */
		{

			JOptionPane.showMessageDialog(null,
					"Eligio niño mayor de 5 años con un costo de $90 por niño, por hora");/* MOSTRAMOS MENSAJE */
			st = JOptionPane.showInputDialog("Teclee numero de niños");/* PEDIMOS QUE INTRODUZCA NUMERO DE NIÑOS */
			niños = Integer.parseInt(st);/* SE GUARDA EN VARIABLE NIÑOS Y SE HACE LA CONVERCION A ENTERO */
			salida += "Su total de niños apagar es de:$" + niños * 90 + "\n";/* CONCATENAMOS EN SALIDA */
			guarderia = (niños * 90);/* ASIGNAMOS VALORES A GUARDERI */
		} // fin if(op==2)
		JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
		areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
		JOptionPane.showMessageDialog(null, areaSalida, "Area de guarderia:\n",
				JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
	}// fin de la funcion guarderia

	public void hospedaje()/* INICIALIZAMOS LA FUNCION HOSPEDAJE */
	{
		String st;/* DECLARAMOS VARIABLE TIPO CADENA */
		st = JOptionPane.showInputDialog(
				"Usted es un cliente premier, teclee los dias de estancia");/* PEDIMOS QUE INTRODUZCA NUMERO DE NIÑOS */
		dias = Integer.parseInt(st);/* SE GUARDA EN VARIABLE NIÑOS Y SE HACE LA CONVERCION A ENTERO */
		int op;/* DECLRAMOS VARIABLE TIPO ENTERO */
		op = Integer.parseInt(JOptionPane.showInputDialog(
				"Tecllee tipo de cuarto... \n1)Sencillo. \n2)Doble. \n3)Suit."));/* DECLRAMOS MENU DE OPCIONES */
		if (op == 1)/* SI LA OP ES UNO */
		{

			JOptionPane.showMessageDialog(null,
					"Eligio cuarto sencillo con un costo de $200 con decuento del 75% por noche");/*
																									 * MOSTRAMOS MENSAJE
																									 */
			salida += "Su tota a pagar es de:$" + ((800 / 4) * dias)
					+ "con descuento de 75%\n";/* CONCATENAMOS EN SALIDA */
			hospedaje = ((800 / 4) * dias);/* ASIGNAMOS VALORES A HOSPEDAJITO */
		} // fin if(op==1)
		if (op == 2)/* SI La OP ES 2 */
		{

			JOptionPane.showMessageDialog(null,
					"Eligio cuarto doble con un costo de $350con decuento del 75% por noche");/* MOSTRAMOS MENSAJE */
			salida += "Su total a pagar es de:$" + ((1400 / 4) * dias)
					+ "con descuento de 75%\n";/* CONCATENAMOS EN SALIDA */
			hospedaje = ((1400 / 4) * dias);/* ASIGNAMOS VALORES A HOSPEDAJIT */
		} // fin if(op==2)
		if (op == 3)/* SI La OP ES 2 */
		{

			JOptionPane.showMessageDialog(null,
					"Eligio cuarto suit con un costo de $450con decuento del 75% por noche");/* MOSTRAMOS MENSAJE */
			salida += "Su total a paga es de:$" + ((1800 / 4) * dias)
					+ "con descuento de 75%\n";/* CONCATENAMOS EN SALIDA */
			hospedaje = ((1800 / 4) * dias);
		} // fin if(op==3)
		JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
		areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
		JOptionPane.showMessageDialog(null, areaSalida, "Area de Hospedaje:\n",
				JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */
	}// fin de la funcion hospedaje

	public void total()/* INICIALIZAMOS LA FUNCION TOTAL */
	{
		sumatotal = cuarto + buffet + buffet1 + buffet2 + buffet3 + tequila + cerveza + refresco + revista + condon
				+ surtida + enchilada + trip + car + lancha + guarderia + hospedaje + premier + plus;

		salida += "Su total a pagar es:$" + sumatotal + "\n";
		JTextArea areaSalida = new JTextArea();/* MANDAMOS LLAMAR A JTEXTAREA */
		areaSalida.setText(salida);/* CONCATENAMOS LA SALIDA */
		JOptionPane.showMessageDialog(null, areaSalida, "Area de total:\n",
				JOptionPane.PLAIN_MESSAGE);/* IMPRIMIMOS LA SALIDA */

	}// fin funcion total

	public static void main(String[] args)/* COMIEMSO DEL MAIN */
	{
		Hotel l = new Hotel();/* SE RENOMBRA PARA MANDAR A LLAMAR LOS CASOS */
		int op;/* SE DECLARA VARIABLE TIPO ENTERO */
		String ax;/* DECLARA VARIABLE CADENA */
		String s1 = new String("RODRIGO"); /* SE GUARADA LA CONTRASEÑA EN S */
		ax = JOptionPane.showInputDialog(
				"Programa de menu deL HOTEL EL REPEGON.\n\nIntroduzca su clave de acceso:");/* INTRODUCIR CLAVE */
		if (ax.compareTo(s1) != 0)/* COMPARA SI LA CLAVE ES CORRECTA */
		{
			ax = JOptionPane.showInputDialog(
					"Le queda una oportunidad, introduzca su clave de acceso:");/* INTRODUZCA LA CLAVE */
		} // fin if(ax.compareTo(s)!=0)
		if (ax.compareTo(s1) != 0)/* COMPARA SI LA CLAVE ES CORRECTA */
		{
			JOptionPane.showMessageDialog(null,
					"Contaseña incorrecta, \n Gracias por utilizar este programa");/*
																					 * SI LA CLAVE ES INCORRECTA TERMINA
																					 * EL PROGRAMA
																					 */
		} // fin if(ax.compareTo(s)!=0)
		if (ax.compareTo(s1) == 0)/* SI ES CORRECTA EJECUTA EL MENU */
		{
			do/* MIENTRAS TECLEE LA OPCION */
			{
				op = Integer.parseInt(JOptionPane.showInputDialog(
						"Bienvenido al Repegon... \n1)Reservacion. \n2)Cuartos. \n3)Forma de pago. \n4)Reservacion con descuento de cliente \n5)Rejistro de nomina \n6)Buffet \n7)Room_service. \n8)Trips \n9)Guarderia \n10)Hospedaje \n11)Total. \n12)Salida"));/*
																																																																	 * MENU
																																																																	 * DE
																																																																	 * OPCIONES
																																																																	 */
				switch (op)/* COMIENSO DE LAS OPCIONES */
				{
				case 1:/* CASO UNO */
					l.reservacion();/* FUNCION RESERVACION */
					l.cuartos();/* FUNCION CUARTOS */
					l.pago();/* FUNCION PAGO */
					break;/* CORTE */
				case 2:/* CASO DOS */
					l.cuartos();/* FUNCION CUARTOS */
					break;/* CORTE */
				case 3:/* CASO TRES */
					l.pago();/* FUNCION PAGO */
					break;/* CORTE */
				case 4:/* CASO CUATRO */
					l.reservacion();
					l.descuento();/* FUNCION DESCUENTO */
					break;/* CORTE */
				case 5:/* CASO CINCO */
					l.registro();/* FUNCION REGISTRO */
					break;/* CORTE */
				case 6:/* CASO seis */
					l.buffet();/* FUNCION BUFFET */
					break;/* CORTE */
				case 7:/* CASO SIETE */
					l.room();/* FUNCION ROOM_SERVICE */
					break;/* CORTE */
				case 8:/* CASO OCHO */
					l.trip();/* FUNCION TOURS */
					break;/* CORTE */
				case 9:/* CASO NUEVE */
					l.guarderia();/* FUNCION GUARDERIA */
					break;/* CORTE */
				case 10:/* CASO dies */
					l.reservacion();/* FUNCION RESERVACION */
					l.hospedaje();/* funcion hospedaje */
					l.pago();/* FUNCION PAGO */
					break;/* CORTE */
				case 11:/* CASO ONCE */
					l.total();/* FUNCION TOTAL */
					break;/* CORTE */
				default:/* FALLA */
					break;/* CORTE */
				}// fin del switch
			} while ((op == 1) || (op == 2) || (op == 3) || (op == 4) || (op == 5) || (op == 6) || (op == 7)
					|| (op == 8) || (op == 9) || (op == 10) || (op == 11));/* OPCIONES 1,2,3,4,5,6,7,8 */
		} // fin if(ax.compareTo(s)==0)
	}// fin del main
}
