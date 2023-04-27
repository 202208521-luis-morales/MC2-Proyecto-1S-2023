/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controladores;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author DELL
 */
public class ControladorPrincipalTest {
    ControladorPrincipal instance;
    
    @Before
    public void init() {
        instance = new ControladorPrincipal();
        instance.agregarVertice("A");
        instance.agregarVertice("B");
        instance.agregarVertice("C");
        instance.agregarVertice("D");
        instance.agregarVertice("E");
        instance.agregarVertice("F");
        instance.agregarVertice("G");
        
        instance.agregarArista("A->C", 3);
        instance.agregarArista("A->D", 5);
        instance.agregarArista("A->F", 6);
        instance.agregarArista("B->C", 1);
        instance.agregarArista("B->E", 8);
        instance.agregarArista("B->F", 4);
        instance.agregarArista("C->E",2);
        instance.agregarArista("C->F", 2);
        instance.agregarArista("D->E", 5);
        instance.agregarArista("D->G",4);
        instance.agregarArista("E->G", 3);
    }
    
    @Test
    public void testGenerarArbolGeneradorMinimo() {
        instance.generarArbolGeneradorMinimo();
    }
    
    /* @Test
    public void testBuscarElCaminoMasCortoDadoUnVertice() {
        instance.buscarElCaminoMasCortoDadoUnVertice(instance.obtenerVerticePorNombre("A"));
    } */
    
    @Test
    public void imprimirDatos() {
        instance.imprimirDatos();
    }
    
}
