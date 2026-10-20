class Mascota {
    String nombre, especie;
    int edad;
    double peso;

    Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }
}

public class Ejercicio3Veterinaria {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Max", "Perro", 4, 24.5);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.2);
        Mascota m3 = new Mascota("Luna", "Perro", 6, 18.0);

        Mascota[] mascotas = {m1, m2, m3};
        for (Mascota m : mascotas) {
            System.out.print(m.nombre + " : " + m.especie + " : " + m.peso + " kg");
            if (m.peso > 20) System.out.print(" - Revisar peso");
            System.out.println();
        }

        Mascota m4 = m1;
        m4.edad++;
        System.out.println("Edad de m1 después del cambio: " + m1.edad);
        // m4 y m1 apuntan al mismo objeto; modificarlo mediante m4 también cambia lo que se observa en m1.
    }
}
