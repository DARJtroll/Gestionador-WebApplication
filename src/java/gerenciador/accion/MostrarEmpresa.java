/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador.accion;

import gerenciador.modelo.DB;
import gerenciador.modelo.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Arian
 */
public class MostrarEmpresa implements Contrato{
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String param = request.getParameter("id");
        
        Integer id = Integer.valueOf(param);
        
        DB db = new DB();
        Empresa emp = db.busacarEmpresaPorId(id);
        
        request.setAttribute("empresa",emp);
        
        return "forward:/formModificarEmpresa.jsp";
        
    }
}
