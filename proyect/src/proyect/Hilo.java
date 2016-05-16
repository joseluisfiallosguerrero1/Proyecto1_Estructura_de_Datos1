/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class Hilo implements Runnable {
    private final List empleados;
    private productos productos;
    private long initialTime;
    private empleados empleado;
    

    public Hilo(productos productos, List empleados,  long initialTime, empleados empleado) {
        this.empleados = empleados;
        this.productos = productos;
        this.initialTime = initialTime;
        this.empleado=empleado;
    }

    @Override
    public void run() {
        System.out.println("\"El empleado " + empleado.getNombre() + Thread.currentThread().getName()
                + "\" COMIENZA A PROCESAR LA MANUFACTURA DEL PRODUCTO " + this.productos.getNombre()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + " segundos");
        this.esperarXsegundos(productos.getTiempo());
        System.out.println("Procesado el producto " + " del " + this.productos.getNombre()
                + "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + " segundos");
        

        System.out.println("\"El empleado " + empleado.getNombre() + Thread.currentThread().getName() + "\" HA TERMINADO DE PROCESAR "
                + this.productos.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + " segundos");

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

    public void setProducto(productos producto) {
        this.productos = producto;
    }
}
