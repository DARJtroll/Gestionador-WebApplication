/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador.accion;

import gerenciador.modelo.DB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Arian
 */
public class EliminarEmpresa implements Contrato{
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String param = request.getParameter("id");
        
        Integer id = Integer.valueOf(param);
        
        DB db = new DB();
        db.eliminarEmpresa(id);
        
        return "response:Entrada?accion=ListarEmpresa";
    }
}
