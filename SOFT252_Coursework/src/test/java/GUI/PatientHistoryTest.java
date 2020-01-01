/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

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
public class PatientHistoryTest {
    
    public PatientHistoryTest() {
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
    public void testMain() {
    }

    @Test
    public void testLoadPatientHistory() {
        //First test a patient that is on the system
        PatientHistory instance = new PatientHistory();
        Boolean result = instance.loadPatientHistory("P101");
        assertEquals(result, true); //Returns true as it loaded successfully.
        //Test a non-existant patient
        Boolean result2 = instance.loadPatientHistory("Null");
        assertEquals(result2, null); //Returns null due to error
        
        
    }
    
}
