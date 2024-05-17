package clases;

import excepciones.LibroVenta;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("rojo","123");
        Cliente cliente = new Cliente("Franco", "123456789",27,27);

        LibroVenta libroVenta = new LibroVenta("17052024", "venta 1");
        libroVenta.guardarVenta(cliente,vehiculo);
    }
}
