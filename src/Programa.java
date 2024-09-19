public class Programa {
    public static void main(String[] args) {
        Producto[] inventario = {
                new ProductoElectronico("Laptop", 1350, 10, "Laptop basica para homeoffice", 20),
                new ProductoRopa("polo", 130, 15, "Polo de algodon y poliester de colores varios", "M"),
                new ProductoRopa("Polera", 200, 20, "Polera de algodon con detalles texturizados", "S")
        };

        Cliente cliente = new Cliente("Kleiver");

        MenuServicio.mostrarMenu(cliente, inventario);
    }
}
