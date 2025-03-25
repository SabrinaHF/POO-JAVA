package Q_01;
import java.util.Scanner;

public class AlunoMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        a.nome = sc.nextLine();
        System.out.print("Informe a 1ª nota do aluno: ");
        a.nota1 = sc.nextInt();
        System.out.print("Informe a 2ª nota do aluno: ");
        a.nota2 = sc.nextInt();
        System.out.print("Informe a 3ª nota do aluno: ");
        a.nota3 = sc.nextInt();

        System.out.println("Média do aluno: " + a.Media());
        a.Situacao();

    }
}
