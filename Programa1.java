package POO;

import java.io.IOException;
import java.util.Scanner;

public class Programa1 {
	public static void main(String[] Args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String nom, apll, corr, r;
		int i, j, s, a = 1;
		String[] pers = new String[5];
		String[] curr = new String[5];
		String[] trab = new String[5];

		do {
			System.out.println("------- ----------Ford--------------------------");
			System.out.println("---------------Go Further-----------------------");
			System.out.println("------convocatoria para reclutar personal-------");

			System.out.print("¿Cual es tu nombre?: \n");
			nom = sc.next();
			System.out.print("¿Cual es tu apellido paterno?: \n");
			apll = sc.next();
			System.out.print("¿Cual es tu correo de electronico?: \n");
			corr = sc.next();

			System.out.print(
					"Acontinuacion escribe 5 caracteristicas con las que te definas (Que sea una palabra por favor): \n");
			for (i = 0; i < 5; i++) {
				System.out.println("Ingrese tus caracteristicas: ");
				pers[i] = sc.next();
			}

			System.out.print("Escribe 5 datos relevantes de tu curriculum (Que sea una palabra por favor): \n");
			for (j = 0; j < 5; j++) {
				System.out.println("Ingrese tus datos curriculares: ");
				curr[j] = sc.next();
			}

			System.out
					.print("Escribe 5 datos relevantes de tu trayectoria laboral (Que sea una palabra por favor): \n");
			for (s = 0; s < 5; s++) {
				System.out.println("Ingrese tus datos laborales: ");
				trab[s] = sc.next();
			}

			System.out.flush();

			System.out.println("-----Gracias por llenar los campos-----");
			System.out.println("Señor@: " + nom + " " + apll);
			System.out.println("Si es seleccionado se le notificara por medio de su correo: " + corr
					+ " que usted a sido seleccionado");
			System.out.println("y que los siguientes datos: \n");
			System.out.println("--------Caracteristicas tuyas----------");
			for (i = 0; i < 5; i++) {
				System.out.println(pers[i]);
			}
			System.out.println("--------Datos de tu curriculum---------");
			for (j = 0; j < 5; j++) {
				System.out.println(curr[j]);
			}
			System.out.println("--------Datos laborales----------------");
			for (s = 0; s < 5; s++) {
				System.out.println(trab[s]);
			}
			System.out.println("\n son validos para la empresa. \n");
			System.out.println("-------GRACIAS POR SU PREFERENCIA------");

			System.out.flush();

			System.out.println("Desea realizar el proseso otra vez?(si/no)");
			r = sc.next();
			if (r.equals("no")) {
				a = 0;
			}

		} while (a == 1);
	}

}
