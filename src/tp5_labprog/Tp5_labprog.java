
package tp5_labprog;

import java.util.ArrayList;
import java.util.Set;
import javax.swing.SwingUtilities;


public class Tp5_labprog {

    
    public static void main(String[] args) {
        
       Formulario formulario = new Formulario(); 
    Directorio directorio=new Directorio();
    
    Contacto c1= new Contacto("33801490","Gisela","Leyria","San Luis","calle granadero",15865386L);
    
    Contacto c2= new Contacto("39456789","juan","sosa","Mendoza","calle dorego",146782342L);
    
    directorio.AgregarContacto(15865386L, c1);
    directorio.AgregarContacto(14678234L, c2);
    
        
        Contacto contactoBuscado = directorio.BuscarContacto(15865386L);
        System.out.println("Contacto encontrado: " + contactoBuscado);

        
        ArrayList<Contacto> contactosSanLuis = directorio.buscarContactos("San Luis");
        System.out.println("Contactos en San Luis: " + contactosSanLuis);

        
        Set<Long> telefonosSosa = directorio.buscarTelefono("Sosa");
        System.out.println("Teléfonos de Sosa: " + telefonosSosa);
        
      
    formulario.setDirectorio(directorio);
        
       
        javax.swing.SwingUtilities.invokeLater(() -> {
            formulario.setVisible(true);
        });
        
    }
}

