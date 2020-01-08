/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

import Interfaces.IWriteJSON;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Lewis
 */
public class NewPrescription extends javax.swing.JFrame implements IWriteJSON{

    public String DoctorID;
    public String MedicineName;
    public String Quantity;
    public String PatientID;
    public String Comment;
    /**
     * Creates new form NewPrescription
     */
    public NewPrescription() {
        initComponents();
        fillMedicines();
        fillPatients();
    }
    public NewPrescription(String doctorID)
    {
        DoctorID = doctorID;
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
        cbPatientNumber = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbMedicines = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDosage = new javax.swing.JTextArea();

        setTitle("Create Prescription");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Create a Prescription for a patient");

        jLabel2.setText("Patient Identification Number:");

        cbPatientNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPatientNumberActionPerformed(evt);
            }
        });

        jLabel3.setText("Medicine to be prescribed:");

        jLabel4.setText("Quantity:");

        jLabel5.setText("Dosage Requirements:");

        jButton1.setText("Close Window");

        jButton2.setText("Create Prescription");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        taDosage.setColumns(20);
        taDosage.setRows(5);
        jScrollPane1.setViewportView(taDosage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(36, 36, 36))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(54, 54, 54)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(71, 71, 71)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbPatientNumber, 0, 302, Short.MAX_VALUE)
                                    .addComponent(cbMedicines, 0, 302, Short.MAX_VALUE)
                                    .addComponent(tfQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbPatientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillPatients(){
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader("JSON/Patients.json")) 
        {
            
            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray patients = (JSONArray) jsonObject.get("patients");
            for (int i = 0; i < patients.size(); i++) {
                JSONObject currentPatient = (JSONObject) patients.get(i);
                String patientID = currentPatient.get("username").toString();
                cbPatientNumber.addItem(patientID);
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
    private void cbPatientNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPatientNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPatientNumberActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        boolean prescriptionAllowed = checkPrescription();
        if (prescriptionAllowed == true)
        {
                   getInformation(); 
                   JOptionPane.showMessageDialog(null, "Prescription has been successfully dispensed to the patient.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The prescription has not been written because there is an error with the prescription");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean checkPrescription()
    {
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("src/main/java/MedicineInformation.json")) 
        {
            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray allMedicines = (JSONArray) jsonObject.get("medicines");
            for (int i = 0; i < allMedicines.size(); i++) {
                JSONObject currentMed = (JSONObject) allMedicines.get(i);
                if (currentMed.get("name").equals(cbMedicines.getSelectedItem().toString()))
                {
                    int stock= (Integer.parseInt(currentMed.get("quantity").toString()));
                    int prescribed = Integer.parseInt(tfQuantity.getText());
                    if (stock - prescribed > -1)
                    {
                        currentMed.put("quantity", stock - prescribed);
                        FileWriter JSONFile = new FileWriter("JSON/MedicineInformation.json");
                        String intro = ("{" + (char)34 + "medicines" + (char)34) + ":";
                        JSONFile.write(intro + allMedicines.toJSONString() + "}");  
                        JSONFile.flush();
                        JSONFile.close();
                        return true;

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "There is not enough of the prescribed medicine available. Please request more.");
                        return false;
                    }
                }
                else
                {
                    
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
        return false;
    }
    private void getInformation()
    {
        PatientID = cbPatientNumber.getSelectedItem().toString();
        MedicineName = cbMedicines.getSelectedItem().toString();
        Quantity = tfQuantity.getText();
        Comment = taDosage.getText();
        WritePrescriptionToFile(PatientID, MedicineName, Quantity, Comment, DoctorID);
        
        
    }
    public boolean WritePrescriptionToFile(String patientID, String medicineName, String quantity, String comment, String doctorID)
    {
        JSONObject newPrescription = new JSONObject();
        newPrescription.put("PatientID", patientID);
        newPrescription.put("MedicineName", medicineName);
        newPrescription.put("Quantity", quantity);
        newPrescription.put("Comment", comment);
        newPrescription.put("DoctorID", doctorID);
        JSONParser parser = new JSONParser();
        boolean result = WriteToJSON("JSON/Prescriptions.json", newPrescription, "Prescriptions");
        return result;
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
            java.util.logging.Logger.getLogger(NewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPrescription().setVisible(true);
            }
        });
    }
     private void fillMedicines()
    {
        JSONParser parser = new JSONParser();
try (Reader reader = new FileReader("JSON/MedicineInformation.json")) 
        {
            
JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray medicines = (JSONArray) jsonObject.get("medicines");
            for (int i = 0; i < medicines.size(); i++) {
                JSONObject currentMedicine = (JSONObject) medicines.get(i);
                cbMedicines.addItem(currentMedicine.get("name").toString());
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
public String GetDoctorID()
{
    return DoctorID;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMedicines;
    private javax.swing.JComboBox<String> cbPatientNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDosage;
    private javax.swing.JTextField tfQuantity;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean WriteToJSON(String fileName, JSONObject objectToWrite, String arrayName) {
        JSONParser parser = new JSONParser();
            try (Reader reader = new FileReader(fileName))
            {
                
                JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
                JSONArray array = (JSONArray) jsonObject.get(arrayName);
                
                array.add(objectToWrite);
                FileWriter JSONFile = new FileWriter(fileName);
                try
                {
                    String intro = ("{" + (char)34 + arrayName + (char)34) + ":";
                    JSONFile.write(intro + array.toJSONString() + "}");
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                JSONFile.flush();
                JSONFile.close();
                return true;
                
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
            }
        return false;
    }
}
