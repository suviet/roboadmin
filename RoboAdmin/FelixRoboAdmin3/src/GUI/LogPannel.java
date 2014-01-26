/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LogPannel.java
 *
 * Created on 30-dic-2009, 17.37.41
 */

package GUI;
import db.mySQL.MySQLDataBase;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Luca
 */
public class LogPannel extends javax.swing.JPanel {

    /** Creates new form LogPannel */
    public LogPannel() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        RoboAdminDBPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("RoboAdminDBPU").createEntityManager();
        logQuery = java.beans.Beans.isDesignTime() ? null : RoboAdminDBPUEntityManager.createQuery("SELECT l FROM Log l");
        logList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(logQuery.getResultList());
        jSplitPanelLog = new javax.swing.JSplitPane();
        jPanelsx = new javax.swing.JPanel();
        jButtonSearch = new javax.swing.JButton();
        jLabelSender = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelLog = new javax.swing.JLabel();
        jLabelSeparetor1 = new javax.swing.JLabel();
        jLabelSeparator2 = new javax.swing.JLabel();
        jTextFieldSender = new javax.swing.JTextField();
        jTextFieldLog = new javax.swing.JTextField();
        jTextFieldYear = new javax.swing.JTextField();
        jTextFieldMonth = new javax.swing.JTextField();
        jTextFieldDay = new javax.swing.JTextField();
        jPaneldx = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLog = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jSplitPanelLog.setDividerLocation(250);

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabelSender.setText("Sender");

        jLabelDate.setText("Date");

        jLabelLog.setText("Log");

        jLabelSeparetor1.setText("/");

        jLabelSeparator2.setText("/");

        javax.swing.GroupLayout jPanelsxLayout = new javax.swing.GroupLayout(jPanelsx);
        jPanelsx.setLayout(jPanelsxLayout);
        jPanelsxLayout.setHorizontalGroup(
            jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelsxLayout.createSequentialGroup()
                        .addComponent(jLabelDate)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSeparetor1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelsxLayout.createSequentialGroup()
                        .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSender)
                            .addComponent(jLabelLog))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldLog, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jTextFieldSender, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                .addGap(642, 642, 642))
        );
        jPanelsxLayout.setVerticalGroup(
            jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsxLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSender))
                .addGap(18, 18, 18)
                .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLog)
                    .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelsxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate)
                    .addComponent(jLabelSeparetor1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(365, 365, 365)
                .addComponent(jButtonSearch)
                .addContainerGap())
        );

        jSplitPanelLog.setLeftComponent(jPanelsx);

        jPaneldx.setLayout(new java.awt.BorderLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, logList, jTableLog);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sender}"));
        columnBinding.setColumnName("Sender");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${log}"));
        columnBinding.setColumnName("Log");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTableLog);

        jPaneldx.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPanelLog.setRightComponent(jPaneldx);

        add(jSplitPanelLog, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        String sender=jTextFieldSender.getText();
        String logs=jTextFieldLog.getText();
        String giorno=jTextFieldDay.getText();
        String mese=jTextFieldMonth.getText();
        String anno=jTextFieldYear.getText();
        String ricerca[]=new String[5];
        ricerca[0]=sender;ricerca[1]=logs;ricerca[2]=giorno;ricerca[3]=mese;ricerca[4]=anno;
        Cerca(ricerca);
    }//GEN-LAST:event_jButtonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager RoboAdminDBPUEntityManager;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelLog;
    private javax.swing.JLabel jLabelSender;
    private javax.swing.JLabel jLabelSeparator2;
    private javax.swing.JLabel jLabelSeparetor1;
    private javax.swing.JPanel jPaneldx;
    private javax.swing.JPanel jPanelsx;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPanelLog;
    private javax.swing.JTable jTableLog;
    private javax.swing.JTextField jTextFieldDay;
    private javax.swing.JTextField jTextFieldLog;
    private javax.swing.JTextField jTextFieldMonth;
    private javax.swing.JTextField jTextFieldSender;
    private javax.swing.JTextField jTextFieldYear;
    private java.util.List<GUI.Log> logList;
    private javax.persistence.Query logQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    //Vartiabili di supporto per la gestione
    private MySQLDataBase db=null;


    
    //=========================================METODO DI INIZIALIZZAZIONE
    protected void inizializza(MySQLDataBase dataBase){
        //prepara il db log su file per ora
        db=dataBase;
    }

    @SuppressWarnings("static-access")
    /**
    * Ricerca di un log nella tabella dei log
    *
    * @param String[] contiene da 0 a 5 elementi in base a quanto è stretta la ricerca
    * @param [0] il sender
    * @param [1] il log
    * @param [2] il giorno
    * @param [3] il mese
    * @param [4] l'anno
    * @return void
    */
    private void Cerca(String[] ricerca){
        ResultSet ris;
        boolean sender=true;
        boolean logg=true;
        boolean giorno=true;
        boolean mese=true;
        boolean anno=true;
        boolean date=false;
        String query="SELECT * FROM log";
        java.sql.Date data=new java.sql.Date(0, 0, 0);
        if (ricerca[0].isEmpty()){
            //non c'è il sender 
            sender=false;
        }
        if(ricerca[1].isEmpty()){
            //non c'è il log
            logg=false;
        }
        if(ricerca[2].isEmpty()){
            //non c'è il giorno
            giorno=false;
        }
        if(ricerca[3].isEmpty()){
            //non c'è il mese
            mese=false;
        }
        if(ricerca[4].isEmpty()){
            //non c'è l'anno
            anno=false;
        }
        if (giorno&&mese&&anno){
           //si usano questi metodi anche se deprecated per migliorare la comprensione e facilità di utilizzo
           data.setDate(Integer.parseInt(ricerca[2]));
           data.setMonth(Integer.parseInt(ricerca[3])-1);//i mesi vanno da 0 a 11
           data.setYear(Integer.parseInt(ricerca[4])-1900);//agli anni è aggiunto 1900
           date=true;
        }
        if (sender){
            //c'è il sender
            if (logg){
                //c'è il sender e il log
                if (date){
                    //c'è sender log e data
                    //la data non funziona
                    query="SELECT * FROM Log WHERE sender='"+ ricerca[0] +"' AND log='"+ ricerca[1] +"' AND date='"+ data +"'";
                }
                //c'è sender e log ma non data
                query="SELECT * FROM Log WHERE sender='"+ ricerca[0] +"' AND log='"+ ricerca[1]+"' ";
            }
            //c'è solo il sender
            query="SELECT * FROM Log WHERE sender='"+ ricerca[0]+"'";
        }
        else {
            //non c'è il sender
            if (logg){
                //non c'è sender ma c'è log
                if (date){
                    //c'è log e data
                    //la data non funziona
                    query="SELECT * FROM Log WHERE log='"+ ricerca[1] +"' AND date='"+ data +"'";
                }
                //c'è solo il log
                query="SELECT * FROM Log WHERE log='"+ ricerca[1] +"'";
            }
            //non c'è sender e non c'è log
            if (date){
                //c'è solo data
                //la data non funziona
                query="SELECT * FROM Log WHERE date='"+ data +"'";
            }
        }
	//eseguo la query
        ris=db.executeSqlQuery(query);
        Risposta r=new Risposta();

        try {
            while (ris.next()){
                r.jTextAreaRisposta.append(ris.getString(1)+" \t"+ ris.getString(2)+" \t"+ ris.getString(3)+" \t"+ ris.getString(4)+"\n");
            }
        } catch (SQLException ex) {
            new ErrorForm(ex.toString()).setVisible(true);
        }
        r.setVisible(true);
    }

}
