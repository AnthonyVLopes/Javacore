package github.anthony.java.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover{


    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do Banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão de acesso do Banco de dados");
    }
// private -> default -> protect -> public
}