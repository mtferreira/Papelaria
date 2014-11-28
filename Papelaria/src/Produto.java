import java.util.*;

/**
 *
 * @author matheus-linux
 */
public class Produto {

    public Scanner input = new Scanner(System.in);

    private int produtoInt;
    private String produtoNome = new String();
    private String produtoCodigoBarras = new String();
    private float produtoPreco;
    private float produtoPeco;
    private Classificacao classificacao;

    public int getProdutoInt() {
        return produtoInt;
    }

    public void setProdutoInt(int produtoInt) {
        this.produtoInt = produtoInt;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public String getProdutoCodigoBarras() {
        return produtoCodigoBarras;
    }

    public void setProdutoCodigoBarras(String produtoCodigoBarras) {
        this.produtoCodigoBarras = produtoCodigoBarras;
    }

    public float getProdutoPreco() {
        return produtoPreco;
    }

    public void setProdutoPreco(float produtoPreco) {
        this.produtoPreco = produtoPreco;
    }

    public float getProdutoPeco() {
        return produtoPeco;
    }

    public void setProdutoPeco(float produtoPeco) {
        this.produtoPeco = produtoPeco;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int id) {    //float classificacao
        this.classificacao.setClassificacaoId(id);

        System.out.println("Informe o nome da classificação");
        this.classificacao.setClassificacaoNome(input.next());

        System.out.println("Informe o nome da classificação");
        this.classificacao.setClassificacaoFaixaErtaria(input.next());
    }

}
