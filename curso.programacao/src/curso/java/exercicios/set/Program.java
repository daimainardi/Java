package curso.java.exercicios.set;

import java.util.TreeSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        //System.out.println(set.contains("Notebook"));
        //set.remove("Tablet");
        //set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');
        for (String p : set) {
            System.out.println(p);
        }
    }
}
