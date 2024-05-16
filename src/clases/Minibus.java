package clases;

public class Minibus extends Bus{
    private String tipoViaje;

    public Minibus() {
    }

    public Minibus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus(){
        System.out.println( "Minibus{" +
                "tipoViaje='" + tipoViaje + '\'' +
                '}');
    }


    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }
}
