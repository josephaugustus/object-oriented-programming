package aula06.salaAula.endereco;

public class EnderecoTeste {

    public static void main(String[] args) {

        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("GO", "Goiás", pais);
        Municipio municipio = new Municipio(new Long(25300), "Goiânia", estado);
        Bairro bairro = new Bairro("Central", "Setor Central", municipio);
        Logradouro logradouro = new Logradouro("Paranaíba", TipoLogradouro.AVENIDA)
         
        Endereco end = new Endereco("125", "qd")
    }
}
