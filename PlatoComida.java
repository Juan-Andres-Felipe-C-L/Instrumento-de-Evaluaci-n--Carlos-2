public class PlatoComida extends ItemMenu{
    
    private boolean esVegetariano;

    public PlatoComida(){

    }

    public PlatoComida(String id, String nombre, double precio, boolean esVegetariano){
        super(id, nombre, precio);
        this.esVegetariano = esVegetariano;   
    }

    public void setEsVegetariano(boolean esVegetariano) {
        this.esVegetariano = esVegetariano;
    }

    public boolean getEsVegetariano(){
        return esVegetariano;
    }

    @Override
    public String obtenerDetalles(){
        String opcion;
        if (esVegetariano) {
            opcion = "Sí.";
        }else{
            opcion = "No.";
        } 
        return "\n-Id del producto: " + getId() + "." + "\n-Nombre del producto: " + getNombre() + "." + "\n-Precio unitario: $" + getPrecio() + " COP." + "\n-¿Es un producto vegetariano? " + opcion;
    }
}
