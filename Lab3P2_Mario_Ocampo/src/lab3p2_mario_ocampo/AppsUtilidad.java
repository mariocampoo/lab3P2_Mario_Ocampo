package lab3p2_mario_ocampo;
public class AppsUtilidad {
    protected String nombre;
    protected String desarrollador;
    protected int precio;
    protected String categoria;

    public AppsUtilidad(String nombre, String desarrollador, int precio, String categoria) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.precio = precio;

        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "AppsUtilidad" + "\n"
                + " Nombre = " + nombre + "\n"
                + " Desarrollador = " + desarrollador + "\n"
                + " Precio = " + precio + "\n"
                + " Categoria = " + categoria+ "\n"
                + "";
    }




    
    
}
