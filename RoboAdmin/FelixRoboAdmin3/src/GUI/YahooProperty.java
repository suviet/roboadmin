/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * YahooProperty.java
 *
 * Created on 1-feb-2010, 13.49.23
 */

package GUI;
import configurator.patchConfigurator.Configurator;
import db.mySQL.MySQLDataBase;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import log.fileLogger.FileLogger;
/**
 *
 * @author Luca
 * Classe per la gestione delle proprietà di Yahoo
 */
public class YahooProperty extends javax.swing.JFrame {

    /** Creates new form YahooProperty */
    public YahooProperty() {
        initComponents();
        inizializza();
        //IL BOTTONE DI AGGIUNTA DI UNA PROPRIETà è RESO INVISIBILE INQUANTO ANCHE SE SI PERMETTESSE L'AGGIUNTA DI UNA PROPERTY RA POI NON SAPREBBE
        //COME GESTIRLA PERTANTO è RESO INUSABILE
        jButtonNew.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        RoboAdminDBPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("RoboAdminDBPU").createEntityManager();
        yahoopropertiesQuery = java.beans.Beans.isDesignTime() ? null : RoboAdminDBPUEntityManager.createQuery("SELECT y FROM Yahooproperties y");
        yahoopropertiesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(yahoopropertiesQuery.getResultList());
        jPanel1 = new javax.swing.JPanel();
        YahooProperties = new javax.swing.JSplitPane();
        jPanelsx = new javax.swing.JPanel();
        jLabelProperty = new javax.swing.JLabel();
        jLabelValue = new javax.swing.JLabel();
        jTextFieldProperty = new javax.swing.JTextField();
        jTextFieldValue = new javax.swing.JTextField();
        jButtonNew = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jPaneldx = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableYahooProperties = new javax.swing.JTable();

        setTitle("Yahoo Property");

        jPanel1.setLayout(new java.awt.BorderLayout());

        YahooProperties.setDividerLocation(260);

        jLabelProperty.setText("Property:");

        jLabelValue.setText("Value:");

        jButtonNew.setText("New");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelsxLayout = new javax.swing.GroupLayout(jPanelsx);
        jPanelsx.setLayout(jPanelsxLayout);
        jPanelsxLayout.setHorizontalGroup(
            jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelsxLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jButtonSubmit)
                .addGap(18, 18, 18)
                .addComponent(jButtonDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNew)
                .addGap(18, 18, 18))
            .addGroup(jPanelsxLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelsxLayout.createSequentialGroup()
                        .addComponent(jLabelValue)
                        .addGap(32, 32, 32))
                    .addGroup(jPanelsxLayout.createSequentialGroup()
                        .addComponent(jLabelProperty)
                        .addGap(16, 16, 16)))
                .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldValue, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jTextFieldProperty, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelsxLayout.setVerticalGroup(
            jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelsxLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProperty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProperty))
                .addGap(28, 28, 28)
                .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValue)
                    .addComponent(jTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonSubmit)
                    .addComponent(jButtonNew))
                .addContainerGap())
        );

        YahooProperties.setLeftComponent(jPanelsx);

        jPaneldx.setLayout(new java.awt.BorderLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, yahoopropertiesList, jTableYahooProperties);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${yahoopropertiesPK.property}"));
        columnBinding.setColumnName("Property");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${yahoopropertiesPK.value}"));
        columnBinding.setColumnName("Value");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTableYahooProperties);
        jTableYahooProperties.getModel().addTableModelListener(new TableModelListener() {
            public void tableChanged(TableModelEvent e) {
                int row = e.getFirstRow();
                int column=e.getColumn();
                ModificaDati(row,column);
            }
        });

        jPaneldx.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        YahooProperties.setRightComponent(jPaneldx);

        jPanel1.add(YahooProperties, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        // TODO add your handling code here:
        String NProperty=jTextFieldProperty.getText();
        String NValue=jTextFieldValue.getText();
        RendiPersistenteProprietà(NProperty,NValue);
        yahooPropertiesListOld.add(new Yahooproperties(NProperty, NValue));
}//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        String property=jTextFieldProperty.getText();
        String value=jTextFieldValue.getText();
        if (!(property.isEmpty() || value.isEmpty())){
            RimuoviRigaRAProperties(property,value);
        }
        int row=jTableYahooProperties.getSelectedRow();
        if (row!=-1){
            RimuoviRigaRAProperties(row);
        } else{
            new ErrorForm("tupla non trovata");
        }
}//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        Object [] dirtyRow=ModifiedRow.toArray();
        ModifiedRow.clear();
        for (int i=0; i<dirtyRow.length; i++){
            int row=Integer.parseInt(dirtyRow[i].toString());
            Object []Temp=new Object[jTableYahooProperties.getColumnCount()];
            for (int j=0;j<jTableYahooProperties.getColumnCount();j++){
                Temp[j]=jTableYahooProperties.getValueAt(row, j);
            }
            String property=Temp[0].toString();
            String value=Temp[1].toString();
            try {
                Yahooproperties oldYahooProperties=yahooPropertiesListOld.get(row);
                String oldProperty=oldYahooProperties.getYahoopropertiesPK().getProperty();
                String oldValue=oldYahooProperties.getYahoopropertiesPK().getValue();
                RendiPersistenteModifica(oldProperty,oldValue,property,value);
            } catch(NumberFormatException e){
                new ErrorForm(e.toString());
            }
        }
        yahooPropertiesListOld.clear();
        CopiaListaYahooProperties(yahooPropertiesListOld, yahoopropertiesList);
}//GEN-LAST:event_jButtonSubmitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YahooProperty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager RoboAdminDBPUEntityManager;
    private javax.swing.JSplitPane YahooProperties;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelProperty;
    private javax.swing.JLabel jLabelValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPaneldx;
    private javax.swing.JPanel jPanelsx;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableYahooProperties;
    private javax.swing.JTextField jTextFieldProperty;
    private javax.swing.JTextField jTextFieldValue;
    private java.util.List<GUI.Yahooproperties> yahoopropertiesList;
    private javax.persistence.Query yahoopropertiesQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    //Vartiabili di supporto per la gestione
    private Vector ModifiedRow=new Vector();
    private java.util.List<GUI.Yahooproperties> yahooPropertiesListOld;
    private Configurator conf=new Configurator();
    private MySQLDataBase db=null;
    private FileLogger log=new FileLogger();


    //=========================================METODI PRIVATI DI INIZIALIZZAZIONE

    protected void inizializza(){
        yahooPropertiesListOld=new ArrayList<Yahooproperties>();
        CopiaListaYahooProperties(yahooPropertiesListOld, yahoopropertiesList);
        //prepara il db log sempre su file al momento
        db=new MySQLDataBase(conf, log);
    }

    //=========================================METODI PRIVATI PER LA GESTIONE DELLA TABELLA

     /**
    * Tiene traccia delle celle interesate da una modifica
    *
    * @param row riga
    * @param column colonna
    * @return void
    */
    private void ModificaDati(int row ,int column){
        //Invocato a ogni modifica della tabella
        //se la colonna modificata è -1 vuol dire che si sta aggiungendo togliendo una riga
        if (column!=-1){
            if (!ModifiedRow.contains(row))
            ModifiedRow.add(row);
        }
    }

     /**
    * Crea un lista con i dati della tabella di supporto al di andare a operare sulla giusta tubla anche se questa è stata modificata
    *
    * @param List<Accept> vecchi
    * @param List<Accept> nuovi
    * @return void
    */
    private void CopiaListaYahooProperties(List<Yahooproperties> yahooPropertiesOld,List<Yahooproperties> yahooPropertiesNew){
         for (int i=0;i<yahooPropertiesNew.size();i++){
            yahooPropertiesOld.add(new Yahooproperties(yahooPropertiesNew.get(i).getYahoopropertiesPK().getProperty(),yahooPropertiesNew.get(i).getYahoopropertiesPK().getValue()));
        }
    }



   /**
    * Rende una nuova property persistente nel DB
    *
    * @param property la nuova propietà
    * @param value il valore della nuova proprietà
    * @return void
    */
    private void RendiPersistenteProprietà(String property, String value){
        //prepara la query da mandare al db
	String query ="INSERT INTO yahooproperties (Property, Value) VALUES ('" + property + "', '"+ value +"')";
        //esegue spedisce la query
        db.executeSqlUpdate(query);
        //AGGIUNGE LA RIGA DIRETTAMENTE ANCHE SULLA TABELLA
        Yahooproperties newYahooProp = new Yahooproperties(property, value);
        yahoopropertiesList.add(newYahooProp);
        jTableYahooProperties.repaint();
    }



     /**
    * Rimuove una tupla selezionata in base all'id inserito nel campo id dalla tabella e dal DB
    * @param property stringa contenente il nome della proprietà da rimuovere
    * @param value stringa contenente il valore associato alla proprietà da rimuovere
    * @return void
    */
    private void RimuoviRigaRAProperties(String property,String value) {
        //preparo la query di rimozione
	String query = "DELETE FROM yahooproperties WHERE Property= '" + property +"' AND Value= '" + value +"' ";
	//eseguo la query
        db.executeSqlUpdate(query);
        //RIMUOVE LA RIGA DALLA TABELLA
        Yahooproperties RProperty=new Yahooproperties(property,value);
        yahoopropertiesList.remove(RProperty);
        jTableYahooProperties.repaint();
    }
    /**
    * Rimuove una tupla selezionata nella tabella dal DB
    * @return void
    */
    private void RimuoviRigaRAProperties(int row){
        String property= (String) jTableYahooProperties.getValueAt(row,0);
        String value=(String) jTableYahooProperties.getValueAt(row, 1);
	//preparo la query
        String query = "DELETE FROM yahooproperties WHERE Property= '" + property +"' AND Value= '" + value +"' ";
	//eseguo la query
	db.executeSqlUpdate(query);
        //RIMUOVE LA RIGA DALLA TABELLA
        yahoopropertiesList.remove(row);
        jTableYahooProperties.repaint();
    }


     /**
    * Rende le modifiche apportate alle tuple sulla tabella persistenti sul DB, la ricerca della tupla da modificare è scolta in base a oldProperty e
    * oldValue
    * @param oldProperty stringa contenente il valore precedente alla modifica della propietà
    * @param oldValue stringa contenente il valore precedente alla modifica del value
    * @param property stringa contenente il valore aggiornato della propietà
    * @param value stringa contente il valore aggiornato del value
    * @return void
    */
    private void RendiPersistenteModifica(String oldProperty, String oldValue, String property, String value) {
        String query = "UPDATE yahooproperties SET Property= '" +property+"', Value= '"+ value +"' WHERE Property='"+ oldProperty +"' AND Value='"+ oldValue +"' ";
        //eseguo la query
        db.executeSqlUpdate(query);

    }

}
