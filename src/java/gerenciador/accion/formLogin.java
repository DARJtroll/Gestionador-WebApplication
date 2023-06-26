/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador.accion;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Arian
 */
public class formLogin implements Contrato{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return "forward:/formLogin.jsp";
    }
    
}
