package model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column(name = "userId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fName;
    private String lName;
    private String userName;
    private String userPassword;
    private boolean isAdmin;

    public User() {
    }

    public User(String fName, String lName,String userName, String userPassword, boolean isAdmin) {
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.isAdmin = isAdmin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
