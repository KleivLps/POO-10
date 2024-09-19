public class Producto {
    private String nombre;
    private double precio;
    private int cantidadStock;
    private String descripcion;

    public Producto(){
    }

    public Producto(String nombre, double precio, int cantidadStock, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void reducirStock(int cantidad) throws ProductoAgotadoException {
        if (cantidad > cantidadStock) {
            throw new ProductoAgotadoException("Stock insuficiente para el producto: " + nombre);
        }
        this.cantidadStock -= cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return nombre + " - S/" + precio + " - "+descripcion+" - "  + cantidadStock +  " en stock.";
    }
}
