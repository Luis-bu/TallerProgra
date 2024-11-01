package Zoo;
import java.io.Serializable;

public class Perro extends Animal implements Serializable{

    //Atributo propio de perro
    private String raza;


    //Constructor
    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }

    //Getter y Setter de raza
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    //Metodo sobreescrito
    @Override
    public String hacerSonido()
    {
        return "El perro ladra";
    }

}
