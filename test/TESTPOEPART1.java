/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import progpoe1.Login;

/**
 *
 * @author lab_services_student
 */
public class TESTPOEPART1 {
    Login login = new Login();
    
    @Test 
    public void testUsernameCorrect(){
        assertTrue(login.checkUserName("kyl_1"));
    }
    
    @Test
    public void testUsernameInncorect(){
        assertFalse(login.checkUserName("kyle!!!!!"));
    
    }
    
    @Test 
    public void testPasswordCorrect(){
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    
    @Test 
    public void testPasswordIncorrect(){
        assertFalse(login.checkPasswordComplexity("password"));
    
    }
    
    @Test
    public void testPhoneCorrect(){
        assertTrue(login.checkCellPhoneNumber("+278389676"));
    
    }
    
    @Test 
    public void testPhoneIncorrect(){
        assertFalse(login.checkCellPhoneNumber("031347949"));
    
    }
    
    @Test 
    public void testLoginSuccess(){
        login.registerUser("kyl_1", "Ch&&sec@ke99!","+278389676" );
        assertTrue(login.loginUser("kyl_1","Ch&&sec@ke99!"));
    
    }
    
    @Test
    
    public void testloginFail(){
        login.registerUser("kyl_1", "Ch&&sec@ke99!","+278389676" );
        assertFalse(login.loginUser("Wrong","Wrong"));
    }
    
}
// Emeris School of computer science Video.2026
    
    
        
    
    
 
    
    
    
            
    
    
    
    
    
    
        
        

    
    















    
   
