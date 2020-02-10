package aula11.as9b.exercicio01;

import java.io.InputStream;
import java.net.ContentHandler;

/**
 *
 * @author mac
 */
public interface XMLReader {

    public void setContentHandler(ContentHandler handler);

    public void parse(InputStream is);
}
