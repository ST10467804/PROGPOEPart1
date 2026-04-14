/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpoe1;

/**
 *
 * @author lab_services_student
 */
public class Login{
    //Variables
    private String username;
    private String password;
    private String cellPhone;
    
    //Method 1
    
    public boolean checkUserName(String username){
        return username.contains("_")&& username.length()<=5;
    
    }
    
    //Method 2
    
    public boolean checkPasswordComplexity(String password){
        return password.length() >=8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[^a-zA-Z0-9].*");
    
    }
    
    //Method 3
    
    public boolean checkCellPhoneNumber(String number){
        return number.matches("^\\+27\\d{9}$");
    
    }
    
    //Method 4
    
    public String registerUser(String username, String password, String cellPhone){
        if(!checkUserName(username)){
            return "Username is not correctly formatted. "
                    + "Please ensure that your username contains an "
                    + "underscore and is no more than five characters in length.";
        }
        
        if(!checkPasswordComplexity(password)){
            return "Password is not correctly formatted. Please ensurethat the "
                    + "password contains at least eight characters, a capital letter"
                    + "a number and a special character.";
        
        }
        
        if(!checkCellPhoneNumber(cellPhone)){
            return "Cell number is inccorectly formatted or does not contain an "
                    + "international code.Please correct the number and try again.";
        
        }
        
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
        
        return "User successfully registered";
        
    }
    
    //Method 5
    
    public boolean loginUser(String username,String password){
        return this.username.equals(username)&&this.password.equals(password);
    
    }
    
    //Method6
    
    public String returnLoginStatus(boolean status, String firstName, String lastName){
        if(status){
            return "Welcome:" + firstName + "," + "Good to see you again.";
        
        }else{
            return "Username or Password is inncorect, Please try again";
        
        }
    
    }
    
}

// G.Bokaba Sildes ARC.2026
// IIE Moduale Manuale.2026 
