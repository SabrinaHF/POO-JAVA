package Q_01;

public class Aluno {

    String nome;
    int nota1, nota2, nota3;

    public int Media() {
        return (nota1+nota2+nota3)/3;
    }

    public void Situacao() {

        if(Media()>=70){
            System.out.println("Aluno aprovado!");
        }else if(Media()<40){
            System.out.println("Aluno reprovado!");
        }else{
            System.out.println("Aluno está na final!");
        }
    }
}
