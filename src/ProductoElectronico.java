public class ProductoElectronico extends Producto{
    private int garantiaMeses;

    public ProductoElectronico() {
    }

    public ProductoElectronico(String nombre, double precio, int cantidadStock, String descripcion, int garantiaMeses) {
        super(nombre, precio, cantidadStock, descripcion);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
}
