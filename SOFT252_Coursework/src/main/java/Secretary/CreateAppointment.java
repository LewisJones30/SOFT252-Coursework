/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secretary;

import Interfaces.IWriteJSON;
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
/**
 *
 * @author Lewis
 */
public class CreateAppointment extends javax.swing.JFrame implements IWriteJSON
{
    public String DoctorName;
    public String PatientID;
    public String AppointmentDate;

    /**
     * Creates new form CreateAppointment
     */
    public CreateAppointment() { 
        initComponents();
        fillDoctors(); //Fill the combo box with names of doctors ready to be chosen
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
        jLabel3 = new javax.swing.JLabel();
        cbDocs = new javax.swing.JComboBox<>();
        tfID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Create an Appointment");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Create an Appointment between a Doctor and Patient");

        jLabel2.setText("Patient Identification Number:");

        jLabel3.setText("Doctor chosen:");

        jLabel4.setText("Date for Appointment:");

        jLabel5.setText("(DD/MM/YY)");

        jButton1.setText("Close Window");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create Appointment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(52, 52, 52)
                                    .addComponent(tfDate))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbDocs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbDocs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String doctorName = cbDocs.getSelectedItem().toString();
        String patientID = tfID.getText();
        String date = tfDate.getText();
        CreateAppointment(doctorName, patientID, date);



    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SecretaryDashboard().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public Boolean CreateAppointment(String doctorName, String patientID, String AppointmentDate)
    {
            JSONObject newAppointment = new JSONObject();
            newAppointment.put("DoctorName", doctorName);
            newAppointment.put("PatientID", patientID);
            newAppointment.put("AppointmentDate", AppointmentDate);
            Boolean result = WriteToJSON("JSON/ScheduledAppointments.json", newAppointment, "ScheduledAppointments");   
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
            java.util.logging.Logger.getLogger(CreateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAppointment().setVisible(true);
            }
        });
    }
     public void fillDoctors()
    {
                JSONParser parser = new JSONParser(); 
    try (Reader reader = new FileReader("JSON/Doctors.json")) 
        {
            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray doctors = (JSONArray) jsonObject.get("doctors");
            for (int i = 0; i < doctors.size(); i++) {
                JSONObject currentDoctor = (JSONObject) doctors.get(i);
                String firstname = currentDoctor.get("firstname").toString();
                String surname = currentDoctor.get("surname").toString();
                cbDocs.addItem(firstname + " " + surname);
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
    private javax.swing.JComboBox<String> cbDocs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfID;
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
