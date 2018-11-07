package DataBases;

/**
 * Created by operator on 27.06.2017.
 */
public class User {
    private String name;
    private String lastName;
    private String telephone;

    public User(String name, String lastName, String telephone) {
        this.name = name;
        this.lastName = lastName;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
