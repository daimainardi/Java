package curso.java.exercicios.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        ////home/daiane/desenvolvimento/curso-java-udemy/in4.txt
        String path = sc.nextLine();

        Map<String,Integer> votes = new LinkedHashMap<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){

            String line = bf.readLine();
            while (line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                Integer vote = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)){
                    int sumVotes = votes.get(name);
                    votes.put(name,vote + sumVotes);
                }
                else {
                    votes.put(name,vote);
                }
                line = bf.readLine();
            }

            for (String key: votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
