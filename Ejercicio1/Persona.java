package Ejercicio1;

public class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}
class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante y estoy aprendiendo Java.");
    }
}
class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor y enseño programación.");
    }
}
class PruebaPresentarse {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Estudiante();
        Persona persona3 = new Profesor();

        persona1.presentarse();
        persona2.presentarse();
        persona3.presentarse();
    }
}

