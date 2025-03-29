import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        int opcao;

        do {
            System.out.println("-----MENU-----");
            System.out.println(" 1- Cadastrar Produto");
            System.out.println(" 2- Realizar Venda");
            System.out.println(" 3- Consultar Estoque");
            System.out.println(" 4- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    p.cadastroProduto();
                    break;
                case 2:
                    p.vendaProduto();
                    break;
                case 3:
                    p.controleEstoque();
                    break;
                case 4:
                    System.out.println("Saindo do Sistema");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }

        }while (opcao != 4);

    }
}
