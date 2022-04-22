package POO;

import java.io.File;

public class file {
	public static void main(String[] args) {
		File fichero = new File("ejemplo.txt");
		if (fichero.exists() && fichero.isFile()) {
			System.out.println("\n Informacion del fchero: ");
			System.out.println("\n El fichero tiene el nombre: " + fichero.getName());
			System.out.println("\n El fichero tiene el path: " + fichero.getAbsolutePath());
			System.out.println("\n longitud del fichero: " + fichero.length());
		}
		File drectorio = new File("C:\\Users\\Rodrigo\\Desktop");
		if (drectorio.exists() && drectorio.isDirectory())
			;
		{
			String listado[] = drectorio.list();
			System.out.println("\n Listado del directorio: ");
			for (int i = 0; i < listado.length; i++) {
				System.out.println(listado[i] + "\n");
			}
		}

	}

}
