package objects;

public class Item {
    private Producto producto;
    private int cantidad;

    public Item(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void agregarCantidad(){
      this.cantidad++;
    }
}
