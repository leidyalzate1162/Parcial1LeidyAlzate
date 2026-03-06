public class ObjProducto {
    
    private String Nombre;
    private int Cantidad;
    
    public ObjProducto(String nombre, int cantidad) {
        Nombre = nombre;
        Cantidad = cantidad;
    }
    public ObjProducto() {
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }    
    
}