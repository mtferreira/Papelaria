package ValidateClasses;

/**
 * @author Matheus Ferreira
 * @version 1.0
 */
import java.math.*;
import java.util.*;
import ValidateClasses.ValidateString;

public class ValidateGenerator {

    private ValidateString Validate_Str = new ValidateString();

    public String cpfGenerator() {
        List<Integer> cpfParcial = new ArrayList();

        int totalSomatoria = 0;
        int restoDv;
        int peso = 10;

        //geranado a parte dos 9 primeiros numeros do CPF
        for (int i = 0; i < 9; i++) {
            cpfParcial.add(this.NumberGenerator()); // gera os nove numeros e insere num vetor
        }

        /* ** Calculando o primeiro dígito - INICIO ** */
        for (int item : cpfParcial) {
            totalSomatoria += (peso * item);   //multiplicando os valores de acordo com o seu peso 
            peso--;
        }

        restoDv = (totalSomatoria % 11);
        if (restoDv < 2) {
            cpfParcial.add(0);
        } else {
            cpfParcial.add(11 - restoDv);
        }
        /* ** Calculando o primeiro dígito - FIM ** */

        /* ** Calculando o segundo dígito - INICIO ** */
        peso = 11;
        totalSomatoria = 0;
        for (int item : cpfParcial) {
            totalSomatoria += (peso * item);   //multiplicando os valores de acordo com o seu peso 
            peso--;
        }

        restoDv = (totalSomatoria % 11);

        if (restoDv < 2) {
            cpfParcial.add(0);
        } else {
            cpfParcial.add(11 - restoDv);
        }

        return this.Validate_Str.ListToString(cpfParcial);
    }

    public boolean validaCPF(String cpf) {

        int i, j = 0, n, dgt1, vetor[] = new int[11];
        int result = 0, rest;
        if (this.Validate_Str.qtdNumberString(cpf) < 11) {
            return false;
        }

        if (cpf.length() < 11 && cpf.length() > 14) {
            return false;
        }
        String[] arrayCpf = cpf.split("-");
        for (i = 0; i < arrayCpf[0].length(); i++) {
            try {
                n = Integer.parseInt(String.valueOf(arrayCpf[0].charAt(i)));
                vetor[j] = n;
                j++;
            } catch (NumberFormatException ex) {
            }
        }
        for (i = 0; i < 9; i++) {
            result += (10 - i) * vetor[i];
        }
        rest = result % 11;
        if (rest < 2) {
            dgt1 = 0;
        } else {
            dgt1 = 11 - rest;
        }
        if ((vetor[9] != dgt1) && (arrayCpf.length < 2 || dgt1 != Integer.parseInt(String.valueOf(arrayCpf[1].charAt(0))))) {
            return false;
        }

        vetor[9] = dgt1;
        result = 0;
        for (i = 0; i < 10; i++) {
            result += (11 - i) * vetor[i];
        }
        rest = result % 11;
        if (rest < 2) {
            dgt1 = 0;
        } else {
            dgt1 = 11 - rest;
        }
        if ((vetor[10] != dgt1) && (arrayCpf.length < 2 || dgt1 != Integer.parseInt(String.valueOf(arrayCpf[1].charAt(1))))) {

            return false;
        }
        cpf = "";
        vetor[10] = dgt1;
        for (i = 0; i < 11; i++) {
            cpf += vetor[i];
        }

        return true;

    }

    public int NumberGenerator() {
        int number = (int) (Math.random() * 10);
        return number;
    }

}
