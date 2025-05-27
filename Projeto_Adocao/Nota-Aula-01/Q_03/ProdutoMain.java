package Q_03;

import java.util.Scanner;

public class ProdutoMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        int op = 0;

        do {
            System.out.println("-----MENU-----");
            System.out.println(" 1- Adicionar Produto");
            System.out.println(" 2- Vender Produto");
            System.out.println(" 3- Exibir Estoque");
            System.out.println(" 4- Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    p.adicionarEstoque();
                    break;
                case 2:
                    p.venderProduto();
                    break;
                case 3:
                    p.exibirEstoque();
                    break;
                case 4:
                    System.out.println("Saindo do Sistema");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }
        }while (op != 4);

    }
}
