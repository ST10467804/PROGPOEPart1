/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progpoe1;

/**
 *
 * @author lab_services_student
 */
 import java.util.Scanner;






public class PROGPOE1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // Create Object
        Scanner input = new Scanner(System.in);
        Login login = new Login();
        // Hardcoded test calls
        login.registerUser("User_","Pass123!","+27123456789");
        login.loginUser("user_","Pass123!");
        
        // Registration
        
        System.out.println("---Register---");
        
        System.out.print("Please enter username:");
        String username = input.nextLine();
        
        System.out.print("Please enter password:");
        String password = input.nextLine();
        
        System.out.print("Enter SA phone(+27...):");
        String phone = input.nextLine();
        
        System.out.println(login.registerUser(username, password, phone));
        
        // Login
        
        System.out.println("---Login---");
        
        System.out.print("Enter username:");
        String loginUser = input.nextLine();
        
        System.out.print("Enter password:");
        String loginPass = input.nextLine();
        
        boolean success = login.loginUser(loginUser, loginPass);
        
        System.out.println(login.returnLoginStatus(success, username, username));
        
        
       
        
        
    }
    
}
// G.Bokaba Sildes ARC.2026
// IIE Moduale Manuale.2026
