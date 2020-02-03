
package aula10.as8b.exercicio05;

/**
 *
 * @author mac
 */
public class EnsinoMed extends EnsinoBasic{
	private String escola;

	public EnsinoMed(String nome, int codigo, String escola, 
                String escolaMedio, String tipoComissao) {
		super(nome, codigo, escola, tipoComissao);
		super.bonificacao(1.5);
		this.escola = escolaMedio;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

}
