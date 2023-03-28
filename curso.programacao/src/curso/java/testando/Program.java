package curso.java.testando;

public class Program {
    public static void main(String[] args) {
        Questao x = new Questao();
        Questao y = new Questao();

        x.q2 = 5;
        x.troca();
        System.out.println(x.q1 + ", " + x.q2 + ", " + y.q1 + ", " + y.q2 );
    }
}
