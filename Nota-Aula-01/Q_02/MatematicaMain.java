package Q_02;
import java.util.Scanner;

public class MatematicaMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Matematica m = new Matematica();

        System.out.println("\n-- Escolha uma operação --");
        System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
        System.out.print(">> ");
        m.opcao = sc.nextInt();
        System.out.print("Informe o 1º número: ");
        m.num1 = sc.nextInt();
        System.out.print("Informe o 2º número: ");
        m.num2 = sc.nextInt();
        System.out.println("Resultado: " + m.Menu());
    }
}
