package aula13.salaAula.excecao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FormataData {

    public Date formataString(String newDate) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        return formato.format(newDate);
    }
}
