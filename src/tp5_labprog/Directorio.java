
package tp5_labprog;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.*;

public class Directorio {
    private TreeMap<Long, Contacto> contactos;//= new TreeMap<>();
  private TreeMap<String, TreeSet<Long>> telefonosPorApellido;
    private TreeMap<String, TreeSet<Contacto>> contactosPorCiudad;

    public Directorio() {
        this.contactos = new TreeMap<>();
        this.telefonosPorApellido = new TreeMap<>();
        this.contactosPorCiudad = new TreeMap<>();
    }

    
    
    
    public void AgregarContacto(long telefono,Contacto contacto){
         contactos.put(telefono, contacto);
    telefonosPorApellido.computeIfAbsent(contacto.getApellido(),k ->new TreeSet <>()).add(telefono);
   contactosPorCiudad.computeIfAbsent(contacto.getCiudad(), k -> new TreeSet<>(Comparator.comparing(Contacto::getTelefono)))
            .add(contacto);    
    }
    public Contacto BuscarContacto(long telefono){
        return contactos.get(telefono);
    
    }
    
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new HashSet<>();
        for (Contacto contacto : contactos.values()) {
            if (contacto.getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(contacto.getTelefono());
            }
        }
        return telefonos;
    }
       
        
        
        
    
        public ArrayList<Contacto> buscarContactos(String ciudad){
            ArrayList<Contacto> contactosCiudad = new ArrayList<>();
        for (Contacto contacto : contactos.values()) {
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
                contactosCiudad.add(contacto);
            }
        }
        return contactosCiudad;
            
            
            
            
            
        }
        
        public void borrarcontacto(long telefono){
        Contacto contacto=contactos.remove(telefono);
        if (contacto != null) {
            telefonosPorApellido.getOrDefault(contacto.getApellido(), new TreeSet<>()).remove(telefono);
            contactosPorCiudad.getOrDefault(contacto.getCiudad(), new TreeSet<>()).remove(contacto);
        
        
        }
        }
        
        
    @Override
    public String toString() {
        return "Directorio " + "contactos=" + contactos ;
    }
        
        
        
}




            
            
            
        
    
    
    
    
    


