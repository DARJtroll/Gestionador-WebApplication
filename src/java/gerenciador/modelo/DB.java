
package gerenciador.modelo;

import gerenciador.modelo.Empresa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DB {
    private static List<Empresa> listaEmpresas = new ArrayList<>();
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    private static Integer LlaveSecuencial = 1;
    static {
        Empresa empresa1= new Empresa("Empresa Numero 1");
        empresa1.setID(LlaveSecuencial++);
        
        Empresa empresa2= new Empresa("Empresa Numero 2");
        empresa2.setID(LlaveSecuencial++);
        
        Empresa empresa3= new Empresa("Empresa Numero 3");
        empresa3.setID(LlaveSecuencial++);
        
        Empresa empresa4= new Empresa("Empresa Numero 4");
        empresa4.setID(LlaveSecuencial++);
        
        listaEmpresas.add(empresa1);
        listaEmpresas.add(empresa2);
        listaEmpresas.add(empresa3);
        listaEmpresas.add(empresa4);
        
        Usuario usuario1 = new Usuario("david","1234");
        Usuario usuario2 = new Usuario("walter", "1234");
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
        
    }
    
    public void agregarEmpresa(Empresa empresa) {
        empresa.setID(LlaveSecuencial++);
        this.listaEmpresas.add(empresa);
    }
    public List<Empresa> getEmpresas(){
        return this.listaEmpresas;
    }

    public void eliminarEmpresa(Integer id) {
        
        Iterator<Empresa> ite = listaEmpresas.iterator();
        
        while(ite.hasNext()){
            Empresa emp = ite.next();
            
            if(Integer.valueOf(emp.getID()) == id){
                ite.remove();
            }
        }

    }

    public Empresa busacarEmpresaPorId(Integer id) {
        
        
        
        for(Empresa emp : listaEmpresas) {
            if(emp.getID() == id){
                return emp;
            }
        }
        return null;
    }

    public Usuario existeUsuario(String paramUsuario, String paramContrasena) {
        for(Usuario user: listaUsuarios){
            if(paramUsuario.equals(user.getLogin()) && paramContrasena.equals(user.getContrasena())){
                return user;
            }
        }
        return null;
    }
}
