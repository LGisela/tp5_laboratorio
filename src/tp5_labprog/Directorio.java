package tp5_labprog;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.*;
import javax.swing.JOptionPane;

public class Directorio {

    private TreeMap<Long, Contacto> contactos = new TreeMap<>();

    public void AgregarContacto(Contacto contacto) {
        if (contactos.put(contacto.getTelefono(), contacto) == null) {
            JOptionPane.showMessageDialog(null, "El contacto se agrego correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "El contacto ya se encuentra en su lista y fue actualizado!");
        }

    }

    public Contacto BuscarContacto(long telefono) {
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

    public ArrayList<Contacto> buscarContactos(String ciudad) {
          ArrayList<Contacto> resultado = new ArrayList<>();
        for (Contacto contacto : contactos.values()) {
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
                Contacto cont = new Contacto(contacto.getTelefono(), contacto.getDni(), contacto.getNombre(), contacto.getApellido(), contacto.getCiudad(), contacto.getDireccion());
                resultado.add(cont);
                JOptionPane.showMessageDialog(null, "El contacto por ciudad fue encontrando.");
            }
        }
        return resultado;
    }

    public void borrarcontacto(long telefono) {
        if (contactos.remove(telefono) != null) {
            JOptionPane.showMessageDialog(null, "El contacto fue eliminado.");
        } 
    }

    @Override
    public String toString() {
        return "Directorio{" + "contactos=" + contactos + '}';
    }

}
