public class Bebida extends ItemMenu{
    
    private int volumenML;

    public Bebida(){

    }

    public Bebida(String id, String nombre, double precio, int volumenML){
        super(id, nombre, precio);
        this.volumenML = volumenML;    
    }

    public void setVolumenML(int volumenML) {
        this.volumenML = volumenML;
    }

    public int getVolumenML() {
        return volumenML;
    }

    @Override
    public String obtenerDetalles(){
        return "\n-Id del producto: " + getId() + "." + "\n-Nombre del producto: " + getNombre() + "." + "\n-Precio unitario: $" + getPrecio() + " COP." + "\n-Volumen de la bebida: " + volumenML + " ML.";
    }
}
