import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO: Instancia la clase Scanner
        Scanner Scanner = new Scanner(System.in);
        // TODO: Lee dos números por teclado
            System.out.printIn("Ingrese 1 número");
            double num1= scanner.nextDouble;
            System.out.printIn("Ingrese otro número");
            double num2= scanner.nextDouble;
        // TODO: Calcula y muestra suma, resta, multiplicación y división

        double suma= num1+num2;
        double resta= num1-num2;
        double multiplicacion= num1*num2;
        double division= num1/num2;

        System.out.printIn("Suma: " + suma);
        System.out.printIn("Resta: " + resta);
        System.out.printIn("Multiplicacion: " + multiplicacion);
        System.out.printIn("Division: " + division);
    }
}
