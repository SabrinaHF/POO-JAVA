package model;
import model.interfaces.Cadastro;
import java.util.ArrayList;
import java.util.List;

public class CadastroProtetor extends CadastroPessoaFisica implements Cadastro {

    private int numResgate;
    private String id;
    private List<CadastroAnimal> animaisResgatados = new ArrayList<>();

    public CadastroProtetor(String nome, String cpf, String telefone, String email, int numResgate, String id) {
        super(nome, cpf, telefone, email);
        this.numResgate = numResgate;
        this.id = id;
    }

    public int getNumResgate() {
        return numResgate;
    }

    public void setNumResgate(int numResgate) {
        this.numResgate = numResgate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CadastroAnimal> getAnimaisResgatados() {
        return animaisResgatados;
    }

    public void adicionarAnimalResgatado(CadastroAnimal animal) {
        animaisResgatados.add(animal);
        numResgate = animaisResgatados.size();
    }

    @Override
    public void registroCadastro() {
        System.out.println("ID Protetor(a): " + id +
                " | Nome: " + getNome() +
                " | CPF: " + getCpf() +
                " | Telefone: " + getTelefone() +
                " | Email: " + getEmail() +
                " | Animais resgatados: " + numResgate);
    }
}
