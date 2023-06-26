
package gerenciador.servlet;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;


//@WebFilter(urlPatterns = "/Entrada")
public class MonitoreoFiltro implements Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        
        long antes = System.currentTimeMillis();
        
        filterChain.doFilter(request, response);
        
        
        long despues = System.currentTimeMillis();
        System.out.println("Monitoreo");
        System.out.println("Tiempo ejecucion = '" + (despues-antes) + "' milisec" );
    }
    
}
