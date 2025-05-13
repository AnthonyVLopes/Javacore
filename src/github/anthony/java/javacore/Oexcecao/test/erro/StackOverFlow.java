package github.anthony.java.javacore.Oexcecao.test.erro;

public class StackOverFlow {
    public static void main(String[] args) {
        recursividade();
    }

    /*Esse aqui é um Erro que estoura a stack(memoria) do programa, e diferente de uma exception, o programa trava de
      vez e não se recupera */
    public static void recursividade(){
        recursividade();
    }
}
