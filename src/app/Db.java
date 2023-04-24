package app;

import java.util.ArrayList;
import modelos.Arista;
import modelos.Vertice;

public class Db {
    public ArrayList<Vertice> dbVerticesTabla = new ArrayList<>();
    public ArrayList<Arista> dbAristasTabla = new ArrayList<>();
    private static Db db;
    
    private Db() {}
    
    /*
        Para usar la base de datos en una clase, haces una instancia de la clase Db, usas su atributo db, y
        ahí podemos guardar, leer, modificar o borrar cosas.
    
    Ejemplo:
        Db db = new Db();
        db.dbVerticesTabla.get(: 0);
    */
    public static Db getInstance() {
        if(db == null) {
            db = new Db();
        }
        
        return db;
    }
}
