package controladores;

import app.Db;
import javax.swing.JOptionPane;
import modelos.Arista;
import modelos.Vertice;

public class ControladorPrincipal {

    /* Te voy a crear los metodos y vos los usas */
    private Db db = Db.getInstance();

    // Busca un vértice dado un nombre, si lo encuentra lo devuelve, sino, devuelve un null
    public Vertice obtenerVerticePorNombre(String nombreDelVertice) {
        Vertice verticeEncontrado = null;
     
        for (Vertice ver : db.dbVerticesTabla) {
            if(nombreDelVertice.equals(ver.getNombre())) {
                verticeEncontrado = ver;
            }
        }
        
        return verticeEncontrado;
    }
    
    public void agregarVertice(String nombreDelVertice) {
        Vertice vertice = obtenerVerticePorNombre(nombreDelVertice);
        
        if(vertice != null) {
            db.dbVerticesTabla.add(new Vertice(nombreDelVertice.trim(), false));
        } else {
            JOptionPane.showMessageDialog(null, "Vértice no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void agregarArista(String textoArista, int peso) {
        Vertice v1 = null;
        Vertice v2 = null;
        String error = null;
        
        if(!textoArista.matches("^[a-zA-Z]+->[a-zA-Z]+$")) {
            error = "El texto para la arista no cumple con el formato";
        } else {
            v1 = obtenerVerticePorNombre(textoArista.split("->")[0]);
            v2 = obtenerVerticePorNombre(textoArista.split("->")[1]);
        }
        
        if(v1 == null || v2 == null) {
            error = error == null ? "Uno de los vértices no existe": error;
        }
        
        if(error != null) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            db.dbAristasTabla.add(new Arista(v1, v2, peso, false));
        }
    }
    
    public void generarArbolGeneradorMinimo() {
        // En progreso...
    }
}
