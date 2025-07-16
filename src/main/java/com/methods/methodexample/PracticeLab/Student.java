package com.methods.methodexample.PracticeLab;

public class Student extends Pakna implements Human {
   private int id;
    private String name;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(int id, String name) {
        setId(id);
        setName(name);
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID with 7-digit logic
    public void setId(int inputId) {
        String idStr = String.valueOf(inputId);
        if (idStr.length() > 7) {
            idStr = idStr.substring(0, 7); // Trim if more than 7 digits
        } else if (idStr.length() < 7) {
            int diff = 7 - idStr.length();
            for (int i = 0; i < diff; i++) {
                idStr += "0"; // Pad with 0s at the end
            }
        }
        this.id = Integer.parseInt(idStr);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name (max 10 characters)
    public void setName(String inputName) {
        if (inputName.length() <= 10) {
            this.name = inputName;
        } else {
            this.name = inputName.substring(0, 10); // Trim if too long
        }
    }
    
        @Override
    public void exampleMethod() {
        System.out.println("I am a human!");
    }
}

