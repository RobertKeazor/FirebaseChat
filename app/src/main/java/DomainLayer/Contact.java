package DomainLayer;


public class Contact {

    private String UserName;
    private String password;
    private String Email;


    public Contact(String userName, String password, String email) {
        UserName = userName;
        this.password = password;
        Email = email;
    }

    public Contact(String userName, String password) {
        UserName = userName;
        this.password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
