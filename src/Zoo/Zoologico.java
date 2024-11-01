package Zoo;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

public class Zoologico {
    // ArrayList de animales y Map para conteo por tipo
    ArrayList<Animal> animales;
    Map<String, Integer> conteoPorTipo;

    // Constructor que inicializa el ArrayList y el Map
    public Zoologico() {
        animales = new ArrayList<>();
        conteoPorTipo = new HashMap<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        String tipo = animal.getClass().getSimpleName();
        conteoPorTipo.put(tipo, conteoPorTipo.getOrDefault(tipo, 0) + 1);
    }

    public void mostrarSonidos() {
        for (Animal animal : animales) {
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("Edad: " + animal.getEdad());
            System.out.println("Sonido: " + animal.hacerSonido());
            System.out.println("---------------------------------");
        }
    }

    public void mostrarConteoPorTipo() {
        System.out.println("Conteo por tipo: ");
        for (Map.Entry<String, Integer> entry : conteoPorTipo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Método para guardar el ArrayList de animales en un archivo binario
    public void guardarAnimales(String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(animales);
            System.out.println("Animales guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar el ArrayList de animales desde un archivo binario
    public void cargarAnimales(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            animales = (ArrayList<Animal>) ois.readObject();
            actualizarConteoPorTipo();
            System.out.println("Animales cargados exitosamente desde " + nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Actualiza el conteo por tipo después de cargar animales
    private void actualizarConteoPorTipo() {
        conteoPorTipo.clear();
        for (Animal animal : animales) {
            String tipo = animal.getClass().getSimpleName();
            conteoPorTipo.put(tipo, conteoPorTipo.getOrDefault(tipo, 0) + 1);
        }
    }
}