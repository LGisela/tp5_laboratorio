
package tp5_labprog;


public class Tp5_labprog {


    public static void main(String[] args) {
    Directorio directorio=new Directorio();
    
    Contacto c1= new Contacto(15865386L,"33801490","gisela","leyria","Sanluis","calle granadero");
    
    Contacto c2= new Contacto(146782342L,"146782342","juan","sosa","Mendoza","calle dorego");
    
    Contacto c3= new Contacto(196587432L,"196587432","gaston","frias","Merlo","calle lainez");
    
    Contacto c4= new Contacto(684932158L,"684932158","valentina","perez","bolivar","calle baigorria");
    


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
