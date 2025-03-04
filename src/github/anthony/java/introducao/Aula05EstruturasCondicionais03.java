package github.anthony.java.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main (String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Estou liso";

        //(condicao) ? verdadeiro : falso - > Operador ternario

        String  resultado = salario > 5000 ?mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
