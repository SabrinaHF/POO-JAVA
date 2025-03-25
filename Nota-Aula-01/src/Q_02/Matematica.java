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

        switch (opcao) {
            case 1: return Somar();
            case 2: return Subtrair();
            case 3: return Multiplicar();
            case 4: return Dividir();
            default: return 0;
        }
    }
}
