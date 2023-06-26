
package gerenciador.accion;

import gerenciador.modelo.DB;
import gerenciador.modelo.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author Arian
 */
public class login implements Contrato{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        String paramUsuario = request.getParameter("usuario");
        String paramContrasena = request.getParameter("contrasena");
        
        DB base = new DB();
        
        Usuario user = base.existeUsuario(paramUsuario,paramContrasena);
        
        if (user!=null){
            
            HttpSession session = request.getSession();
            session.setAttribute("LogUsuario", user);
            
            return "redirect:Entrada?accion=ListarEmpresa";
            
        }
        return "redirect:Entrada?accion=formLogin";
    }
    
}
