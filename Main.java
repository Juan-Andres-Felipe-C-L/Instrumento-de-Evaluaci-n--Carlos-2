public class Main {
    public static void main(String[] args) {
        PlatoComida orden = new PlatoComida("adada", "COCa", 1000, true);
        String respuesta =orden.obtenerDetalles();
        System.out.println(respuesta);
    }
}
