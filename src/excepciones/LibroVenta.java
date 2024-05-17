package excepciones;

import clases.Cliente;
import clases.Vehiculo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Crear la clase LibroVenta con los siguientes atributos.
public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    //Generar constructor con parámetros a la clase LibroVenta.
    public LibroVenta(String fechaVenta, String nombreVenta) {
        this.fechaVenta = fechaVenta;
        this.nombreVenta = nombreVenta;
    }

    //Crear una operación llamada guardar llamada guardarVenta a la clase LibroVenta
    public void guardarVenta(Cliente cliente, Vehiculo vehiculo){
        try {
            // Se crea el nombre del archivo con el nombre de la venta y extensión .txt
            String nombreArchivo = nombreVenta + ".txt";
            nombreArchivo = nombreArchivo.trim(); //quitamos los espacios al inicio o final de la cadena
            nombreArchivo = nombreArchivo.replaceAll(" ", "_");

            // Se abre el archivo en modo de escritura
            FileWriter archivo = new FileWriter("src/ficheros/" + nombreArchivo, true);
            PrintWriter pw = new PrintWriter(archivo);

            // Se escribe la información en el archivo
            pw.println("Patente del vehículo: " + vehiculo.getPatente());
            pw.println("Edad del cliente: " + cliente.getEdad());
            pw.println("Fecha de la venta: " + fechaVenta);
            pw.println("Nombre de venta: " + nombreVenta);
            pw.println(); // Salto de línea para separar cada venta

            // Se cierra el archivo
            archivo.close();
            System.out.println("Venta guardada correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar la venta: " + e.getMessage());
        }
    }

    //Crear los Accesadores y Seteadores para cada campo de la clase LibroVenta
    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

}
