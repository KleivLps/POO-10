public class Cliente {
    private String nombre;
    private final Carrito carrito;

    public Cliente() {
        this.carrito = new Carrito();
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.carrito = new Carrito();
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
