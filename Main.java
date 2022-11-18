import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";

        final String user = "postgres";
        final String password = "123456";

        Connection conn = null;

        Scanner ler = new Scanner(System.in);

        String opcao = "";
        opcao = String.valueOf(ler.nextLine().charAt(0));

        do {

            System.out.println("Selecione uma das opções abaixo: ");
            System.out.println("<1> Cadastrar Livro");
            System.out.println("<2> Pesquisar Livro por Preço");
            System.out.println("<3> Pesquisar Livro por Título");
            System.out.println("<4> Excluir Livro");
            System.out.println("<5> Sair");

            System.out.print("Resposta: ");
            opcao = ler.nextLine();

            switch (opcao) {
                case 1:
                    InserirRegistros livro = new InserirRegistros();
                    break;

                case 2:

                    break;

                case 3:
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println(" ");
                    break;
                default:
                    System.out.println(" ");
            }

            while (!opcao.equals("5")) ;


        }
    }
}




