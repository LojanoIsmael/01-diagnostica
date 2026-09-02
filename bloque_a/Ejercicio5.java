public class Ejercicio5 {

    // TODO: Define la función estática calcularPromedio(double a, double b)
    public static doublecalcularPromedio(double a, double b){
        return(a+b)/2;
    } 

    public static void main(String[] args) {
        // TODO: Prueba la función calcularPromedio
        double promedio= calcularPromedio();
        System.out.printIn("Promedio: " + promedio);

        // TODO: Instancia la clase Estudiante y llama a su método mostrarFicha()
        Estudiante estudiante = new Estudiante("Ismael", 18, "Informática"); 
        estudiante.mostrarFicha();


    }
}

// TODO: Crea aquí la clase Estudiante con sus atributos, constructor y métodos
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
        System.out.printIn("Nombre: " + nombre);
        System.out.printIn("Edad: " + edad);
        System.out.printIn("Carrera: " + carrera);
    }
}