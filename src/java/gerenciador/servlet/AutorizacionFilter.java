package gerenciador.servlet;

import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebFilter(urlPatterns = {"/Entrada"})
public class AutorizacionFilter implements Filter {

    @Override
    public void doFilter(ServletRequest ServRequest, ServletResponse ServResponse, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest  request = (HttpServletRequest) ServRequest;
        HttpServletResponse response = (HttpServletResponse) ServResponse;
        
        System.out.println("Autorizacion");
        
        String param = request.getParameter("accion");
        HttpSession session = request.getSession();
        
        boolean isUsuario = (session.getAttribute("LogUsuario") == null);
        boolean isAccionProtegida = !(param.equals("formLogin") ||  param.equals("login"));
        if(isUsuario && isAccionProtegida){
            response.sendRedirect("redirect:Entrada?accion=formLogin");
            return;
        }
        chain.doFilter(ServRequest, ServResponse);
    }
    
}
