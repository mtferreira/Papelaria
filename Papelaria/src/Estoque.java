import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheus-linux
 */
public class Estoque {

    public Scanner input = new Scanner(System.in);
    protected int estoqueId;
    protected String estoqueLocalizacao;
    public Map<Produto, Integer> estoque = new HashMap();

    public void cadastraEstoque(int id, String location, int qtd_produtos) {
        this.setEstoqueId(id);
        this.setEstoqueLocalizacao(location);
        for (int i = 0; i < qtd_produtos; i++) {
            Produto produto = new Produto();
            produto.setProdutoInt(i);
            System.out.println("Nome do produto:");
            produto.setProdutoNome(input.next());
            produto.setClassificacao(i);
        }
    }

    public void editarEstoque(String location) {
        this.setEstoqueLocalizacao(location);
    }

    public boolean excluirEstoque() {
        try {
            this.finalize();
            return true;
        } catch (Throwable ex) {
            Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void exibirEstoque() {
        System.out.println("Código do Estoque = " + this.getEstoqueId());
        System.out.println("Localização do Estoque = " + this.getEstoqueLocalizacao());
    }

    public String getEstoqueLocalizacao() {
        return estoqueLocalizacao;
    }

    public void setEstoqueLocalizacao(String estoqueLocalizacao) {
        this.estoqueLocalizacao = estoqueLocalizacao;
    }

    public int getEstoqueId() {
        return estoqueId;
    }

    public void setEstoqueId(int estoqueId) {
        this.estoqueId = estoqueId;
    }

}
