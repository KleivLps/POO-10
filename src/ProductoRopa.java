public class ProductoRopa extends Producto{
    private String talla;

    public ProductoRopa() {
    }

    public ProductoRopa(String nombre, double precio, int cantidadStock, String descripcion, String talla) {
        super(nombre, precio, cantidadStock, descripcion);
        this.talla = talla;
    }



    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
