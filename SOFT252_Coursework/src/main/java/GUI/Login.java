/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Doctor.DoctorDashboard;
import Secretary.SecretaryDashboard;
import Admin.AdminDashboard;
import java.io.File;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.Reader;
import java.util.Iterator;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.net.URL;
import javax.swing.JOptionPane;
/**
 *
 * @author ljones30
 */
public class Login extends javax.swing.JFrame {

    String loggedInID = "0";
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
public String getloggedInId()
{
    return loggedInID;
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
        tfPassword = new javax.swing.JPasswordField();
        tfUsername = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        tfPassword.setName("jFieldPassword"); // NOI18N

        tfUsername.setName("jFieldUsername"); // NOI18N

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("New Patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(tfPassword)
                    .addComponent(tfUsername)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new SignUpPage().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*
        This code opens each of the four documents for Doctors, Patients, Admins and Secretaries
        It runs the attemptLoginUser for each person it finds.
        It will run the specific dashboard needed from there.
        */
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader("JSON/Doctors.json"))
        {

            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray doctors = (JSONArray) jsonObject.get("doctors");
            for (int i = 0; i < doctors.size(); i++) {
                JSONObject test = (JSONObject) doctors.get(i);
                attemptLoginUser(test, "D", tfUsername.getText(), tfPassword.getText());
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
        
        //Attempt to login through the patients
        try (Reader reader = new FileReader("JSON/Patients.json")) 
        {
            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray patients = (JSONArray) jsonObject.get("patients");
            for (int i = 0; i < patients.size(); i++) {
                JSONObject test = (JSONObject) patients.get(i);
                attemptLoginUser(test, "P", tfUsername.getText(), tfPassword.getText());      
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
        //Check for admins
        
        try (Reader reader = new FileReader("JSON/Admins.json")) 
        {
            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray patients = (JSONArray) jsonObject.get("admins");
            for (int i = 0; i < patients.size(); i++) {
                JSONObject test = (JSONObject) patients.get(i);
                attemptLoginUser(test, "A", tfUsername.getText(), tfPassword.getText());  
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
        //Attempt login from Secretaries
        try (Reader reader = new FileReader("JSON/Secretaries.json")) 
        {
            JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
            JSONArray array = (JSONArray) jsonObject.get("secretaries");
            
            
            
            for (int i = 0; i < array.size(); i++) {
                JSONObject test = (JSONObject) array.get(i);
                attemptLoginUser(test, "S", tfUsername.getText(), tfPassword.getText());
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
        JOptionPane.showMessageDialog(null, "The username and/or password you have entered is incorrect.");
        tfUsername.setText("");
        tfPassword.setText("");
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean attemptLoginUser(JSONObject person, String type, String enteredUsername, String enteredPassword)
    {
        //Boolean is used for JUnit testing purposes.
                String username = person.get("username").toString();
                if (username.equals(enteredUsername))
                {
                    String password = person.get("password").toString();
                    System.out.println("1/2 complete.");
                    if (password.equals(enteredPassword))
                    {
                        String Name = person.get("firstname") + " " + person.get("surname");
                        if ("D".equals(type))
                        {
                        new DoctorDashboard(username, Name).setVisible(true);
                        this.setVisible(false);
                        return true;
                        }
                        else if ("P".equals(type))
                        {
                            new PatientDashboard(username, Name).setVisible(true);
                            this.setVisible(false);
                            return true;
                        }
                        else if ("S".equals(type))
                        {
                            new SecretaryDashboard(Name).setVisible(true);
                            this.setVisible(false);
                            return true;
                        }
                        else
                        {
                            new AdminDashboard(Name).setVisible(true);
                            this.setVisible(false);
                            return true;
                        }

                        

                    }
                }
                return false;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JFormattedTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
