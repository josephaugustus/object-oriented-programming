package aula06.salaAula.endereco;

public class EnderecoTeste {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pais pais = new Pais("Brasil");
        Estado goias = new Estado("GO", "Goiás", pais);
        Municipio municipio = new Municipio(new Long(25300),
                "Goiânia", goias);
        Bairro bairro = new Bairro("Central", "Setor Central", municipio);
        Logradouro log = new Logradouro("Paranaíba", TipoLogradouro.AVENIDA);

        Endereco end = new Endereco("125", "qd.45 lt. 26A", 74135967,
                "Residencial", bairro, log);

        System.out.println(end.toString());
    }

}
