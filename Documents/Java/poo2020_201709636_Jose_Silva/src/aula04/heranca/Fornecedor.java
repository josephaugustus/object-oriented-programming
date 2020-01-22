package aula04.heranca;

public class Fornecedor extends PessoaJuridica{

    private String produtos;
    
    public Fornecedor(String nome, String endereco,
        String telefone, String cnpj, String razaoSocial) {

        super(nome, endereco, telefone);
        this.produtos = produtos;
    }
}
