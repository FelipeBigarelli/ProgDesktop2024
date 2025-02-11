package views;

import controller.Binary.ProductBinaryController;
import controller.Text.ProductController;
import models.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author biga
 */
public class ProductWindow extends javax.swing.JFrame {

    public ProductController productController = new ProductController(1);
    public ProductBinaryController productBinaryController = new ProductBinaryController(0);
    public int modelId = 0;
    public String modelNome;
    public String modelTipo;
    public List<Integer> listUniqueId = new ArrayList<>(); 
    public int uniqueId;
    public static int typeFile;    
    
    public ProductWindow(int typeFile) {
        this.typeFile = typeFile; 
        initComponents();
        setModelId();
        InitTable();          
    }
    
        public void setModelId() {
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (jTable1.getSelectedRow() >= 0) {
                    modelId = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                    modelNome = (jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                    modelTipo = (jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                    campoNome.setText(modelNome);
                    campoTipo.setText(modelTipo);
                }
            }
        });
    }
    
    public int getUniqueId() {
        for(int i = 0;i<jTable1.getModel().getRowCount();i++) {      
            if (!listUniqueId.contains(Integer.parseInt(jTable1.getModel().getValueAt(i,0).toString()))) {
                listUniqueId.add(Integer.parseInt(jTable1.getModel().getValueAt(i,0).toString()));
            }
        }
        
        System.out.println(listUniqueId);
        
        Collections.reverse(listUniqueId);
        if (!listUniqueId.isEmpty()) {
            uniqueId = Integer.parseInt(listUniqueId.get(0).toString());
        }else {
            uniqueId = 0;
        }
        
        do {
            uniqueId++;
        }while(listUniqueId.contains(uniqueId));
        return uniqueId;
    }
    
    public void removeListUnique(int id) {    
        Iterator itr = listUniqueId.iterator(); 
        while (itr.hasNext()) 
        { 
            int x = (Integer)itr.next(); 
            if (x == id) 
                itr.remove(); 
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoTipo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produto");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 100, 60, 30);

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel2.setText("Tipo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 150, 50, 24);
        getContentPane().add(campoNome);
        campoNome.setBounds(110, 100, 180, 30);
        getContentPane().add(campoTipo);
        campoTipo.setBounds(110, 150, 220, 30);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 270, 470, 90);

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 10, 70, 40);

        jButton2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 200, 110, 40);

        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 200, 110, 40);

        jButton4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton4.setText("Remover");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(420, 200, 110, 40);

        jButton5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton5.setText("Voltar ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 10, 90, 40);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -20, 630, 460);

        setSize(new java.awt.Dimension(643, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (campoNome.getText().isEmpty() || campoTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Verifique se os campos foram preenchidos", "Aviso!", 2);
        } else if(campoNome.getText().contains(",") || campoTipo.getText().contains(",")){
            JOptionPane.showMessageDialog(null, "Caractere ',' inválido!", "Aviso!", 2);
        }else{
            String newModel = getUniqueId() + "," + campoNome.getText() + "," + campoTipo.getText();
            if (typeFile == 0) {
                Product newProduct = new Product();
                newProduct.id = getUniqueId();
                newProduct.nome = campoNome.getText();
                newProduct.tipo = campoTipo.getText();
                productBinaryController.genericList.add(newProduct);                
            }else {
                productController.setNewModel(newModel);
            }
            if (typeFile == 0 ? productBinaryController.write(true) : productController.write(true)) {
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!", "Sucesso", 1);
                campoNome.setText("");
                campoTipo.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!", "Erro", 0);
            }
            InitTable();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Product editedProduct = new Product();
        if (typeFile == 0) {
            editedProduct.id = modelId;
            editedProduct.nome = campoNome.getText();
            editedProduct.tipo = campoTipo.getText();            
        }else {
            String updateModel = modelId + "," + campoNome.getText() + "," + campoTipo.getText();   
            productController.setNewModel(updateModel);
        }
        
        if (campoNome.getText().isEmpty() || campoTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Verifique se os campos foram preenchidos", "Aviso!", 2);
        } else if(campoNome.getText().contains(",") || campoTipo.getText().contains(",")){
            JOptionPane.showMessageDialog(null, "Caractere ',' inválido!", "Aviso!", 2);
        }else if(typeFile == 0 ? productBinaryController.Update(editedProduct) : productController.Update(modelId)) {
            JOptionPane.showMessageDialog(null, "Produto atualizado", "Sucesso", 1);
            InitTable();
        }else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o produto", "Erro!", 0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (modelId > 0) {
            if(typeFile == 0 ? productBinaryController.remove(modelId) : productController.remove(modelId)) {
                removeListUnique(modelId);
                JOptionPane.showMessageDialog(null, "Produto removido", "Sucesso", 1);           
                InitTable();         
                campoNome.setText("");
                campoTipo.setText("");
            }else {
                JOptionPane.showMessageDialog(null, "Erro ao remover o produto", "Erro!", 0);           
            }
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado", "Aviso!", 2);           
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        new OptionWindow(typeFile).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductWindow(typeFile).setVisible(true);
            }
        });
    }
    
        public void InitTable() {
        Vector<Vector<String>> data = new Vector<Vector<String>>();
        Vector<String> col = new Vector<String>();
        col.add("Id");
        col.add("Nome");
        col.add("Tipo");

        if (typeFile == 0) {
            productBinaryController.read();
            productBinaryController.genericList.forEach((item) -> {
                Vector<String> tempItem = new Vector<String>();
                Product product = (Product) item;
                tempItem.add(product.id + "");
                tempItem.add(product.nome);
                tempItem.add(product.tipo);
                data.add(tempItem);
            });            
        }else {
            ArrayList<String> products = productController.ReadAll();
            products.forEach((product) -> {
                Vector<String> tempItem = new Vector<String>();
                String[] splitedProduct = product.split(",");
                tempItem.add(splitedProduct[0]);
                tempItem.add(splitedProduct[1]);
                tempItem.add(splitedProduct[2]);
                data.add(tempItem);
            });            
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                data,
                col
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
