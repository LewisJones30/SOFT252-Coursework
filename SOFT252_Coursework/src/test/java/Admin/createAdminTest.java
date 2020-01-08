/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

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
public class createAdminTest {
    
    public createAdminTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        String firstName = "Test";
        String surname = "Test";
        String username = "Username";
        String password = "Password";
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
    public void testAddAdmin() {
        createAdmin instance = new createAdmin();
        //Firstly create a failure
        Boolean result1;
        result1 = instance.AdminChecks("Test", "Test", "Test", "Test");
        Boolean expectedResult = false;
        
        assertEquals(result1, expectedResult);
        //Secondly create a successful admin
        Boolean result2;
        result2 = instance.AdminChecks("Lewis", "Jones", "A103", "beans");
        Boolean expectedResult2 = true;
        assertEquals(result2, expectedResult2);
        
    }

    @Test
    public void TestMain() {
        fail("Nothing implemented.");
    }
    
}
