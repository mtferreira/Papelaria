package ValidateClasses;

/**
 * @author Matheus Ferreira
 * @version 1.0
 */
import java.util.*;

public class ValidateString {

    /**
     * Objetivo: Retornar quantidade de numeros em uma string;
     *
     * @param str
     * @return count: Quantidade de numeros presentes em uma string
     */
    public int qtdNumberString(String str) {
        int count = 0; // armazena quantidade de numeros encontrados na string
        char c[] = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') {// verificando se caractere é um numero
                count++;
            }
        }
        return count;
    }

    public String ListToString(List<Integer> list) {
        String result = new String();
        result = "";
        for (int str : list) {
            result += str;
        }
        return result;
    }

    public String MapToString(Map<Integer, Integer> map) {
        String result = new String();
        result = "";
        for (int str : map.keySet()) {
            result += str;
        }
        return result;
    }

}
