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
public class materiales {
    String nombre;
    String descripcion;
    String marca;
    int numero_de_serie;
  
    

    public materiales() {
    }

    public materiales(String nombre, String descripcion, String marca, int numero_de_serie ) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.numero_de_serie = numero_de_serie;
        
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumero_de_serie() {
        return numero_de_serie;
    }

    public void setNumero_de_serie(int numero_de_serie) {
        this.numero_de_serie = numero_de_serie;
    }

    
    
    

    @Override
    public String toString() {
        return "materiales{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", marca=" + marca + ", numero_de_serie=" + numero_de_serie + '}';
    }
    
    
}

