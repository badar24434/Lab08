package com.csc3402.lab.lab08.security.formlogin.util;

/**
 * Utility class to generate password entries for testing purposes.
 * Run the main method to generate SQL statements for data.sql.
 */
public class PasswordGenerator {
    
    public static void main(String[] args) {
        // Define test passwords
        String[] users = {"admin@gmail.com", "test@gmail.com", "abc@gmail.com", "def@gmail.com"};
        String[] names = {"admin", "John", "Alex", "Boss"};
        String[] passwords = {"admin", "test", "abc", "def"};
        
        System.out.println("Use these values in your data.sql file:");
        for (int i = 0; i < users.length; i++) {
            System.out.println("INSERT INTO users(email, name, password) VALUES");
            System.out.println("    ('" + users[i] + "','" + names[i] + "','" + passwords[i] + "');");
        }
    }
}
