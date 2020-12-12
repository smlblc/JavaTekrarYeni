package gun41.encapsulation;

/*
To achieve encapsulation in Java
Declare the variables of a class as private.
Provide public setter and getter methods to modify and view the variables values.

 */
public class User {

    //Declare the variables of a class as private.
    private long id;
    private String username;
    private String password;
    private boolean active;
    private Boolean signedIn;
    private boolean certificate;

    public User() {

    }

    //    public User(long id, String username, String password) {
//        setId(id);
//        setUsername(username);
//        setPassword(password);
//    }

    public User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        //this.password = password;
        setPassword(password);
    }

    //Provide public setter and getter methods to modify and view the variables values.

    // to make write-only, remove all get methods
    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        //password is valid only when length > 6
        if(password.length() < 6) {
            //unchecked/runtime exceptions are not required to handle
            throw new IllegalArgumentException("Password length is too short, provide longer password!");
        }

        this.password = password;
    }

    // to make read-only, remove all set methods
    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    // assume if id = 1, it is ADMIN, and we do not show password of admin
    public String getPassword() {
        if(this.id == 1) {
            //unchecked/runtime exceptions are not required to handle
            throw new RuntimeException("you cannot see password of admin");

        }
        return password;
    }

    //for primitive boolean, "is" prefix is used
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    //for primitive boolean, sometimes "has/**/" prefix is used
    public boolean hasCertificate() {
        return certificate;
    }
    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }

    //for wrapper Boolean "get" prefix is used
    public Boolean getSignedIn() {
        return signedIn;
    }
    public void setSignedIn(Boolean signedIn) {
        this.signedIn = signedIn;
    }

}
