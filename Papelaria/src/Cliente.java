/**
 *
 * @author Matheus Ferreira
 */
import java.util.*;
import ValidateClasses.ValidateGenerator;

public class Cliente extends PessoaFisica {

    public void Cliente() {

    }

    public boolean cadastrarCliente(String cpf, String nome, int id) {
        if (this.cadastrarPessoa(cpf, nome, id)) {
            return true;
        }
        return false;
    }

    public boolean editaCliente(String nome) {
        if (this.editaPessoa(nome)) {
            return true;
        }
        return false;
    }

    public void exibirCliente() {
        this.exibePessoa();
    }

    public Cliente buscarClientes(List<Cliente> clientes, String cpf) {
        for (Cliente clt : clientes) {
            if (clt.getPessoaCPF() == cpf) {
                return clt;
            }
        }
        return null;
    }

    public List cadastrarClienteRandom(int id_aux) {
        int count;
        Scanner input = new Scanner(System.in);
        ValidateGenerator VG = new ValidateGenerator();
        List<Cliente> Clientes_list = new ArrayList();

        System.out.println("Quantos clientes deseja inserir");
        count = input.nextInt();

        while (count > 0) {
            Cliente cliente_n = new Cliente();
            try {
                cliente_n.cadastrarCliente(VG.cpfGenerator(), "Cliente" + id_aux, id_aux);
                Clientes_list.add(cliente_n);
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
        return Clientes_list;
    }
}
