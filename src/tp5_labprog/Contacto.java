package tp5_labprog;

/**
 *
 * @author HP-PAVILION
 */
public class Contacto {

    private long telefono;

    private String dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Contacto() {
    }

    
    public Contacto(Long telefono,String dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "contacto : DNI=" + dni + "nombre :" + nombre + "apellido" + apellido
                + "ciudad : " + ciudad + "direccion: " + direccion;
    }

}
