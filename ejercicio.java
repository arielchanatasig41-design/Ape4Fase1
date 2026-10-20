class Estudiante {
    String nombre;
    double nota1, nota2, nota3, promedio;

    Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3.0;
    }

    String estado() {
        if (promedio >= 7) return "Aprobado";
        if (promedio >= 5) return "Supletorio";
        return "Reprobado";
    }
}

public class Ejercicio1Notas {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Ana", 8, 9, 7),
            new Estudiante("Luis", 6, 5, 7),
            new Estudiante("Marta", 4, 3, 5),
            new Estudiante("Pedro", 9, 8, 10),
            new Estudiante("Sofia", 7, 6, 8)
        };

        int aprobados = 0;
        for (Estudiante e : estudiantes) {
            e.calcularPromedio();
            System.out.printf("%s : %.2f - %s%n",
                    e.nombre, e.promedio, e.estado());
            if (e.promedio >= 7) aprobados++;
        }
        System.out.println("Total de estudiantes aprobados: " + aprobados);
    }
}
