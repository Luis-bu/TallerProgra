package Zoo;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Creamos un Zoologico
        Zoologico zoo = new Zoologico();

        //Creamos 2 gatos y 2 perros
        Gato gato1 = new Gato("Michi", 5);
        Gato gato2 = new Gato("Gatito", 3);
        Perro perro1 = new Perro("Manchas", 7, "Daltamata");
        Perro perro2 = new Perro("Max", 8, "Shiba inu");

        //Agregamos los animales
        zoo.agregarAnimal(gato1);
        zoo.agregarAnimal(gato2);
        zoo.agregarAnimal(perro1);
        zoo.agregarAnimal(perro2);

        //Mostramos los sonidos
        zoo.mostrarSonidos();
        zoo.mostrarConteoPorTipo();


    }
}

