package Q_03;

import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;
    private int qtd_estoque;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void adicionarEstoque() {

        Scanner sc = new Scanner(System.in);
        String opcao;

        do{
            System.out.print("Informe o nome do produto: ");
            setNome(sc.nextLine());
            System.out.print("Informe o preço do produto: ");
            setPreco(sc.nextDouble());
            System.out.print("Informe a quantidade: ");
            setQtd_estoque((getQtd_estoque() + sc.nextInt()));
            sc.nextLine();
            System.out.print("Para adicionar um novo produto, digite S: ");
            opcao = sc.nextLine().toLowerCase();
        }while(opcao.equals("s"));

        System.out.println("Produto adicionado com sucesso!");
    }

    public void venderProduto() {

        Scanner sc = new Scanner(System.in);

        String opcao;

        do{
            System.out.print("Informe o nome do produto: ");
            setNome(sc.nextLine());
            System.out.print("Informe a quantidade: ");
            setQtd_estoque((getQtd_estoque() - sc.nextInt()));
            sc.nextLine();
            System.out.print("Para vender um novo produto, digite S: ");
            opcao = sc.nextLine().toLowerCase();
        }while(opcao.equals("s"));

        System.out.println("Valor da venda: " + getQtd_estoque()*getPreco());
        System.out.println("Venda realizada com sucesso!");

    }

    public void exibirEstoque() {



    }

}
