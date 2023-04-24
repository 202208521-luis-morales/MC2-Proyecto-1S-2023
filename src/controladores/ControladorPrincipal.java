package controladores;

import app.Db;
import modelos.Arista;
import modelos.Vertice;

public class ControladorPrincipal {
    /* Te voy a crear los metodos y vos los usas */
    private Db db = Db.getInstance();
    
    public void agregarVertice(String nombreDelVertice) {
        db.dbVerticesTabla.add(new Vertice(nombreDelVertice, false));
    }
    
    public void agregarArista(String vertice1, String vertice2, int peso) {
        
    }
}
