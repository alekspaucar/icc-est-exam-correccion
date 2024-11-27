package Models;


public class Persona {
    String nombre; // Almacena el nombre de la carro
    int edad; // Almacena la edad de la carro


    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Asigna el nombre pasado al atributo nombre de la clase
        this.edad = edad; // Asigna la edad pasada al atributo edad de la clase
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
@Override
    public String toString(){
        return "Persona {nombre = "+nombre+",edad = "+edad+"}";
    }
}