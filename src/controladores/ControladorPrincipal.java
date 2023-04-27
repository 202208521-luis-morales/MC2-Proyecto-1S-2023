package controladores;

import app.Db;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import modelos.Arista;
import modelos.Vertice;

public class ControladorPrincipal {
    /* Te voy a crear los metodos y vos los usas */
    private Db db = Db.getInstance();
    
    public ArrayList<Vertice> obtenerArregloDeVertices() {
        return db.dbVerticesTabla;
    }
    
    public ArrayList<Arista> obtenerArregloDeAristas() {
        return db.dbAristasTabla;
    }

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
        
        if(vertice == null) {
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
    
    // Este método alterará la base de datos que tiene un único registro del grafo en cuestión
    /*
        Pasos del algoritmo de Prim:
        1. Se toma un vértice al azar
        2. Se busca el camino adyacente con el menor peso posible
        3. De ahí se examinan los nuevos vértices y se selecciona el menor camino posible de uno de los vértices (paso por paso)
            sin que haya ciclo (Es decir, si A<->B y B<->C, entonces no se podría A<->C)
        4. Se repite hasta que todos los vértices sean seleccionados
    */
    public void generarArbolGeneradorMinimo() {
        ArrayList<Vertice> arrVertices = obtenerArregloDeVertices();
        ArrayList<Arista> arrAristas = obtenerArregloDeAristas();
        Random rand = new Random();
        
        Vertice verticeAleatorio = arrVertices.get(rand.nextInt(arrVertices.size()));
        System.out.println(verticeAleatorio.getNombre());
        
        for (int i = 0; i < 10; i++) {
            
        }
    }
    
    // Todos los métodos privados no deberías poder acceder a ellos, solo sirven para el algoritmo
    private Arista obtenerElCaminoMasCortoDadoUnVertice(Vertice ver) {
        ArrayList<Arista> arrAristas = obtenerArregloDeAristas();
        ArrayList<Integer> arrIndexesDondeEstaElVertice = new ArrayList<>();
        Arista caminoMasCorto = null;
        
        // Método: obtener los indexes de las aristas donde esté el vértice "ver"
        for (int i = 0; i < arrAristas.size(); i++) {
            Arista ari = arrAristas.get(i);
            if(ari.getVertice1() == ver || ari.getVertice2() == ver) arrIndexesDondeEstaElVertice.add(i);
        }
        
        // Método: dados los indexes, buscamos el que tenga el menor peso, y finalmente se devolverá esa arista
        caminoMasCorto = arrAristas.get(arrIndexesDondeEstaElVertice.get(0));
        for (Integer index : arrIndexesDondeEstaElVertice) {
            if(arrAristas.get(index).getPeso() < caminoMasCorto.getPeso()) caminoMasCorto = arrAristas.get(index);
        }
        
        return caminoMasCorto;
    }
    
    public void imprimirDatos() {
        System.out.println("###############################");
        System.out.println("###VERTICES");
        System.out.println("###############################");
        for (int i = 0; i < obtenerArregloDeVertices().size(); i++) {
            Vertice ver = obtenerArregloDeVertices().get(i);
            
            System.out.println("###");
            System.out.println("[" + i + "]");
            System.out.println("ID: " + ver.getId());
            System.out.println("NOMBRE: " + ver.getNombre());
            System.out.println("ES VALIDO: " + ver.isEsValido());
        }
        
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("###############################");
        System.out.println("### ARISTAS");
        System.out.println("###############################");
        
        for (int i = 0; i < obtenerArregloDeAristas().size(); i++) {
            Arista ari = obtenerArregloDeAristas().get(i);
            
            System.out.println("###");
            System.out.println("[" + i + "]");
            System.out.println("ID: " + ari.getId());
            System.out.println("VERTICE 1: " + ari.getVertice1().getNombre());
            System.out.println("VERTICE 2: " + ari.getVertice2().getNombre());
            System.out.println("PESO: " + ari.getPeso());
            System.out.println("ES VALIDO: " + ari.isEsValido());
        }
        
    }
}
