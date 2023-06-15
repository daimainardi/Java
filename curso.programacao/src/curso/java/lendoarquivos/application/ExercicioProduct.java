package curso.java.lendoarquivos.application;

import curso.java.lendoarquivos.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();
        //System.out.println(sourceFolderStr);

        Boolean success = new File(sourceFolderStr + "/out").mkdir();
        //System.out.println("Folder created: " + success);

        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));
                //System.out.println(itemCsv);
                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.totalPrice()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + " Created");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }


        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        sc.close();
    }
}
