/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package gerenciador.servlet;

import gerenciador.accion.Contrato;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arian
 */
@WebServlet(name = "unicaEntradaServlet", urlPatterns = {"/Entrada"})
public class unicaEntradaServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        /*
        HttpSession session = request.getSession();
        
        boolean isUsuario = (session.getAttribute("LogUsuario") == null);
        boolean isAccionProtegida = !(param.equals("formLogin") ||  param.equals("login"));
        if(isUsuario && isAccionProtegida){
            response.sendRedirect("redirect:Entrada?accion=formLogin");
            return;
        }

        // AAA
        
        String param = request.getParameter("accion");
        String nombreAccion = null;
        String nombreDeClase = "gerenciador.accion."+param;
        Class clase = null;
        
        Object obj = null;
        try {
            clase = Class.forName(nombreDeClase);
            obj = clase.newInstance();
            Contrato objContracto = (Contrato)obj;
            nombreAccion = objContracto.ejecutar(request, response);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(unicaEntradaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        String[] arreglo = nombreAccion.split(":");
        if(arreglo[0].equals("forward")){
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view"+arreglo[1]);
            rd.forward(request, response);
        }else{
            response.sendRedirect(arreglo[1]);
        }*/
    }

}
