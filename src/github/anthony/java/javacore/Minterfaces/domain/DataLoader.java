package github.anthony.java.javacore.Minterfaces.domain;

public interface DataLoader {
   public abstract void load();
   //Por padrão todos os metodos declarado em interfaces são public e abstract, é uma regra

   default void checkPermission(){
       System.out.println("Checando permissão de acesso");
    }
}
