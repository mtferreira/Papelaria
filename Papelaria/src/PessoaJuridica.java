import java.util.*;
import ValidateClasses.*;

public class PessoaJuridica {

    private int pessoaJuridicaId;
    private String pessoaJuridicaCNPJ = new String();
    private String pessoaJuridicaRazaoSocial = new String();
    private String pessoaJuridicaNomeFantasia = new String();

    public int getPessoaJuridicaId() {
        return pessoaJuridicaId;
    }

    public void setPessoaJuridicaId(int pessoaJuridicaId) {
        this.pessoaJuridicaId = pessoaJuridicaId;
    }

    public String getPessoaJuridicaCNPJ() {
        return pessoaJuridicaCNPJ;
    }

    public void setPessoaJuridicaCNPJ(String pessoaJuridicaCNPJ) {
        this.pessoaJuridicaCNPJ = pessoaJuridicaCNPJ;
    }

    public String getPessoaJuridicaRazaoSocial() {
        return pessoaJuridicaRazaoSocial;
    }

    public void setPessoaJuridicaRazaoSocial(String pessoaJuridicaRazaoSocial) {
        this.pessoaJuridicaRazaoSocial = pessoaJuridicaRazaoSocial;
    }

    public String getPessoaJuridicaNomeFantasia() {
        return pessoaJuridicaNomeFantasia;
    }

    public void setPessoaJuridicaNomeFantasia(String pessoaJuridicaNomeFantasia) {
        this.pessoaJuridicaNomeFantasia = pessoaJuridicaNomeFantasia;
    }

    public boolean cadastraPessoaJuridica(int id, String cnpj, String razao, String fantasia) {
        if (this.validaCNPJ(cnpj)) {
            this.setPessoaJuridicaId(id);
            this.setPessoaJuridicaNomeFantasia(fantasia);
            this.setPessoaJuridicaRazaoSocial(razao);
            return true;
        } else {
            return false;
        }

    }

    public void editaPessoaJuridica(String fantasia) {
        this.setPessoaJuridicaNomeFantasia(fantasia);
    }

    public void excluiPessoaJuridica(ArrayList<PessoaJuridica> pessoaJuridica, int id) {
        pessoaJuridica.remove(id);
    }

    public void exibePessoaJuridica() {
        System.out.println("codigo: " + this.pessoaJuridicaId);
        System.out.println("CNPJ: " + this.pessoaJuridicaCNPJ);
        System.out.println("Razao Social: " + this.pessoaJuridicaRazaoSocial);
        System.out.println("Nome Fantazia: " + this.pessoaJuridicaNomeFantasia);
    }

    public boolean validaCNPJ(String cnpj) {
        int i, j = 0, n, dgt1;
        int result, rest;
        Map<Integer, Integer> cnpjParcial = new HashMap();
        ValidateString validate_str = new ValidateString();

        if (cnpj.length() < 14 && cnpj.length() > 18) {
            return false;
        }
        String[] arrayCnpj = cnpj.split("-");
        for (i = 0; i < arrayCnpj[0].length(); i++) {
            try {
                n = Integer.parseInt(String.valueOf(arrayCnpj[0].charAt(i)));
                cnpjParcial.put(n, j);
                j++;
            } catch (NumberFormatException ex) {
            }
        }
        System.out.println(cnpjParcial.get(0));
        result = this.calculaValorCnpj(cnpjParcial);

        rest = result % 11;
        if (rest < 2) {
            dgt1 = 0;
        } else {
            dgt1 = 11 - rest;
        }

        if ((cnpjParcial.get(12) != dgt1) && (arrayCnpj.length < 2 || dgt1 != Integer.parseInt(String.valueOf(arrayCnpj[1].charAt(0))))) {
            return false;
        }
        cnpjParcial.put(dgt1, 12);
        result = this.calculaValorCnpj(cnpjParcial);

        rest = result % 11;
        if (rest < 2) {
            dgt1 = 0;
        } else {
            dgt1 = 11 - rest;
        }
        if ((cnpjParcial.get(13) != dgt1) && (arrayCnpj.length < 2 || dgt1 != Integer.parseInt(String.valueOf(arrayCnpj[1].charAt(1))))) {
            return false;
        }
        cnpjParcial.put(dgt1, 13);

        this.pessoaJuridicaCNPJ = validate_str.MapToString(cnpjParcial);
        return true;
    }

    private int calculaValorCnpj(Map<Integer, Integer> mapa_cnpj) {
        int j = 0;
        int result = 0, n;

        System.out.println("aqui " + mapa_cnpj.get(j));
        for (int i = 6; i > 1; i--) {
            n = mapa_cnpj.get(j);
            result += (i * n);
            j++;
        }
        for (int i = 9; i > 1; i--) {
            result += (i * mapa_cnpj.get(j));
            j++;
        }
        return result;
    }

}
