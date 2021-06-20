package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			Character option = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (option == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			} else if (option == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				Date manufactureDate = sdf.parse(sc.nextLine());
				products.add(new UsedProduct(name, price, manufactureDate));
			} else {
				products.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
