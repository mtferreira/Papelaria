import ValidateClasses.ValidateString;
import ValidateClasses.ValidateGenerator;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaFisica {

    private int pessoaFisicaId;
    private String pessoaNome = new String();
    private String pessoaCPF = new String();

    private ValidateString Validate_Str = new ValidateString();

    public int getPessoaFisicaId() {
        return pessoaFisicaId;
    }

    public void setPessoaFisicaId(int pessoaFisicaId) {
        this.pessoaFisicaId = pessoaFisicaId;
    }

    public String getPessoaNome() {
        return pessoaNome;
    }

    public void setPessoaNome(String pessoaNome) {
        this.pessoaNome = pessoaNome;
    }

    public String getPessoaCPF() {
        return pessoaCPF;
    }

    public void setPessoaCPF(String pessoaCPF) {
        this.pessoaCPF = pessoaCPF;
    }

    public boolean cadastrarPessoa(String cpf, String nome, int id) {
        if (!this.validaCPF(cpf)) {
            return false;
        }
        this.setPessoaFisicaId(id);
        this.setPessoaNome(nome);
        this.setPessoaCPF(cpf);
        return true;
    }

    public boolean editaPessoa(String nome) {
        this.setPessoaNome(nome);
        return true;
    }

    public void excluirPessoa(PessoaFisica pessoa) {
        try {
            pessoa.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(PessoaFisica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void exibePessoa() {
        System.out.println("codigo: " + this.pessoaFisicaId);
        System.out.println("Nome: " + this.pessoaNome);
        System.out.println("CPF: " + this.pessoaCPF);
    }

    public boolean validaCPF(String cpf) {
        ValidateGenerator Validate_G = new ValidateGenerator();

        if (Validate_G.validaCPF(cpf)) {
            return true;
        }
        return false;
    }
}
