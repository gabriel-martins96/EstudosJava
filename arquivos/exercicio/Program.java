package exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Product> list = new ArrayList();
		
		//1º Acessar o arquivo
		System.out.print("Enter file path: ");
		String sourceFileStr = scan.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		
		//2º Criar a pasta out
		String getFilePath = sourceFile.getParent();
		
		//3ºCriar a subpasta out
		boolean success = new File (getFilePath + "\\out").mkdir();
		//teste:
		System.out.println("Directory created successfully: " + success);
		 
		//4ºCriar arquivo summery.csv
		//4.1 Criar o caminho
		String targetFileStr = getFilePath + "\\out\\summary.csv";
		
		//4.2 Criar input de leitura
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			String line = br.readLine();
			//4.3 Criar os objetos de Produtos
			while (line != null) {
			String[] fields = line.split(",");
			String name = fields [0];
			Double price = Double.parseDouble(fields[1]);
			Double quantity = Double.parseDouble(fields[2]);
			list.add(new Product(name, price, quantity));
			line = br.readLine();
			}
		
		//4.4 Criar o arquivo e escrever	
		try (BufferedWriter bw = new BufferedWriter(new FileWriter (targetFileStr))){
			for (Product item : list) {
				bw.write(item.getName() + "," + String.format("%.2f", item.total()));
				bw.newLine();
			}
			System.out.println(targetFileStr + ": Created");
		}
		catch (IOException e) {
			System.out.println("Error writing file " + e.getMessage());
		}
		}
		catch(IOException e) {
			System.out.println("Error reading file " + e.getMessage());
		}
		scan.close();
	}

}
