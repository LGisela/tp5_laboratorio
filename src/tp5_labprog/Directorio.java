
package tp5_labprog;

import static java.lang.reflect.Array.set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.*;

public class Directorio {
    private TreeMap<Long, Contacto> contactos = new TreeMap<>();
  
    
    public void AgregarContacto(String telefono,Contacto contacto){
         contactos.get(telefono);
    
    }
    public Contacto BuscarContacto(long telefono){
        return contactos.get(telefono);
    
    }
    
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : contactos.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }
        public ArrayList<Contacto> buscarContactos(String ciudad){
            ArrayList<Contacto>resultado=new ArrayList<>();
            for (Contacto contacto:contactos.values()){
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)){
                resultado.add(contacto);
            }}
        return resultado;
        }
        
        public void borrarcontacto(long telefono){
        contactos.remove(telefono);
        }

    @Override
    public String toString() {
        return "Directorio{" + "contactos=" + contactos + '}';
    }
        
        
        
}




            
            
            
        
    
    
    
    
    


