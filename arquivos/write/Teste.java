package write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teste {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good Afernoon", "Good night"};
		String path = "C:\\Users\\gabriel.martins\\Documents\\teste2.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter (path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); //para quebrar linha
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
