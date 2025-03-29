
import java.util.Scanner;

public class Produto {

    private int codigo, quantidade;
    private String nome, tamanho, cor;
    private double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void cadastroProduto() {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----CADASTRO-----");


        System.out.print("Informe o código do produto: ");
        setCodigo(sc.nextInt());
        sc.nextLine();

        System.out.print("Informe o nome do produto: ");
        setNome(sc.nextLine());

        System.out.print("Informe o tamanho do produto: ");
        setTamanho(sc.nextLine());

        System.out.print("Informe o cor do produto: ");
        setCor(sc.nextLine());

        System.out.print("Informe o valor do produto: ");
        setValor(sc.nextDouble());

        System.out.print("Informe a quantidade do produto: ");
        setQuantidade(sc.nextInt()+getQuantidade());
        sc.nextLine();

        System.out.println("Produto cadastrado com sucesso!");

        System.out.println("--------------");


    }

    public void vendaProduto() {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----VENDA-----");


        System.out.print("Informe o código do produto: ");
        int codigoProduto = sc.nextInt();
        sc.nextLine();

        if (codigoProduto != getCodigo()) {
            System.out.println("Produto não encontrado!");
        }

        System.out.print("Informe a quantidade desejada: ");
        int qtdCompra = sc.nextInt();
        sc.nextLine();

        if (qtdCompra > getQuantidade()) {
            System.out.println("Produto fora de estoque!");
        }else {
            double total = qtdCompra * getValor();
            setQuantidade(getQuantidade() - qtdCompra);

            System.out.println("--Pagamento--");
            System.out.println(" 1- Pix\n 2- Espécie\n 3- Transferência\n 4- Débito\n 5- Crédito");
            System.out.print("> ");
            int resposta = sc.nextInt();
            sc.nextLine();

            double pagamento = total;

            if (resposta == 5) {
                pagamento = total / 3;
                System.out.printf("Valor do pagamento dividido em 3 vezes: R$ %.2f%n", pagamento);
            } else if (resposta == 2) {
                pagamento = total - (total * 0.05);
                System.out.printf("Valor do pagamento com desconto: R$ %.2f%n", pagamento);

                System.out.print("Digite o valor pago: ");
                double especie = sc.nextDouble();
                sc.nextLine();

                if (especie > pagamento) {
                    double troco = especie - pagamento;
                    System.out.printf("Valor do troco: R$ %.2f%n", troco);
                } else {
                    pagamento = total - (total * 0.05);
                    System.out.printf("Valor do pagamento com desconto: R$ %.2f%n", pagamento);
                }

            }else{
                pagamento = total - (total * 0.05);
                System.out.printf("Valor do pagamento com desconto: R$ %.2f%n", pagamento);
            }
        }
        System.out.println("Venda concluída com sucesso!");
        System.out.println("--------------");
    }

    public void controleEstoque() {

        System.out.println("-----Estoque-----");

        System.out.println("Código: " + getCodigo());
        System.out.println("Produto: " + getNome());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.printf("Valor: R$ %.2f%n", getValor());
        System.out.println("Tamanho: " + getTamanho());
        System.out.println("Cor: " + getCor());

        System.out.println("--------------");
    }
}
