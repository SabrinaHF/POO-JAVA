package model;
import model.interfaces.Cadastro;

public class Adocao implements Cadastro {
    private CadastroAdotante pessoa;
    private CadastroAnimal animal;

    public Adocao(CadastroAdotante pessoa, CadastroAnimal animal) {
        this.pessoa = pessoa;
        this.animal = animal;
        this.animal.setAdotado(true);
        this.pessoa.adicionarAdocao(this);
    }

    public void registroCadastro() {
        System.out.println(pessoa.getNome() + " adotou " + animal.getNome());
    }
}