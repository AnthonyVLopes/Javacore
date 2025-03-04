package github.anthony.java.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // * / + - %
        int num1 = 10;
        float num2 = 20;
        double resultado = num1 / num2;
        System.out.println(resultado);

        //% -> Resto da divisão
        double resto = 22 % 7;

        System.out.println(resto);

        // < > <= >= == != ->Operadores Relacionais
        boolean isDezMenorQueNove = 10 < 9;
        boolean isDezMaiorQueNove = 10 > 9;
        boolean isDezIgualaVinte = 10 == 20;
        boolean isDezDiferenelaVinte = 10 != 20;

        System.out.println("is10menorqueove: " + isDezMenorQueNove);
        System.out.println("isDezMaiorQueNove: " + isDezMaiorQueNove);
        System.out.println("isDezIgualaVinte: " + isDezIgualaVinte);
        System.out.println("isDezDiferenelaVinte: " + isDezDiferenelaVinte);

        // &&(AND) || (or) !(logical Note) -> Operadodres Logicos

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTinta = idade > 30 && salario > 4618;
        boolean isDentroDaLeiMenorQueTinta = idade < 30 && salario > 3318;

        System.out.println("isDentroDaLeiMaiorQueTinta: " + isDentroDaLeiMaiorQueTinta);
        System.out.println("isDentroDaLeiMenorQueTinta: " + isDentroDaLeiMenorQueTinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContapupanca = 10000;
        float valorPlaystation = 500f;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContapupanca > valorPlaystation;
        System.out.println("isPlayStationCincoCompravel: " + isPlayStationCincoCompravel);

        // = += -= *= %= /= -> Operadores de atribuição

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 34;
        bonus %= 4;

        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println(contador);


    }

}
