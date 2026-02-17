package models;

public class RequestUserLoginModel {
    private String email;
    private String password;

    public RequestUserLoginModel() {
    }

    public RequestUserLoginModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void getEmail(String email) {
        this.email = email;
    }
    }

