package clases;

public class Cliente extends Persona{

    private int edad;

    public Cliente() {
    }

    public Cliente(String nombre, String rut, int edad, int edad1) {
        super(nombre, rut, edad);
        this.edad = edad1;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
