/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kborb
 */
public class Persona {
     private int codigo;
    private String nombre;
    private String destino;
    private int edad;

    public Persona() {
    }

    public Persona(int codigo, String nombre, String destino, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.destino = destino;
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int coddigo) {
        this.codigo = coddigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", destino=" + destino + ", edad=" + edad + '}';
    }
    
}
