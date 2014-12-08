import java.util.*;

public class Papelaria extends PessoaJuridica {

    private int papelariaId;
    protected String papelariaNome = new String();
    private String papelariaEndereco = new String();
    public List<Estoque> estoque = new ArrayList();

    public void cadastrarPapelaria(int id, String Nome, String endereco) {
        this.setPapelariaId(id);
        this.setPapelariaNome(Nome);
        this.setPapelariaEndereco(endereco);
    }

    public void cadastrarPapelariaRandom() {

    }

    public void editarPapelaria(String Nome, String endereco) {
        this.setPapelariaNome(Nome);
        this.setPapelariaEndereco(endereco);
    }

    public void exibirPapelaria() {
        System.out.println("codigo: " + this.papelariaId);
        System.out.println("Nome: " + this.papelariaNome);
        System.out.println("Endereco: " + this.papelariaEndereco);
    }

    public int getPapelariaId() {
        return papelariaId;
    }

    public void setPapelariaId(int papelariaId) {
        this.papelariaId = papelariaId;
    }

    public String getPapelariaNome() {
        return papelariaNome;
    }

    public void setPapelariaNome(String papelariaNome) {
        this.papelariaNome = papelariaNome;
    }

    public String getPapelariaEndereco() {
        return papelariaEndereco;
    }

    public void setPapelariaEndereco(String papelariaEndereco) {
        this.papelariaEndereco = papelariaEndereco;
    }

}
