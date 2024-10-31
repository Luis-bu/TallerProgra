package Zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoologico {
    //Arraylist de animales
    ArrayList<Animal> animales;
    Map<String, Integer> conteoPorTipo;

    //Constructor que incializa el Arraylist
    public Zoologico() {
        animales = new ArrayList<>();
        conteoPorTipo = new HashMap<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        String tipo = animal.getClass().getSimpleName();
        conteoPorTipo.put(tipo, conteoPorTipo.getOrDefault(tipo, 0) + 1);
    }

    public void mostrarSonidos()
    {
        for (Animal animal : animales)
        {
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("Edad: " + animal.getEdad());
            System.out.println("Sonido: " + animal.hacerSonido());
            System.out.println("---------------------------------");
        }
    }

    public void mostrarConteoPorTipo()
    {
        System.out.println("Conteo por tipo: ");
        for (Map.Entry<String, Integer> entry : conteoPorTipo.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
