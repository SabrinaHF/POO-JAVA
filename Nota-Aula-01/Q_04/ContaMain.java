package Q_04;

import java.util.Scanner;

public class ContaMain {

    public static void main(String[] args) {

        Conta conta = new Conta();
        Scanner sc = new Scanner(System.in);
        int op;

        do{
            System.out.println(">>>> Menu Principal <<<<");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Finalizar operação");
            System.out.print("> Informe a opção desejada: ");
            op = sc.nextInt();

            switch(op){
                case 1:
                    conta.consultaSaldo();
                    break;
                case 2:
                    conta.Depositar();
                    break;
                case 3:
                    conta.Sacar();
                    break;
                case 4:
                    conta.Transferir();
                    break;
                case 5:
                    System.out.println("Operação finalizada com sucesso.");
                    break;
                default:
                    System.out.println(">Opção inválida. Digite uma opção válida.");
                    break;
            }
        }while(op!= 5);
    }
}
