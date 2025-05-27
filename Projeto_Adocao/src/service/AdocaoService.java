package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class AdocaoService {

    private List<CadastroAdotante> adotantes = new ArrayList<>();
    private List<CadastroProtetor> protetores = new ArrayList<>();
    private List<CadastroAnimal> animais = new ArrayList<>();
    private List<Adocao> adocoes = new ArrayList<>();

    public void cadastrarAdotante(CadastroAdotante adotante) {
        adotantes.add(adotante);
        adotante.registroCadastro();
    }

    public void cadastrarProtetor(CadastroProtetor protetor) {
        protetores.add(protetor);
        protetor.registroCadastro();
    }

    public void cadastrarAnimal(CadastroAnimal animal) {
        animais.add(animal);
        animal.registroCadastro();
    }

    public boolean realizarAdocao(CadastroAdotante adotante, CadastroAnimal animal) {
        if (animal.isAdotado()) {
            return false;
        }
        Adocao adocao = new Adocao(adotante, animal);
        adocoes.add(adocao);
        return true;
    }

    public CadastroAdotante buscarAdotantePorId(String id) {
        return adotantes.stream()
                .filter(a -> a.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }

    public CadastroProtetor buscarProtetorPorId(String id) {
        return protetores.stream()
                .filter(p -> p.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }

    public CadastroAnimal buscarAnimalPorId(String id) {
        return animais.stream()
                .filter(a -> a.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }

    public List<CadastroAdotante> getAdotantes() {
        return adotantes;
    }

    public List<CadastroProtetor> getProtetores() {
        return protetores;
    }

    public List<CadastroAnimal> getAnimais() {
        return animais;
    }

    public List<Adocao> getAdocoes() {
        return adocoes;
    }
}
