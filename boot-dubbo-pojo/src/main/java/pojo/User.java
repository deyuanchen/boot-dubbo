package pojo;


import java.io.Serializable;


/**
 * <p>Tiltle: boot-dubbo </p>
 * <p>Description: token生成器对象 </p>
 *
 * @Author 陈德元
 * data: 2018-08-03
 * version: 1.0
 */
public class User implements Serializable{

    private Integer role;

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    private Integer id;


    private String username;


    private String password;


    private String firstname;


    private String lastname;


    private String email;


    private Boolean enabled;

    public User() {

    }

    public User(Integer role, Integer id, String username, String password, String firstname) {
        this.role = role;
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}