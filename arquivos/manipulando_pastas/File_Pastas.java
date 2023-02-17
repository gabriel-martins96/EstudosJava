package manipulando_pastas;

import java.io.File;
import java.util.Scanner;

public class File_Pastas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter folder path: ");
		String strPath = scan.nextLine();
		
		//Passo o caminho da pasta para o file, para poder manipular
		File path = new File (strPath);
		
		File[] folders = path.listFiles(File::isDirectory); //aqui fazemos o filtro, aqui pesquisamos as pastas
		System.out.println("Folders");
		for (File folder : folders) {
			System.out.println(folder.getName());
		}
		
		File[] files = path.listFiles(File::isFile); // filtrando por aquivo
		System.out.println("Files/Archives");
		for (File file : files) {
			System.out.println(file.getName());
		}
		//Criando uma subpasta
		//Criar uma variável boolean para o returno da função que cria a pasta
		boolean success = new File (strPath + "\\apagar").mkdir();
		//teste:
		System.out.println("Directory created successfully: " + success);
		scan.close();
	}

}
