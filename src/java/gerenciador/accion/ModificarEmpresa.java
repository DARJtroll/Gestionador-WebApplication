/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador.accion;

import gerenciador.modelo.DB;
import gerenciador.modelo.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Arian
 */
public class ModificarEmpresa implements Contrato{
    
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String nombreEmpresa = request.getParameter("nombre");
        String fecha = request.getParameter("fechaAbertura");
        String strId = request.getParameter("id");
        Integer id = Integer.valueOf(strId);
            
        Empresa empresa = new Empresa();
        empresa.setNombre(nombreEmpresa);
            
        SimpleDateFormat ft = new SimpleDateFormat("dd/mm/yyyy");    
        Date fechaReg = new Date();
        try {
  
            empresa.setFechaAbetura(ft.parse(fecha));

            fechaReg = ft.parse(fecha);
        } catch (ParseException ex) {
            fecha = ex.toString();
        }
        
            DB basedatos = new DB();
            Empresa emp =basedatos.busacarEmpresaPorId(id);
            
            emp.setNombre(nombreEmpresa);
            emp.setFechaAbetura(fechaReg);
            
            return "redirect:Entrada?accion=ListarEmpresa";
    
    }
}
