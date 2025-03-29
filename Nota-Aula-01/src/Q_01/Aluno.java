package Q_01;

public class Aluno {

    String nome;
    int nota1, nota2, nota3;

    public int Media() {
        return (nota1+nota2+nota3)/3;
    }

    public String Situacao() {

        int media = Media();

        if(media>=70){
            return "Aluno aprovado!";
        }else if(media<40){
            return "Aluno reprovado!";
        }else{
            return "Aluno está na final!";
        }
    }
}
