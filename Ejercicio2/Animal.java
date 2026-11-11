package Ejercicio2;

public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}
class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // constructor de la clase base
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // método de la clase base
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
class PruebaAnimalPez {
    public static void main(String[] args) {
        Pez pez = new Pez("Ejercicio2.Pez payaso", "Salada");
        pez.mostrarEspecie();
    }
}
