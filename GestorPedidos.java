public class GestorPedidos {
    
    private ItemMenu[] pedidos;
    private int indice;

    public GestorPedidos(){

    }

    public GestorPedidos(int indice){
        this.indice = indice;
    }

    public void setIndice(int indice){
        this.indice = indice;
    }

    public int getIndice(){
        return indice;
    }

    public void agregarItem(ItemMenu item){
        pedidos = new ItemMenu[indice];
        for(int i = 0; i < pedidos.length; i++){
            pedidos[i] = item;
        }
    }
}
