public class Main {
    public static void main(String[] args) {
        System.out.println("=== Clínica Veterinaria ===");

        // PRUEBA DE MASCOTA
        Mascota m1 = new Mascota("Firulais", "Perro", "Labrador", 5, 20.5);

        System.out.println(m1);

        System.out.println("¿Es adulto? " + m1.esAdulto());
        System.out.println("¿Peso normal? " + m1.estaEnPesoNormal(10, 25));
    }
}