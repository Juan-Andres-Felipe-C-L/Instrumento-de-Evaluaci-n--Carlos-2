public class ItemMenu {
    
    private String id;
    private String nombre;
    private double precio;

    public ItemMenu(){

    }

    public ItemMenu(String id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String obtenerDetalles(){
        return "\n-Id del producto: " + id + "." + "\n-Nombre del producto: " + nombre + "." + "\n-Precio unitario: $" + precio + " COP.";
    }
}
