package Ejercicio3;

public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

 class Perro extends Animal {
    public void hacerSonidos() { // sin @Override y con el nombre mal escrito
        System.out.println("El perro ladra.");
    }
}

 class PruebaError {
    public static void main(String[] args) {
        Animal animal = new Perro();
        animal.hacerSonido();
    }
}
