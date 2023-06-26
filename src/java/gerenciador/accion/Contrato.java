
package gerenciador.accion;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Arian
 */
public interface Contrato {
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
