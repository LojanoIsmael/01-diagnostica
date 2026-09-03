public class Ejercicio5 {

    public static doublecalcularPromedio(double a, double b){
        return(a+b)/2;
    } 

    public static void main(String[] args) {
        double promedio= calcularPromedio();
        System.out.println("Promedio: " + promedio);

        // TODO: Instancia la clase Estudiante y llama a su método mostrarFicha()
        Estudiante estudiante = new Estudiante("Ismael", 18, "Informática"); 
        estudiante.mostrarFicha();


    }
}

class Estudiante {
    String nombre;
    int edad;
    String carrera;

    public Estudiante(String nombre, int edad, String carrera){
        this.nombre=nombre;
        this.edad=edad;
        this.carrera=carrera;
    }
    public void mostrarFicha(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
}