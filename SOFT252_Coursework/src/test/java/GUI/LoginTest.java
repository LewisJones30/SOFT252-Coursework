/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import org.json.simple.JSONObject;
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
public class LoginTest {
    
    public LoginTest() {
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
    public void testGetloggedInId() {
    }

    @Test
    public void testAttemptLoginUser() {
        //Attempt with a successful login first.
        JSONObject testPatient = new JSONObject();
        testPatient.put("username", "P105");
        testPatient.put("password", "beans");
        testPatient.put("firstName", "Test");
        testPatient.put("surname", "Test");
        testPatient.put("Gender", "Male");
        testPatient.put("Age", "25");
        String enteredUsername = "P105";
        String enteredPassword = "beans";
        Login instance = new Login();
        Boolean test = instance.attemptLoginUser(testPatient, "P", enteredUsername, enteredPassword);
        assertEquals(test, true); 
        //Attempt with an invalid login.
        enteredUsername = "null";
        enteredPassword = "null";
        Boolean test2 = instance.attemptLoginUser(testPatient, "P", enteredUsername, enteredPassword);
        assertEquals(test2, false);
    }

    @Test
    public void testMain() {
    }
    
}
