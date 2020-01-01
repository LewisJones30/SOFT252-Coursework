/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secretary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lewis
 */
public class patientManagementTest {
    
    public patientManagementTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testUpdateTextFields() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testFillPatients() {
        
        
        
    }
    @Test
    public void testRemovePatient()
    {
        //Testing the removal of patients
        //Please note that if the patient username has been removed through
        //other means, this test will fail. Otherwise it will pass.
        //To force a pass, check the JSON file for a patient username,
        //and then use that as the string instead.
        String patientUsername = "P101";
        patientManagement instance = new patientManagement();
        Boolean result = instance.RemovePatient(patientUsername);
        assertEquals(result, true); 
        
        
    }
    
}
