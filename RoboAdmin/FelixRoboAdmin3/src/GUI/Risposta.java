/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Risposta.java
 *
 * Created on 22-gen-2010, 21.04.17
 */

package GUI;

/**
 *
 * @author Luca
 * Classe usata per visualizzare i risultati di una ricerca al momento usata solo su ricerche svolte sul log
 */
public class Risposta extends javax.swing.JFrame {

    /** Creates new form Risposta */
    public Risposta() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRisposta = new javax.swing.JTextArea();

        setTitle("Risposta");

        jTextAreaRisposta.setColumns(20);
        jTextAreaRisposta.setEditable(false);
        jTextAreaRisposta.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRisposta);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Risposta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextArea jTextAreaRisposta;
    // End of variables declaration//GEN-END:variables

}
