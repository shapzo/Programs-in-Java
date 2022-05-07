import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String nombre, fecha, vendedor, pago, r, m, banco, preferente, nombres;
		float d = 0, precio, t = 0;
		int a = 0, b = 0, q = 0, c = 0, w = 0;

		System.out.println("Tienda de Ropa \n");
		System.out.println("----------Troncoso----------");

		System.out.println("Clave del vendedor: ");
		vendedor = sc.nextLine();

		System.out.println("Fecha: ");
		fecha = sc.nextLine();

		System.out.println("Nombre del cliente: ");
		nombres = sc.nextLine();

		do {
			System.out.println("Departamentos: ");

			System.out.println("1.-Damas");
			System.out.println("2.-Caballeros");
			System.out.println("3.-Blancos");
			System.out.println("4.-Pagar");
			System.out.println("5.-Salir");
			System.out.println("Ingrese la opcion deseada");
			int op;
			op = sc.nextInt();
			switch (op) {
			case 1:
				do {
					System.out.println("----------Damas---------");

					System.out.println("1.-Blusa");
					System.out.println("2.-Falda");
					System.out.println("3.-Medias");
					System.out.println("4.-Salir");
					System.out.println("Ingrese el tipo de prenda");
					op = sc.nextInt();
					switch (op) {
					case 1:
						System.out.println("Blusa");
						System.out.print("Precio: ");
						precio = sc.nextFloat();
						t = t + precio;
						break;
					case 2:
						System.out.println("Falda ");
						System.out.print("Precio: ");
						precio = sc.nextFloat();
						t = t + precio;
						break;
					case 3:
						System.out.println("Medias ");
						System.out.print("Precio: ");
						precio = sc.nextFloat();
						t = t + precio;
						break;
					case 4:
						b = 1;
						break;
					}
				} while (b == 0);
				break;
			case 2:
				do {
					System.out.println("----------Caballeros---------");

					System.out.println("1.-Camisa");
					System.out.println("2.-Pantalon");
					System.out.println("3.-Corbata");
					System.out.println("4.-Salir");
					System.out.println("Ingrese el tipo de prenda deseado");
					op = sc.nextInt();
					switch (op) {
					case 1:
						System.out.println("Camisa");
						System.out.print("Precio: ");
						precio = sc.nextFloat();
						t = t + precio;
						break;
					case 2:
						System.out.println("Pantalon ");
						System.out.print("Precio: ");
						precio = sc.nextFloat();
						t = t + precio;
						break;
					case 3:
						System.out.println("Corbata ");
						System.out.print("Precio: ");
						precio = sc.nextFloat();
						t = t + precio;
						break;
					case 4:
						c = 1;
						break;
					}
				} while (c == 0);
				break;

			case 3:
				do {
					System.out.println("----------Blancos---------");

					System.out.println("1.-Playera");
					System.out.println("2.-Calsetines");
					System.out.println("3.-Calzonsillos/tangas");
					System.out.println("4.-Salir");
					System.out.println("Ingrese el tipo de prenda deseado");
					op = sc.nextInt();
					switch (op) {
					case 1:
						System.out.println("Playera");
						System.out.print("Precio: ");
						precio = sc.nextFloat();
						t = t + precio;
						break;
					case 2:
						System.out.println("Calsetines ");
						System.out.print("Precio: ");
						precio = sc.nextFloat();
						t = t + precio;
						break;
					case 3:
						System.out.println("Calzonsillos/tangas ");
						System.out.print("Precio: ");
						precio = sc.nextFloat();
						t = t + precio;
						break;
					case 4:
						q = 1;
						break;
					}
				} while (q == 0);

				break;

			case 4:
				do {

					System.out.println("Metodo de pago");
					System.out.println("1.-Tarjeta");
					System.out.println("2.-Contado");
					System.out.println("3.-Imprime Tiked");
					System.out.println("4.-Salir");
					System.out.println("Ingrese el modo de pago y posteriormente imprime el tiked");
					op = sc.nextInt();
					switch (op) {
					case 1:
						System.out.println("Tarjeta");
						System.out.print("Ingrese numero de tarjeta: ");
						m = sc.next();
						System.out.println("Ingrese banco: ");
						banco = sc.next();

						System.out.println("Fecha: " + fecha);
						System.out.println("Transaccion validada por el vendedor: " + vendedor + " por $" + t
								+ " pesos al banco " + banco + ", numero de tarjeta: " + m);
						System.out.println("Grasias por su visita se�or@ " + nombres + " vuelva pronto");
						System.out.println("\n");
						break;
					case 2:
						System.out.println("Contado ");
						System.out.println("Total a pagar: " + t);

						System.out.println("Fecha: " + fecha);
						System.out.println("Pago validado por el vendedor: " + vendedor + " por $" + t + " pesos.");
						System.out.println("Grasias por su visita se�or@ " + nombres + " vuelva pronto.");
						System.out.println("\n");
						System.out.println("Imprimir tiked de pago");

						break;
					case 3:
						
						String ruta = System.getProperties().getProperty("user.dir");
						//String ruta2 = ruta1 + "Tiked.txt";
						File archivo = new File(ruta);
						BufferedWriter bw;

						if (archivo.exists()) {
							bw = new BufferedWriter(new FileWriter(archivo));
							bw.write("-----------Tiked de pago----------------\n");
							bw.write("-------Servicios de consulta medica ----\n");
							bw.write("-----------LIFE LINE MEDICAL---------- -\n");
							bw.write("Se�or: \n");
							bw.write("-----" + nombres + "----\n");
							bw.write("El presio a pagar es: \n");
							bw.write("-----$" + t + "----\n");
							bw.write("Fecha de expedicion: \n");
							bw.write("-----" + fecha + "----\n");
							bw.write("Quien lo atendio: \n");
							bw.write("-----" + vendedor + "----\n");
							bw.write("-----Grasias pro su preferencia----");
						} else {
							bw = new BufferedWriter(new FileWriter(archivo));
							bw.write("-----------Tiked de pago----------------\n");
							bw.write("-------Servicios de consulta medica ----\n");
							bw.write("-----------LIFE LINE MEDICAL---------- -\n");
							bw.write("Se�or: \n");
							bw.write("-----" + nombres + "----\n");
							bw.write("El presio a pagar es: \n");
							bw.write("-----$" + t + "----\n");
							bw.write("Fecha de expedicion: \n");
							bw.write("-----" + fecha + "----\n");
							bw.write("Quien lo atendio: \n");
							bw.write("-----" + vendedor + "----\n");
							bw.write("-----Grasias pro su preferencia----");
						}
						bw.close();
						break;
					case 4:
						w = 1;
						break;
					}
				} while (w == 0);

				break;
			case 5:
				a = 1;
				break;

			}
		} while (a == 0);
	} // fin de la 2� clase
} // fin de la primera clase
