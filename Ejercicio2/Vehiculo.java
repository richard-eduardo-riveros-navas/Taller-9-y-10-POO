package Ejercicio2;

public class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se mueve.");
    }
}
class Bicicleta extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("La bicicleta se mueve con pedales.");
    }
}
class PruebaMoverse {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta();

        vehiculo.moverse();
        bicicleta.moverse();
    }
}

