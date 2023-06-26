
package gerenciador.modelo;

import java.util.Date;

public class Empresa {
    
    
    private Integer ID;
    private String nombre;
    private Date fechaAbetura = new Date();

    public Empresa(String Nombre) {
        this.nombre = Nombre;
    }

    public Empresa() {
    }
    
        
    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public Date getFechaAbetura() {
        return fechaAbetura;
    }

    public void setFechaAbetura(Date fechaAbetura) {
        this.fechaAbetura = fechaAbetura;
    }
    
}
