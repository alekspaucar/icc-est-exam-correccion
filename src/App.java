
import Controllers.PersonaController;
import Models.Persona;

public class App {
        public static void main(String[] args) throws Exception {
                Persona[] personas = {
                                new Persona("Anais", 25),
                                new Persona("Luis", 32),
                                new Persona("Carlos", 40),
                                new Persona("María", 19),
                                new Persona("José", 45),
                                new Persona("Laura", 30),
                                new Persona("Pedro", 28),
                                new Persona("Marta", 35),
                                new Persona("Jorge", 50),
                                new Persona("Sofía", 22),
                                new Persona("Raúl", 18),
                                new Persona("Patricia", 29),
                                new Persona("Andrés", 41),
                                new Persona("Elena", 24),
                                new Persona("Manuel", 38),
                                new Persona("Isabel", 34),
                                new Persona("Gabriel", 42),
                                new Persona("Claudia", 26),
                                new Persona("Fernando", 31),
                                new Persona("Paula", 20),
                                new Persona("Diego", 36),
                                new Persona("Rosa", 27),
                                new Persona("Rubén", 44),
                                new Persona("Teresa", 33),
                                new Persona("Iván", 17),
                                new Persona("Julia", 21),
                                new Persona("Adriana", 39),
                                new Persona("Sergio", 48),
                                new Persona("Lorena", 23),
                                new Persona("Miguel", 52)
                };
              
        PersonaController controller = new PersonaController();
        // Ordenar por edad en orden descendente
        controller.ordenarPorEdadDescendente(personas);
        System.out.println("Personas ordenadas por edad (descendente):");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        // Buscar por edad
        int[] edades = {25, 70};
        for (int edad : edades) {
            int index = controller.buscarEdad(personas, edad);
            if (index != -1) {
                System.out.println("Encontrado: " + personas[index] + " en la posición " + index);
            } else {
                System.out.println("Edad " + edad + " no encontrada.");
            }
        }
        // Ordenar por nombre en orden ascendente
        controller.ordenarPorNombreAscendente(personas);
        System.out.println("\nPersonas ordenadas por nombre (ascendente):");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        // Buscar por nombre
        String[] nombres = {"Anais", "Miguel"};
        for (String nombre : nombres) {
            int index = controller.buscarPorNombre(personas, nombre);
            if (index != -1) {
                System.out.println("Encontrado: " + personas[index] + " en la posición " + index);
            } else {
                System.out.println("Nombre \"" + nombre + "\" no encontrado.");
            }
        }
    }
}