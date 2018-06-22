/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_josephmoscoso;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class gerentes {

    private String nombre;
    private String idempresa;
    private String contraseña;
    private String jefe;
    private int salario;
    private String puesto;
    ArrayList<gerentes> a = new ArrayList();

    public gerentes() {
    }

    public gerentes(String nombre, String idempresa, String contraseña, String jefe, int salario, String puesto) {
        this.nombre = nombre;
        this.idempresa = idempresa;
        this.contraseña = contraseña;
        this.jefe = jefe;
        this.salario = salario;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(String idempresa) {
        this.idempresa = idempresa;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public ArrayList<gerentes> getA() {
        return a;
    }

    public void setA(ArrayList<gerentes> a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + " jefe=" + jefe + " puesto=" + puesto;
    }
}
