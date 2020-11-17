package com.example.try1;

public class UserHelperClass {
    String patientname,username,password,phoneno,email;

    public UserHelperClass() {
    }

    public UserHelperClass(String patientname, String username, String password, String phoneno, String email) {
        this.patientname = patientname;
        this.username = username;
        this.password = password;

        this.phoneno = phoneno;
        this.email = email;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
