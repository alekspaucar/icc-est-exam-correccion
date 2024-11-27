package Controllers;
import Models.Persona;
public class PersonaController {


    public void ordenarPorEdadDescendente(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            int aux=i;
            for (int j = i+1 ; j < personas.length; j++) {
            if (personas[j].getEdad()>personas[aux].getEdad()) {
                aux=j;

                }

            }
            Persona temp = personas[i];
            personas[i] = personas[aux];
            personas[aux] = temp;
        }
    }
    public int buscarEdad(Persona[] personas ,int edad){
        int inicio = 0;
        int fin = personas.length;
        while(inicio<=fin){
            int medio = (inicio + fin)/2;
            if(personas[medio].getEdad() == edad){
                return medio;
            }else if (personas[medio].getEdad() < edad) {
                fin= medio - 1;
            }else{
                inicio=medio+1;
            }
        }
        return -1;
    }
    public void ordenarPorNombreAscendente(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona clave = personas[i];
            int j = i - 1;
    
            // Comparar nombres directamente
            while (j >= 0 && personas[j].getNombre().compareTo(clave.getNombre()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = clave; // Asignar la clave a la posición correcta
        }
    }
    public int buscarPorNombre(Persona[] personas, String nombre) {
        int inicio = 0;
        int fin = personas.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int comparacion = personas[medio].getNombre().compareTo(nombre);
            if (comparacion == 0) {
                return medio;
            } else if (comparacion > 0) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1; 
    }

}
