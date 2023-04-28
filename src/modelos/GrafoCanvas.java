/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class GrafoCanvas extends Canvas {
    private GrafoCanvas grafo;

    public GrafoCanvas(GrafoCanvas grafo) {
        this.grafo = grafo;
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Aquí puedes escribir el código para dibujar el grafo en el panel
        // Utiliza los métodos y propiedades de la clase Graphics para dibujar las aristas y vértices del grafo
    }
}