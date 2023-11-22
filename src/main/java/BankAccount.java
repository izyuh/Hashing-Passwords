import javax.persistence.*;

@Entity
public class BankAccount {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String username;
    @Column
    String password;


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
