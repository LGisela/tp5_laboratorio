
package tp5_labprog;

/**
 *
 * @author HP-PAVILION
 */
public class Tp5_labprog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Directorio directorio=new Directorio();
    
    Contacto c1= new Contacto(15865386L,"33801490","gisela","leyria","Sanluis","calle granadero");
    
    Contacto c2= new Contacto(146782342L,"146782342","juan","sosa","Mendoza","calle dorego");
    
//    directorio.AgregarContacto("15865386", c1);
//    directorio.AgregarContacto("146782342", c2);
    
    directorio.AgregarContacto(c1);
    directorio.AgregarContacto(c2);
    
    directorio.BuscarContacto(15865386);
    directorio.buscarContactos("Sanluis");
    directorio.buscarTelefono("sosa");
    directorio.borrarcontacto(1467823421);
        System.out.println("nuevo directorio :" + directorio);
        
    Formulario form = new Formulario(directorio);
    form.setVisible(true);
    form.setLocationRelativeTo(null);
    
    }
    
    
    
    
    
}
