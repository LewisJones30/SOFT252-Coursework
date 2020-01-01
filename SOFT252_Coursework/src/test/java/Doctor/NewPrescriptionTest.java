/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

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
public class NewPrescriptionTest {
    
    public NewPrescriptionTest() {
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
    public void testFillPatients() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testGetDoctorID() {
    }
    @Test 
    public void testWritePrescriptionToFile()
    {
        //Example of a working prescription
        //Note this test is just to test adding, this will not check if there is enough/not enough.
        String PatientID = "P101";
        String DoctorID = "D101";
        String Medicine = "Paracetamol";
        String Quantity = "20";
        String Comment = "Take a maximum of 4 per day.";
        NewPrescription instance = new NewPrescription();
        Boolean result = instance.WritePrescriptionToFile(PatientID, Medicine, Quantity, Comment, DoctorID);
        Boolean expectedResult = true;
        assertEquals(result, expectedResult);
        
    }
    
}
