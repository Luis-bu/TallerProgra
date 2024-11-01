package Zoo;
import java.io.Serializable;
public class Gato extends Animal implements Serializable{

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
