package com.methods.methodexample.JDBCProjectExample;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Students {
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private Gender gender;
    private LocalDate dob;
    private LocalDateTime created_at;
    private boolean is_deleted;

    public Students(String first_name, String last_name, String email, Gender gender, LocalDate dob, LocalDateTime created_at, boolean is_deleted) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.created_at = created_at;
        this.is_deleted = is_deleted;
    }

    public Students(Long id, String first_name, String last_name, String email, Gender gender, LocalDate dob, LocalDateTime created_at, boolean is_deleted) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.created_at = created_at;
        this.is_deleted = is_deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public boolean get_Is_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }
    
    
    
    
    
}
