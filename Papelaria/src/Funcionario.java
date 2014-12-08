import java.util.*;
import ValidateClasses.ValidateGenerator;
import ValidateClasses.ValidateString;

public class Funcionario extends PessoaFisica {

    public void Funcionario() {

    }

    public boolean cadastrarFuncionario(String cpf, String nome, int id) {
        if (this.cadastrarPessoa(cpf, nome, id)) {
            return true;
        }
        return false;
    }

    public boolean editaFuncionario(String nome) {
        if (this.editaPessoa(nome)) {
            return true;
        }
        return false;
    }

    public void exibirFuncionario() {
        this.exibePessoa();
    }

    public Funcionario buscarFuncionario(List<Funcionario> funcionario, String cpf) {
        for (Funcionario func : funcionario) {
            if (func.getPessoaCPF() == cpf) {
                return func;
            }
        }
        return null;
    }

    public List cadastrarFuncionarioRandom(int id_aux) {
        int count;
        Scanner input = new Scanner(System.in);
        ValidateGenerator VG = new ValidateGenerator();
        List<Funcionario> Funcionarios_list = new ArrayList();

        System.out.println("Quantos Funcionarios deseja inserir");
        count = input.nextInt();

        while (count > 0) {
            Funcionario funcionario_n = new Funcionario();
            try {
                funcionario_n.cadastrarFuncionario(VG.cpfGenerator(), "Cliente" + id_aux, id_aux);
                Funcionarios_list.add(funcionario_n);
                id_aux++;
                count--;
            } catch (Exception ex) {
                System.out.println("Erro ao Gerar cliente randomicamente");
                System.out.println("error:");
                System.out.println(ex);
            }
        }

        System.out.println("Clientes foram cadastrados");
//        for (Cliente clt : Clientes_list) {
//            clt.exibirCliente();
//        }
        return Funcionarios_list;
    }
}
