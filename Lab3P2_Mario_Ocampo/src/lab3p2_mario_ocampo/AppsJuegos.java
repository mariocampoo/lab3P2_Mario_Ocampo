package lab3p2_mario_ocampo;
public class AppsJuegos extends AppsUtilidad{
    protected int EdadRecomendada;

    public AppsJuegos(int EdadRecomendada, String nombre, String desarrollador, int precio, String categoria) {
        super(nombre, desarrollador, precio,categoria);
        this.EdadRecomendada = EdadRecomendada;
    }    
    
    
    
}
