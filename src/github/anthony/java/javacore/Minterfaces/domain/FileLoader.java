package github.anthony.java.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
}
