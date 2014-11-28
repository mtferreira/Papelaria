import java.util.*;

public class Main {

    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica();
        if (pessoa.validaCPF("12312312311")) {
            System.out.println("valido");
        }
    }
}
