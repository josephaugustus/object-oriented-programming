package aula10.as8b.exercicio05;

/**
 *
 * @author mac
 */
public class EnsinoBasic extends BaixaEscolaridade {

    private String escola;

    public EnsinoBasic(String nome, int codigo, String escola, String tipoBonificacao) {
        super(nome, codigo, tipoBonificacao);
        super.bonificacao(1.1);
        this.escola = escola;

    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}
