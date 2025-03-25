package Q_02;

public class Matematica {

    int opcao, num1, num2;

    public int Somar() {
        return num1 + num2;
    }

    public int Subtrair() {
        return num1 - num2;
    }

    public int Multiplicar() {
        return num1 * num2;
    }

    public int Dividir() {
        return num1 / num2;
    }

    public int Menu() {

        return switch (opcao) {
            case 1 -> Somar();
            case 2 -> Subtrair();
            case 3 -> Multiplicar();
            case 4 -> Dividir();
            default -> {
                System.out.println("Opção inválida!");
                yield 0;
            }
        }
    }
}
