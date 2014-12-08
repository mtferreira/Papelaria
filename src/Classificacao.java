import java.util.*;

/**
 *
 * @author matheus-linux
 */
public class Classificacao {
    
    public Scanner input = new Scanner(System.in);
    
    private int classificacaoId;
    private String classificacaoNome = new String();
    private String classificacaoFaixaErtaria = new String();

    public int getClassificacaoId() {
        return classificacaoId;
    }

    public void setClassificacaoId(int classificacaoId) {
        this.classificacaoId = classificacaoId;
    }

    public String getClassificacaoNome() {
        return classificacaoNome;
    }

    public void setClassificacaoNome(String classificacaoNome) {
        this.classificacaoNome = classificacaoNome;
    }

    public String getClassificacaoFaixaErtaria() {
        return classificacaoFaixaErtaria;
    }

    public void setClassificacaoFaixaErtaria(String classificacaoFaixaErtaria) {
        this.classificacaoFaixaErtaria = classificacaoFaixaErtaria;
    }
}
