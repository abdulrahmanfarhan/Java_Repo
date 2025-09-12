package user;

public class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setPassword(String password) {
        this.password = password;
    }



    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
