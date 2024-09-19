import java.util.HashMap;
import java.util.Map;

public class Carrito {
    private final Map<Producto, Integer> productos;

    public Carrito() {
        this.productos = new HashMap<>();
    }

    public void agregarProducto(Producto producto, int cantidad) throws  ProductoAgotadoException{
        producto.reducirStock(cantidad);
        productos.put(producto, productos.getOrDefault(producto,0) + cantidad);
    }

    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<Producto, Integer> entry : productos.entrySet()) {
            total += entry.getKey().getPrecio() * entry.getValue();
        }
        return total;
    }

    public void mostrarCarrito() {
        for (Map.Entry<Producto, Integer> entry: productos.entrySet()) {
            System.out.println(entry.getKey().getNombre() + " x" + entry.getValue() + " - $" + (entry.getKey().getPrecio() * entry.getValue()));
        }
        System.out.println("Total: $" +calcularTotal());
    }

    public void vaciarCarrito() {
        productos.clear();
    }
}