package modelos;

import java.util.UUID;

public class Vertice {
     private int x;
    private int y;
    private String id;
    private String nombre; // El nombre será único
    private boolean esValido;

    public Vertice(String nombre, boolean esValido) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.esValido = esValido;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsValido() {
        return esValido;
    }

    public void setEsValido(boolean esValido) {
        this.esValido = esValido;
    }
     public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
