package aula10.as8b.exercicio05;

/**
 *
 * @author mac
 */
public class BaixaEscolaridade extends Funcionario {

    private String tipoBonificacao;

    public BaixaEscolaridade(String nome, int codigo,
            String tipoBonificacao) {
        super(nome, codigo);
        super.bonificacao(1);
        this.tipoBonificacao = tipoBonificacao;

        if (this.tipoBonificacao == "Gerente") {
            super.setAdicional(1500.00);
        }
        if (this.tipoBonificacao == "Supervisor") {
            super.setAdicional(600.00);
        }
        if (this.tipoBonificacao == "Vendedor") {
            super.setAdicional(250.00);
        }

    }

    public String getTipoBonificacao() {
        return tipoBonificacao;
    }

    public void setTipoBonificacao(String tipoComissao) {
        this.tipoBonificacao = tipoBonificacao;
    }
}
