import java.util.*;

/**
 *
 * @author matheus-linux
 */
public class Trabalho {

    public int trabalhoId;
    public int funcionarioId;
    public int papelariaId;
    public int setorId;

    public void cadastrarTrabalho(int funcionarioId, int papelariaId) {
        this.setFuncionarioId(funcionarioId);
        this.setPapelariaId(papelariaId);
    }

    public int getTrabalhoId() {
        return trabalhoId;
    }

    public void setTrabalhoId(int trabalhoId) {
        this.trabalhoId = trabalhoId;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public int getPapelariaId() {
        return papelariaId;
    }

    public void setPapelariaId(int papelariaId) {
        this.papelariaId = papelariaId;
    }

    public int getSetorId() {
        return setorId;
    }

    public void setSetorId(int setorId) {
        this.setorId = setorId;
    }

}
