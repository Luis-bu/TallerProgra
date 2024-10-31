package Zoo;

public abstract class Animal {
    //Atributos
    private String nombre;
    private int edad;

    //Constructor Vacio
    public Animal() {}

    //Constructor con parametro
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getter y setters de nombre y edad
    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public String getNombreMayus()
    {
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo abstracto
    public abstract String hacerSonido();







}
