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
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Arian
 */
public class NuevaEmpresa implements Contrato{
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
                
            String nombreEmpresa = request.getParameter("nombre");
            String fecha = request.getParameter("fechaAbertura"); 
            Empresa empresa = new Empresa();
            empresa.setNombre(nombreEmpresa);
            
            
        try {
            SimpleDateFormat ft = new SimpleDateFormat("dd/mm/yyyy");
            empresa.setFechaAbetura(ft.parse(fecha));
        } catch (ParseException ex) {
            fecha = ex.toString();
        }
        
            DB basedatos = new DB();
        
            basedatos.agregarEmpresa(empresa);
        
            System.out.println(empresa.getNombre());
            
            return "redirect:Entrada?accion=ListarEmpresa";
    }
}
