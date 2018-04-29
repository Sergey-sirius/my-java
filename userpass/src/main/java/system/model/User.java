package system.model;

public class User {
    private String name;
    private String password;

    // construct1
    public User() {

    }
    // construct2
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // get seter
    public String getName() {  return name;  }
    public void setName(String name) { this.name = name; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    // print string out
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
