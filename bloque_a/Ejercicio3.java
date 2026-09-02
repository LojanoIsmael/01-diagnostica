import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Leer la edad con Scanner
        System.out.printIn("Ingrese su edad")
        int edad = scanner.nextInt();

        // TODO: Evaluar con if / else si es mayor o menor de edad
        if (edad=>18){
            System.out.printIn("Es mayor de edad");
        }else{
            System.out.printIn("Es menor de edad");
        }

    }
}
