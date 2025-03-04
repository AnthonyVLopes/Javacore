package github.anthony.java.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadocomprarbebida = idade >= 18;

        if (isAutorizadocomprarbebida != false) {
            System.out.println("Pode tomar uma");
        } else {
            System.out.println("pode não porra");
        }

        // normalmente isso ão é utilizado mas vale lembrar
        boolean bruh = true;
        if (bruh == false) {
            System.out.println("não faça isso!");
        }


    }
}
