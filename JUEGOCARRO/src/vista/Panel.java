/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

/**
 *
 * @author Gladys
 */
public class Panel extends javax.swing.JPanel implements Runnable{

    /**
     * Creates new form Panel
     */
    
    static final int ANCHO=500, LARGO=500;
    
    
    public Panel() {
        initComponents();
        this.setIgnoreRepaint(true);
        //this.setBounds(0, 0, ANCHO, LARGO);
        
        
        //HIlo
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void run(){
        
        while(true){
            render();
            try{
                Thread.sleep(100);
            } catch(Exception ex){}
        }
        
    }
    
    private void render(){
        Graphics g;
        g = this.getGraphics();
        
        //FONDO
        g.setColor(Color.ORANGE);
        g.fillRect(0, 0, this.ANCHO, this.LARGO);
        
        //OBJETO
        g.setColor(Color.WHITE);
        g.fillOval(100, 100, 40, 40);
        
        Toolkit.getDefaultToolkit().sync();
        
        g.dispose();
    }

    
    
}
