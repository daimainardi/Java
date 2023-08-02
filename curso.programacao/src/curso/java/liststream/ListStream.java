package curso.java.liststream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStream {
    public static void main(String[] args) {

        List<Pessoa> pessoa = Arrays.asList
                (new Pessoa("Daniel", 40),
                        (new Pessoa("Daiane", 39)),
                        (new Pessoa("Karina", 35)),
                        (new Pessoa("Kamilla", 38)));

        //Stream<Pessoa> streamPessoa = pessoa.stream(); assim não permite várias operações matemáticas.

        Stream<Pessoa> streamPessoa = pessoa.parallelStream();
        IntSummaryStatistics estatistica = streamPessoa.mapToInt(Pessoa::getIdade).summaryStatistics(); //reference
        // IntSummaryStatistics estatistica = streamPessoa.mapToInt(p -> p.getIdade()).summaryStatistics(); // lambda
        System.out.println(estatistica);

        //System.out.println(streamPessoa.collect(Collectors.toList()));

        //System.out.println(streamPessoa.map(Pessoa::getNome).collect(Collectors.toList()));//reference
        //System.out.println(streamPessoa.map(p -> p.getNome()).collect(Collectors.toList())); // lambda

        //System.out.println(streamPessoa.map(p -> p.getIdade()).collect(Collectors.toList()));

        //System.out.println(streamPessoa.filter(p -> p.getNome().startsWith("D")).mapToInt(p -> p.getIdade()).sum());

        //System.out.println(streamPessoa.filter(p -> p.getNome().startsWith("D")).collect(Collectors.toList()));

        //System.out.println(streamPessoa.max(Comparator.comparing(Pessoa::getIdade))); // metodo reference
        //System.out.println(streamPessoa.max(Comparator.comparing(i -> i.getIdade())));

        //System.out.println(streamPessoa.min(Comparator.comparing(i -> i.getIdade())));

    }
}
