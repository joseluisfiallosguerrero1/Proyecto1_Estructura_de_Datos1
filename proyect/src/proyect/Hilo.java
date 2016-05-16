/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;
/**
 *
 * @author Christian
 */
public class Hilo implements Runnable {
    private final List empleados;
    private productos productos;
    private long initialTime;

    public Hilo(productos productos, List empleados,  long initialTime) {
        this.empleados = empleados;
        this.productos = productos;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        /*System.out.println("\"La cajera " + Thread.currentThread().getName()
                + "\" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.productos.getNombre()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");*/

        for (int i = 0; i < this.empleados.size(); i++) {
            // Se procesa el pedido en X segundos
            this.esperarXsegundos(productos.getTiempo());
            System.out.println("Procesado el producto " + (i + 1) + " del " + this.productos.getNombre()
                    + "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }

        System.out.println("\"La cajera " + Thread.currentThread().getName() + "\" HA TERMINADO DE PROCESAR "
                + this.productos.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    public productos getProducto() {
        return productos;
    }

    public void setCliente(productos producto) {
        this.productos = productos;
    }
}
