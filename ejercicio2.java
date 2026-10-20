class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}

public class Ejercicio2Inventario {
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto("Cuaderno", 2.50, 8),
            new Producto("Esfero", 0.75, 10),
            new Producto("Mochila", 18.00, 6),
            new Producto("Regla", 1.00, 4)
        };

        // Se venden 3 unidades de Cuaderno y 3 de Mochila.
        productos[0].stock -= 3;
        productos[2].stock -= 3;

        double total = 0;
        for (Producto p : productos) {
            System.out.print(p.nombre + " : $" +
                    String.format("%.2f", p.precio));
            if (p.stock < 5) System.out.print(" - Reponer");
            System.out.println(" (stock: " + p.stock + ")");
            total += p.precio * p.stock;
        }
        System.out.printf("Valor total del inventario: $%.2f%n", total);
    }
}
