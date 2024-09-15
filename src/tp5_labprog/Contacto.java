
package tp5_labprog;


public class Contacto {
    
    private String dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private Long telefono;

    public Contacto(String dni, String nombre, String apellido, String ciudad, String direccion, Long telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }


    


    @Override
    public String toString() {
        return "contacto : DNI :" + dni + "nombre :" +nombre + " apellido : " + apellido +
                "ciudad : " + ciudad + "direccion: " + direccion+ " telefono : " + telefono;
    }
    
    
    
}
