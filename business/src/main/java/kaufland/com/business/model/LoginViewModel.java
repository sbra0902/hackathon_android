package main.java.kaufland.com.business.model;

public class LoginViewModel {
    //[Required]
    public String username;

    //[Required]
    public String password;

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
}