package Zoo;

public class Gato extends Animal{

    //Constructor
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    //Metodo sobreescrito
    @Override
    public String hacerSonido()
    {
        return "El gato maulla";
    }
}
