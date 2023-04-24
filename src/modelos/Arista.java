package modelos;

import java.util.UUID;

public class Arista {
    private String id;
    private Vertice vertice1;
    private Vertice vertice2;
    private int peso;
    private boolean esValido;

    public Arista(Vertice vertice1, Vertice vertice2, int peso, boolean esValido) {
        this.id = UUID.randomUUID().toString();
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.peso = peso;
        this.esValido = esValido;
    }

    public String getId() {
        return id;
    }

    public Vertice getVertice1() {
        return vertice1;
    }

    public void setVertice1(Vertice vertice1) {
        this.vertice1 = vertice1;
    }

    public Vertice getVertice2() {
        return vertice2;
    }

    public void setVertice2(Vertice vertice2) {
        this.vertice2 = vertice2;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isEsValido() {
        return esValido;
    }

    public void setEsValido(boolean esValido) {
        this.esValido = esValido;
    }
    
    
}
