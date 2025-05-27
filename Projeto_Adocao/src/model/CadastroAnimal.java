package model;
import model.interfaces.Cadastro;

public class CadastroAnimal implements Cadastro {

    private String id;
    private String nome;
    private String raca;
    private boolean adotado = false;
    private CadastroProtetor protetorResponsavel;

    public CadastroAnimal(String id, String nome, String raca) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isAdotado() {
        return adotado;
    }

    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
        if (adotado) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }


    public CadastroProtetor getProtetorResponsavel() {
        return protetorResponsavel;
    }

    public void setProtetorResponsavel(CadastroProtetor protetorResponsavel) {
        this.protetorResponsavel = protetorResponsavel;
        if (protetorResponsavel != null) {
            protetorResponsavel.adicionarAnimalResgatado(this);
        }
    }

    @Override
    public void registroCadastro() {
        System.out.println("ID do animal: "+ id + "Nome do animal: " + nome + "| Raça: " + raca + "| Adotado: " + adotado);
    }
}
