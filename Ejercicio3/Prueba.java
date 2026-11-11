package Ejercicio3;

class Animal {
    private String especie; // privado

    public Animal(String especie) {
       this.especie = especie;
    }
}
class Perro extends Animal {
        private String raza;

        public Perro(String especie, String raza) {
            super(especie);
            this.raza = raza;
        }

        public void mostrar() {
            //System.out.println("La especie es: "+super.especie);
            System.out.println("La raza es: "+raza);
        }
}
public class Prueba {
    public static void main(String[] args) {
        Perro a = new Perro("mamifero","bulldog");
        a.mostrar();
    }
}
