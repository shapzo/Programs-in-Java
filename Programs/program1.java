import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String nombre, Date, vendedor, pago, r, m, banco, preferente, nombres;
		float d = 0, cost, t = 0;
		int a = 0, b = 0, q = 0, c = 0, w = 0;

		System.out.println("Clothing store\n");
		System.out.println("----------The Penguin----------");

		System.out.println("Vendor key: ");
		vendedor = sc.nextLine();

		System.out.println("Date: ");
		Date = sc.nextLine();

		System.out.println("Customer name: ");
		nombres = sc.nextLine();

		do {
			System.out.println("Departments: ");

			System.out.println("1.-Ladies");
			System.out.println("2.-Gentlemen");
			System.out.println("3.-Whites");
			System.out.println("4.-To pay");
			System.out.println("5.-Exit");
			System.out.println("Enter the desired option");
			int op;
			op = sc.nextInt();
			switch (op) {
			case 1:
				do {
					System.out.println("---------Ladies---------");

					System.out.println("1.-Blouse");
					System.out.println("2.-Skirt");
					System.out.println("3.-Dress");
					System.out.println("4.-Exit");
					System.out.println("Type the number corresponding to the desired garment");
					op = sc.nextInt();
					switch (op) {
					case 1:
						System.out.println("Blouse");
						System.out.print("cost: ");
						cost = sc.nextFloat();
						t = t + cost;
						break;
					case 2:
						System.out.println("Skirt ");
						System.out.print("cost: ");
						cost = sc.nextFloat();
						t = t + cost;
						break;
					case 3:
						System.out.println("Dress ");
						System.out.print("cost: ");
						cost = sc.nextFloat();
						t = t + cost;
						break;
					case 4:
						b = 1;
						break;
					}
				} while (b == 0);
				break;
			case 2:
				do {
					System.out.println("----------Gentlemen---------");

					System.out.println("1.-Jacket");
					System.out.println("2.-Jeans");
					System.out.println("3.-Vest");
					System.out.println("4.-Exit");
					System.out.println("Type the number corresponding to the desired garment");
					op = sc.nextInt();
					switch (op) {
					case 1:
						System.out.println("Jacket");
						System.out.print("cost: ");
						cost = sc.nextFloat();
						t = t + cost;
						break;
					case 2:
						System.out.println("Jeans ");
						System.out.print("cost: ");
						cost = sc.nextFloat();
						t = t + cost;
						break;
					case 3:
						System.out.println("Vest ");
						System.out.print("cost: ");
						cost = sc.nextFloat();
						t = t + cost;
						break;
					case 4:
						c = 1;
						break;
					}
				} while (c == 0);
				break;

			case 3:
				do {
					System.out.println("----------Whites---------");

					System.out.println("1.-Nightgown");
					System.out.println("2.-Socks");
					System.out.println("3.-Briefs/knickers");
					System.out.println("4.-Exit");
					System.out.println("Type the number corresponding to the desired garment");
					op = sc.nextInt();
					switch (op) {
					case 1:
						System.out.println("Nightgown");
						System.out.print("cost: ");
						cost = sc.nextFloat();
						t = t + cost;
						break;
					case 2:
						System.out.println("Socks ");
						System.out.print("cost: ");
						cost = sc.nextFloat();
						t = t + cost;
						break;
					case 3:
						System.out.println("Briefs/knickers ");
						System.out.print("cost: ");
						cost = sc.nextFloat();
						t = t + cost;
						break;
					case 4:
						q = 1;
						break;
					}
				} while (q == 0);

				break;

			case 4:
				do {

					System.out.println("Payment method");
					System.out.println("1.-Card");
					System.out.println("2.-Counted");
					System.out.println("3.-Print ticket");
					System.out.println("4.-Exit");
					System.out.println("Enter the payment method and then print the ticket");
					op = sc.nextInt();
					switch (op) {
					case 1:
						System.out.println("Card");
						System.out.print("Enter card number: ");
						m = sc.next();
						System.out.println("Enter bank: ");
						banco = sc.next();

						System.out.println("Date: " + Date);
						System.out.println("Transaction validated by the seller: " + vendedor + " for $" + t
								+ " to the bank " + banco + ", card number: " + m);
						System.out.println("Thank you for your visit sir/madam " + nombres + " come back soon");
						System.out.println("\n");

						break;
					case 2:
						System.out.println("Counted ");
						System.out.println("Total to pay: " + t);

						System.out.println("Date: " + Date);
						System.out.println("Transaction validated by the seller: " + vendedor + " for $" + t + " dollars.");
						System.out.println("Thank you for your visit sir/madam " + nombres + " come back soon.");
						System.out.println("\n");
						System.out.println("Print payment receipt");

						/*String osName = System.getProperties().getProperty("os.name");
						System.out.println("onde vergas estoy toy " + osName + " asu makina XD");*/

						break;
					case 3:
					String ruta = System.getProperties().getProperty("user.dir/tiked.txt", "tiked.txt");
					File archivo = new File(ruta);
					BufferedWriter bw;

					if (archivo.exists()) {
						bw = new BufferedWriter(new FileWriter(archivo));
						bw.write("----------Payment ticket----------\n");
						bw.write("--------The Penguin--------\n");
						bw.write("Sir/Madam: \n");
						bw.write(": " + nombres + "\n");
						bw.write("The price to pay is: \n");
						bw.write("$ " + t + "\n");
						bw.write("Expedition date: \n");
						bw.write(": " + Date + "\n");
						bw.write("Who attended him: \n");
						bw.write(": " + vendedor + "\n");
						bw.write("-----Thanks for your preference-----");
					} else {
						bw = new BufferedWriter(new FileWriter(archivo));
						bw.write("----------Payment ticket----------\n");
						bw.write("--------The Penguin--------\n");
						bw.write("Sir/Madam: \n");
						bw.write(": " + nombres + "\n");
						bw.write("The price to pay is: \n");
						bw.write("$ " + t + "\n");
						bw.write("Expedition date: \n");
						bw.write(": " + Date + "\n");
						bw.write("Who attended him: \n");
						bw.write(": " + vendedor + "\n");
						bw.write("-----Thanks for your preference-----");
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
	}
}
