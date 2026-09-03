import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad")
        int edad = scanner.nextInt();

  
        if (edad=>18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }

    }
}
