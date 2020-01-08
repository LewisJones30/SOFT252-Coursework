/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secretary;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.Reader;
import java.util.Iterator;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author Lewis
 */
public class patientManagement extends javax.swing.JFrame {
    public String patientID;

    /**
     * Creates new form patientManagement
     */
    public patientManagement() {
        initComponents();
        fillPatients();
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
        cbPatients = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfFName = new javax.swing.JTextField();
        tfLName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfAddress = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setTitle("Patient Management");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Patient Management");

        cbPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPatientsActionPerformed(evt);
            }
        });

        jLabel2.setText("Select patient number:");

        jLabel3.setText("Patient First Name:");

        jLabel4.setText("Patient Last Name:");

        jLabel5.setText("Patient's Address:");

        jButton1.setText("Update Patient Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete this patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPatients, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfFName, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfAddress)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPatientsActionPerformed
        // TODO add your handling code here:
        UpdateTextFields();
        
    }//GEN-LAST:event_cbPatientsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader("JSON/Patients.json")) 
        {
            
            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray patients = (JSONArray) jsonObject.get("patients");
            for (int i = 0; i < patients.size(); i++) {
                JSONObject currentPatient = (JSONObject) patients.get(i);
                String username = currentPatient.get("username").toString();
                if (username.equals( cbPatients.getSelectedItem()))
                {
                    currentPatient.put("firstname", tfFName.getText());
                    currentPatient.put("surname", tfLName.getText());
                    currentPatient.put("address", tfAddress.getText());
                }
            }
        FileWriter JSONFile = new FileWriter("JSON/Patients.json");
        try
        {
            String intro = ("{" + (char)34 + "patients" + (char)34) + ":";
            JSONFile.write(intro + patients.toJSONString() + "}");
            JSONFile.flush();
            JSONFile.close();

        }
        catch (IOException e)
                {
                    e.printStackTrace();
                }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e) 
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SecretaryDashboard().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    public boolean RemovePatient(String patientUsername)
    {
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete this patient?");
        if (dialogResult == JOptionPane.YES_OPTION)
        {
           JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader("JSON/Patients.json")) 
        {
            
            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray patients = (JSONArray) jsonObject.get("patients");
            for (int i = 0; i < patients.size(); i++) {
                JSONObject currentPatient = (JSONObject) patients.get(i);
                String username = currentPatient.get("username").toString();
                if (username.equals( patientUsername))
                {
                    patients.remove(i);
                }
            }
            FileWriter JSONFile = new FileWriter("JSON/Patients.json");
        try
        {
            String intro = ("{" + (char)34 + "patients" + (char)34) + ":";
            JSONFile.write(intro + patients.toJSONString() + "}");
            JSONFile.flush();
            JSONFile.close();
            return true;

        }
        catch (IOException e)
                {
                    e.printStackTrace();
                }
            
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            return false;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
        catch (ParseException e) 
        {
            e.printStackTrace();
            return false;
        } 

        }
        else
        {
        return false;
        }
        return false;
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String patientUsername = cbPatients.getSelectedItem().toString();
        RemovePatient(patientUsername);
        
         
            
    }//GEN-LAST:event_jButton2ActionPerformed
public void UpdateTextFields()
{
    System.out.println("Updating...");
    System.out.println(cbPatients.getSelectedItem());
    JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader("JSON/Patients.json")) 
        {
            
            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray patients = (JSONArray) jsonObject.get("patients");
            for (int i = 0; i < patients.size(); i++) {
                JSONObject currentPatient = (JSONObject) patients.get(i);
                String username = currentPatient.get("username").toString();
                if (username.equals( cbPatients.getSelectedItem()))
                {
                    tfFName.setText(currentPatient.get("firstname").toString());
                    tfLName.setText(currentPatient.get("surname").toString());
                    tfAddress.setText(currentPatient.get("address").toString());
                }
            }
        
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e) 
        {
            e.printStackTrace();
        }
}
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
            java.util.logging.Logger.getLogger(patientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patientManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patientManagement().setVisible(true);
            }
        });
    }
    public void fillPatients(){
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader("JSON/Patients.json")) 
        {
            
            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray patients = (JSONArray) jsonObject.get("patients");
            for (int i = 0; i < patients.size(); i++) {
                JSONObject currentPatient = (JSONObject) patients.get(i);
                String patientID = currentPatient.get("username").toString();
                cbPatients.addItem(patientID);
            }
        
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e) 
        {
            e.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPatients;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfFName;
    private javax.swing.JTextField tfLName;
    // End of variables declaration//GEN-END:variables
}
