package curso.java.estruturadedados.listas;

public class Programa {
    public static void main(String[] args) {

        Lista listaClientes = new Lista();

        Cliente cliente = new Cliente(221L, "Produtos excelentes LTDA", "Rua sem fim, 200", 5000.0);

        // inserindo elementos na Lista Ligada
        listaClientes.insereInicio(cliente);   // usando uma variável cliente

        listaClientes.insereInicio(new Cliente(185L, "Negócios Importantes SA",
                "Avenida Principal, 10", 12000.0));

        listaClientes.insereInicio(new Cliente(443L, "Parceiros Críticos LTDA",
                "Rua dos negócios, 2000", 7000.0));

        System.out.println("------impressao da lista (1)------");
        listaClientes.imprimeLista();
        System.out.println("--------------------------");

        // removendo um elemento da Lista Ligada
        // necessário type casting para a classe Cliente
        Cliente clienteRemovido = (Cliente) listaClientes.removeInicio();

        System.out.println(clienteRemovido);
        System.out.println("--------------------------");

        System.out.println("------impressao da lista apos exclusao (2)------");
        listaClientes.imprimeLista();
        System.out.println("--------------------------");

        System.out.println("------busca de elemento------");
        // busca do elemento na posição 2 da lista
        cliente = (Cliente) listaClientes.buscaElemento(2);
        if (cliente != null) {
            System.out.println("Elemento da posicao 2 da Lista Ligada");
            System.out.println(cliente);
        }

        System.out.println("------nova exclusao de elemento da lista------");
        // removendo um elemento da Lista Ligada
        // necessário type casting para a classe Cliente
        clienteRemovido = (Cliente) listaClientes.removeInicio();
        System.out.println("Elemento removido da Lista Ligada");
        System.out.println(cliente);
        System.out.println("--------------------------");

        System.out.println("------impressao da lista (3)------");
        listaClientes.imprimeLista();

        // liberando toda a lista
        System.out.println("Liberando toda a lista");
        listaClientes.liberaLista();
        System.out.println("------impressao da lista (4)------");
        listaClientes.imprimeLista();

    }

}

