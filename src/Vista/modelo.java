package Vista;
import app.Db;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Arista;
import modelos.Vertice;


public class modelo extends javax.swing.JFrame {
private Db db;
    public modelo() {
        db = Db.getInstance();
        initComponents();
    }
        private class GrafoCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
        
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtVertice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtArista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnGenerar = new javax.swing.JButton();
        GrafoPanel = new javax.swing.JPanel();
        PrimPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerticeActionPerformed(evt);
            }
        });

        jLabel1.setText("Vértice");

        jLabel2.setText("Arista");

        txtArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAristaActionPerformed(evt);
            }
        });

        jLabel3.setText("Formato A-B");

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jLabel4.setText("Peso");

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        jLabel5.setText("Vértices");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setText("Aristas");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GrafoPanelLayout = new javax.swing.GroupLayout(GrafoPanel);
        GrafoPanel.setLayout(GrafoPanelLayout);
        GrafoPanelLayout.setHorizontalGroup(
            GrafoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        GrafoPanelLayout.setVerticalGroup(
            GrafoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PrimPanelLayout = new javax.swing.GroupLayout(PrimPanel);
        PrimPanel.setLayout(PrimPanelLayout);
        PrimPanelLayout.setHorizontalGroup(
            PrimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );
        PrimPanelLayout.setVerticalGroup(
            PrimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtVertice, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtArista))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregar)
                                    .addComponent(jLabel4)
                                    .addComponent(btnCargar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PrimPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGenerar))
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GrafoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GrafoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrimPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCargar))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(btnAgregar)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGenerar)
                        .addGap(92, 92, 92))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAristaActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
       String vertice = txtVertice.getText();
       if(!vertice.isEmpty()){
    if (buscarVerticePorNombre(vertice) != null) {
        JOptionPane.showMessageDialog(this, "El vértice ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        Vertice nuevoVertice = new Vertice(vertice, true);
        db.dbVerticesTabla.add(nuevoVertice);
        actualizarVertices();
        txtVertice.setText("");
    }
    }else{        JOptionPane.showMessageDialog(this, "Por favor llene todos los espacios.", "Error", JOptionPane.ERROR_MESSAGE);
                     txtVertice.setText("");
       }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
      Graphics g = GrafoPanel.getGraphics();
    dibujarVerticeYArista(g);
    }//GEN-LAST:event_btnGenerarActionPerformed


    

   
   
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
 
     String arista = txtArista.getText();
    String pesoString = txtPeso.getText();
    if (arista.isEmpty() || pesoString.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ambos campos deben ser completados", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    int peso = Integer.parseInt(pesoString);
    String[] vertices = arista.split("-");
    if (vertices.length != 2) {
        JOptionPane.showMessageDialog(null, "Formato de arista inválido", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    Vertice vertice1 = buscarVerticePorNombre(vertices[0]);
    Vertice vertice2 = buscarVerticePorNombre(vertices[1]); 
    if (vertice1 == null || vertice2 == null) {
        JOptionPane.showMessageDialog(null, "Uno de los vértices no existe", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    } 
    Arista nuevaArista = new Arista(vertice1, vertice2, peso, false);
    db.dbAristasTabla.add(nuevaArista);
    actualizarAristas();
    txtArista.setText("");
    txtPeso.setText("");
}

    
    private void dibujarVerticeYArista(Graphics g) {
    // Dibujar los vértices
    for (Vertice vertice : db.dbVerticesTabla) {
        int x = (int) (Math.random() * (getWidth() - 20));
        int y = (int) (Math.random() * (getHeight() - 20));
        g.setColor(Color.RED);
        g.fillOval(x, y, 20, 20);
        g.setColor(Color.BLACK);
        g.drawString(vertice.getNombre(), x + 25, y + 15);

        
       ArrayList<Arista> aristasDelVertice = obtenerAristasDelVertice(vertice);
        for (Arista arista : aristasDelVertice) {
            Vertice vertice1 = arista.getVertice1();
            Vertice vertice2 = arista.getVertice2();
       int x1 = vertice1.getX(); 
        int y1 = vertice1.getY(); 
        int x2 = vertice2.getX(); 
        int y2 = vertice2.getY(); 


            g.setColor(Color.BLUE); // Establecer el color de la arista
            g.drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10); // Dibujar una línea que conecta los dos vértices
            g.setColor(Color.BLACK); // Establecer el color del peso de la arista
            g.drawString(Integer.toString(arista.getPeso()), (x1 + x2) / 2, (y1 + y2) / 2); // Dibujar el peso de la arista en el centro de la línea
        }
    }
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    
    public ArrayList<Arista> obtenerAristasDelVertice(Vertice vertice) {
    ArrayList<Arista> aristasDelVertice = new ArrayList<>();
    for (Arista arista : db.dbAristasTabla) {
        if (arista.getVertice1().equals(vertice) || arista.getVertice2().equals(vertice)) {
            aristasDelVertice.add(arista);
        }
    }
    return aristasDelVertice;
}
    
    private Vertice buscarVerticePorNombre(String nombre) {
    for (Vertice vertice : db.dbVerticesTabla) {
        if (vertice.getNombre().equals(nombre)) {
            return vertice;
        }
    }
    return null; 
}
    
    
    private void txtVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVerticeActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void actualizarVertices() {
    StringBuilder sb = new StringBuilder();
    for (Vertice vertice : db.dbVerticesTabla) {
        sb.append(vertice.getNombre()).append("\n");
    }
    jTextArea1.setText(sb.toString());
}

private void actualizarAristas() {
    
      StringBuilder sb = new StringBuilder();
    for (Arista arista : db.dbAristasTabla) {
        sb.append("Arista: ")
            .append(arista.getVertice1().getNombre())
            .append(" - ")
            .append(arista.getVertice2().getNombre())
            .append("     Peso:(")
            .append(arista.getPeso())
            .append(")\n");
    }
    jTextArea2.setText(sb.toString());
    }

    
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GrafoPanel;
    private javax.swing.JPanel PrimPanel;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txtArista;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtVertice;
    // End of variables declaration//GEN-END:variables
}
