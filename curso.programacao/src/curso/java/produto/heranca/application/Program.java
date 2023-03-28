package curso.java.produto.heranca.application;

import curso.java.produto.heranca.entities.ImportedProduct;
import curso.java.produto.heranca.entities.Product;
import curso.java.produto.heranca.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Product> productList = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (productType == 'c'){
                Product product = new Product(name, price);
                productList.add(product);
            } else if (productType == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date date = formatter.parse(sc.next());
                Product product = new UsedProduct(name, price, date);
                productList.add(product);
            }
            else {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                productList.add(product);
            }

        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod: productList) {
            System.out.println(prod.priceTag());
        }
        /*for (int i = 0; i< productList.size(); i++){
            System.out.println(productList.get(i).priceTag());
        }*/

    }
}
