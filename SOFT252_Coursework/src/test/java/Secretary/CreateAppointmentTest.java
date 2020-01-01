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
public class CreateAppointmentTest {
    
    public CreateAppointmentTest() {
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
    public void testFillDoctors() {
    }
    @Test
    public void testCreateAppointment()
    {
        //Test a valid appointment. 
        //There is not a test for an invalid appointment, as the patientID and doctorName sections are automatically
        //determined when the application is loaded, so there is impossible for these to be wrong.
        String PatientID = "P101"; //Mock patientID, but is obtained through the patient file.
        String doctorName = "Eve Jeffery"; //Mock doctor but is an implemented doctor.
        String AppointmentDate = "01/01/2019";
        CreateAppointment instance = new CreateAppointment();
        Boolean result = instance.CreateAppointment(doctorName, PatientID, AppointmentDate);
        assertEquals(result, true);
        
        
    }
    
}
