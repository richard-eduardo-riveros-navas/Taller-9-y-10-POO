package Ejercicio1;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
class PruebaPersonaEmpleado {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 30);
        Empleado empleado = new Empleado("Laura", 25, "Sistemas");

        persona.mostrarDetalles();
        System.out.println("---");
        empleado.mostrarDetalles();
    }
}
