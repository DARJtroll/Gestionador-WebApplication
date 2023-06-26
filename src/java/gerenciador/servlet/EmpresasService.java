/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package gerenciador.servlet;

import com.google.gson.Gson;
import gerenciador.modelo.DB;
import gerenciador.modelo.Empresa;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author Arian
 */
@WebServlet(name = "EmpresasService", urlPatterns = {"/Empresas"})
public class EmpresasService extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        List<Empresa> lista = new DB().getEmpresas();
        
        Gson son = new Gson();
        String json = son.toJson(lista);
        
        response.setContentType("Application/json");
        response.getWriter().print(json);
        
    }

}
