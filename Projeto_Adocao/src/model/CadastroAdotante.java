package model;
import model.interfaces.Cadastro;
import java.util.ArrayList;
import java.util.List;

public class CadastroAdotante extends CadastroPessoaFisica implements Cadastro {

    private int numAdocoes;
    private String id;
    private List<Adocao> adocoes = new ArrayList<>();

    public CadastroAdotante(String nome, String cpf, String telefone, String email, int numAdocoes, String id) {
        super(nome, cpf, telefone, email);
        this.numAdocoes = numAdocoes;
        this.id = id;
    }

    public int getnumAdocoes() {
        return numAdocoes;
    }

    public void setnumAdocoes(int numAdocoes) {
        this.numAdocoes = numAdocoes;
    }

    public List<Adocao> getAdocoes() {
        return adocoes;
    }

    public void setAdocoes(List<Adocao> adocoes) {
        this.adocoes = adocoes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void adicionarAdocao(Adocao adocao) {
        adocoes.add(adocao);
        numAdocoes = adocoes.size();
    }

    @Override
    public void registroCadastro() {
        System.out.println("ID Adotante: " + id + "| Nome: " + getNome() + "| CPF: " + getCpf() + "| Telefone: " + getTelefone() + "| Email: " + getEmail());
    }

}
