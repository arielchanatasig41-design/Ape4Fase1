class Libro {
    String titulo, autor;
    boolean disponible;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
}

class Socio {
    String nombre;
    int librosPrestados;

    Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    void prestar(Libro libro) {
        if (libro.disponible) {
            libro.disponible = false;
            librosPrestados++;
        }
    }
}
