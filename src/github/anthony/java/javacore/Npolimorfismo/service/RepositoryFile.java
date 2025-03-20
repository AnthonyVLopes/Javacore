package github.anthony.java.javacore.Npolimorfismo.service;

import github.anthony.java.javacore.Npolimorfismo.repository.Repository;

public class RepositoryFile implements Repository {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }

}
