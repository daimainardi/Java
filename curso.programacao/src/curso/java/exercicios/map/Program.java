package curso.java.exercicios.map;

import java.util.TreeMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<String,String> cookies = new TreeMap<>();

        cookies.put("UserName", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("Phone", "999650387");

        cookies.remove("email");
        cookies.put("Phone", "998658966"); // sobrescreve porque não repete

        System.out.println("Contains 'Phone' key: " + cookies.containsKey("Phone"));
        System.out.println("Phone number: " + cookies.get("Phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies:");
        for (String key: cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));

        }


    }
}
