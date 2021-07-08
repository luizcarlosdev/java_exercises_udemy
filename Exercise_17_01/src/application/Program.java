package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		ArrayList<Product> products = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] product_line = line.split(",");
				String name = product_line[0];
				double price = Double.valueOf(product_line[1]);
				int quantity = Integer.valueOf(product_line[2]);
				products.add(new Product(name, price, quantity));
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Product product : products) {
			System.out.println(product);
		}
		
		// Create folder under given path if it doesn't exists
		String folderOut = path.getParent() + "/out";
		new File(folderOut).mkdir();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(folderOut + "/summary.txt"))) {
			for (Product product : products) {
				bw.write(product.toString());
				bw.newLine();
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		
		sc.close();
	}

}
