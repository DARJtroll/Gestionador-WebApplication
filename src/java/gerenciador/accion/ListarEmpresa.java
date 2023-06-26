
package gerenciador.accion;

import gerenciador.modelo.DB;
import gerenciador.modelo.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class ListarEmpresa implements Contrato{

    public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        
        DB base = new DB();
        List<Empresa> listaEmpresas = base.getEmpresas();    
        
        
        
        request.setAttribute("empresas",listaEmpresas);
        
        
        
        return "forward:/ListaEmpresas.jsp";
    }
    
}
