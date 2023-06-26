
package gerenciador.modelo;

/**
 *
 * @author Arian
 */
public class Usuario {
    private String login;
    private String contrasena;

    public Usuario(String login, String contrasena) {
        this.login = login;
        this.contrasena = contrasena;
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public boolean esIgual(String usuario,String contra){
        if(this.login.equals(usuario) && this.contrasena.equals(contra)){
            return true;
        }else{
            return false;
        }
        
    }
    
}
