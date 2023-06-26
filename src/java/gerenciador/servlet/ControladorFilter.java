package gerenciador.servlet;

import gerenciador.accion.Contrato;
import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

//@WebFilter(urlPatterns = {"/Entrada"})
public class ControladorFilter implements Filter {

    @Override
    public void doFilter(ServletRequest ServRequest, ServletResponse ServResponse, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest  request = (HttpServletRequest) ServRequest;
        HttpServletResponse response = (HttpServletResponse) ServResponse;
        
        System.out.println("Controlador");
        
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
        }

        //chain.doFilter(ServRequest, ServResponse);
    }
    
}
