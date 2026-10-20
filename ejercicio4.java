class Cuenta {
    String titular;
    double saldo;

    Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class Ejercicio4Ahorro {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Andrea", 200);
        Cuenta c2 = new Cuenta("Carlos", 350);

        int meses1 = 0;
        while (c1.saldo < 500) {
            c1.saldo += 50;
            meses1++;
            System.out.printf("%s : $%.2f%n", c1.titular, c1.saldo);
        }
        System.out.println("Meses de " + c1.titular + ": " + meses1);
        System.out.println();

        int meses2 = 0;
        while (c2.saldo < 500) {
            c2.saldo += 50;
            meses2++;
            System.out.printf("%s : $%.2f%n", c2.titular, c2.saldo);
        }
        System.out.println("Meses de " + c2.titular + ": " + meses2);
    }
}
