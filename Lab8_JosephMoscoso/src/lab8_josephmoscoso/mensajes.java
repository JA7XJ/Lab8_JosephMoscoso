/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_josephmoscoso;

/**
 *
 * @author Joseph
 */
public class mensajes {
    private String Destino;
    private String Fuente;
    private String cif;
    private String msj;

    public mensajes() {
    }

    public mensajes(String Destino, String Fuente, String cif, String msj) {
        this.Destino = Destino;
        this.Fuente = Fuente;
        this.cif = cif;
        this.msj = msj;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getFuente() {
        return Fuente;
    }

    public void setFuente(String Fuente) {
        this.Fuente = Fuente;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    @Override
    public String toString() {
        return "mensajes{" + "Destino=" + Destino + ", Fuente=" + Fuente + ", cif=" + cif + ", msj=" + msj + '}';
    }
    
}
