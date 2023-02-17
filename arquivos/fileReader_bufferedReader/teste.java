package fileReader_bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class teste {
	//Manualmente, não é muito usado
	public static void main(String[] args) {
		String path = "C:\\Users\\gabriel.martins\\Documents\\teste.txt";
		FileReader fr = null;
		BufferedReader br = null;

		// Agora vou criar uma stream de leitura a partir do path
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			// br = new BufferedReader (new FileReader(path));

			// Lógica para estabelecer a leitura
			String line = br.readLine(); // Se for a última linha, ele retorna null
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			// Aqui também pode gerar IOException ao tentar fechar
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
