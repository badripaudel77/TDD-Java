package org.example;

/**
 Hello world!
 */
public class UserValidator {
    public boolean validateUser(int age, String name, String phoneNumber) {
        if(age== 0 || name.isEmpty() || phoneNumber.isEmpty()) {
            throw new NullPointerException("Input can't be empty");
        }

        if((age <18 && age >0) || name.trim().length()<3 || phoneNumber.trim().length() <14) return false;
        if(!phoneNumber.trim().startsWith("+")|| phoneNumber.trim().contains(" ")) return false;

        // refactor logic to check if invalid input ....

        if(age <0) {
            throw new RuntimeException("Age can't be negative");
        }
        return  true;
    }
}
