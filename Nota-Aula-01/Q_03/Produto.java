package Q_03;

import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;
    private int qtd_estoque;

    public Produto(String nome, double preco, int qtd_estoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtd_estoque = qtd_estoque;
    }

    public Produto() {

    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }

    public void setQtd_Estoque(int qtd_estoque) {

        this.qtd_estoque = qtd_estoque;
    }

    public String getNome() {

        return nome;
    }

    public double getPreco() {

        return preco;
    }

    public int getQtd_Estoque() {

        return qtd_estoque;
    }

    public void adicionarEstoque() {

        Scanner sc = new Scanner(System.in);

        System.out.println(">> CADASTRO <<");

        System.out.print("- Informe o nome do produto: ");
        setNome(sc.nextLine());
        System.out.print("- Informe o preço do produto: ");
        setPreco(sc.nextDouble());
        System.out.print("- Informe a quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        setQtd_Estoque(quantidade+getQtd_Estoque());

        System.out.println(">>Produto adicionado com sucesso!<<");
    }

    public void venderProduto() {

        Scanner sc = new Scanner(System.in);

        System.out.println(">> VENDA <<");

        System.out.print("- Informe a quantidade desejada: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        if (quantidade > getQtd_Estoque()) {
            System.out.println("Produto fora de estoque!");
            return;
        }

        double total = quantidade * preco;
        setQtd_Estoque(getQtd_Estoque() - quantidade);

        System.out.printf("- Valor da venda: R$ %.2f%n", total);
        System.out.println(">>Venda realizada com sucesso!<<");

    }

    public void exibirEstoque() {

        System.out.println(">> ESTOQUE <<");
        System.out.println("Produto: " + getNome());
        System.out.printf("Preço: R$ %.2f%n", getPreco());
        System.out.printf("Quantidade: %d%n", getQtd_Estoque());
        System.out.println("----------");
    }

}
