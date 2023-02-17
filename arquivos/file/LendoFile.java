package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\gabriel.martins\\Documents\\teste.txt");
		//1º\: prefixo de caracter especial, a 2º é o caracter especial
		Scanner scan = null;
		try {
			scan = new Scanner(file); // Aqui ele vai tentar abrir o arquivo, pode gerar IOException, sou obrigado a tratar
			while (scan.hasNextLine()) { // testa se ainda tem uma próxima linha
				System.out.println(scan.nextLine());
			}
		}
		catch (IOException e){ //tratando
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (scan != null) { //pode ser que não tenha nem instanciado se tentar fechar vai lançar outra exceção
				scan.close();
			}
		}
	}
}
