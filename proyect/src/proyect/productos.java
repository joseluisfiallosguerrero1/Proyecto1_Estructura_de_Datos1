/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

/**
 *
 * @author jose
 */
public class productos {
    String Nombre;
    String Descripcion;
    int tiempo;
    List materiales;

    public productos() {
    }

    public productos(String Nombre, String Descripcion, int tiempo, List materiales) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.tiempo = tiempo;
        this.materiales = materiales;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List getMateriales() {
        return materiales;
    }

    public void setMateriales(List materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
