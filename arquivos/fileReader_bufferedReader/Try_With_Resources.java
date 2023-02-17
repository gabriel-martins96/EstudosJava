package fileReader_bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_With_Resources {
	public static void main(String[] args) {
		String path = "C:\\Users\\gabriel.martins\\Documents\\teste.txt";
		
		//1º criar BufferedReader e Depois FileReader a partir de um caminho
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine(); 
			//Na última linha retorna null
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}

}

