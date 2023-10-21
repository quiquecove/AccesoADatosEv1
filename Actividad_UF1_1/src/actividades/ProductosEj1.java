package actividades;

import java.io.Serializable;

public class ProductosEj1 implements Serializable {
    private int id;
    private String nombre;
    private String medidas;
    private float precio;

    public ProductosEj1(int id, String nombre, String medidas, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.medidas = medidas;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
