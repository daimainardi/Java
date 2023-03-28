package curso.java.testando;

public class Questao {
    static int q1;
    int q2;
    static {q1 = 9;}
    {q2 = 3;}

    void troca(){
        q1 = q2;
    }

}
