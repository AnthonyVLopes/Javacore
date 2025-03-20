package github.anthony.java.javacore.Npolimorfismo.teste;

import github.anthony.java.javacore.Npolimorfismo.repository.Repository;
import github.anthony.java.javacore.Npolimorfismo.service.RepositoryFile;
import github.anthony.java.javacore.Npolimorfismo.service.RepositoryMemory;

public class RepositoryTeste {
    public static void main(String[] args) {
        //Orientação a interfaces

        Repository repository = new RepositoryFile();
        repository.salvar();

        Repository repository2 = new RepositoryMemory();
        repository2.salvar();



    }
}
